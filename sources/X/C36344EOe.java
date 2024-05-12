package X;

/* renamed from: X.EOe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36344EOe {
    public static final C36344EOe LIZ = new C36344EOe();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.bytedance.hybrid.spark.SparkContext r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "sparkContext"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = r9.url
            android.net.Uri r6 = X.C35546DxG.LIZ(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter> r0 = com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter.class
            java.util.Set r1 = r1.getServices(r0)
            java.lang.String r0 = "get().getServices(ICustomSparkRouter::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            java.lang.String r4 = ""
            if (r0 == 0) goto Lc3
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter r1 = (com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter) r1
            if (r10 != 0) goto Lc0
            r0 = r4
        L2f:
            boolean r0 = r1.LIZIZ(r9, r0)
            if (r0 == 0) goto L1e
            if (r10 != 0) goto Lbd
            r0 = r4
        L38:
            java.lang.String r8 = r1.LIZ(r9, r0)
        L3c:
            android.net.Uri r7 = X.C35546DxG.LIZ(r8)
            java.lang.String r2 = r7.getHost()
            r3 = 1
            r1 = 0
            if (r2 == 0) goto Lb0
            java.lang.String r0 = "webview"
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r1)
            if (r0 != r3) goto Lb0
            java.lang.String r0 = "url"
            java.lang.String r8 = X.C78926UyI.LJJJJI(r7, r0)
        L56:
            r5 = 1
        L57:
            if (r8 != 0) goto Lae
        L59:
            android.net.Uri r0 = X.C35546DxG.LIZ(r4)
            java.lang.String r1 = "__spark_session_id"
            java.lang.String r2 = X.C78926UyI.LJJJJI(r0, r1)
            if (r2 == 0) goto L6b
            int r0 = r2.length()
            if (r0 != 0) goto L71
        L6b:
            java.lang.String r2 = X.C78926UyI.LJJJJI(r7, r1)
            if (r2 == 0) goto L77
        L71:
            int r0 = r2.length()
            if (r0 != 0) goto L81
        L77:
            android.os.Bundle r0 = r9.bundle
            if (r0 == 0) goto Lac
            java.lang.String r2 = r0.getString(r1)
        L7f:
            if (r2 == 0) goto L85
        L81:
            java.lang.String r10 = X.C40101FoX.LIZLLL(r2)
        L85:
            java.lang.String r0 = "enable_runtime_switch"
            java.lang.String r1 = X.C78926UyI.LJJJJI(r6, r0)
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto La0
            com.ss.android.ugc.aweme.hybridkit.IHybridKitService r1 = com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LJIIJJI()
            if (r2 != 0) goto Laa
            r0 = 1
        L9a:
            boolean r0 = r1.LJI(r4, r10, r0)
            if (r0 == 0) goto La8
        La0:
            r0 = 1
        La1:
            if (r5 == 0) goto La6
            if (r0 == 0) goto La6
        La5:
            return r3
        La6:
            r3 = 0
            goto La5
        La8:
            r0 = 0
            goto La1
        Laa:
            r0 = 0
            goto L9a
        Lac:
            r2 = 0
            goto L7f
        Lae:
            r4 = r8
            goto L59
        Lb0:
            if (r10 == 0) goto Lbb
            java.lang.String r0 = "http"
            boolean r0 = ujb.o.LJJJLIIL(r10, r0, r1)
            if (r0 != r3) goto Lbb
            goto L56
        Lbb:
            r5 = 0
            goto L57
        Lbd:
            r0 = r10
            goto L38
        Lc0:
            r0 = r10
            goto L2f
        Lc3:
            r8 = r10
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36344EOe.LIZ(com.bytedance.hybrid.spark.SparkContext, java.lang.String):boolean");
    }
}
