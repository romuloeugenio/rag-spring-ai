package com.content.rag.model;

import java.util.UUID;

public record OrderCreatedDto(
        UUID orderId,
        UUID customerId,
        String orderName,
        String orderLocation
) {
}
