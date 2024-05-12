package X;

/* renamed from: X.Lu5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55733Lu5 implements Runnable {
    public static final RunnableC55733Lu5 LJLIL = new RunnableC55733Lu5();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (r1.equals("homepage_now") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0091, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r1.equals("homepage_hot") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (r1.equals("personal_homepage") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (r1.equals("homepage_friends") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r1.equals("homepage_follow") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r1.equals("notification_page") != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            if (r0 == 0) goto L50
            X.LRe r1 = X.LRD.LIZ(r0)
            java.lang.String r0 = "long_press_layer"
            boolean r2 = r1.LIZ(r0)
            android.app.Activity r1 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            java.lang.String r4 = "homepage_hot"
            if (r0 == 0) goto L2a
            X.LjC r1 = (X.InterfaceC55058LjC) r1
            java.lang.String r1 = r1.getEnterFrom()
            if (r1 == 0) goto L2a
            int r0 = r1.hashCode()
            switch(r0) {
                case -1572049565: goto L89;
                case -1271119582: goto L80;
                case -667094460: goto L77;
                case -562830579: goto L6e;
                case 1691937916: goto L67;
                case 1691943685: goto L5e;
                default: goto L2a;
            }
        L2a:
            if (r2 != 0) goto L50
            com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam r3 = new com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam
            java.lang.String r5 = "toast_disappear"
            java.lang.String r6 = "share_video"
            r7 = 0
            r8 = 17
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r0 = X.C2307993z.LIZ()
            java.lang.String r2 = "getTopActivity()"
            if (r0 == 0) goto L51
            java.lang.String r0 = "in_app_share"
            r3.trigger = r0
            X.Lwa r1 = X.C55888Lwa.LIZIZ
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r1.LJJJJI(r0, r3)
        L50:
            return
        L51:
            X.Lwa r1 = X.C55888Lwa.LIZIZ
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r1.LIZ(r0, r3)
            goto L50
        L5e:
            java.lang.String r0 = "homepage_now"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L91
            goto L2a
        L67:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L91
            goto L2a
        L6e:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L91
            goto L2a
        L77:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L91
            goto L2a
        L80:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L91
            goto L2a
        L89:
            java.lang.String r0 = "notification_page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
        L91:
            r4 = r1
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC55733Lu5.LIZ():void");
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
