package X;

/* renamed from: X.PKt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64283PKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r7 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.Throwable r13, java.io.PrintWriter r14) {
        /*
            if (r13 == 0) goto La3
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r11 = java.util.Collections.newSetFromMap(r0)
            r11.add(r13)
            r8 = r14
            r8.println(r13)
            java.lang.StackTraceElement[] r3 = r13.getStackTrace()
            int r1 = r3.length
            r0 = 384(0x180, float:5.38E-43)
            if (r1 <= r0) goto L7c
            r7 = 1
        L1c:
            int r6 = r3.length
            r5 = 0
            r2 = 0
        L1f:
            java.lang.String r4 = "\tat "
            if (r5 >= r6) goto L79
            r1 = r3[r5]
            if (r7 == 0) goto L63
            r0 = 256(0x100, float:3.59E-43)
            if (r2 <= r0) goto L63
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "\t... skip "
            r1.append(r0)
            int r0 = r3.length
            int r0 = r0 - r2
            int r0 = r0 + (-128)
            r1.append(r0)
            java.lang.String r0 = " lines"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r8.println(r0)
        L47:
            int r0 = r3.length
            int r2 = r0 + (-128)
        L4a:
            int r0 = r3.length
            if (r2 >= r0) goto L7e
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r4)
            r0 = r3[r2]
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r8.println(r0)
            int r2 = r2 + 1
            goto L4a
        L63:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r8.println(r0)
            int r2 = r2 + 1
            int r5 = r5 + 1
            goto L1f
        L79:
            if (r7 == 0) goto L7e
            goto L47
        L7c:
            r7 = 0
            goto L1c
        L7e:
            java.lang.Throwable[] r2 = r13.getSuppressed()
            int r1 = r2.length
            r0 = 0
        L84:
            if (r0 >= r1) goto L94
            r7 = r2[r0]
            java.lang.String r9 = "Suppressed: "
            java.lang.String r10 = "\t"
            r12 = 128(0x80, float:1.8E-43)
            LIZ(r7, r8, r9, r10, r11, r12)
            int r0 = r0 + 1
            goto L84
        L94:
            java.lang.Throwable r7 = r13.getCause()
            if (r7 == 0) goto La3
            java.lang.String r9 = "Caused by: "
            java.lang.String r10 = ""
            r12 = 128(0x80, float:1.8E-43)
            LIZ(r7, r8, r9, r10, r11, r12)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64283PKt.LIZIZ(java.lang.Throwable, java.io.PrintWriter):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r2 = r3.length - (r16 / 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r2 >= r3.length) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("\tat ");
        r1.append(r3[r2]);
        r12.println(X.X1D.LIZIZ(r1));
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r11 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.Throwable r11, java.io.PrintWriter r12, java.lang.String r13, java.lang.String r14, java.util.Set r15, int r16) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64283PKt.LIZ(java.lang.Throwable, java.io.PrintWriter, java.lang.String, java.lang.String, java.util.Set, int):void");
    }
}
