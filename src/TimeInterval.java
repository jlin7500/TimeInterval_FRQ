import java.sql.Time;

public class TimeInterval
{
    int start;
    int end;
    public TimeInterval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    public boolean OverlapsWith(TimeInterval interval)
    {
        if(this.start >= interval.start && this.end <= interval.end)
        {
            return true;
        }
        if(interval.start >= this.start && interval.start <= this.end)
        {
            return true;
        }
        return false;
    }
}
