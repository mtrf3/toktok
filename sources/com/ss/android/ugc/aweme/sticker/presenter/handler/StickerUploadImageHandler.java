package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.ERS;
import X.ESP;
import X.ID0;
import X.InterfaceC81397Vx3;
import X.T4Q;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StickerUploadImageHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public Effect LJLILLLLZI;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLILLLLZI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LJIJI(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLILLLLZI = session.LIZ;
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (!ID0.LJIJI(this.LJLILLLLZI) || i != 69 || i2 != 1) {
        } else {
            throw null;
        }
    }
}
