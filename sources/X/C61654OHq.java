package X;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.OHq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61654OHq {
    public static SharedPreferences LIZ;
    public static SharedPreferences LIZIZ;
    public static final Application LIZJ;

    public static final boolean LIZ() {
        Application application = LIZJ;
        if (application == null) {
            return false;
        }
        if (LIZIZ == null) {
            LIZIZ = F9J.LIZIZ(application, 4, "monitor_sdk");
        }
        SharedPreferences sharedPreferences = LIZIZ;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean("monitor_validation_switch", false);
    }

    public static final String LIZIZ() {
        String string;
        Application application = LIZJ;
        if (application == null) {
            return "";
        }
        SharedPreferences LIZIZ2 = F9J.LIZIZ(application, 4, "bd_hybrid_monitor_global_shared_preference");
        LIZ = LIZIZ2;
        if (LIZIZ2 == null || (string = LIZIZ2.getString("monitor_setting_response", "")) == null) {
            return "";
        }
        return string;
    }

    static {
        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
        o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
        LIZJ = hybridMultiMonitor.getApplication();
    }
}
