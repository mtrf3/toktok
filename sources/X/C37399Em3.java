package X;

/* renamed from: X.Em3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37399Em3 implements BQ6 {
    public final /* synthetic */ C37449Emr LIZ;
    public final /* synthetic */ BQ6 LIZIZ;
    public final /* synthetic */ Class LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ BQ6 LJ;

    public /* synthetic */ C37399Em3(C37449Emr c37449Emr, BQ6 bq6, Class cls, String str, BQ6 bq62) {
        this.LIZ = c37449Emr;
        this.LIZIZ = bq6;
        this.LIZJ = cls;
        this.LIZLLL = str;
        this.LJ = bq62;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r10 == null) goto L14;
     */
    @Override // X.BQ6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r10) {
        /*
            r9 = this;
            X.Emr r6 = r9.LIZ
            X.BQ6 r7 = r9.LIZIZ
            java.lang.Class r8 = r9.LIZJ
            java.lang.String r5 = r9.LIZLLL
            X.BQ6 r4 = r9.LJ
            r6.getClass()
            if (r7 != 0) goto L10
        Lf:
            return
        L10:
            java.lang.Class<X.BQ6> r1 = X.BQ6.class
            r0 = 0
            java.lang.Class r3 = X.C17N.LJJIIJ(r7, r1, r0)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            r2 = 0
            if (r0 == r8) goto L5a
            java.lang.Class<X.UCe> r0 = X.C76800UCe.class
            if (r0 == r8) goto L5a
            r1 = -4
            if (r3 == 0) goto L3d
            boolean r0 = r3.isInstance(r10)
            if (r0 == 0) goto L3d
        L29:
            if (r10 != 0) goto L59
        L2b:
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r0 == r3) goto L59
            java.lang.String r0 = "unsupported result type."
            r6.LIZJ(r1, r5, r0, r2)
            X.Em5 r0 = new X.Em5
            r0.<init>()
            X.C37449Emr.LIZLLL(r4, r0)
            goto Lf
        L3d:
            java.lang.Class<com.google.gson.m> r0 = com.google.gson.m.class
            if (r0 != r3) goto L4a
            com.google.gson.Gson r0 = com.bytedance.pia.core.utils.GsonUtils.LIZIZ()     // Catch: java.lang.Throwable -> L4c
            com.google.gson.j r10 = r0.LJIJJLI(r10)     // Catch: java.lang.Throwable -> L4c
            goto L29
        L4a:
            r10 = r2
            goto L2b
        L4c:
            r0 = move-exception
            r6.LIZJ(r1, r5, r2, r0)
            X.Em5 r0 = new X.Em5
            r0.<init>()
            X.C37449Emr.LIZLLL(r4, r0)
            goto Lf
        L59:
            r2 = r10
        L5a:
            r7.accept(r2)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37399Em3.accept(java.lang.Object):void");
    }
}
