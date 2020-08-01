//"Taken a lot of help from google and github while doing this task"
//Observer design pattern is used
import java.util.*;
public class BongoTest3 extends Thread implements OnVideoSegmentReceivedListener //using thread class and implementing OnVideoSegmentReceivedListener class
{
  private List<VideoSegment> videoSegmentList = new ArrayList<VideoSegment>(); //listing all the VideoSegment objects
  public static void main(String[] args) //main method
  {
    BongoTest3 videoPlayer = new BongoTest3();
    VideoDownloader videoDownloader = new VideoDownloader();
    videoDownloader.subscribe(videoPlayer);
    videoPlayer.play();
  }
  public void notifyVideoPlayer(VideoSegment videoSegment) //overridden method for adding to the list
  {
    videoSegmentList.add(videoSegment);
    interrupt(); //triggering Thread state
  }
  private boolean playVideoSegment() 
  {
    System.out.println("Playing video......");
    return true;
  } 
  private boolean playVideoSegmentToSpecificPosition(int offset) //controlling the position while forward and rewind
  {
    synchronized (this) //one thread at a time
    {
      notify(); //triggering a waiting thread
      System.out.println("Played to position " + offset);
    }
    return true;
  }
  public boolean play() //playing video
  {
    try 
    {
      synchronized (this) //one thread at a time
      {
        wait(1000); //waiting cycle
        System.out.println("Buffering......"); //if timeout
        return playVideoSegment(); 
      }
    } 
    catch (InterruptedException e) 
    {
      return playVideoSegment();
    }
  }
  public boolean forward(int position) //forwarding video to the position
  {
    return playVideoSegmentToSpecificPosition(position);
  } 
  public boolean rewind() //rewinding video and starting from first frame
  {
    return playVideoSegmentToSpecificPosition(0);
  }
}