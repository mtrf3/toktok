package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C10K;
import X.C221108m2;
import X.C52832KoO;
import X.C62822Ol8;
import X.C76800UCe;
import X.C81432Vxc;
import X.InterfaceC65784Pro;
import X.XOY;
import Y.ACallableS118S0100000_15;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AudioFocusManager implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final XOY LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (((Boolean) C52832KoO.LIZ.getValue()).booleanValue()) {
            C10K.LIZJ(new ACallableS118S0100000_15(this, 4));
            return;
        }
        XOY xoy = this.LJLJI;
        xoy.getClass();
        int i = XOY.LIZJ + 1;
        XOY.LIZJ = i;
        if (i != 1 || (interfaceC65784Pro = xoy.LIZ) == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (((Boolean) C52832KoO.LIZ.getValue()).booleanValue()) {
            C10K.LIZJ(new ACallableS118S0100000_15(this, 5));
            return;
        }
        XOY xoy = this.LJLJI;
        xoy.getClass();
        int i = XOY.LIZJ - 1;
        XOY.LIZJ = i;
        if (i != 0 || (interfaceC65784Pro = xoy.LIZIZ) == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public AudioFocusManager(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLILLLLZI = C221108m2.LIZIZ(C81432Vxc.INSTANCE);
        this.LJLJI = new XOY(new AqS165S0100000_15(this, 644), new AqS165S0100000_15(this, 645));
    }

    public static final AudioFocusManager LIZ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new AudioFocusManager(owner);
    }
}
