package ru.nsu.fit.wheretogo.entity.user_coeff;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.nsu.fit.wheretogo.entity.Category;
import ru.nsu.fit.wheretogo.entity.User;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "user_coeff")
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class UserCoefficient {
    @EmbeddedId
    UserCoefficientId coefficientId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @MapsId("user")
    private User user;

    @OneToOne
    @JoinColumn(name = "category_id", nullable = false)
    @MapsId("category")
    private Category category;

    @Column(name = "coeff", nullable = false)
    private Double coeff;

    @Column(name = "count_places", nullable = false)
    private Long placesCount;

}
