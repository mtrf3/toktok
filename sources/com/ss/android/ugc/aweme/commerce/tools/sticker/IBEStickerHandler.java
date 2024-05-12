package com.ss.android.ugc.aweme.commerce.tools.sticker;

import X.C16880lQ;
import X.C29S;
import X.ERS;
import X.ESP;
import X.InterfaceC81397Vx3;
import X.T4Q;
import Y.ARunnableS2S1101000_7;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBEStickerHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public final ShortVideoContext LJLILLLLZI;
    public final Handler LJLJI;
    public Effect LJLJJI;

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        ShortVideoContext shortVideoContext = this.LJLILLLLZI;
        if (shortVideoContext != null) {
            shortVideoContext.creativeModel.commerceModel.getIbeContext().setMetadata(null);
        }
        this.LJLJJI = null;
    }

    public IBEStickerHandler(C29S activity, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJJI = session.LIZ;
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        this.LJLJI.post(new ARunnableS2S1101000_7(i, this, str, 0));
    }
}
