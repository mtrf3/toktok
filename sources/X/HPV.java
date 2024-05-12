package X;

/* loaded from: classes8.dex */
public final class HPV {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.app.Activity r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "routeUri"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.Nx7 r0 = X.C61017Nx7.LIZ()
            boolean r2 = r0.LIZIZ()
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r4 = new com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder
            r4.<init>()
            r3 = 1
            r4.permissionActivityRequired(r3)
            LIZIZ(r7, r8, r4)
            java.lang.String r0 = "source_params"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r8, r0)
            if (r0 == 0) goto L2c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r1.<init>(r0)     // Catch: org.json.JSONException -> L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r6 = 0
            if (r1 == 0) goto La0
            java.lang.String r0 = "open_sub_only_setting"
            int r0 = r1.optInt(r0)
            if (r0 != r3) goto La0
            r5 = 1
        L39:
            if (r2 == 0) goto L4a
            com.ss.android.ugc.aweme.services.IExternalService r2 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            X.HPX r1 = new X.HPX
            r1.<init>(r5, r7, r4, r8)
            java.lang.String r0 = "route"
            r2.asyncService(r7, r0, r1)
        L49:
            return
        L4a:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.getFlags()
            java.lang.String r0 = "com.ss.android.ugc.aweme.splash.SplashActivity"
            r2.setClassName(r7, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.setFlags(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig r0 = r4.build()
            java.lang.String r1 = "EXTRA_AV_RECORD_CONFIG"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "enter_record_from_other_platform"
            android.content.Intent r0 = r2.putExtra(r0, r3)
            r2.putExtras(r0)
            if (r5 == 0) goto L9c
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r6)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L9c
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.app.PushLoginActivity> r0 = com.ss.android.ugc.aweme.app.PushLoginActivity.class
            r2.<init>(r7, r0)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig r0 = r4.build()
            r2.putExtra(r1, r0)
            r0 = 2
            android.content.Intent[] r1 = new android.content.Intent[r0]
            android.content.Intent r0 = X.C51029K0z.LJIJI(r7)
            r1[r6] = r0
            r1[r3] = r2
            r7.startActivities(r1)
            goto L49
        L9c:
            X.C16880lQ.LIZIZ(r7, r2)
            goto L49
        La0:
            r5 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HPV.LIZ(android.app.Activity, android.net.Uri):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0595, code lost:
    
        if (r38.equals("mobileStickTemplate") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x038d, code lost:
    
        if (r1 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0554, code lost:
    
        if (r38.equals("customizedSticker") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0599, code lost:
    
        r41.showStickerPanel(true);
        r41.shootWay(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x05a2, code lost:
    
        if (r9 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05a4, code lost:
    
        r41.autoUseSticker(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x05ab, code lost:
    
        if (X.C43416H2e.LIZ() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05ad, code lost:
    
        r41.recordParam(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05b2, code lost:
    
        if (r18 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x05b4, code lost:
    
        r41.shootWay(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x05b9, code lost:
    
        if (r19 != null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x05bb, code lost:
    
        r0 = "inbox_notification";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x05bd, code lost:
    
        r41.enterFrom(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x05c2, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x05c5, code lost:
    
        if (r29 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x05c7, code lost:
    
        r41.unpublishedEffect(r29);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.app.Activity r39, android.net.Uri r40, com.ss.android.ugc.aweme.services.external.ui.RecordConfig.Builder r41) {
        /*
            Method dump skipped, instructions count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HPV.LIZIZ(android.app.Activity, android.net.Uri, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder):void");
    }
}
