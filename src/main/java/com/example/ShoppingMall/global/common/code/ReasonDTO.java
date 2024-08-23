package com.example.ShoppingMall.global.common.code;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public record ReasonDTO(
        HttpStatus httpStatus,
        String code,
        String message,
        boolean isSuccess
) {
}
