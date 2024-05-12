package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* loaded from: classes12.dex */
public abstract class VideoSink extends NativeObject {
    public abstract void OnDiscardedFrame();

    public abstract void onFrame(VideoFrame videoFrame);

    public void onFrameOnJava(VideoFrame videoFrame) {
        onFrame(videoFrame);
    }
}
