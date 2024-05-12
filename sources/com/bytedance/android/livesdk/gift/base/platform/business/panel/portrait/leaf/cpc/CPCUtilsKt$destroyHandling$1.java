package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes6.dex */
public final class CPCUtilsKt$destroyHandling$1 implements GenericLifecycleObserver {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dispose() {
        this.LJLIL.invoke();
    }

    public CPCUtilsKt$destroyHandling$1(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }
}
