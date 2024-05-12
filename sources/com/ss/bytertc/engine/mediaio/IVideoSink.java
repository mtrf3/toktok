package com.ss.bytertc.engine.mediaio;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.video.VideoFrame;

/* loaded from: classes33.dex */
public interface IVideoSink {
    void consumeVideoFrame(VideoFrame videoFrame);

    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    int getRenderElapse();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
