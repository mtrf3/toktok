package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.afb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94351afb implements SpeechEngine.SpeechListener {
    public SpeechEngine LIZ;
    public InterfaceC93964aZM LIZIZ;

    public final void LIZIZ(int i) {
        SpeechEngine speechEngine = this.LIZ;
        if (speechEngine != null) {
            speechEngine.sendDirective(2001, "", C93757aW1.LIZ(i));
        }
        SpeechEngine speechEngine2 = this.LIZ;
        if (speechEngine2 != null) {
            speechEngine2.setListener(null);
            speechEngine2.destroyEngine();
        }
        this.LIZ = null;
        this.LIZIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(byte[] r9, boolean r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            r5 = 3
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Exception -> Ld2
            com.google.gson.Gson r3 = r0.LIZ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> Ld2
            java.nio.charset.Charset r2 = X.PVC.LIZ     // Catch: java.lang.Exception -> Ld2
            r1.<init>(r9, r2)     // Catch: java.lang.Exception -> Ld2
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResponse> r0 = com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResponse.class
            java.lang.Object r3 = r3.LJI(r1, r0)     // Catch: java.lang.Exception -> Ld2
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResponse r3 = (com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResponse) r3     // Catch: java.lang.Exception -> Ld2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> Ld2
            java.lang.Class<com.ss.android.ugc.aweme.local_test.LocalTestApi> r0 = com.ss.android.ugc.aweme.local_test.LocalTestApi.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> Ld2
            com.ss.android.ugc.aweme.local_test.LocalTestApi r0 = (com.ss.android.ugc.aweme.local_test.LocalTestApi) r0     // Catch: java.lang.Exception -> Ld2
            java.lang.Boolean r1 = r0.getSearchDebugSwitch()     // Catch: java.lang.Exception -> Ld2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Ld2
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L3f
            X.aZM r1 = r8.LIZIZ     // Catch: java.lang.Exception -> Ld2
            if (r1 == 0) goto L3f
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Ld2
            r0.<init>(r9, r2)     // Catch: java.lang.Exception -> Ld2
            r1.LIZIZ(r0)     // Catch: java.lang.Exception -> Ld2
        L3f:
            X.aXx r0 = X.C93877aXx.LIZ     // Catch: java.lang.Exception -> Ld2
            r0.getClass()     // Catch: java.lang.Exception -> Ld2
            boolean r0 = X.C93877aXx.LIZ()     // Catch: java.lang.Exception -> Ld2
            r6 = 0
            java.lang.String r7 = "music"
            r4 = 0
            if (r0 == 0) goto L71
            if (r10 == 0) goto L71
            if (r3 == 0) goto L53
            goto L56
        L53:
            r1 = r4
        L54:
            r0 = r4
            goto L5c
        L56:
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.MusicSearchResult r1 = r3.musicResult     // Catch: java.lang.Exception -> Ld2
            if (r1 == 0) goto L54
            java.lang.String r0 = r1.resultType     // Catch: java.lang.Exception -> Ld2
        L5c:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)     // Catch: java.lang.Exception -> Ld2
            if (r0 != 0) goto L71
            if (r1 == 0) goto L65
            goto L67
        L65:
            r1 = r4
            goto L69
        L67:
            java.lang.String r1 = r1.resultType     // Catch: java.lang.Exception -> Ld2
        L69:
            java.lang.String r0 = "speech"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Lc7
        L71:
            boolean r0 = X.C93877aXx.LIZ()     // Catch: java.lang.Exception -> Ld2
            r1 = 0
            if (r0 == 0) goto Lbe
            if (r10 == 0) goto Lbe
            if (r3 == 0) goto Lbe
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.MusicSearchResult r0 = r3.musicResult     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L83
            java.lang.String r4 = r0.resultType     // Catch: java.lang.Exception -> Ld2
        L83:
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r7)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Lbe
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Exception -> Ld2
            com.google.gson.Gson r4 = r0.LIZ()     // Catch: java.lang.Exception -> Ld2
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.MusicSearchResult r0 = r3.musicResult     // Catch: java.lang.Exception -> Ld2
            java.lang.String r3 = r0.songResult     // Catch: java.lang.Exception -> Ld2
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.MusicRecognitionResult> r0 = com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.MusicRecognitionResult.class
            java.lang.Object r0 = r4.LJI(r3, r0)     // Catch: java.lang.Exception -> Ld2
            com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.MusicRecognitionResult r0 = (com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.MusicRecognitionResult) r0     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Lb6
            java.util.List<com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.SongInfo> r0 = r0.songInfo     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Lb6
            java.lang.Object r4 = X.ORZ.LJLLLLLL(r6, r0)     // Catch: java.lang.Exception -> Ld2
            com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.SongInfo r4 = (com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.SongInfo) r4     // Catch: java.lang.Exception -> Ld2
            if (r4 == 0) goto Lb6
            kotlin.jvm.internal.IDqS179S0200000_42 r3 = new kotlin.jvm.internal.IDqS179S0200000_42     // Catch: java.lang.Exception -> Ld2
            r0 = 17
            r3.<init>(r8, r4, r0)     // Catch: java.lang.Exception -> Ld2
            X.C2VQ.LIZIZ(r3, r1)     // Catch: java.lang.Exception -> Ld2
            return
        Lb6:
            X.aZM r0 = r8.LIZIZ     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Ldc
            r0.v()     // Catch: java.lang.Exception -> Ld2
            goto Ldc
        Lbe:
            X.alL r0 = new X.alL     // Catch: java.lang.Exception -> Ld2
            r0.<init>(r8, r3, r10)     // Catch: java.lang.Exception -> Ld2
            X.C2VQ.LIZIZ(r0, r1)     // Catch: java.lang.Exception -> Ld2
            goto Ldc
        Lc7:
            X.aZM r0 = r8.LIZIZ     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Lce
            r0.v()     // Catch: java.lang.Exception -> Ld2
        Lce:
            r8.LIZIZ(r5)     // Catch: java.lang.Exception -> Ld2
            return
        Ld2:
            X.aZM r0 = r8.LIZIZ
            if (r0 == 0) goto Ld9
            r0.v()
        Ld9:
            r8.LIZIZ(r5)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94351afb.LIZ(byte[], boolean):void");
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
    public final void onSpeechMessage(int i, byte[] bArr, int i2) {
        if (bArr != null) {
            new String(bArr, PVC.LIZ);
        }
        String str = null;
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            if (bArr != null) {
                str = new String(bArr, PVC.LIZ);
            }
            ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LIZIZ(String.valueOf(str));
        }
        if (i != 1001) {
            if (i != 1003) {
                if (i != 1201) {
                    if (i != 1204) {
                        return;
                    }
                    LIZ(bArr, true);
                    C2VQ.LIZIZ(new IDqS423S0100000_42(this, 151), 0L);
                    return;
                }
                LIZ(bArr, false);
                return;
            }
            InterfaceC93964aZM interfaceC93964aZM = this.LIZIZ;
            if (interfaceC93964aZM != null) {
                interfaceC93964aZM.v();
            }
            if (bArr != null) {
                new String(bArr, PVC.LIZ);
            }
            C2VQ.LIZIZ(new IDqS423S0100000_42(this, 152), 0L);
            return;
        }
        if (bArr != null) {
            new String(bArr, PVC.LIZ);
        }
        C93877aXx.LIZ.getClass();
        if (!C93877aXx.LIZ() || bArr == null) {
            return;
        }
        C93934aYs.LIZ = new String(bArr, PVC.LIZ);
    }
}
