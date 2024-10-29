package ru.javaops.bootjava.common.error;

import static ru.javaops.bootjava.common.error.ErrorType.DATA_CONFLICT;

public class DataConflictException extends AppException {
    public DataConflictException(String msg) {
        super(msg, DATA_CONFLICT);
    }
}