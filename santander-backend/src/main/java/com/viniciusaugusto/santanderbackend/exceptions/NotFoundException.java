package com.viniciusaugusto.santanderbackend.exceptions;

import com.viniciusaugusto.santanderbackend.utils.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
