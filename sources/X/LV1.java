package X;

/* loaded from: classes10.dex */
public final class LV1<TTaskResult, TContinuationResult> implements C10I {
    public static final LV1<TTaskResult, TContinuationResult> LIZ = new LV1<>();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r5 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r2.LJI("google");
        r0 = r2.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        r4 = r0.getActivityId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r2.LIZLLL = r4;
        r2.LJ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r2.LJFF != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        X.C2U8.LIZ(new X.C2L1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r2.LJFF() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        r2.LJIIIZ();
        r2.LJIIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (android.text.TextUtils.equals(r1, r0) != false) goto L32;
     */
    @Override // X.C10I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object then(X.C10K r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.LJIIJJI()
            if (r0 == 0) goto La7
            X.LV0 r2 = X.LV0.LJII
            java.lang.Object r7 = r9.LJIIJJI()
            java.lang.String r0 = "task.result"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfo r7 = (com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfo) r7
            r2.getClass()
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.LIZ     // Catch: X.C158056If -> La3
            r4 = 0
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch: X.C158056If -> La3
            if (r0 == 0) goto L26
            java.util.List r0 = r0.getCampaignList()     // Catch: X.C158056If -> La3
            goto L27
        L26:
            r0 = r4
        L27:
            r3 = 1
            if (r0 == 0) goto L61
            java.util.Iterator r6 = r0.iterator()     // Catch: X.C158056If -> La3
            r5 = 0
        L2f:
            boolean r0 = r6.hasNext()     // Catch: X.C158056If -> La3
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r6.next()     // Catch: X.C158056If -> La3
            java.lang.String r1 = (java.lang.String) r1     // Catch: X.C158056If -> La3
            if (r5 != 0) goto L48
            java.lang.String r0 = r7.campaign     // Catch: X.C158056If -> La3
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: X.C158056If -> La3
            if (r0 == 0) goto L46
            goto L48
        L46:
            r5 = 0
            goto L49
        L48:
            r5 = 1
        L49:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: X.C158056If -> La3
            java.lang.String r0 = "hintGoogleCampaign："
            r1.append(r0)     // Catch: X.C158056If -> La3
            r1.append(r5)     // Catch: X.C158056If -> La3
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: X.C158056If -> La3
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: X.C158056If -> La3
            goto L2f
        L5f:
            if (r5 != 0) goto L77
        L61:
            java.lang.String r1 = r7.campaign     // Catch: X.C158056If -> La3
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.LIZ     // Catch: X.C158056If -> La3
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch: X.C158056If -> La3
            if (r0 == 0) goto La1
            java.lang.String r0 = r0.getCampaignName()     // Catch: X.C158056If -> La3
        L71:
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: X.C158056If -> La3
            if (r0 == 0) goto La7
        L77:
            java.lang.String r0 = "google"
            r2.LJI(r0)     // Catch: X.C158056If -> La3
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.LIZ     // Catch: X.C158056If -> La3
            if (r0 == 0) goto L84
            java.lang.String r4 = r0.getActivityId()     // Catch: X.C158056If -> La3
        L84:
            r2.LIZLLL = r4     // Catch: X.C158056If -> La3
            r2.LJ = r3     // Catch: X.C158056If -> La3
            boolean r0 = r2.LJFF     // Catch: X.C158056If -> La3
            if (r0 != 0) goto L94
            X.2L1 r0 = new X.2L1     // Catch: X.C158056If -> La3
            r0.<init>()     // Catch: X.C158056If -> La3
            X.C2U8.LIZ(r0)     // Catch: X.C158056If -> La3
        L94:
            boolean r0 = r2.LJFF()     // Catch: X.C158056If -> La3
            if (r0 == 0) goto La7
            r2.LJIIIZ()     // Catch: X.C158056If -> La3
            r2.LJIIJ()     // Catch: X.C158056If -> La3
            goto La7
        La1:
            r0 = r4
            goto L71
        La3:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        La7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LV1.then(X.10K):java.lang.Object");
    }
}
