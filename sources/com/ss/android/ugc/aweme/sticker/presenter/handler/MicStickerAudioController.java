package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC79069V1l;
import X.C0IB;
import X.C29S;
import X.C46175IAh;
import X.C5NP;
import X.C76800UCe;
import X.C79071V1n;
import X.C79072V1o;
import X.C79073V1p;
import X.C82891Wg3;
import X.I28;
import X.InterfaceC65784Pro;
import X.InterfaceC78918UyA;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.X1D;
import Y.AObjectS88S0100000_13;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.IDqS453S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MicStickerAudioController implements GenericLifecycleObserver {
    public volatile Effect LJLIL;
    public volatile boolean LJLILLLLZI;
    public final String LJLJI;
    public final LifecycleOwner LJLJJI;
    public final InterfaceC78918UyA LJLJJL;
    public final C0IB<Boolean> LJLJJLL;
    public final Context LJLJL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJLJ;
    public final InterfaceC65784Pro<Boolean> LJLJLLL;
    public final InterfaceC88474Ynu<Boolean, Boolean, Boolean, Boolean, C76800UCe> LJLL;

    public MicStickerAudioController() {
        throw null;
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
        LIZ.append(this.LJLJI);
        LIZ.append(" onStop currentSticker ");
        LIZ.append(this.LJLIL);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (this.LJLIL != null) {
            LIZ(C79072V1o.LIZ);
        }
    }

    public final void LIZ(AbstractC79069V1l abstractC79069V1l) {
        boolean z;
        this.LJLJJL.LIZ(abstractC79069V1l);
        I28 i28 = AudioGraphStickerHandler.LJLJLJ;
        i28.getClass();
        if (AudioGraphStickerHandler.LJLJJI != null || AudioGraphStickerHandler.LJLJJL || AudioGraphStickerHandler.LJLJJLL) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = null;
        if (z && (o.LJ(C79072V1o.LIZ, abstractC79069V1l) || o.LJ(C79073V1p.LIZ, abstractC79069V1l) || o.LJ(C79071V1n.LIZ, abstractC79069V1l))) {
            InterfaceC88474Ynu<Boolean, Boolean, Boolean, Boolean, C76800UCe> interfaceC88474Ynu = this.LJLL;
            Boolean bool2 = Boolean.FALSE;
            interfaceC88474Ynu.invoke(bool2, bool2, bool2, bool2);
            i28.getClass();
            AudioGraphStickerHandler.LJLJJI = null;
            i28.getClass();
            AudioGraphStickerHandler.LJLJJL = false;
            i28.getClass();
            AudioGraphStickerHandler.LJLJJLL = false;
            return;
        }
        i28.getClass();
        if (AudioGraphStickerHandler.LJLJJI == null) {
            return;
        }
        InterfaceC88474Ynu<Boolean, Boolean, Boolean, Boolean, C76800UCe> interfaceC88474Ynu2 = this.LJLL;
        i28.getClass();
        AudioGraph audioGraph = AudioGraphStickerHandler.LJLJJI;
        if (audioGraph != null) {
            bool = audioGraph.getUseOutput();
        }
        Boolean bool3 = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(o.LJ(bool, bool3));
        Boolean bool4 = Boolean.FALSE;
        i28.getClass();
        interfaceC88474Ynu2.invoke(valueOf, bool3, bool4, Boolean.valueOf(AudioGraphStickerHandler.LJLJJLL));
    }

    public MicStickerAudioController(LifecycleOwner lifecycleOwner, C46175IAh c46175IAh, C0IB recordHasStopped, C29S context, AqS157S0100000_7 aqS157S0100000_7, IDqS453S0100000_7 iDqS453S0100000_7) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordHasStopped, "recordHasStopped");
        o.LJIIIZ(context, "context");
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = c46175IAh;
        this.LJLJJLL = recordHasStopped;
        this.LJLJL = context;
        this.LJLJLJ = null;
        this.LJLJLLL = aqS157S0100000_7;
        this.LJLL = iDqS453S0100000_7;
        this.LJLJI = "MicStickerAudioController";
        lifecycleOwner.getLifecycle().addObserver(this);
        recordHasStopped.LIZIZ(lifecycleOwner, new AObjectS88S0100000_13(this, 4));
    }
}
