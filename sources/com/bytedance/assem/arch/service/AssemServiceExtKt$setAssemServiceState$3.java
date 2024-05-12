package com.bytedance.assem.arch.service;

import X.GFM;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AssemServiceExtKt$setAssemServiceState$3 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
        o.LJIIIZ(event, "event");
        if (GFM.LIZ[event.ordinal()] != 1) {
        } else {
            throw null;
        }
    }
}
