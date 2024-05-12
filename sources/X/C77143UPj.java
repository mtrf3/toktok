package X;

/* renamed from: X.UPj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77143UPj implements QBC {
    public final /* synthetic */ UPG LJLIL;
    public final /* synthetic */ InterfaceC73573Su9<C77150UPq> LJLILLLLZI;

    public C77143UPj(UPG upg, C73433Srt c73433Srt) {
        this.LJLIL = upg;
        this.LJLILLLLZI = c73433Srt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    @Override // X.QBC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAuthResult(com.bytedance.lobby.auth.AuthResult r8) {
        /*
            r7 = this;
            java.lang.String r0 = "it"
            r5 = r8
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = r5.mIsSuccessful
            if (r0 == 0) goto L98
            boolean r0 = r5.mIsCancelled
            if (r0 != 0) goto L98
            java.lang.String r0 = r5.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L98
            X.UPG r0 = r7.LJLIL
            r0.getClass()
            boolean r0 = X.UPG.LJIILIIL(r5)
            if (r0 == 0) goto L98
            r6 = 1
        L22:
            X.UPG r0 = r7.LJLIL
            java.lang.String r1 = r0.LIZLLL()
            X.UPG r0 = r7.LJLIL
            java.lang.String r2 = r0.LJ()
            X.UPG r0 = r7.LJLIL
            java.lang.Boolean r3 = r0.LJLL
            java.lang.Integer r4 = r0.LJLLI
            X.UQ4.LJFF(r1, r2, r3, r4, r5, r6)
            if (r6 == 0) goto L79
            X.UPG r2 = r7.LJLIL
            java.lang.String r1 = r5.mToken
            java.lang.String r0 = "it.token"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LJLJLJ = r1
            X.UPG r0 = r7.LJLIL
            r0.getClass()
            boolean r0 = X.UPG.LJIIL(r5)
            if (r0 == 0) goto L5d
            boolean r0 = X.C35384Due.LIZ()
            if (r0 == 0) goto L5d
        L56:
            X.UPG r0 = r7.LJLIL
            java.lang.String r0 = r0.LJLJLJ
            X.C77332UWq.LIZ(r0)
        L5d:
            X.UPG r2 = r7.LJLIL
            long r0 = r5.mExpiryDateInMillis
            r2.LJLJLLL = r0
            X.Su9<X.UPq> r0 = r7.LJLILLLLZI
            X.UPq r1 = new X.UPq
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = 30
            r4 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            r0.onNext(r1)
        L73:
            X.Su9<X.UPq> r0 = r7.LJLILLLLZI
            r0.onComplete()
            return
        L79:
            boolean r0 = r5.mIsCancelled
            r1 = r0 ^ 1
            X.UPG r0 = r7.LJLIL
            r0.LJIILJJIL()
            X.UPG r0 = r7.LJLIL
            r0.LJIIJJI(r1)
            X.Su9<X.UPq> r0 = r7.LJLILLLLZI
            X.UPq r1 = new X.UPq
            r2 = 0
            r5 = 0
            r6 = 30
            r3 = r2
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r0.onNext(r1)
            goto L73
        L98:
            r6 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77143UPj.onAuthResult(com.bytedance.lobby.auth.AuthResult):void");
    }
}
