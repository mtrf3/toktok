package com.byted.cast.sdk.render.video;

/* loaded from: classes29.dex */
public interface VideoJitterBufferCallback {
    void onOutputFrame(long j);

    void onRenderFrame(long j);

    void onVideoSize(int i, int i2);
}
