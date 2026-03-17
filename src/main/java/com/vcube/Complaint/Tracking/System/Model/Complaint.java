package com.vcube.Complaint.Tracking.System.Model;

import java.time.LocalDate;

import com.vcube.Complaint.Tracking.System.Enums.Priority;
import com.vcube.Complaint.Tracking.System.Enums.Status;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="complaint")
@Data
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complaintid;

    private String title;
    private String description;
    private String department;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private LocalDate createdDate;

	public Long getComplaintid() {
		return complaintid;
	}

	public void setComplaintid(Long complaintid) {
		this.complaintid = complaintid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
}