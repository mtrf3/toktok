package com.bytedance.analytics.page;

import X.C0IC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class TrackerProcessLifecycleObserver implements LifecycleEventObserver {
    public static final TrackerProcessLifecycleObserver LJLIL = new TrackerProcessLifecycleObserver();
    public static boolean LJLILLLLZI = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (C0IC.LIZ[event.ordinal()] != 1 || !LJLILLLLZI) {
            return;
        }
        LJLILLLLZI = false;
    }
}
