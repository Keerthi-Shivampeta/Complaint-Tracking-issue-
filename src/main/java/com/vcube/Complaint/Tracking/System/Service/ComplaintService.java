package com.vcube.Complaint.Tracking.System.Service;

import java.time.LocalDate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.Complaint.Tracking.System.Enums.Status;
import com.vcube.Complaint.Tracking.System.Model.Complaint;
import com.vcube.Complaint.Tracking.System.Repository.ComplaintRepository;

@Service
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository complaintrepo;
	
	public Complaint createComplaint(Complaint complaint) {

	    complaint.setStatus(Status.open);
	    complaint.setCreatedDate(LocalDate.now());

	    return complaintrepo.save(complaint);
	}
	
	public List<Complaint> getAllComplaints(){
		return complaintrepo.findAll();
	}
	
	public Complaint getcomplaintbyid(Long id) {
		return complaintrepo.findById(id).orElseThrow();
	}
	
	public String deletecomplaint(Long id) {
		complaintrepo.deleteById(id);
		return "deleted succesfully";
	}
	
	public Complaint updateStatus(Long id,Status status) {
		Complaint complaint=complaintrepo.findById(id).orElse(null);
		if(complaint!=null) {
			complaint.setStatus(status);
			return complaintrepo.save(complaint);
		}
		return null;
	}
}
