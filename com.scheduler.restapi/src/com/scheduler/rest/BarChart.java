package com.scheduler.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/BarChartData")
public class BarChart {
	
	  @GET
	  @Produces({MediaType.APPLICATION_JSON, "application/json"})
	  public List<Data> getBarChartDataJson() {
		  return getData();
	  }
	  
	  @GET
	  @Produces({MediaType.APPLICATION_XML, "application/xml"})
	  public List<Data> getBarChartDataXML() {
		  return getData();
	  }
	  
	  @GET
	  @Produces({ MediaType.TEXT_XML, "application/text" })
	  public List<Data> getBarChartDataHTML() {
		  return getData();
	  }
	    
	  private List<Data> getData() {
		  List<Data> list = new ArrayList<Data>();
		  double scale = 100.0, min = 20.0;
		  for (int i = 0; i < 12; i++) {
			  list.add(new Data(i+"", Math.floor(Math.max(Math.random() * scale, min)), Math.floor(Math.max(Math.random() * scale, min)),
					  Math.floor(Math.max(Math.random() * scale, min)), Math.floor(Math.max(Math.random() * scale, min)), Math.floor(Math.max(Math.random() * scale, min)),
					  Math.floor(Math.max(Math.random() * scale, min)), Math.floor(Math.max(Math.random() * scale, min)), Math.floor(Math.max(Math.random() * scale, min)),
					  Math.floor(Math.max(Math.random() * scale, min))));
		  }
		  return list;
	  }
}