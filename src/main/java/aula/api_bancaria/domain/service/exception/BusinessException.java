package aula.api_bancaria.domain.service.exception;

import java.io.Serial;


public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}