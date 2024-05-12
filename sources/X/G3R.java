package X;

/* loaded from: classes7.dex */
public final class G3R {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (android.text.TextUtils.equals("EN", r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ() {
        /*
            r6 = 31744(0x7c00, float:4.4483E-41)
            r5 = 0
            java.lang.String r4 = "enable_autocut_display_title"
            r3 = 1
            int r1 = X.C00F.LIZ(r6, r5, r4, r3)
            r0 = 2
            if (r1 != r0) goto L2f
            com.ss.android.ugc.aweme.setting.services.ISettingService r0 = com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.LIZ()
            java.lang.String r2 = r0.getAppLanguage()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = "ROOT"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r2.toUpperCase(r1)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "EN"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L2f
        L2d:
            r5 = 1
        L2e:
            return r5
        L2f:
            int r0 = X.C00F.LIZ(r6, r5, r4, r3)
            if (r0 != r3) goto L2e
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G3R.LIZ():boolean");
    }
}
