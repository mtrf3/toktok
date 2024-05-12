package com.ss.ttlivestreamer.livestreamv2.ktv;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class MVVideoCapture extends VideoCapturer {
    public boolean mStart;
    public int mVideoHeight;
    public VideoMixer mVideoMixer;
    public VideoSink mVideoMixerCallback;
    public int mVideoWidth;

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.removeVideoSink(this.mVideoMixerCallback);
            this.mVideoMixer.setEnable(false);
            this.mVideoMixer.release();
            this.mVideoMixer = null;
        }
        VideoSink videoSink = this.mVideoMixerCallback;
        if (videoSink != null) {
            videoSink.release();
            this.mVideoMixerCallback = null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void stop() {
        this.mStart = false;
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.setEnable(false);
        }
    }

    public MVVideoCapture() {
        VideoMixer videoMixer = new VideoMixer();
        this.mVideoMixer = videoMixer;
        videoMixer.setEnable(false);
        VideoSink videoSink = new VideoSink() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MVVideoCapture.1
            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public void OnDiscardedFrame() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                MVVideoCapture mVVideoCapture = MVVideoCapture.this;
                if (mVVideoCapture.mStart) {
                    mVVideoCapture.onFrame(videoFrame.getBuffer(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs() / 1000);
                }
            }
        };
        this.mVideoMixerCallback = videoSink;
        this.mVideoMixer.addVideoSink(videoSink);
    }

    public VideoMixer getVideoMixer() {
        return this.mVideoMixer;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSource
    public void adaptOutputFormat(int i, int i2, int i3) {
        super.adaptOutputFormat(i, i2, i3);
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        if (this.mVideoMixer != null) {
            TEBundle tEBundle = new TEBundle();
            this.mVideoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_width", this.mVideoWidth);
            tEBundle.setInt("vmixer_height", this.mVideoHeight);
            this.mVideoMixer.setParameter(tEBundle);
            tEBundle.release();
            this.mVideoMixer.setEnable(true);
        }
        adaptOutputFormat(i, i2, i3);
        this.mStart = true;
    }
}
