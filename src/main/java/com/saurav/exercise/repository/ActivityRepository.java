package com.saurav.exercise.repository;

import java.util.List;

import com.saurav.exercise.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);


}