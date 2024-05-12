package X;

/* loaded from: classes13.dex */
public final class T92 implements InterfaceC74161T8r {
    public final /* synthetic */ T97 LJLIL;

    public T92(T97 t97) {
        this.LJLIL = t97;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.InterfaceC74161T8r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, boolean r7, boolean r8, X.InterfaceC67352kd r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.T94
            if (r0 == 0) goto L1e
            r4 = r9
            X.T94 r4 = (X.T94) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L42
        L1e:
            X.T94 r4 = new X.T94
            r4.<init>(r5, r9)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r3)
            X.T97 r0 = r5.LJLIL     // Catch: X.PZF -> L79 java.io.IOException -> L80
            X.Ol8 r0 = r0.LIZ     // Catch: X.PZF -> L79 java.io.IOException -> L80
            java.lang.Object r0 = r0.getValue()     // Catch: X.PZF -> L79 java.io.IOException -> L80
            com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi r0 = (com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi) r0     // Catch: X.PZF -> L79 java.io.IOException -> L80
            r4.LJLJI = r1     // Catch: X.PZF -> L79 java.io.IOException -> L80
            java.lang.Object r3 = r0.getVoiceDetailsInfo(r6, r4)     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C141335gf.LIZJ(r3)     // Catch: X.PZF -> L79 java.io.IOException -> L80
        L45:
            X.Pbt r3 = (X.C64797Pbt) r3     // Catch: X.PZF -> L79 java.io.IOException -> L80
            boolean r0 = r3.LIZIZ()     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r0 == 0) goto L57
            T r0 = r3.LIZIZ     // Catch: X.PZF -> L79 java.io.IOException -> L80
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r0 = (com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse) r0     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r0 == 0) goto L57
            java.lang.Integer r0 = r0.statusCode     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r0 != 0) goto L62
        L57:
            X.3C1 r2 = new X.3C1     // Catch: X.PZF -> L79 java.io.IOException -> L80
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: X.PZF -> L79 java.io.IOException -> L80
            r0.<init>()     // Catch: X.PZF -> L79 java.io.IOException -> L80
            r2.<init>(r0)     // Catch: X.PZF -> L79 java.io.IOException -> L80
            goto L78
        L62:
            int r0 = r0.intValue()     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r0 != 0) goto L57
            T r1 = r3.LIZIZ     // Catch: X.PZF -> L79 java.io.IOException -> L80
            r0 = r1
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r0 = (com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse) r0     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionStruct r0 = r0.info     // Catch: X.PZF -> L79 java.io.IOException -> L80
            if (r0 == 0) goto L57
            X.2tb r2 = new X.2tb     // Catch: X.PZF -> L79 java.io.IOException -> L80
            r2.<init>(r1)     // Catch: X.PZF -> L79 java.io.IOException -> L80
        L78:
            return r2
        L79:
            r0 = move-exception
            X.3C1 r1 = new X.3C1
            r1.<init>(r0)
            goto L86
        L80:
            r0 = move-exception
            X.3C1 r1 = new X.3C1
            r1.<init>(r0)
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T92.LIZLLL(java.lang.String, boolean, boolean, X.2kd):java.lang.Object");
    }
}
