package X;

import com.bytedance.keva.Keva;
import defpackage.i0;

/* loaded from: classes8.dex */
public final class G9D {
    public static final Keva LIZ;
    public static int LIZIZ;

    static {
        Keva repo = Keva.getRepo("publish_privacy_settings_cache");
        LIZ = repo;
        LIZIZ = repo.getInt("privacy_setting_comment", 0);
    }

    public static int LIZJ() {
        return LIZ.getInt(LIZLLL("privacy_setting_permission"), -1);
    }

    public static boolean LJFF() {
        return !LIZ.getBoolean(LIZLLL("auto_show_in_edit_page"), false);
    }

    public static int LIZ() {
        if (G9P.LIZIZ()) {
            return LIZ.getInt(LIZLLL("privacy_setting_default_permission"), 0);
        }
        if (!G9P.LIZJ()) {
            return 0;
        }
        Keva keva = LIZ;
        return keva.getInt(LIZLLL("privacy_setting_default_permission"), keva.getInt(LIZLLL("privacy_setting_permission"), 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1 == 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ() {
        /*
            com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService r1 = yq4.a.LJIILIIL()
            java.lang.String r0 = "video_visibility_select"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord r0 = r1.LJII(r0)
            r2 = 0
            if (r0 == 0) goto L38
            int r1 = r0.status
            r0 = 1
            if (r1 != r0) goto L38
        L12:
            java.lang.String r3 = "privacy_setting_permission"
            if (r0 == 0) goto L22
            com.bytedance.keva.Keva r2 = X.G9D.LIZ
            java.lang.String r1 = LIZLLL(r3)
            r0 = -1
            int r0 = r2.getInt(r1, r0)
        L21:
            return r0
        L22:
            boolean r0 = X.C41012G7s.LIZ()
            if (r0 == 0) goto L2d
            int r0 = LIZ()
            goto L21
        L2d:
            com.bytedance.keva.Keva r1 = X.G9D.LIZ
            java.lang.String r0 = LIZLLL(r3)
            int r0 = r1.getInt(r0, r2)
            goto L21
        L38:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G9D.LIZIZ():int");
    }

    public static String LIZLLL(String str) {
        String LIZJ = C77339UWx.LIZJ();
        if (LIZJ == null || LIZJ.length() == 0) {
            return str;
        }
        return i0.LJFF(str, LIZJ);
    }

    public static void LJ(int i) {
        if (!ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{0, 2, 1, 4})) {
            return;
        }
        LIZ.storeInt(LIZLLL("privacy_setting_default_permission"), i);
    }
}
