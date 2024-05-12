package com.ss.ttlivestreamer.core.engine;

/* loaded from: classes12.dex */
public class VideoTrack extends MediaTrack {
    public VideoProcessor mVideoProcessor;

    public native double nativeGetStaticsInfoWithKey(String str);

    public native void nativeSetVideoProcessor(VideoProcessor videoProcessor);

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public synchronized void release() {
        super.release();
        VideoProcessor videoProcessor = this.mVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.release();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public void addVideoSink(VideoSink videoSink) {
        super.addVideoSink(videoSink);
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public boolean containVideoSink(VideoSink videoSink) {
        return super.containVideoSink(videoSink);
    }

    public double getStaticsInfoWithKey(String str) {
        return nativeGetStaticsInfoWithKey(str);
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public void removeVideoSink(VideoSink videoSink) {
        super.removeVideoSink(videoSink);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        this.mVideoProcessor = videoProcessor;
        nativeSetVideoProcessor(videoProcessor);
    }

    public VideoTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
