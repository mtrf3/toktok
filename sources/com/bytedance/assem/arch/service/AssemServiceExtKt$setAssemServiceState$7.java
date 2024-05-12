package com.bytedance.assem.arch.service;

import X.GFN;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AssemServiceExtKt$setAssemServiceState$7 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
        o.LJIIIZ(event, "event");
        if (GFN.LIZ[event.ordinal()] != 1) {
        } else {
            throw null;
        }
    }
}
