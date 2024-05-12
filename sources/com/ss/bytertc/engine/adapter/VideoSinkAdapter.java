package com.ss.bytertc.engine.adapter;

import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;

/* loaded from: classes33.dex */
public class VideoSinkAdapter implements IVideoSink {
    public com.ss.bytertc.engine.mediaio.IVideoSink mBridgedOldSink;
    public boolean mDirectPush;
    public boolean mInitialized;
    public IVideoSink mSink;
    public boolean mStarted;
    public VideoSinkTask mVideoSinkTask;

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public int getRenderElapse() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getRenderElapse();
        }
        return 0;
    }

    public void release() {
        VideoSinkTask videoSinkTask;
        if (this.mBridgedOldSink != null && (videoSinkTask = this.mVideoSinkTask) != null) {
            videoSinkTask.post(new Runnable() { // from class: com.ss.bytertc.engine.adapter.VideoSinkAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_bytertc_engine_adapter_VideoSinkAdapter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_bytertc_engine_adapter_VideoSinkAdapter$1__run$___twin___() {
                    com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink = VideoSinkAdapter.this.mBridgedOldSink;
                    if (iVideoSink != null) {
                        iVideoSink.onStop();
                        VideoSinkAdapter.this.mBridgedOldSink.onDispose();
                    }
                }

                public static void com_ss_bytertc_engine_adapter_VideoSinkAdapter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_bytertc_engine_adapter_VideoSinkAdapter$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public VideoSinkAdapter(IVideoSink iVideoSink) {
        this.mSink = iVideoSink;
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public void onFrame(VideoFrame videoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            iVideoSink.onFrame(videoFrame);
            return;
        }
        com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink2 = this.mBridgedOldSink;
        if (iVideoSink2 == null) {
            return;
        }
        iVideoSink2.consumeVideoFrame(videoFrame);
    }

    public void onVideoFrame(VideoFrame videoFrame) {
        if (videoFrame == null) {
            return;
        }
        onFrame(videoFrame);
    }

    public VideoSinkAdapter(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, VideoSinkTask videoSinkTask) {
        this.mBridgedOldSink = iVideoSink;
        this.mVideoSinkTask = videoSinkTask;
    }

    public VideoSinkAdapter(IVideoSink iVideoSink, boolean z) {
        this.mSink = iVideoSink;
        this.mDirectPush = z;
    }
}
