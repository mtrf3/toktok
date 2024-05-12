package com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope;

import X.C55096Ljo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LinkMicScopeExtKt$bindLinkAbilityInternal$1$1$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            C55096Ljo.LJIILL(null, null, null);
        }
    }
}
