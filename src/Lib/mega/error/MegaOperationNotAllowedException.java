package Lib.mega.error;

public class MegaOperationNotAllowedException extends MegaException {

    public MegaOperationNotAllowedException() {
        super("Operation not allowed by Mega");
    }
}
