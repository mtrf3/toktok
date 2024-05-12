package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* loaded from: classes13.dex */
public class JediViewHolder_LifecycleAdapter implements GeneratedAdapter {
    public final JediViewHolder LIZ;

    public JediViewHolder_LifecycleAdapter(JediViewHolder jediViewHolder) {
        this.LIZ = jediViewHolder;
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
        if (event == Lifecycle.Event.ON_CREATE) {
            if (!z2 || methodCallsLogger.approveCall("create$ext_adapter_release", 1)) {
                this.LIZ.create$ext_adapter_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger.approveCall("start$ext_adapter_release", 1)) {
                this.LIZ.start$ext_adapter_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("resume$ext_adapter_release", 1)) {
                this.LIZ.resume$ext_adapter_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger.approveCall("pause$ext_adapter_release", 1)) {
                this.LIZ.pause$ext_adapter_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            if (!z2 || methodCallsLogger.approveCall("stop$ext_adapter_release", 1)) {
                this.LIZ.stop$ext_adapter_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("destroy$ext_adapter_release", 1)) {
                this.LIZ.destroy$ext_adapter_release();
            }
        }
    }
}
