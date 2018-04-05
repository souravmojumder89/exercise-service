package com.saurav.exercise;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saurav.exercise.model.Activity;
import com.saurav.exercise.model.User;
import com.saurav.exercise.repository.ActivityRepository;
import com.saurav.exercise.repository.ActivityResourceStub;

@Path("activities")
public class ActivityResource {
	
	private ActivityRepository activityRepository = new ActivityResourceStub();

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Activity> getAllActivities() {
		return activityRepository.findAllActivities();
	}
	@Path("{activityId}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Activity getActivity(@PathParam("activityId") String activityId) {
		System.out.println(activityId);
		return activityRepository.findActivity(activityId);
	}
	@Path("{activityId}/user")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User getActivityUser(@PathParam("activityId") String activityId) {
		User user = activityRepository.findActivity(activityId).getUser();
		return user;
	}

}
