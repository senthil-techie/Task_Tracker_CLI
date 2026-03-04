package Task_Tracker;


import java.time.LocalTime;

public class Main {
	
	
	public static void main(String[] args) {
		task_Tracker tt = new task_Tracker();
		
		tt.addTask(1, "eat", "todo", LocalTime.now());
		tt.addTask(2, "sleep", "todo", LocalTime.now());
		tt.addTask(3, "study", "todo", LocalTime.now());
		tt.addTask(4, "play", "todo", LocalTime.now());
		
		tt.displayAllTask();
		
		tt.updateTask(2, "dairy", "progress", LocalTime.now());
		
		tt.displayAllTask();
		
		tt.deleteTask(3);
		
		tt.displayAllTask();
		
		tt.updateTask(4, "bath", "done", LocalTime.now());
		
		tt.displayProgessTask();
		
		tt.displayDoneTask();
		
		
		
		
		
		
	}
}
