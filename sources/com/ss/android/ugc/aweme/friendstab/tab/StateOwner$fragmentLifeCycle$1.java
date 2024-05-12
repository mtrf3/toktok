package com.ss.android.ugc.aweme.friendstab.tab;

import X.C76800UCe;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes10.dex */
public final class StateOwner$fragmentLifeCycle$1 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        StateOwner.LJLIL.getClass();
        StateOwner.LJLLJ.postValue(C76800UCe.LIZ);
    }
}
