package com.ugc.effectcreator.effectcore.sdk;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bef.effectsdk.message.MessageCenter;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class CKEffectEditorContext$doAfterResLoad$2 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        MessageCenter.removeListener(null);
        throw null;
    }
}
