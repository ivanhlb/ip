package duke.exception;

public abstract class DukeException extends Exception {
    public DukeException(String message) {
        super(message);
    }

    public DukeException() {

    }
}
