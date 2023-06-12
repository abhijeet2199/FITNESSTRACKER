
//FITNESS TRACKER FOR ELDERLY PEOPLE SO THEY CAN BE ALERTED WHEN IT'S SOMETHING WRONG

package prac2;
import java.util.ArrayList;
import java.util.List;

class FitnessTracker {
    private int steps;
    private int heartRate;
    private int sleepDuration;
    private List<String> activities;

    public FitnessTracker() {
        steps = 0;
        heartRate = 0;
        sleepDuration = 0;
        activities = new ArrayList<>();
    }

    public void addSteps(int steps) {
        this.steps += steps;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setSleepDuration(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public int getSteps() {
        return steps;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSleepDuration() {
        return sleepDuration;
    }

    public List<String> getActivities() {
        return activities;
    }



    public static void main(String[] args) {
        
        FitnessTracker tracker = new FitnessTracker();

        //Give instructions over here that what is your target
        tracker.addSteps(1000);
        tracker.setHeartRate(80);
        tracker.setSleepDuration(7);
        tracker.addActivity("Walking");

        //here we will print the output which we will get from our device
        System.out.println("Steps: " + tracker.getSteps());
        System.out.println("Heart Rate: " + tracker.getHeartRate());
        System.out.println("Sleep Duration: " + tracker.getSleepDuration() + " hours");
        System.out.println("Activities: " + tracker.getActivities());
    }}


