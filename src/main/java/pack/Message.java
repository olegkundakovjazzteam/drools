package pack;

/**
 * Created by JazzTeamUser on 17.11.2015.
 */
public class Message {

    public static final int HELLO = 0;
    public static final int GOODBYE = 1;

    private String message;
    private int status;

    public Message(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}