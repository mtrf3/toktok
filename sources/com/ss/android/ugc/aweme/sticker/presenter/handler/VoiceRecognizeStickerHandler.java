package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC79069V1l;
import X.C0IB;
import X.C29S;
import X.C34436DfM;
import X.C46175IAh;
import X.C5NP;
import X.C76800UCe;
import X.C79071V1n;
import X.C79072V1o;
import X.C79074V1q;
import X.C82890Wg2;
import X.C82891Wg3;
import X.ERS;
import X.ESP;
import X.ID0;
import X.InterfaceC65784Pro;
import X.InterfaceC78918UyA;
import X.T4Q;
import X.TMB;
import X.X1D;
import Y.AObjectS88S0100000_13;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceRecognizeStickerHandler extends ESP implements GenericLifecycleObserver {
    public volatile Effect LJLILLLLZI;
    public volatile boolean LJLJI;
    public final String LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final InterfaceC78918UyA LJLJJLL;
    public final C0IB<Boolean> LJLJL;
    public final Context LJLJLJ;
    public final InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final InterfaceC65784Pro<Boolean> LJLL;
    public final InterfaceC65784Pro<Boolean> LJLLI;

    public VoiceRecognizeStickerHandler() {
        throw null;
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLILLLLZI = null;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJI);
        LIZ.append(" cancelSticker isStop ");
        LIZ.append(this.LJLJL);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (o.LJ(this.LJLJL.LIZ(), Boolean.TRUE)) {
            this.LJLJJLL.LIZ(C79071V1n.LIZ);
        } else {
            this.LJLJI = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJI);
        LIZ.append(" onStop currentSticker ");
        LIZ.append(this.LJLILLLLZI);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI != null) {
            this.LJLJJLL.LIZ(C79072V1o.LIZ);
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LJJII(session.LIZ);
    }

    public final void LJIILIIL(AbstractC79069V1l abstractC79069V1l) {
        Lifecycle lifecycle = this.LJLJJL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED) && this.LJLLI.invoke().booleanValue()) {
            this.LJLJJLL.LIZIZ(abstractC79069V1l, null);
        }
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJI);
        LIZ.append(" useSticker lifecycleOwner isActive: sticker ");
        LIZ.append(session.LIZ);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLILLLLZI = session.LIZ;
        if (this.LJLL.invoke().booleanValue()) {
            this.LJLJI = false;
            LJIILIIL(C79074V1q.LIZ);
        } else {
            TMB tmb = C82890Wg2.LJFF;
            Context context = this.LJLJLJ;
            tmb.getClass();
            TMB.LIZJ(R.string.t68, 1, context).LIZ();
        }
    }

    public VoiceRecognizeStickerHandler(LifecycleOwner lifecycleOwner, C46175IAh c46175IAh, C0IB recordHasStopped, C29S context, AqS157S0100000_7 aqS157S0100000_7) {
        C34436DfM allowStartAudioRecorderByMicState = C34436DfM.LJLIL;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordHasStopped, "recordHasStopped");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(allowStartAudioRecorderByMicState, "allowStartAudioRecorderByMicState");
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = c46175IAh;
        this.LJLJL = recordHasStopped;
        this.LJLJLJ = context;
        this.LJLJLLL = null;
        this.LJLL = allowStartAudioRecorderByMicState;
        this.LJLLI = aqS157S0100000_7;
        this.LJLJJI = "VoiceRecognizeStickerHandler";
        lifecycleOwner.getLifecycle().addObserver(this);
        recordHasStopped.LIZIZ(lifecycleOwner, new AObjectS88S0100000_13(this, 5));
    }
}
