package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.Duh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35387Duh {
    public static final C35387Duh LIZIZ = new C35387Duh();
    public final Keva LIZ;

    public final void LIZ() {
        Keva keva = this.LIZ;
        SettingsManager.LIZLLL().getClass();
        keva.storeBoolean("keva_enabled", SettingsManager.LIZ("abmock_keva_switch", false));
        Keva keva2 = this.LIZ;
        SettingsManager.LIZLLL().getClass();
        keva2.storeBoolean("settings_keva_enabled", SettingsManager.LIZ("settings_keva_switch", false));
    }

    public C35387Duh() {
        Keva repoSync = KevaImpl.getRepoSync("abmock_keva_repo", 1);
        this.LIZ = repoSync;
        repoSync.getBoolean("keva_enabled", true);
        repoSync.getBoolean("settings_keva_enabled", false);
    }
}
