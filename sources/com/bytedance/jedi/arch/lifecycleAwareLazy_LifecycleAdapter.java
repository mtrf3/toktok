package com.bytedance.jedi.arch;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* loaded from: classes13.dex */
public class lifecycleAwareLazy_LifecycleAdapter implements GeneratedAdapter {
    public final lifecycleAwareLazy LIZ;

    public lifecycleAwareLazy_LifecycleAdapter(lifecycleAwareLazy lifecycleawarelazy) {
        this.LIZ = lifecycleawarelazy;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Lifecycle.Event.ON_CREATE) {
            if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                this.LIZ.onStart();
            }
        }
    }
}
