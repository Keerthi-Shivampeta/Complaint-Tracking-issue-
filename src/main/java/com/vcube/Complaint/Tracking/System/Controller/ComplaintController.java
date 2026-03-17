package com.vcube.Complaint.Tracking.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Complaint.Tracking.System.Enums.Status;
import com.vcube.Complaint.Tracking.System.Model.Complaint;
import com.vcube.Complaint.Tracking.System.Service.ComplaintService;

@RestController
public class ComplaintController {

	@Autowired
	private ComplaintService service;

	@PostMapping("/createcomplaint")
	public Complaint createComplaint(@RequestBody Complaint complaint) {
		return service.createComplaint(complaint);
	}

	@GetMapping("/getallcomplaints")
	public List<Complaint> getAllComplaints() {
		return service.getAllComplaints();
	}

	@DeleteMapping("/deletecomplaint/{id}")
	public String deleteController(@PathVariable Long id) {
		service.deletecomplaint(id);

		return "deleted complaint succesfully";
	}

	@GetMapping("/getcomplaintbyid/{id}")
	public Complaint getComplaintbyid(@PathVariable Long id) {
		return service.getcomplaintbyid(id);
	}
	
	@PatchMapping("/updatestatus/{id}/status")
	public Complaint updatestatus(@PathVariable Long id,@RequestParam Status status) {
		return service.updateStatus(id, status);
	}
}
