package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm;

import X.C105814Dh;
import X.C105914Dr;
import X.C105934Dt;
import X.C105994Dz;
import X.C221108m2;
import X.C34B;
import X.C4E7;
import X.C4EE;
import X.C4Y9;
import X.C62822Ol8;
import X.C78613UtF;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.speech.speechengine.SpeechEngine;
import kotlin.jvm.internal.AqS13S0000100_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS6S0010000_1;

/* loaded from: classes2.dex */
public final class TakoSpeechViewModel extends AssemViewModel<C105934Dt> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C4EE.LJLIL);
    public XKQ LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C105934Dt defaultState() {
        return new C105934Dt(0);
    }

    public final C4E7 hv0() {
        return (C4E7) this.LJLIL.getValue();
    }

    public final void jv0() {
        C34B.LIZIZ("TakoSpeechViewModel", "startSpeech");
        hv0().LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        setState(new AqS13S0000100_1(currentTimeMillis, 0));
        if (C4Y9.LIZIZ()) {
            this.LJLILLLLZI = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C105914Dr(this, currentTimeMillis, null), 2);
        }
    }

    public final void kv0() {
        C34B.LIZIZ("TakoSpeechViewModel", "stopSpeech");
        setState(C105994Dz.LJLIL);
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        SpeechEngine speechEngine = hv0().LIZ;
        if (speechEngine != null) {
            speechEngine.sendDirective(2001, "");
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C4E7 hv0 = hv0();
        SpeechEngine speechEngine = hv0.LIZ;
        if (speechEngine != null) {
            speechEngine.setListener(null);
        }
        SpeechEngine speechEngine2 = hv0.LIZ;
        if (speechEngine2 != null) {
            speechEngine2.destroyEngine();
        }
        hv0.LIZ = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        hv0().LIZIZ = this;
    }

    public final void lv0(Exception exc) {
        setState(new AqS167S0100000_1(exc, 117));
    }

    public final void mv0(boolean z) {
        XKQ xkq;
        setState(new AqS6S0010000_1(z, 1));
        setState(C105994Dz.LJLIL);
        if (!z && (xkq = this.LJLILLLLZI) != null) {
            xkq.LIZIZ(null);
        }
    }

    public final void iv0(int i, Exception exc) {
        if (i == 1013) {
            exc = new C105814Dh(null, 1, null);
        }
        setState(new AqS167S0100000_1(exc, 117));
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void gv0(com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel r6, boolean r7, int r8) {
        /*
            r5 = 1
            r0 = r8 & 1
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            r6.getClass()
            java.lang.String r1 = "TakoSpeechViewModel"
            java.lang.String r0 = "finishTalking"
            X.C34B.LIZIZ(r1, r0)
            boolean r0 = X.C4Y9.LIZ()
            if (r0 == 0) goto L7d
            long r3 = java.lang.System.currentTimeMillis()
            X.33Q r0 = r6.getState()
            X.4Dt r0 = (X.C105934Dt) r0
            java.lang.Long r0 = r0.LJLJJI
            if (r0 == 0) goto L7a
            long r0 = r0.longValue()
        L28:
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7d
            X.4E0 r2 = new X.4E0
            java.lang.String r0 = "talk time < 1s"
            r2.<init>(r0)
            kotlin.jvm.internal.AqS167S0100000_1 r1 = new kotlin.jvm.internal.AqS167S0100000_1
            r0 = 117(0x75, float:1.64E-43)
            r1.<init>(r2, r0)
            r6.setState(r1)
        L40:
            X.XKQ r0 = r6.LJLILLLLZI
            r1 = 0
            if (r0 == 0) goto L48
            r0.LIZIZ(r1)
        L48:
            if (r5 == 0) goto L4e
            r6.kv0()
        L4d:
            return
        L4e:
            java.lang.String r2 = ""
            if (r7 == 0) goto L6c
            X.4Dx r0 = X.C105974Dx.LJLIL
            r6.setState(r0)
            X.XKQ r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L5e
            r0.LIZIZ(r1)
        L5e:
            X.4E7 r0 = r6.hv0()
            com.bytedance.speech.speechengine.SpeechEngine r1 = r0.LIZ
            if (r1 == 0) goto L4d
            r0 = 2001(0x7d1, float:2.804E-42)
            r1.sendDirective(r0, r2)
            goto L4d
        L6c:
            X.4E7 r0 = r6.hv0()
            com.bytedance.speech.speechengine.SpeechEngine r1 = r0.LIZ
            if (r1 == 0) goto L4d
            r0 = 1100(0x44c, float:1.541E-42)
            r1.sendDirective(r0, r2)
            goto L4d
        L7a:
            r0 = 0
            goto L28
        L7d:
            r5 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel.gv0(com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel, boolean, int):void");
    }
}
