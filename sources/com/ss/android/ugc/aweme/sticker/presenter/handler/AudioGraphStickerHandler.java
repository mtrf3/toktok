package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.C5NP;
import X.C76800UCe;
import X.C79070V1m;
import X.C79071V1n;
import X.C79074V1q;
import X.C82890Wg2;
import X.C82891Wg3;
import X.ERS;
import X.ESP;
import X.I28;
import X.IB0;
import X.InterfaceC79068V1k;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.T4Q;
import X.TMB;
import X.V3N;
import X.X1D;
import Y.ARunnableS32S0200000_13;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AudioGraphStickerHandler extends ESP implements GenericLifecycleObserver {
    public static AudioGraph LJLJJI;
    public static boolean LJLJJL;
    public static boolean LJLJJLL;
    public static boolean LJLJL;
    public static final I28 LJLJLJ = new I28();
    public final MicStickerAudioController LJLILLLLZI;
    public final InterfaceC79068V1k LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJI.LLZ();
        LJLJJI = null;
        C79070V1m.LIZ(this.LJLJI, false, false, 15);
        LJLJJL = false;
        LJLJJLL = false;
        AudioGraph audioGraph = LJLJJI;
        if (audioGraph != null && audioGraph.enableMic()) {
            MicStickerAudioController micStickerAudioController = this.LJLILLLLZI;
            C79071V1n c79071V1n = C79071V1n.LIZ;
            micStickerAudioController.getClass();
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(micStickerAudioController.LJLJI);
            LIZ.append(" cancelSticker isStop ");
            LIZ.append(micStickerAudioController.LJLJJLL);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            micStickerAudioController.LJLIL = null;
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = micStickerAudioController.LJLJLJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
            if (o.LJ(micStickerAudioController.LJLJJLL.LIZ(), Boolean.TRUE)) {
                micStickerAudioController.LIZ(c79071V1n);
            } else {
                micStickerAudioController.LJLILLLLZI = true;
            }
        }
        this.LJLJI.release();
    }

    public final void LJIILL() {
        if (LJLJJI != null && this.LJLJI.LIZLLL()) {
            this.LJLJI.LLZIL();
        }
    }

    public final void LJIILLIIL() {
        if (LJLJJI != null && !LJLJL && this.LJLJI.LIZLLL()) {
            this.LJLJI.LLZIL();
        }
    }

    public final void LJIIZILJ() {
        if (LJLJJI != null && LJLJL && this.LJLJI.LIZLLL()) {
            this.LJLJI.LLZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (LJLJJI == null) {
            return;
        }
        LJIIJJI();
        this.LJLJI.LLZ();
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        AudioGraph audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), V3N.LJII(session.LIZ.getSdkExtra(), "audio_graph"), AudioGraph.class);
        LJLJJI = audioGraph;
        if (audioGraph != null) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL(T4Q t4q) {
        AudioGraph audioGraph = LJLJJI;
        if (audioGraph != null && audioGraph.enableMusic()) {
            this.LJLJI.LJIIIIZZ(t4q.LIZ);
        }
        if (!LJLJL) {
            this.LJLJI.LLZIL();
            this.LJLJI.LLZ();
        }
        if (this.LJLJI.LIZLLL()) {
            if (LJLJL) {
                this.LJLJI.LLZ();
            }
            this.LJLJI.LLZIL();
        }
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        boolean z;
        Boolean useOutput;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJI.init();
        this.LJLJI.LLZ();
        LJLJJL = this.LJLJI.LJIIIZ();
        LJLJJLL = this.LJLJI.LIZJ();
        this.LJLJI.LJII();
        this.LJLJI.LJIIJ();
        InterfaceC79068V1k interfaceC79068V1k = this.LJLJI;
        AudioGraph audioGraph = LJLJJI;
        if (audioGraph != null && (useOutput = audioGraph.getUseOutput()) != null) {
            z = useOutput.booleanValue();
        } else {
            z = false;
        }
        C79070V1m.LIZ(interfaceC79068V1k, z, true, 12);
        this.LJLJI.LJ();
        this.LJLJI.LJI();
        AudioGraph audioGraph2 = LJLJJI;
        if (audioGraph2 != null && audioGraph2.enableMic()) {
            this.LJLJI.LIZIZ();
        }
        AudioGraph audioGraph3 = LJLJJI;
        if (audioGraph3 != null && audioGraph3.enableMic() && (!this.LJLJI.LIZJ() || this.LJLJI.LJFF())) {
            MicStickerAudioController micStickerAudioController = this.LJLILLLLZI;
            Effect effect = session.LIZ;
            C79074V1q c79074V1q = C79074V1q.LIZ;
            ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(this, session, 45);
            micStickerAudioController.getClass();
            o.LJIIIZ(effect, "effect");
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(micStickerAudioController.LJLJI);
            LIZ.append(" useSticker lifecycleOwner isActive: sticker ");
            LIZ.append(effect);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            micStickerAudioController.LJLIL = effect;
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = micStickerAudioController.LJLJLJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            if (micStickerAudioController.LJLJLLL.invoke().booleanValue()) {
                micStickerAudioController.LJLILLLLZI = false;
                Lifecycle lifecycle = micStickerAudioController.LJLJJI.getLifecycle();
                o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    micStickerAudioController.LJLJJL.LIZIZ(c79074V1q, aRunnableS32S0200000_13);
                    LJLJLJ.getClass();
                    AudioGraph audioGraph4 = LJLJJI;
                    if (audioGraph4 != null) {
                        InterfaceC88474Ynu<Boolean, Boolean, Boolean, Boolean, C76800UCe> interfaceC88474Ynu = micStickerAudioController.LJLL;
                        Boolean useOutput2 = audioGraph4.getUseOutput();
                        Boolean bool = Boolean.TRUE;
                        interfaceC88474Ynu.invoke(Boolean.valueOf(o.LJ(useOutput2, bool)), bool, Boolean.valueOf(LJLJJL), Boolean.valueOf(LJLJJLL));
                        return;
                    }
                    return;
                }
                return;
            }
            TMB tmb = C82890Wg2.LJFF;
            Context context = micStickerAudioController.LJLJL;
            tmb.getClass();
            TMB.LIZJ(R.string.t68, 1, context).LIZ();
            aRunnableS32S0200000_13.run();
            return;
        }
        LJIILJJIL(session);
    }

    public AudioGraphStickerHandler(LifecycleOwner lifecycleOwner, MicStickerAudioController micStickerAudioController, IB0 ib0) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = micStickerAudioController;
        this.LJLJI = ib0;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        if ((!kotlin.jvm.internal.o.LJ(r7, java.lang.Boolean.valueOf(com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJLL))) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        if (r8 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002a, code lost:
    
        if (r7 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler r5, java.lang.Boolean r6, java.lang.Boolean r7, boolean r8, int r9) {
        /*
            r0 = r9 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r6 = r1
        L6:
            r0 = r9 & 2
            if (r0 == 0) goto Lb
            r7 = r1
        Lb:
            r0 = r9 & 4
            if (r0 == 0) goto L10
            r8 = 0
        L10:
            com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJI
            r4 = 1
            if (r0 == 0) goto L1b
            if (r6 != 0) goto L1c
            if (r7 != 0) goto L2c
            if (r8 != 0) goto L3c
        L1b:
            return
        L1c:
            boolean r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L3c
            if (r7 == 0) goto L3a
        L2c:
            boolean r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L3c
        L3a:
            if (r8 == 0) goto L1b
        L3c:
            X.V1k r3 = r5.LJLJI
            com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJI
            if (r0 == 0) goto L46
            java.lang.Boolean r1 = r0.getUseOutput()
        L46:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r6 == 0) goto L6f
            boolean r1 = r6.booleanValue()
        L52:
            if (r7 == 0) goto L6c
            boolean r0 = r7.booleanValue()
        L58:
            r3.LIZ(r2, r4, r1, r0)
            if (r6 == 0) goto L63
            boolean r0 = r6.booleanValue()
            com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJL = r0
        L63:
            if (r7 == 0) goto L1b
            boolean r0 = r7.booleanValue()
            com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJLL = r0
            goto L1b
        L6c:
            boolean r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJLL
            goto L58
        L6f:
            boolean r1 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJL
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJIILIIL(com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler, java.lang.Boolean, java.lang.Boolean, boolean, int):void");
    }
}
