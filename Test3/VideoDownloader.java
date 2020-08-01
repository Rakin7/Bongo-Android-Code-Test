public class VideoDownloader 
{
  private OnVideoSegmentReceivedListener onVideoSegmentReceivedListener;  
  public void download() // download asynchronously
  {
    boolean shouldDownloadVideo = true;
    while (shouldDownloadVideo) // Downloading and creating video segment
    {
      VideoSegment videoSegment = new VideoSegment(); 
      shouldDownloadVideo = !videoSegment.lastSegment; //base case for while loop
      onVideoSegmentReceivedListener.notifyVideoPlayer(videoSegment); 
    }
  }
  public void subscribe(BongoTest3 videoPlayer)
  {
    if (videoPlayer instanceof OnVideoSegmentReceivedListener) 
    {
      onVideoSegmentReceivedListener = (OnVideoSegmentReceivedListener) videoPlayer; //casting the videoPlayer
    } 
    else 
    {
      throw new ClassCastException("VideoPlayer should implement OnVideoSegmentReceivedListener.");
    }
  }
}