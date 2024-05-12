package X;

/* renamed from: X.0DH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DH {
    public final C25710zf<C29321Dc> LIZ = new C25710zf<>(new C29321Dc[16]);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if ((r3.LJLJI & 256) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if ((r3.LJLILLLLZI & 256) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if ((r3 instanceof X.C1DQ) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r1 = (X.C1DQ) r3;
        r1.LJIJJ(X.C78840Uwu.LJJIIZI(r1, 256));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if ((r3.LJLJI & 256) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r3 = r3.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r3 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C29321Dc r4) {
        /*
            X.0DV r2 = r4.LLIFFJFJJ
            X.0DK r1 = r2.LIZIZ
            X.0DK r0 = X.C0DK.Idle
            if (r1 != r0) goto L10
            boolean r0 = r2.LIZLLL
            if (r0 != 0) goto L10
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L2e
        L10:
            r3 = 0
            r4.LLIIJLIL = r3
            X.0zf r0 = r4.LJJ()
            int r2 = r0.LJLJI
            if (r2 <= 0) goto L2d
            T[] r1 = r0.LJLIL
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            kotlin.jvm.internal.o.LJII(r1, r0)
        L22:
            r0 = r1[r3]
            X.1Dc r0 = (X.C29321Dc) r0
            LIZ(r0)
            int r3 = r3 + 1
            if (r3 < r2) goto L22
        L2d:
            return
        L2e:
            boolean r0 = r4.LJZI
            if (r0 != 0) goto L33
            goto L10
        L33:
            X.0D4 r0 = r4.LLI
            X.1M3 r3 = r0.LJ
            int r0 = r3.LJLJI
            r2 = 256(0x100, float:3.59E-43)
            r0 = r0 & r2
            if (r0 == 0) goto L10
        L3e:
            int r0 = r3.LJLILLLLZI
            r0 = r0 & r2
            if (r0 == 0) goto L51
            boolean r0 = r3 instanceof X.C1DQ
            if (r0 == 0) goto L51
            r1 = r3
            X.1DQ r1 = (X.C1DQ) r1
            X.29g r0 = X.C78840Uwu.LJJIIZI(r1, r2)
            r1.LJIJJ(r0)
        L51:
            int r0 = r3.LJLJI
            r0 = r0 & r2
            if (r0 == 0) goto L10
            X.1M3 r3 = r3.LJLJJL
            if (r3 == 0) goto L10
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DH.LIZ(X.1Dc):void");
    }
}
