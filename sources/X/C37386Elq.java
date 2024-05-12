package X;

/* renamed from: X.Elq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37386Elq {
    public static final String LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static final Object LIZLLL;

    static {
        C16880lQ.LJLLJ(C37386Elq.class);
        LIZ = "/proc/meminfo";
        LIZJ = "unknown";
        LIZLLL = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x006a, code lost:
    
        if (0 != 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            boolean r0 = X.C37386Elq.LIZIZ
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "^MemTotal:\\s+([0-9]+) kB$"
            java.util.regex.Pattern r2 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            r4 = 1
            r12 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1 = 0
            r5 = 0
            java.io.FileReader r9 = new java.io.FileReader     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L8c
            java.lang.String r0 = X.C37386Elq.LIZ     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L8c
            r9.<init>(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L8c
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6a
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6a
        L1f:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            if (r0 == 0) goto L40
            java.util.regex.Matcher r1 = r2.matcher(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            boolean r0 = r1.find()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            if (r0 != 0) goto L30
            goto L1f
        L30:
            java.lang.String r0 = r1.group(r4)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            r1 = 1024(0x400, double:5.06E-321)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L3f
            goto L40
        L3f:
            r5 = r7
        L40:
            r3.close()     // Catch: java.lang.Exception -> L46
            r9.close()     // Catch: java.lang.Exception -> L46
        L46:
            java.lang.Object r3 = X.C37386Elq.LIZLLL
            monitor-enter(r3)
            double r0 = (double) r5
            double r0 = r0 * r10
            double r0 = r0 / r12
            double r1 = java.lang.Math.ceil(r0)     // Catch: java.lang.Throwable -> L59
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            X.C37386Elq.LIZJ = r0     // Catch: java.lang.Throwable -> L59
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L59
            goto L86
        L59:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L59
            throw r0
        L5c:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Exception -> L8d
            if (r9 == 0) goto L8d
            goto L66
        L63:
            r1 = r3
            goto L6c
        L65:
            r4 = move-exception
        L66:
            r9.close()     // Catch: java.lang.Exception -> L8d
            goto L8d
        L6a:
            if (r1 == 0) goto L6f
        L6c:
            r1.close()     // Catch: java.lang.Exception -> L74
        L6f:
            if (r9 == 0) goto L74
            r9.close()     // Catch: java.lang.Exception -> L74
        L74:
            java.lang.Object r3 = X.C37386Elq.LIZLLL
            monitor-enter(r3)
            double r0 = (double) r5
            double r0 = r0 * r10
            double r0 = r0 / r12
            double r1 = java.lang.Math.ceil(r0)     // Catch: java.lang.Throwable -> L89
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L89
            X.C37386Elq.LIZJ = r0     // Catch: java.lang.Throwable -> L89
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
        L86:
            X.C37386Elq.LIZIZ = r4
            return
        L89:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            throw r0
        L8c:
            r4 = move-exception
        L8d:
            java.lang.Object r3 = X.C37386Elq.LIZLLL
            monitor-enter(r3)
            double r0 = (double) r5
            double r0 = r0 * r10
            double r0 = r0 / r12
            double r1 = java.lang.Math.ceil(r0)     // Catch: java.lang.Throwable -> La0
            int r0 = (int) r1     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> La0
            X.C37386Elq.LIZJ = r0     // Catch: java.lang.Throwable -> La0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La0
            throw r4
        La0:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37386Elq.LIZ():void");
    }
}
