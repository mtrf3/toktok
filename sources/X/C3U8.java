package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* renamed from: X.3U8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3U8 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null) {
            Integer M = privacyUserSettings.M("dm_safe_mode");
            if (M != null && M.intValue() == 1) {
                return true;
            }
            Integer M2 = privacyUserSettings.M("dm_filter_keyword");
            if (M2 != null && M2.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ() {
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (privacyUserSettings.M("dm_safe_mode") == null && privacyUserSettings.M("dm_filter_keyword") == null)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("direct_message")) == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }
}
