package com.ss.android.ugc.aweme.nows.player.strategy;

import X.C196977oD;
import X.EnumC196787nu;
import X.InterfaceC196737np;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class LifecycleStrategy extends C196977oD implements GenericLifecycleObserver {
    public final Lifecycle LJLILLLLZI;

    @Override // X.C196977oD, X.InterfaceC197027oI
    public final void onDetach() {
        this.LJLIL = null;
        this.LJLILLLLZI.removeObserver(this);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        InterfaceC196737np interfaceC196737np = this.LJLIL;
        if (interfaceC196737np != null) {
            interfaceC196737np.release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        InterfaceC196737np interfaceC196737np = this.LJLIL;
        if (interfaceC196737np != null) {
            interfaceC196737np.LJIIJJI(EnumC196787nu.PAGE);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        InterfaceC196737np interfaceC196737np = this.LJLIL;
        if (interfaceC196737np != null) {
            interfaceC196737np.LJIILJJIL(EnumC196787nu.PAGE);
        }
    }

    public LifecycleStrategy(Lifecycle lifecycle) {
        this.LJLILLLLZI = lifecycle;
    }

    @Override // X.C196977oD, X.InterfaceC197027oI
    public final void LIZ(InterfaceC196737np player) {
        o.LJIIIZ(player, "player");
        this.LJLIL = player;
        this.LJLILLLLZI.addObserver(this);
    }
}
