package com.ss.ttlivestreamer.livestreamv2.render;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class DirectVideoMixer extends VideoMixer {
    public boolean mDirectRender;
    public int mHeight;
    public WeakReference<RenderView> mRenderView;
    public VideoSinkInternal mVideoSinkInternal;
    public int mWidth;

    @Override // com.ss.ttlivestreamer.core.mixer.VideoMixer, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mRenderView = new WeakReference<>(null);
        removeVideoSink(this.mVideoSinkInternal);
        this.mVideoSinkInternal.release();
        this.mVideoSinkInternal = null;
        super.release();
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isDirectRenderMode() {
        return this.mDirectRender;
    }

    /* loaded from: classes12.dex */
    public class VideoSinkInternal extends VideoSink {
        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public synchronized void release() {
            super.release();
        }

        public VideoSinkInternal() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            RenderView renderView = DirectVideoMixer.this.mRenderView.get();
            if (renderView != null) {
                renderView.onFrame(videoFrame);
            }
        }
    }

    public DirectVideoMixer(long j) {
        boolean z;
        VideoSinkInternal videoSinkInternal = new VideoSinkInternal();
        this.mVideoSinkInternal = videoSinkInternal;
        addVideoSink(videoSinkInternal);
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        this.mWidth = tEBundle.getInt("vmixer_width");
        this.mHeight = tEBundle.getInt("vmixer_height");
        tEBundle.setBool("vmixer_enable_gl_finish", GLThreadManager.isNeedFinish());
        if ((1024 & j) > 0) {
            z = true;
        } else {
            z = false;
        }
        tEBundle.setBool("vmixer_clear_stencil", z);
        tEBundle.setBool("vmixer_clear_rect", (j & 2048) > 0);
        setParameter(tEBundle);
        tEBundle.release();
        enableDirectRender(false);
    }

    public void enableDirectRender(boolean z) {
        this.mDirectRender = z;
        setEnable(!z);
    }

    public int onDirectFrame(VideoFrame videoFrame) {
        RenderView renderView;
        if (this.mDirectRender && (renderView = this.mRenderView.get()) != null) {
            renderView.onFrame(videoFrame);
            return 0;
        }
        return 0;
    }

    public void updateView(RenderView renderView) {
        this.mRenderView = new WeakReference<>(renderView);
    }

    public int onFrame(int i, VideoFrame videoFrame) {
        synchronized (this) {
            if (!this.mDirectRender) {
                return mixFrame(i, videoFrame);
            }
            return -1;
        }
    }

    public void updateSize(int i, int i2) {
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        tEBundle.setInt("vmixer_width", i);
        tEBundle.setInt("vmixer_height", i2);
        setParameter(tEBundle);
        tEBundle.release();
        this.mWidth = i;
        this.mHeight = i2;
    }

    public int onFrame(int i, VideoMixer.VideoMixerTexture videoMixerTexture) {
        synchronized (this) {
            if (!this.mDirectRender) {
                return mixFrame(i, videoMixerTexture);
            }
            return -1;
        }
    }
}
