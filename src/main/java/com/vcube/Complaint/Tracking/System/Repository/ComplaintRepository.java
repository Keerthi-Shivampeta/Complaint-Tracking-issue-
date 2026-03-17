package com.vcube.Complaint.Tracking.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.Complaint.Tracking.System.Model.Complaint;

public interface ComplaintRepository  extends JpaRepository<Complaint,Long>{

}
