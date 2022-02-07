package client.erromessages;

public class ErrorMessage {
    private String cause;
    private String message;
    private String field;

    public ErrorMessage(String cause, String message, String field) {
        this.cause = cause;
        this.message = message;
        this.field = field;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
