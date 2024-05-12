package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.C46207IBn;
import X.ERS;
import X.ESP;
import X.IC5;
import X.ICG;
import X.ID0;
import X.InterfaceC46206IBm;
import X.InterfaceC81397Vx3;
import X.T4Q;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickerVideoStatusHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public Effect LJLILLLLZI;
    public int LJLJI;
    public volatile boolean LJLJJI;
    public boolean LJLJJL;
    public final InterfaceC46206IBm LJLJJLL;
    public final IC5 LJLJL;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLILLLLZI = null;
        if (!this.LJLJJI) {
            return;
        }
        this.LJLJJLL.LIZIZ(false);
        this.LJLJJLL.LIZJ(null);
        this.LJLJJI = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroyed();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyed() {
        if (!ID0.LJIILLIIL(this.LJLILLLLZI) || !this.LJLJJI) {
            return;
        }
        this.LJLJJLL.LIZIZ(false);
        this.LJLJJLL.LIZJ(null);
        this.LJLJJI = false;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LJIILLIIL(this.LJLILLLLZI);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLILLLLZI = session.LIZ;
        this.LJLJJI = true;
        this.LJLJJL = false;
        this.LJLJI = 2;
        this.LJLJJLL.LIZIZ(true);
        this.LJLJJLL.LIZJ(new C46207IBn(this));
    }

    public StickerVideoStatusHandler(LifecycleOwner lifecycleOwner, ICG icg, IC5 ic5) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJLL = icg;
        this.LJLJL = ic5;
        this.LJLJI = 2;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (ID0.LJIILLIIL(this.LJLILLLLZI) && i == 52) {
            this.LJLJI = i2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.LJLJJLL.start();
                    return;
                }
                this.LJLJJLL.pause();
                return;
            }
            if (this.LJLJJL) {
                return;
            }
            IC5 ic5 = this.LJLJL;
            if (ic5 != null && ic5.LIZJ() && this.LJLJL.LIZIZ()) {
                return;
            }
            this.LJLJJLL.start();
        }
    }
}
