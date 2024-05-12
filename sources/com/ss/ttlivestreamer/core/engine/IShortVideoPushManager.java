package com.ss.ttlivestreamer.core.engine;

import android.view.Surface;

/* loaded from: classes15.dex */
public interface IShortVideoPushManager {
    void activeSurface(Surface surface, int i, int i2);

    void enableVideoMirror(boolean z, boolean z2);

    Surface getSurface();

    boolean isVideoMirror(boolean z);

    void release();

    void releaseSurface(Surface surface);

    void setFitMode(boolean z);
}
