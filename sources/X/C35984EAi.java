package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.EAi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35984EAi {
    public static final C35983EAh LIZ;

    static {
        C35983EAh c35983EAh;
        java.util.Map map;
        try {
            map = (java.util.Map) SettingsManager.LIZLLL().LJIIIIZZ("profile_badge_all", C35983EAh.class, LIZ);
        } catch (Throwable unused) {
            c35983EAh = null;
        }
        if (map != null && !(map instanceof C35983EAh)) {
            C35983EAh c35983EAh2 = new C35983EAh();
            if (map != null) {
                c35983EAh2.putAll(map);
            }
            c35983EAh = c35983EAh2;
            LIZ = c35983EAh;
        }
        c35983EAh = (C35983EAh) map;
        LIZ = c35983EAh;
    }
}
