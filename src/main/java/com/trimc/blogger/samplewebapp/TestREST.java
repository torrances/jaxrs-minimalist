package com.trimc.blogger.samplewebapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class TestREST {

	class Result {
		public String name;
		public long timestamp;

		public Result(String name) {
			this.timestamp = System.currentTimeMillis();
			this.name = name;
		}
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Object getit(@QueryParam("name") String name) {
		return new Result(name);
	}
}
