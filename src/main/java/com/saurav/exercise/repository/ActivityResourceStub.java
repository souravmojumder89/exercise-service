package com.saurav.exercise.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.saurav.exercise.model.Activity;
import com.saurav.exercise.model.User;

public class ActivityResourceStub implements ActivityRepository {

	public List<Activity> findAllActivities () {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		activity1.setId("1");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		activity1.setId("2");
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		Activity activity1 = new Activity();
		
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user  = new User();
		user.setName("John");
		user.setId("123");
		
		activity1.setUser(user);
		
		
		return activity1;
	}
	
}

