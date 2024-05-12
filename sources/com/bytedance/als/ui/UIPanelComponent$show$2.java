package com.bytedance.als.ui;

import X.C0Y1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.IDqS420S0100000;

/* loaded from: classes.dex */
public final class UIPanelComponent$show$2 implements GenericLifecycleObserver {
    public final /* synthetic */ UIPanelComponent LJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.LJLIL.LJLJL.getLifecycle().removeObserver(this);
        C0Y1.LIZ(new IDqS420S0100000(this, 19));
    }

    public UIPanelComponent$show$2(UIPanelComponent uIPanelComponent) {
        this.LJLIL = uIPanelComponent;
    }
}
