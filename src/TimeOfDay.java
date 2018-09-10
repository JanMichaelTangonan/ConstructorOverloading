public class TimeOfDay {

    private int mHours;
    private int pMinutes;

    public TimeOfDay() {
        this(0,0);

    }

    public TimeOfDay(int pHours){
        this(pHours,0);


    }

    public TimeOfDay(int pHours, int pMinutes) {
        setmHours(pHours);

        setpMinutes(pMinutes);

    }

    public int getmHours() {
        return mHours;
    }

    public int getmMinutes() {
        return pMinutes;
    }


    public void setmHours (int pHour) {
        if (pHour < 24 && pHour > 0) {
            this.mHours = pHour;
        }
        else{
            throw new IllegalArgumentException("Bad Data input: Hours: "+ pHour);
        }
    }


    public void setpMinutes (int pMinutes) {
        if (pMinutes < 60 && pMinutes >=0){
            this.pMinutes = pMinutes;
        }
        else{
            throw new IllegalArgumentException("Bad Data input: Minutes "+ pMinutes);
        }

    }


}

