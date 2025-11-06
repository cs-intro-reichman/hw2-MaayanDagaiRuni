public class TimeCalc {
    public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes_to_add = Integer.parseInt(args[1]);
        int total_minutes = (hours * 60) + minutes + minutes_to_add;
        int total_hour = total_minutes / 60;
        int new_hours = total_hour % 24;
        int new_minutes = total_minutes - (total_hour*60);
        System.out.println(new_hours + ":" + new_minutes);
    }
}