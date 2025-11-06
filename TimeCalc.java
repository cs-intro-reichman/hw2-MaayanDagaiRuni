public class TimeCalc {
    public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes_to_add = Integer.parseInt(args[1]);
        int total_minutes = (hours * 60) + minutes + minutes_to_add;
        int total_hour = total_minutes / 60;
        int new_hours = total_hour % 24;
        int new_minutes = total_minutes - (total_hour*60);
        String str_minutes = "";
        String str_hours = "";

        		if (new_hours <10){
			str_hours = "0"+ new_hours;
		}
		else{
			str_hours =  String.valueOf(new_hours);
        }
        // Minutes Handling - if less then 10 minutes add "0"
		if (new_minutes <10){
			str_minutes = "0"+ new_minutes;
		}
		else{
			str_minutes = String.valueOf(new_minutes);
			
		}
        System.out.println(str_hours + ":" + str_minutes);
    }
}