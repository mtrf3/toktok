package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

/* renamed from: X.KvZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53277KvZ {
    public static final Keva LIZ = Keva.getRepo("dubbing_settings_cache");

    public static boolean LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("dubbing_popup_debug_setting", false)) {
                return false;
            }
        } catch (Throwable unused) {
        }
        return LIZ.getBoolean("dubbing_intro_shown", false);
    }
}
