public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        updateTime();
    }

    public String info() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public void tick() {
        seconds++;
        updateTime();
    }

    private void updateTime() {
        minutes += seconds / 60;
        seconds %= 60;
        hours += minutes / 60;
        minutes %= 60;
        hours %= 24;
    }

    public void add(String time) {
        hours += Integer.parseInt(time.substring(0, 2));
        minutes += Integer.parseInt(time.substring(3, 5));
        seconds += Integer.parseInt(time.substring(6, 8));
        updateTime();
    }

    public void add(Time a) {
        hours += a.hours;
        minutes += a.minutes;
        seconds += a.seconds;
        updateTime();
    }
}