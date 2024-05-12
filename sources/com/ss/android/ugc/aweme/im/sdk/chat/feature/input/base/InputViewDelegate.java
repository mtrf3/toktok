package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import X.C105134Ar;
import X.C105454Bx;
import X.C32V;
import X.C4B8;
import X.InterfaceC105124Aq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes2.dex */
public class InputViewDelegate implements InterfaceC105124Aq {
    public final InterfaceC105124Aq LJLIL;

    @Override // X.InterfaceC105124Aq
    public final /* synthetic */ boolean AQ() {
        throw null;
    }

    @Override // X.InterfaceC105124Aq
    public final void LLLLLZIL() {
    }

    @Override // X.InterfaceC105124Aq
    public final void i30(String str) {
    }

    @Override // X.InterfaceC105124Aq
    public final void n9() {
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        C105134Ar.LIZ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105134Ar.LIZIZ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    @Override // X.InterfaceC105124Aq
    public final int getPanelType() {
        InterfaceC105124Aq interfaceC105124Aq = this.LJLIL;
        if (interfaceC105124Aq != null) {
            return interfaceC105124Aq.getPanelType();
        }
        return -1;
    }

    @Override // X.InterfaceC105124Aq
    public final void vb() {
        this.LJLIL.vb();
    }

    public InputViewDelegate(InterfaceC105124Aq interfaceC105124Aq) {
        this.LJLIL = interfaceC105124Aq;
    }

    @Override // X.InterfaceC105124Aq
    public final void LLLZLZ(C105454Bx c105454Bx) {
        this.LJLIL.LLLZLZ(c105454Bx);
    }

    @Override // X.InterfaceC105124Aq
    public final void T0(C32V c32v, C4B8 c4b8) {
        this.LJLIL.T0(c32v, c4b8);
    }
}
