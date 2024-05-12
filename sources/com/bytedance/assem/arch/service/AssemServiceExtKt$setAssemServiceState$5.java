package com.bytedance.assem.arch.service;

import X.C207588Cs;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AssemServiceExtKt$setAssemServiceState$5 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
        o.LJIIIZ(event, "event");
        if (C207588Cs.LIZ[event.ordinal()] != 1) {
        } else {
            throw null;
        }
    }
}
