package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import kotlin.jvm.internal.IDqS419S0100000_42;

/* renamed from: X.aTR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93597aTR {
    public final /* synthetic */ VoiceSearchViewModel LIZ;

    public final void LIZ() {
        this.LIZ.gv0();
    }

    public final void LIZIZ() {
        Integer valueOf;
        VoiceSearchViewModel voiceSearchViewModel = this.LIZ;
        voiceSearchViewModel.setState(new IDqS419S0100000_42(voiceSearchViewModel, 39));
        VoiceSearchViewModel voiceSearchViewModel2 = this.LIZ;
        XKQ xkq = voiceSearchViewModel2.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        voiceSearchViewModel2.LJLJI = 2;
        voiceSearchViewModel2.LJLILLLLZI = XKX.LIZLLL(ViewModelKt.getViewModelScope(voiceSearchViewModel2), null, null, new C94947apD(voiceSearchViewModel2, null), 3);
        VoiceSearchViewModel voiceSearchViewModel3 = this.LIZ;
        C94351afb c94351afb = voiceSearchViewModel3.LJLIL;
        C94353afd c94353afd = new C94353afd(voiceSearchViewModel3);
        c94351afb.getClass();
        c94351afb.LIZIZ = c94353afd;
        SpeechEngine speechEngine = c94351afb.LIZ;
        if (speechEngine != null) {
            speechEngine.sendDirective(2001, "", C93757aW1.LIZ(3));
        }
        SpeechEngine speechEngine2 = c94351afb.LIZ;
        if (speechEngine2 == null || (valueOf = Integer.valueOf(speechEngine2.sendDirective(1000, "", C78857UxB.LJJIIJ(1476788240, "bpea-search_asr_recording_start")))) == null || valueOf.intValue() != 0) {
            InterfaceC93964aZM interfaceC93964aZM = c94351afb.LIZIZ;
            if (interfaceC93964aZM != null) {
                interfaceC93964aZM.v();
            }
            c94351afb.LIZIZ(3);
        }
    }

    public C93597aTR(VoiceSearchViewModel voiceSearchViewModel) {
        this.LIZ = voiceSearchViewModel;
    }
}
