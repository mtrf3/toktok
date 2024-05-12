package com.ss.ttlivestreamer.livestreamv2.core;

import android.view.Surface;

/* loaded from: classes12.dex */
public interface IPushFrameAfterCapture {
    void release();

    void start(Surface surface);

    void stop();

    void toAddSurfaceViewCallback();

    void toRemoveSurfaceViewCallback();
}
