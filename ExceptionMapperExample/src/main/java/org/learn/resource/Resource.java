
package org.learn.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/exp")
public class Resource {

	@GET	
	@Path("outofbound")
	public Response indexOutOfBoundException() {
		String indexOutOfBound = "hello";
		//It will raise index out of bound exception
		indexOutOfBound.charAt(indexOutOfBound.length());
		return  Response.status(Response.Status.OK).build();
	}
	@GET	
	@Path("nullp")
	public Response nullPointerException() {
		throw new NullPointerException("Throwing null pointer exception");
	}
	
	@GET	
	@Path("dividebyzero")
	public Response divideByZero() {
		int divByZero = 100 / 0;
		System.out.println(divByZero);
		return Response.status(Response.Status.OK).build();
	}	
}
