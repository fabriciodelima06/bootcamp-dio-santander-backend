package com.project.bootcam.exceptions;

import com.project.bootcam.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
