package X;

/* loaded from: classes10.dex */
public final class L80 implements Runnable {
    public static final L80 LJLIL = new L80();

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0009, B:9:0x0013, B:11:0x002e, B:14:0x003c, B:16:0x0040, B:17:0x0048, B:19:0x004e, B:21:0x0064, B:22:0x0076, B:24:0x009d, B:25:0x00a0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0009, B:9:0x0013, B:11:0x002e, B:14:0x003c, B:16:0x0040, B:17:0x0048, B:19:0x004e, B:21:0x0064, B:22:0x0076, B:24:0x009d, B:25:0x00a0), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            java.lang.String r3 = "fcp_tab_error"
            boolean r0 = X.C53160Ktg.LIZ()     // Catch: java.lang.Exception -> La3
            r6 = 1
            if (r0 != 0) goto L12
            boolean r0 = X.C53157Ktd.LIZ()     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L13
        L12:
            r2 = 1
        L13:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            r5.<init>()     // Catch: java.lang.Exception -> La3
            X.L81 r0 = X.L81.HIT_FCP_TAB_EXP     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = r0.getCateGoryStr()     // Catch: java.lang.Exception -> La3
            r5.put(r0, r2)     // Catch: java.lang.Exception -> La3
            X.L81 r0 = X.L81.USE_PRELOAD_SUCCESS     // Catch: java.lang.Exception -> La3
            java.lang.String r1 = r0.getCateGoryStr()     // Catch: java.lang.Exception -> La3
            boolean r0 = X.L82.LIZLLL     // Catch: java.lang.Exception -> La3
            r5.put(r1, r0)     // Catch: java.lang.Exception -> La3
            if (r2 == 0) goto L39
            X.L81 r0 = X.L81.USE_FCP_SUCCESS     // Catch: java.lang.Exception -> La3
            java.lang.String r1 = r0.getCateGoryStr()     // Catch: java.lang.Exception -> La3
            boolean r0 = X.L82.LIZJ     // Catch: java.lang.Exception -> La3
            r5.put(r1, r0)     // Catch: java.lang.Exception -> La3
        L39:
            r4 = 0
            if (r2 == 0) goto L62
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.L82.LIZ     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto L62
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> La3
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La3
        L48:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto L64
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> La3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> La3
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> La3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La3
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La3
            r5.put(r1, r0)     // Catch: java.lang.Exception -> La3
            goto L48
        L62:
            r2 = r4
            goto L76
        L64:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            r2.<init>()     // Catch: java.lang.Exception -> La3
            X.L81 r0 = X.L81.FCP_ORIGIN_DATA     // Catch: java.lang.Exception -> La3
            java.lang.String r1 = r0.getCateGoryStr()     // Catch: java.lang.Exception -> La3
            com.ss.android.ugc.aweme.experiment.TabConfig r0 = X.L76.LIZ()     // Catch: java.lang.Exception -> La3
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La3
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La3
            r1.<init>()     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = "fcp tab result: "
            r1.append(r0)     // Catch: java.lang.Exception -> La3
            r1.append(r5)     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = ", fcp origin data: "
            r1.append(r0)     // Catch: java.lang.Exception -> La3
            com.ss.android.ugc.aweme.experiment.TabConfig r0 = X.L76.LIZ()     // Catch: java.lang.Exception -> La3
            r1.append(r0)     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> La3
            X.C221018lt.LJFF(r3, r0)     // Catch: java.lang.Exception -> La3
            X.C09900aA.LJI(r3, r5, r4, r2)     // Catch: java.lang.Exception -> La3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.L82.LIZ     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto La0
            r0.clear()     // Catch: java.lang.Exception -> La3
        La0:
            X.L82.LIZIZ = r6     // Catch: java.lang.Exception -> La3
            goto Lbb
        La3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "monitor exception: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LJFF(r3, r0)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L80.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
