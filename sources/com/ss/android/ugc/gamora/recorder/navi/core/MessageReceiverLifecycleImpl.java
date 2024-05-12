package com.ss.android.ugc.gamora.recorder.navi.core;

import X.C36400EQi;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;

/* loaded from: classes13.dex */
public final class MessageReceiverLifecycleImpl extends C36400EQi implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onDestroy() {
        MessageCenter.removeListener(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        MessageCenter.addListener(this);
    }

    public MessageReceiverLifecycleImpl(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
    }
}
