package X;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes11.dex */
public final class OFT {
    public static boolean LIZ() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        Application application = C61654OHq.LIZJ;
        boolean z = false;
        if (application != null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(application, 4, "bd_hybrid_monitor_global_shared_preference");
            C61654OHq.LIZ = LIZIZ;
            if (LIZIZ != null) {
                z = LIZIZ.getBoolean("monitor_is_reinstall", false);
            }
            if (!z && application != null && (sharedPreferences = C61654OHq.LIZ) != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("monitor_is_reinstall", true)) != null) {
                putBoolean.apply();
            }
        }
        return !z;
    }
}
