package com.ss.bytertc.engine.video;

/* loaded from: classes33.dex */
public interface IVideoSink {
    int getRenderElapse();

    void onFrame(VideoFrame videoFrame);
}
