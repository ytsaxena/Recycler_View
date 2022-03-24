package android.example.recyclerview;

public class ModelClass {
    private int imageview;
    private String texttitle;
    private String time;
    private String message;
    private String divider;


    public ModelClass(int imageview, String texttitle, String time, String message, String divider) {
        this.imageview = imageview;
        this.texttitle = texttitle;
        this.time = time;
        this.message = message;
        this.divider = divider;
    }


    public int getImageview() {
        return imageview;
    }

    public String getTexttitle() {
        return texttitle;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public String getDivider() {
        return divider;
    }

}
