package X;

/* renamed from: X.8bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214788bq {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r11 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.AbstractC63695OzD r9, java.util.List r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, java.lang.String r12) {
        /*
            X.2Xu r3 = new X.2Xu
            r2 = 0
            if (r11 == 0) goto L54
            java.lang.String r4 = r11.getAid()
        L9:
            java.lang.String r1 = ""
            if (r4 != 0) goto Le
            r4 = r1
        Le:
            com.ss.android.ugc.aweme.IAccountService r0 = X.C214838bv.LIZ()
            X.RBY r0 = r0.LJFF()
            java.lang.String r5 = r0.getCurUserId()
            if (r11 == 0) goto L22
            java.lang.String r6 = r11.getAuthorUid()
            if (r6 != 0) goto L25
        L22:
            r6 = r1
            if (r11 == 0) goto L29
        L25:
            java.lang.String r2 = r11.getAuthorUid()
        L29:
            com.ss.android.ugc.aweme.IAccountService r0 = X.C214838bv.LIZ()
            X.RBY r0 = r0.LJFF()
            java.lang.String r0 = r0.getCurUserId()
            boolean r8 = kotlin.jvm.internal.o.LJ(r2, r0)
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r9.LJ(r3)
            java.util.Iterator r1 = r10.iterator()
        L44:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            X.LIp r0 = (X.InterfaceC54035LIp) r0
            r9.LJ(r0)
            goto L44
        L54:
            r4 = r2
            goto L9
        L56:
            r9.LJFF()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214788bq.LIZ(X.OzD, java.util.List, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r5.isSupportDanmaku() == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, X.EnumC214808bs r7, X.EnumC214798br r8) {
        /*
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "showOptions"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "enterMethod"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.2Y3 r4 = new X.2Y3
            java.lang.String r3 = r7.getValue()
            java.lang.String r2 = r8.getValue()
            if (r5 == 0) goto L32
            boolean r1 = r5.isSupportDanmaku()
            r0 = 1
            if (r1 != r0) goto L32
        L22:
            r4.<init>(r3, r2, r0)
            com.ss.android.ugc.aweme.eventtrack.eventfiles.ShowDanmakuOptionsEvent r1 = new com.ss.android.ugc.aweme.eventtrack.eventfiles.ShowDanmakuOptionsEvent
            r1.<init>()
            java.util.List r0 = X.C47261Igj.LJJIJ(r4)
            LIZ(r1, r0, r5, r6)
            return
        L32:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214788bq.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.8bs, X.8br):void");
    }
}
