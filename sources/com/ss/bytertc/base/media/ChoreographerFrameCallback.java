package com.ss.bytertc.base.media;

import X.C16880lQ;
import android.view.Choreographer;
import android.view.Surface;

/* loaded from: classes33.dex */
public class ChoreographerFrameCallback implements Choreographer.FrameCallback {
    public Surface currentSurface;
    public long nativeCallbackHandle;
    public String renderTaskUUID;

    public void resetCallback() {
        this.nativeCallbackHandle = 0L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.nativeCallbackHandle != 0) {
            C16880lQ.LLIIIJ().postFrameCallback(this);
            Surface surface = this.currentSurface;
            if (surface != null) {
                RTCNativeFunctions.nativeNotifyChoreographerDoFrame(this.nativeCallbackHandle, surface, this.renderTaskUUID);
            }
        }
    }
}
