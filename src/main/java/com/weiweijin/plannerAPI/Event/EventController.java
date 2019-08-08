package com.weiweijin.plannerAPI.Event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

	@RequestMapping(method = RequestMethod.GET, value ="/")
	public String getEvents() {
		return "get all events";
	}
}
