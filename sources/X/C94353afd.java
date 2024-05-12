package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import kotlin.jvm.internal.IDqS17S1100000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.afd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94353afd implements InterfaceC93964aZM {
    public final /* synthetic */ VoiceSearchViewModel LIZ;

    @Override // X.InterfaceC93964aZM
    public final void v() {
        VoiceSearchViewModel voiceSearchViewModel = this.LIZ;
        voiceSearchViewModel.runOnUIThread(new IDqS419S0100000_42(voiceSearchViewModel, 114));
    }

    public C94353afd(VoiceSearchViewModel voiceSearchViewModel) {
        this.LIZ = voiceSearchViewModel;
    }

    @Override // X.InterfaceC93964aZM
    public final void LIZIZ(String str) {
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            VoiceSearchViewModel voiceSearchViewModel = this.LIZ;
            voiceSearchViewModel.runOnUIThread(new IDqS17S1100000_42(voiceSearchViewModel, str, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r3.LIZ.setState(new kotlin.jvm.internal.IDqS419S0100000_42(r4, 116));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        return;
     */
    @Override // X.InterfaceC93964aZM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C94309aev r4, boolean r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r2 = r3.LIZ
            kotlin.jvm.internal.IDqS419S0100000_42 r1 = new kotlin.jvm.internal.IDqS419S0100000_42
            r0 = 115(0x73, float:1.61E-43)
            r1.<init>(r4, r0)
            r2.setState(r1)
            r1 = 1
            if (r5 == 0) goto L3f
            int r0 = r4.LJLJJI
            if (r0 != r1) goto L28
            java.lang.String r0 = r4.LJLIL
            int r0 = r0.length()
            if (r0 <= 0) goto L39
        L1b:
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r2 = r3.LIZ
            kotlin.jvm.internal.IDqS419S0100000_42 r1 = new kotlin.jvm.internal.IDqS419S0100000_42
            r0 = 116(0x74, float:1.63E-43)
            r1.<init>(r4, r0)
            r2.setState(r1)
        L27:
            return
        L28:
            java.lang.String r0 = r4.LJLILLLLZI
            int r0 = r0.length()
            if (r0 <= 0) goto L39
            java.lang.String r0 = r4.LJLJI
            int r0 = r0.length()
            if (r0 <= 0) goto L39
            goto L1b
        L39:
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r0 = r3.LIZ
            r0.gv0()
            goto L27
        L3f:
            java.lang.String r0 = r4.LJLIL
            int r0 = r0.length()
            if (r0 != 0) goto L4f
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r1 = r3.LIZ
            X.alN r0 = X.C94709alN.LJLIL
            r1.setState(r0)
            goto L27
        L4f:
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r2 = r3.LIZ
            kotlin.jvm.internal.IDqS419S0100000_42 r1 = new kotlin.jvm.internal.IDqS419S0100000_42
            r0 = 117(0x75, float:1.64E-43)
            r1.<init>(r4, r0)
            r2.setState(r1)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94353afd.LIZ(X.aev, boolean):void");
    }
}
