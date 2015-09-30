package distributed.chat.service;

@SuppressWarnings("serial")
public class InvalidMessageException extends Exception
{
    public InvalidMessageException()
    {
        super();
    }

    public InvalidMessageException(final String msg)
    {
        super(msg);
    }
}
