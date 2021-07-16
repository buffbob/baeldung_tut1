package com.lastgulch.baeldung_tut1.exception;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException() {
        super();
    }

    public BookIdMismatchException(final String msg) {
        super(msg);
    }

    public BookIdMismatchException(final String m, final Throwable cause) {
        super(m, cause);
    }

    public BookIdMismatchException(final Throwable t) {
        super(t);
    }
}
