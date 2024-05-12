package com.ss.avframework.livestreamv2.core.interact.video;

/* loaded from: classes12.dex */
public interface VideoSinkFactory {
    VideoSink create(String str, boolean z, int i, boolean z2, boolean z3, boolean z4);

    void destroy(VideoSink videoSink);
}
