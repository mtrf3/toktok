package com.bytedance.creativex.camerakit.camera.session.recorder.impl;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* loaded from: classes15.dex */
public class RecorderImpl_LifecycleAdapter implements GeneratedAdapter {
    public final RecorderImpl LIZ;

    public RecorderImpl_LifecycleAdapter(RecorderImpl recorderImpl) {
        this.LIZ = recorderImpl;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
                this.LIZ.onResume();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger.approveCall("onPause", 1)) {
                this.LIZ.onPause();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("release", 1)) {
                this.LIZ.release();
            }
        }
    }
}
