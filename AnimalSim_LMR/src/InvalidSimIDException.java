
/**
 * Custom exception for simID that aren't greater than 0.
 * @author LeAia Reed
 *
 */
public class InvalidSimIDException extends RunTimeException{
	public InvalidSimIDException(String message) {
		super(message);
	}

}
