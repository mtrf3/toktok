package X;

import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSettingsObject;

/* renamed from: X.DuO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35368DuO {
    public static final RuInstantLoginSettingsObject LIZ = new RuInstantLoginSettingsObject(null, 1, null);

    public static RuInstantLoginSettingsObject.RealConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RuInstantLoginSettingsObject ruInstantLoginSettingsObject = LIZ;
        LJIIIZ.getClass();
        RuInstantLoginSettingsObject ruInstantLoginSettingsObject2 = (RuInstantLoginSettingsObject) FFL.LJIJ(true, "instant_login_config", 31744, RuInstantLoginSettingsObject.class, ruInstantLoginSettingsObject);
        if (ruInstantLoginSettingsObject2 != null) {
            return ruInstantLoginSettingsObject2.siConfig;
        }
        return null;
    }

    public static boolean LIZIZ() {
        RuInstantLoginSettingsObject.RealConfig LIZ2;
        RuInstantLoginSettingsObject.RealConfig LIZ3 = LIZ();
        if ((LIZ3 == null || LIZ3.type != 1) && ((LIZ2 = LIZ()) == null || LIZ2.type != 2)) {
            return false;
        }
        return true;
    }
}
