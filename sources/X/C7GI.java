package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* renamed from: X.7GI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GI {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (((Number) C7GP.LIZ.getValue()).intValue() == 0 || (((Number) C7GK.LIZ.getValue()).intValue() & 1) != 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("video_view_history")) == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r2.equals("zh-hant") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r2.equals("zh-hans") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r2.equals("ko") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r2.equals("en") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r2.equals("cs") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r2.equals("bn") != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(int r5) {
        /*
            boolean r0 = LIZ()
            r4 = 0
            if (r0 == 0) goto L55
            r0 = 2
            if (r5 <= r0) goto L55
            com.ss.android.ugc.aweme.setting.services.ISettingService r0 = com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.LIZ()
            java.lang.String r3 = r0.getAppLanguage()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r1 = r2.hashCode()
            r0 = 3148(0xc4c, float:4.411E-42)
            if (r1 == r0) goto L83
            r0 = 3184(0xc70, float:4.462E-42)
            if (r1 == r0) goto L7a
            r0 = 3241(0xca9, float:4.542E-42)
            if (r1 == r0) goto L71
            r0 = 3428(0xd64, float:4.804E-42)
            if (r1 == r0) goto L68
            switch(r1) {
                case -371515459: goto L5f;
                case -371515458: goto L56;
                default: goto L34;
            }
        L34:
            r2 = 1
        L35:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "lan:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " hitLan:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "Now ViewerListUtils"
            X.C71Y.LIZLLL(r0, r1)
            if (r2 == 0) goto L55
            r4 = 1
        L55:
            return r4
        L56:
            java.lang.String r0 = "zh-hant"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8b
            goto L34
        L5f:
            java.lang.String r0 = "zh-hans"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8b
            goto L34
        L68:
            java.lang.String r0 = "ko"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8b
            goto L34
        L71:
            java.lang.String r0 = "en"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8b
            goto L34
        L7a:
            java.lang.String r0 = "cs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8b
            goto L34
        L83:
            java.lang.String r0 = "bn"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L34
        L8b:
            r2 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7GI.LIZJ(int):boolean");
    }
}
