package Task_Tracker;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import java.util.List;

public class Task {
	private int id;
	private String desc;
	private String status;
	private LocalTime CreatedAt;
	private LocalTime UpdatedAt;
	
	
	
	public Task(int id, String desc, String status, LocalTime createdAt) {
		this.id = id;
		this.desc = desc;
		this.status = status;
		this.CreatedAt = createdAt;
		this.UpdatedAt = null;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public LocalTime getCreatedAt() {
		return CreatedAt;
	}

	public LocalTime getUpdatedAt() {
		return UpdatedAt;
	}



	public void setUpdatedAt(LocalTime updatedAt) {
		UpdatedAt = updatedAt;
	}

	
	@Override
	public String toString() {
		return "Task [id: " + id + ", desc: " + desc + ", status: " + status + ", CreatedAt:" + CreatedAt + " UpdatedAT: "+ UpdatedAt +"]";
	}
	
}

