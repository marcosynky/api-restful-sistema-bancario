package aula.api_bancaria.domain.service.exception;

import java.io.Serial;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }

}