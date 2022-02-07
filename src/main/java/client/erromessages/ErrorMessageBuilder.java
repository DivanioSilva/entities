package client.erromessages;

public class ErrorMessageBuilder {
    private String field;
    private String cause;
    private String message;

    public ErrorMessageBuilder setCause(String cause) {
        this.cause = cause;
        return this;
    }

    public ErrorMessageBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public ErrorMessageBuilder setField(String field){
        this.field = field;
        return this;
    }

    public ErrorMessage createErrorMessage() {
        return new ErrorMessage(cause, message, field);
    }
}