package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* renamed from: X.3UE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UE {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C3UG.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C3UF.LJLIL);

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZJ() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && (M = privacyUserSettings.M("direct_message")) != null && (M.intValue() == 1 || M.intValue() == 4)) {
            return true;
        }
        return false;
    }
}
