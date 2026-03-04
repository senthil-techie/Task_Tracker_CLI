package Task_Tracker;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class task_Tracker {
	
	private List<Task> tasks = new ArrayList<>();
	
	void addTask(int id, String desc, String status, LocalTime createdAt) {
		Task task = new Task(id, desc, status, createdAt);
		tasks.add(task);
	}
	
	void displayAllTask() {
		for(Task task : tasks) {
			System.out.println(task);
		}
	}
	
	void updateTask(int id, String desc, String status, LocalTime createdAt) {
		for(Task task : tasks) {
			if(task.getId() == id) {
				task.setUpdatedAt(createdAt);
				task.setDesc(desc);
				task.setStatus(status);
				System.out.println("Task Updated Successfully!!");
				return;
			}
		}
		System.out.println("Task Not Found!");
		
	}
	
	void deleteTask(int id) {
		for(Task task : tasks) {
			if(task.getId() == id) {
				tasks.remove(task);
				System.out.println("Task Deleted Successfully!!");
				return;
			}	
		}
		System.out.println("Task Not Found!");
		
		
	}
	
	void displayProgessTask() {
		for(Task task : tasks) {
			if(task.getStatus() == "progress") {
				System.out.println(task);
			}
		}
	}
	
	void displayDoneTask() {
		for(Task task : tasks) {
			if(task.getStatus() == "done") {
				System.out.println(task);
			}
		}
	}

}
