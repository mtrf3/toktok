package X;

/* renamed from: X.Ebx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36773Ebx extends C42031kt {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e1: INVOKE (r0 I:X.0RA) = (r0v0 ?? I:java.lang.Throwable), (r7 I:X.0R9) STATIC call: X.0RA.LIZ(java.lang.Throwable, X.0R9):X.0RA A[MD:(java.lang.Throwable, X.0R9):X.0RA (m)] (LINE:50331873), block:B:44:0x00de */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:2:0x0000, B:4:0x0007, B:10:0x0014, B:13:0x0020, B:15:0x0024, B:23:0x0051, B:25:0x005d, B:26:0x0062, B:28:0x0082, B:29:0x0084, B:31:0x009a, B:33:0x00a0, B:35:0x00ac, B:37:0x00b4, B:38:0x00b8, B:41:0x0032), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:2:0x0000, B:4:0x0007, B:10:0x0014, B:13:0x0020, B:15:0x0024, B:23:0x0051, B:25:0x005d, B:26:0x0062, B:28:0x0082, B:29:0x0084, B:31:0x009a, B:33:0x00a0, B:35:0x00ac, B:37:0x00b4, B:38:0x00b8, B:41:0x0032), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0R9] */
    @Override // X.C42031kt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0RA LIZLLL(X.C0R9 r10, int r11, boolean r12) {
        /*
            r9 = this;
            r7 = r10
            java.lang.String r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> Ldd
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L10
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Ldd
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            r2 = 0
            if (r0 == 0) goto L20
            java.lang.String r1 = "empty url"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ldd
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ldd
            X.0RA r0 = X.C0RA.LIZ(r0, r2)     // Catch: java.lang.Throwable -> Ldd
            return r0
        L20:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r7.LIZLLL     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto L2c
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L32
            r4 = r2
        L2f:
            if (r4 == 0) goto L5b
            goto L51
        L32:
            X.KOz r1 = X.C5UN.LJJLJ(r1)     // Catch: java.lang.Throwable -> Ldd
            X.2ex r0 = X.C63832ex.LJLIL     // Catch: java.lang.Throwable -> Ldd
            X.4g9 r1 = X.OJ4.LJJJJI(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            X.2yu r0 = X.C76202yu.LJLIL     // Catch: java.lang.Throwable -> Ldd
            X.4g9 r1 = X.OJ4.LJJJJI(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            X.2ev r0 = X.C63812ev.LJLIL     // Catch: java.lang.Throwable -> Ldd
            X.4Vp r0 = X.OJ4.LJJJJLL(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Ldd
            r4.<init>()     // Catch: java.lang.Throwable -> Ldd
            X.C113554cx.LJJLIIJ(r4, r0)     // Catch: java.lang.Throwable -> Ldd
            goto L2f
        L51:
            java.lang.String r1 = "x-metasec-bypass-ttnet-features"
            java.lang.String r0 = "1"
            java.lang.Object r0 = r4.put(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Ldd
        L5b:
            if (r4 != 0) goto L62
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Ldd
            r4.<init>()     // Catch: java.lang.Throwable -> Ldd
        L62:
            java.lang.String r1 = "x-tt-dataflow-id"
            java.lang.String r0 = "671088644"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            X.Eby r3 = new X.Eby     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = r7.LIZIZ     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = "request.url"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Ldd
            r3.LIZIZ = r5     // Catch: java.lang.Throwable -> Ldd
            long r0 = (long) r11     // Catch: java.lang.Throwable -> Ldd
            r3.LIZJ = r0     // Catch: java.lang.Throwable -> Ldd
            r3.LIZLLL = r0     // Catch: java.lang.Throwable -> Ldd
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> Ldd
            if (r0 != 0) goto L84
            r3.LIZ = r4     // Catch: java.lang.Throwable -> Ldd
        L84:
            X.Ebz r0 = X.C36774Eby.LJI     // Catch: java.lang.Throwable -> Ldd
            X.EZ5 r1 = X.EZ5.GET     // Catch: java.lang.Throwable -> Ldd
            r0.getClass()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = "method"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            X.Ec8 r0 = X.C36774Eby.LJFF     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Ldd
            com.bytedance.ies.android.base.runtime.depend.INetworkDepend r0 = (com.bytedance.ies.android.base.runtime.depend.INetworkDepend) r0     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L9e
            X.EZ6 r2 = r0.requestForString(r1, r3)     // Catch: java.lang.Throwable -> Ldd
        L9e:
            if (r2 != 0) goto Lac
            java.lang.String r1 = "Response is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ldd
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ldd
            X.0RA r0 = X.C0RA.LIZ(r0, r7)     // Catch: java.lang.Throwable -> Ldd
            return r0
        Lac:
            X.0RA r3 = new X.0RA     // Catch: java.lang.Throwable -> Ldd
            java.lang.Integer r0 = r2.LIZJ()     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto Lda
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> Ldd
        Lb8:
            java.lang.String r5 = r2.LIZ()     // Catch: java.lang.Throwable -> Ldd
            java.util.LinkedHashMap r0 = r2.LIZLLL()     // Catch: java.lang.Throwable -> Ldd
            X.KOz r1 = X.C5UN.LJJLJ(r0)     // Catch: java.lang.Throwable -> Ldd
            X.2ew r0 = X.C63822ew.LJLIL     // Catch: java.lang.Throwable -> Ldd
            X.4Vp r0 = X.OJ4.LJJJJLL(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Ldd
            r6.<init>()     // Catch: java.lang.Throwable -> Ldd
            X.C113554cx.LJJLIIJ(r6, r0)     // Catch: java.lang.Throwable -> Ldd
            java.lang.Throwable r8 = r2.LIZIZ()     // Catch: java.lang.Throwable -> Ldd
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Ldd
            goto Ldc
        Lda:
            r4 = -1
            goto Lb8
        Ldc:
            return r3
        Ldd:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            X.0RA r0 = X.C0RA.LIZ(r0, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36773Ebx.LIZLLL(X.0R9, int, boolean):X.0RA");
    }
}
