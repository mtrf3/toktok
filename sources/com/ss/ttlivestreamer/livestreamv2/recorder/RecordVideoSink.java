package com.ss.ttlivestreamer.livestreamv2.recorder;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.engine.VideoSink;

/* loaded from: classes12.dex */
public class RecordVideoSink extends VideoCapturer {
    public int mFps;
    public int mHeight;
    public int mWidth;
    public VideoSink mVideoSink = new VideoSink() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecordVideoSink.1
        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            RecordVideoSink.this.onFrame(videoFrame.getBuffer(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs() / 1000);
        }
    };
    public int mStatus = 0;

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        stop();
        super.release();
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            videoSink.release();
            this.mVideoSink = null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void stop() {
        this.mStatus = 2;
    }

    public VideoSink getVideoSink() {
        return this.mVideoSink;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        nativeAdaptedOutputFormat(i, i2, i3);
        this.mStatus = 1;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mStatus == 1) {
            return super.onFrame(buffer, i, i2, i3, j);
        }
        return -1;
    }

    public int pushVideoFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return onFrame(buffer, i, i2, i3, j);
    }
}
