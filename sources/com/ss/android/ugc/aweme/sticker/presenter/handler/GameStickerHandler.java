package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.C5H3;
import X.C62822Ol8;
import X.C76800UCe;
import X.ERS;
import X.ESP;
import X.InterfaceC65784Pro;
import X.InterfaceC81397Vx3;
import X.T4Q;
import X.V3N;
import X.WX1;
import X.WX2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class GameStickerHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public final SafeHandler LJLILLLLZI;
    public Effect LJLJI;
    public final C5H3<WX2> LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        if (this.LJLJJI.isInitialized()) {
            this.LJLJJI.getValue().onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        if (this.LJLJJI.isInitialized()) {
            this.LJLJJI.getValue().LIZIZ();
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return V3N.LJIILLIIL(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJJL.invoke();
        this.LJLJI = session.LIZ;
    }

    public GameStickerHandler(LifecycleOwner lifecycleOwner, C62822Ol8 c62822Ol8, AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLJJI = c62822Ol8;
        this.LJLJJL = aqS164S0100000_14;
        this.LJLILLLLZI = new SafeHandler(lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (!V3N.LJIILLIIL(this.LJLJI)) {
            return;
        }
        this.LJLILLLLZI.post(new WX1(this, i, i2, i3, str));
    }
}
