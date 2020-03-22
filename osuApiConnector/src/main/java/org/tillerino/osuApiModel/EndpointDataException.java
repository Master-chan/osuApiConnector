package org.tillerino.osuApiModel;

import java.io.IOException;

/**
 * Thrown when endpoint data on osu!API is invalid instead of returning null;
 * @author Master-chan
 *
 */
public class EndpointDataException extends IOException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2012456440433178443L;
	
	
	public EndpointDataException(String message)
	{
		super(message);
	}
	
	public EndpointDataException(Exception cause)
	{
		super(cause);
	}
	
	public EndpointDataException(String message, Exception cause)
	{
		super(message, cause);
	}
	
}
