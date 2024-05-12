package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.tiktok.tpsc.data.LogPbBean;
import com.ss.android.ugc.tiktok.tpsc.data.usersettings.PrivacyUserSettingsResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.SPe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72042SPe {
    public static PrivacyUserSettingsV2 LIZ;
    public static String LIZIZ;
    public static final Keva LIZJ;

    static {
        Keva repo = Keva.getRepo("privacy_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZJ = repo;
    }

    public static String LIZIZ() {
        boolean z;
        String LIZ2 = C72052SPo.LIZ();
        if (LIZ2 == null || LIZ2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "privacy_user_setting_v3";
        }
        return i0.LJFF("privacy_user_setting_v3", LIZ2);
    }

    public static void LIZ(PrivacyUserSettingsResponse resp) {
        String str;
        o.LJIIIZ(resp, "resp");
        PrivacyUserSettingsV2 privacyUserSettings = resp.getPrivacyUserSettings();
        LogPbBean logPb = resp.getLogPb();
        String str2 = null;
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        LIZJ.storeString(LIZIZ(), GsonProtectorUtils.toJson(C79146V4k.LJJIIZ(), new C72048SPk(privacyUserSettings, str, false)));
        LIZJ(resp.getPrivacyUserSettings());
        LogPbBean logPb2 = resp.getLogPb();
        if (logPb2 != null) {
            str2 = logPb2.getImprId();
        }
        LIZIZ = str2;
    }

    public static void LIZJ(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        PrivacyUserSettingsV2 privacyUserSettingsV22;
        if (privacyUserSettingsV2 != null) {
            privacyUserSettingsV22 = PrivacyUserSettingsV2.L(privacyUserSettingsV2);
        } else {
            privacyUserSettingsV22 = null;
        }
        LIZ = privacyUserSettingsV22;
        if (privacyUserSettingsV2 != null) {
            LIZJ.storeString(LIZIZ(), GsonProtectorUtils.toJson(C79146V4k.LJJIIZ(), new C72048SPk(privacyUserSettingsV22, LIZIZ, true)));
            C2U8.LIZ(new C79723Ay(PrivacyUserSettingsV2.L(privacyUserSettingsV2)));
        }
    }
}
