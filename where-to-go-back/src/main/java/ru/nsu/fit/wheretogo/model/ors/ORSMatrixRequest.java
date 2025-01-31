package ru.nsu.fit.wheretogo.model.ors;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ORSMatrixRequest {
    List<List<String>> locations;
    String profile;
}
