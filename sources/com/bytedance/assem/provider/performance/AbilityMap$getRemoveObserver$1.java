package com.bytedance.assem.provider.performance;

import X.C53897LDh;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AbilityMap$getRemoveObserver$1 implements LifecycleEventObserver {
    public final /* synthetic */ Object LJLIL;

    public AbilityMap$getRemoveObserver$1(Object obj) {
        this.LJLIL = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            source.getLifecycle().removeObserver(this);
            C53897LDh.LIZ.remove(this.LJLIL);
        }
    }
}
