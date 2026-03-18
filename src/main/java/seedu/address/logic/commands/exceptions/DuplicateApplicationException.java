package seedu.address.logic.commands.exceptions;

/**
 * Represents an error which occurs when trying to add a duplicate application.
 */
public class DuplicateApplicationException extends CommandException {
    public DuplicateApplicationException(String message) {
        super(message);
    }
}
