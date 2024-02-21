package ru.nsu.fit.wheretogo.service.openroute;

import ru.nsu.fit.wheretogo.dto.route.ORSDirectionsDto;

/**
 * Сервис по работе с OpenRoute сервером
 */
public interface OpenRouteService {

    String health();

    ORSDirectionsDto getDirectionDriving();

    ORSDirectionsDto getDirectionWalking();
}
