package ru.nsu.fit.wheretogo.dto.user;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.fit.wheretogo.dto.BaseDTO;
import ru.nsu.fit.wheretogo.entity.user.User;

import java.time.Instant;

@Getter
@Setter
public class UserDTO extends BaseDTO {

    @NotNull
    private String email;

    @NotNull
    @Size(max = 40, message = "Username have to considered 40 letters!")
    private String username;

    private Instant createdAt;

    public static UserDTO getFromEntity(User user) {
        if (user == null) {
            return null;
        }

        var dto = new UserDTO();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setUsername(user.getUsername());
        dto.setCreatedAt(user.getCreatedAt());

        return dto;
    }
}
