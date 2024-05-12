package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* renamed from: X.3f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89363f2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C89373f3.LJLIL);

    public static boolean LIZ() {
        PrivacyUserSettingsV2 privacyUserSettings;
        Integer M;
        if (((Number) LIZ.getValue()).intValue() <= 0 || (privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("direct_message")) == null || M.intValue() != 3) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        if (LIZ() && ((Number) LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
