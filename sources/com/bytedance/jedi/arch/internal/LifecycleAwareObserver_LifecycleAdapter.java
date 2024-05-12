package com.bytedance.jedi.arch.internal;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* loaded from: classes13.dex */
public class LifecycleAwareObserver_LifecycleAdapter implements GeneratedAdapter {
    public final LifecycleAwareObserver LIZ;

    public LifecycleAwareObserver_LifecycleAdapter(LifecycleAwareObserver lifecycleAwareObserver) {
        this.LIZ = lifecycleAwareObserver;
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
            if (!z2 || methodCallsLogger.approveCall("onLifecycleEvent", 2)) {
                this.LIZ.onLifecycleEvent(lifecycleOwner);
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                this.LIZ.onDestroy();
            }
        }
    }
}
