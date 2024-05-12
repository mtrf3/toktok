package com.bytedance.assem.arch.extensions.assemble;

import X.GFK;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AssemAssembleExtKt$assemAssembleInit$2$1$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (GFK.LIZ[event.ordinal()] != 1) {
        } else {
            throw null;
        }
    }
}
