package X;

/* renamed from: X.2uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73592uh {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (X.C78685UuP.LJJJZ(r5) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:5:0x000b, B:7:0x0015, B:13:0x008f, B:18:0x0023, B:20:0x0043, B:21:0x004c, B:23:0x0052, B:31:0x0060, B:33:0x0066, B:35:0x006c, B:37:0x0072, B:38:0x0085, B:40:0x008b, B:42:0x0097, B:47:0x00a1), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r10) {
        /*
            boolean r0 = X.C78685UuP.LJJJZ(r10)
            r1 = 0
            if (r0 == 0) goto Lb3
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r10)
            java.lang.String r0 = "btm_page_code"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> La9
            r10 = 1
            r9 = 0
            if (r2 == 0) goto L1e
            int r0 = r2.length()     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            if (r0 != 0) goto L23
            r1 = r2
            goto L8f
        L23:
            com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService r0 = com.bytedance.ies.ugc.statisticlogger.btm.BTMTrackerServiceImpl.LJFF()     // Catch: java.lang.Throwable -> La9
            java.util.Map r6 = r0.LIZIZ()     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "channel"
            java.lang.String r7 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "bundle"
            java.lang.String r5 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "url"
            java.lang.String r8 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> La9
            boolean r0 = X.C78685UuP.LJJJZ(r8)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L64
            java.util.Set r0 = r6.keySet()     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> La9
            r3 = r1
        L4c:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L60
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La9
            boolean r0 = ujb.s.LJJJLZIJ(r8, r2, r9)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L4c
            r3 = r2
            goto L4c
        L60:
            java.lang.Object r1 = r6.get(r3)     // Catch: java.lang.Throwable -> La9
        L64:
            if (r1 != 0) goto L8f
            boolean r0 = X.C78685UuP.LJJJZ(r7)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L95
            boolean r0 = X.C78685UuP.LJJJZ(r5)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L95
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La9
            r2.append(r7)     // Catch: java.lang.Throwable -> La9
            r0 = 45
            r2.append(r0)     // Catch: java.lang.Throwable -> La9
            r2.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> La9
        L85:
            boolean r0 = X.C78685UuP.LJJJZ(r7)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r6.get(r7)     // Catch: java.lang.Throwable -> La9
        L8f:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> La9
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> La9
            goto Lb1
        L95:
            if (r7 == 0) goto L9f
            int r0 = r7.length()     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L9e
            goto L9f
        L9e:
            r10 = 0
        L9f:
            if (r10 == 0) goto L85
            boolean r0 = X.C78685UuP.LJJJZ(r5)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L85
            r7 = r5
            goto L85
        La9:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lb1:
            java.lang.String r1 = (java.lang.String) r1
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73592uh.LIZ(java.lang.String):java.lang.String");
    }
}
