package com.ss.bytertc.engine.video;

/* loaded from: classes33.dex */
public abstract class IVideoProcessor {
    public void onGLEnvInitiated() {
    }

    public void onGLEnvRelease() {
    }

    public abstract VideoFrame processVideoFrame(VideoFrame videoFrame);
}
