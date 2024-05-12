package X;

import android.util.LruCache;

/* renamed from: X.Zr8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91222Zr8 {
    public static final LruCache<String, Boolean> LIZ = new LruCache<>(3);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r1.getWhitePreviewPlayableSet().contains(r11) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE.isPlayableExpiredToday(r6) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C91299ZsN r10, X.InterfaceC91296ZsK r11) {
        /*
            r9 = 0
            if (r11 != 0) goto L4
            return r9
        L4:
            java.lang.String r6 = r11.getId()
            java.lang.String r7 = ""
            if (r6 != 0) goto Ld
            r6 = r7
        Ld:
            boolean r1 = r11.LJIILIIL()
            r0 = 1
            if (r1 != r0) goto L66
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r1 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r0 = r1.isPreviewPlayableExpiredToday(r6)
            if (r0 == 0) goto L26
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.getWhitePreviewPlayableSet()
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L2e
        L26:
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r0 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r0 = r0.isTodayPlayableLimited()
            if (r0 == 0) goto L64
        L2e:
            r8 = 1
        L2f:
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r0 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r5 = r0.isWhitePlayable(r6)
            if (r10 == 0) goto L3b
            java.lang.String r0 = r10.LIZ
            if (r0 != 0) goto L62
        L3b:
            java.lang.String r4 = "RESUME_FROM_CHANGE_TAB"
            java.lang.String r3 = "RESUME_FROM_GAIN_FOCUS"
            java.lang.String r2 = "RESUME_FROM_ON_FOREGROUND"
            java.lang.String r1 = "RESUME_FROM_ON_RESUME"
            java.lang.String r0 = "RESUME_FROM_DSP_TAB_CHANGE"
            java.lang.String[] r0 = new java.lang.String[]{r2, r4, r3, r1, r0}
            java.util.Set r0 = X.C77275UUl.LJIIIIZZ(r0)
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L6f
            android.util.LruCache<java.lang.String, java.lang.Boolean> r0 = X.C91222Zr8.LIZ
            java.lang.Object r1 = r0.get(r6)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L6f
            return r9
        L62:
            r7 = r0
            goto L3b
        L64:
            r8 = 0
            goto L2f
        L66:
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r0 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r0 = r0.isPlayableExpiredToday(r6)
            if (r0 != 0) goto L2e
            goto L26
        L6f:
            if (r8 == 0) goto L73
            if (r5 == 0) goto L74
        L73:
            r9 = 1
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91222Zr8.LIZ(X.ZsN, X.ZsK):boolean");
    }
}
