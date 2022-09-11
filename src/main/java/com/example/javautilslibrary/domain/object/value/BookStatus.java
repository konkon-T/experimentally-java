package com.example.javautilslibrary.domain.object.value;


import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

/**
 * Book status Enum
 */
@Getter
public enum BookStatus {
    BE(0),
    RENTAL(1);

    private int status;

    private BookStatus(int i) {
    }

    public static void isStatus(int status) {
        if (Objects.isNull(status)) {
            return;
        } else {
            var value = Arrays.stream(BookStatus.values()).filter(e -> e.getStatus() == status).findAny();
            if (value.isPresent())
                throw new IllegalStateException("Book status is valid, you check value");
        }
    }
}
