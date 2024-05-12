package X;

/* loaded from: classes13.dex */
public final class T93 implements InterfaceC74162T8s {
    public final /* synthetic */ T99 LJLIL;

    public T93(T99 t99) {
        this.LJLIL = t99;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.InterfaceC74162T8s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r14, boolean r15, boolean r16, X.InterfaceC67352kd r17) {
        /*
            r13 = this;
            r10 = 0
            r3 = r17
            boolean r0 = r3 instanceof X.T95
            if (r0 == 0) goto L22
            r12 = r3
            X.T95 r12 = (X.T95) r12
            int r2 = r12.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r12.LJLJI = r2
        L15:
            java.lang.Object r2 = r12.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJI
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L76
        L22:
            X.T95 r12 = new X.T95
            r12.<init>(r13, r3)
            goto L15
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r2)
            X.T99 r0 = r13.LJLIL     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            X.Ol8 r0 = r0.LIZ     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.Object r5 = r0.getValue()     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceApi r5 = (com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceApi) r5     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.String r0 = "[\""
            r2.append(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r2.append(r14)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.String r0 = "\"]"
            r2.append(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.String r0 = X.X1D.LIZIZ(r2)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.util.List r6 = X.C47261Igj.LJJIJ(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r15 == 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r16 == 0) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r12.LJLJI = r1     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r11 = r10
            java.lang.Object r2 = r5.getVoiceDetails(r6, r7, r8, r9, r10, r11, r12)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r2 != r3) goto L79
            return r3
        L76:
            X.C141335gf.LIZJ(r2)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
        L79:
            X.Pbt r2 = (X.C64797Pbt) r2     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            boolean r0 = r2.LIZIZ()     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r0 == 0) goto L8b
            T r0 = r2.LIZIZ     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r0 = (com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse) r0     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r0 == 0) goto L8b
            java.lang.Integer r0 = r0.statusCode     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r0 != 0) goto L96
        L8b:
            X.3C1 r1 = new X.3C1     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r0.<init>()     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r1.<init>(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            goto Lb5
        L96:
            int r0 = r0.intValue()     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r0 != 0) goto L8b
            T r0 = r2.LIZIZ     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r0 = (com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse) r0     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r0 == 0) goto L8b
            java.util.List<com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct> r0 = r0.ttsVoiceStruct     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            if (r0 == 0) goto L8b
            boolean r0 = r0.isEmpty()     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r0 = r0 ^ 1
            if (r0 != r1) goto L8b
            X.2tb r1 = new X.2tb     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            T r0 = r2.LIZIZ     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
            r1.<init>(r0)     // Catch: X.PZF -> Lb6 java.io.IOException -> Lbd
        Lb5:
            return r1
        Lb6:
            r0 = move-exception
            X.3C1 r1 = new X.3C1
            r1.<init>(r0)
            goto Lc3
        Lbd:
            r0 = move-exception
            X.3C1 r1 = new X.3C1
            r1.<init>(r0)
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T93.LIZLLL(java.lang.String, boolean, boolean, X.2kd):java.lang.Object");
    }
}
