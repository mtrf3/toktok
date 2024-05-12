package com.bytedance.widget;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* loaded from: classes13.dex */
public class Widget_LifecycleAdapter implements GeneratedAdapter {
    public final Widget LIZ;

    public Widget_LifecycleAdapter(Widget widget) {
        this.LIZ = widget;
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
            if (!z2 || methodCallsLogger.approveCall("create$widget_release", 1)) {
                this.LIZ.create$widget_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger.approveCall("start$widget_release", 1)) {
                this.LIZ.start$widget_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("resume$widget_release", 1)) {
                this.LIZ.resume$widget_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger.approveCall("pause$widget_release", 1)) {
                this.LIZ.pause$widget_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            if (!z2 || methodCallsLogger.approveCall("stop$widget_release", 1)) {
                this.LIZ.stop$widget_release();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("destroy$widget_release", 1)) {
                this.LIZ.destroy$widget_release();
            }
        }
    }
}
