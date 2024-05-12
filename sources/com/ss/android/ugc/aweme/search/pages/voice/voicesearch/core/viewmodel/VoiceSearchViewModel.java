package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel;

import X.C94350afa;
import X.C94351afb;
import X.C94710alO;
import X.XKQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.IDqS419S0100000_42;

/* loaded from: classes34.dex */
public final class VoiceSearchViewModel extends AssemViewModel<C94350afa> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public XKQ LJLILLLLZI;
    public int LJLJI;
    public final C94351afb LJLIL = new C94351afb();
    public String LJLJJI = "";
    public String LJLJJL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C94350afa defaultState() {
        return new C94350afa(0);
    }

    public final void gv0() {
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        setState(new IDqS419S0100000_42(this, 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.speech.speechengine.SpeechEngine] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bytedance.speech.speechengine.SpeechEngine] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.speech.speechengine.SpeechEngine$SpeechListener] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.speech.speechengine.SpeechEngine] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "cluster"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.afb r4 = r5.LJLIL
            X.aTR r3 = new X.aTR
            r3.<init>(r5)
            r4.getClass()
            X.C93758aW2.LIZ()
            r2 = 0
            com.bytedance.speech.speechengine.SpeechEngine r1 = com.bytedance.speech.speechengine.SpeechEngineGenerator.getInstance()     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L1a
            goto L48
        L1a:
            r1.createEngine()     // Catch: java.lang.Throwable -> L39
            X.C93963aZL.LIZ(r1, r6)     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Throwable -> L39
            r1.setContext(r0)     // Catch: java.lang.Throwable -> L39
            int r0 = r1.initEngine()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L34
            r1.setListener(r2)     // Catch: java.lang.Throwable -> L39
            r1.destroyEngine()     // Catch: java.lang.Throwable -> L39
            goto L48
        L34:
            r1.setListener(r4)     // Catch: java.lang.Throwable -> L39
            goto L47
        L38:
            r1 = r2
        L39:
            java.lang.String r0 = "asrengine_loadso_failed_2"
            X.C78983UzD.LJIILL(r0)
            if (r1 == 0) goto L48
            r1.setListener(r2)
            r1.destroyEngine()
            goto L48
        L47:
            r2 = r1
        L48:
            r4.LIZ = r2
            if (r2 != 0) goto L50
            r3.LIZ()
        L4f:
            return
        L50:
            r3.LIZIZ()
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel.hv0(java.lang.String):void");
    }

    public final void iv0(int i, boolean z, boolean z2) {
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C94350afa state = getState();
        if (z) {
            if (state.LJLIL == 4 && !z2) {
                this.LJLIL.LIZIZ(3);
                return;
            } else {
                this.LJLIL.LIZIZ(i);
                gv0();
                return;
            }
        }
        int i2 = state.LJLIL;
        if (i2 == 1 || i2 == 3) {
            this.LJLIL.LIZIZ(2);
            setState(C94710alO.LJLIL);
        } else {
            this.LJLIL.LIZIZ(1);
            gv0();
        }
    }
}
