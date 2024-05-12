package com.ss.android.ugc.aweme.story.base.distribution.dispatcher;

import X.AbstractC54806Lf8;
import X.C54808LfA;
import X.InterfaceC54770LeY;
import X.InterfaceC92693kP;
import X.ORS;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Set;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryReceiver implements GenericLifecycleObserver {
    public final Object LJLIL;
    public final InterfaceC54770LeY LJLILLLLZI;
    public final AbstractC54806Lf8<?, ?> LJLJI;
    public InterfaceC92693kP LJLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        AbstractC54806Lf8<?, ?> abstractC54806Lf8 = this.LJLJI;
        InterfaceC54770LeY storyView = this.LJLILLLLZI;
        abstractC54806Lf8.getClass();
        o.LJIIIZ(storyView, "storyView");
        Set<StoryReceiver> set = abstractC54806Lf8.LIZ.get(storyView);
        if (set != null) {
            ORS.LJJLIIJ(set, new AqS175S0100000_9(this, 629));
        }
        abstractC54806Lf8.LIZ.remove(storyView);
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public StoryReceiver(Object key, InterfaceC54770LeY storyView, C54808LfA dispatcher) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(storyView, "storyView");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LJLIL = key;
        this.LJLILLLLZI = storyView;
        this.LJLJI = dispatcher;
        storyView.getLifecycle().addObserver(this);
    }
}
