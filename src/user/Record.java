package user;
import java.util.Date;
import java.sql.Blob;

public class Record {
    private URKey urKey;
    private Blob answer;
    private Date date;

    public Record(){}

    public URKey getUrKey(){return urKey;}
    public void setUrKey(URKey urKey){this.urKey=urKey;}

    public Blob getAnswer(){return answer;}
    public void setAnswer(Blob answer){this.answer=answer;}

    public Date getDate(){return date;}
    public void setDate(Date date){this.date=date;}
}
