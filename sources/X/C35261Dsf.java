package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Dsf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35261Dsf {
    public static boolean LIZ() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_google_ua", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }
}
