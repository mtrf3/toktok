package X;

import android.content.Context;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.Method;

/* renamed from: X.IpL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47795IpL {
    public static Class<?> LIZ;
    public static Class<?> LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static Class<?> LJI;
    public static Method LJII;

    public static int LIZ(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            BatteryManager batteryManager = (BatteryManager) C16880lQ.LLILL(context, "batterymanager");
            if (batteryManager == null) {
                return 0;
            }
            return batteryManager.getIntProperty(4);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int LIZIZ(Context context) {
        if (context != null) {
            try {
                PowerManager powerManager = (PowerManager) C16880lQ.LLILL(context, "power");
                if (powerManager != null) {
                    return powerManager.isPowerSaveMode() ? 1 : 0;
                }
                return -1;
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isPowerSaveMode:");
                LIZ2.append(e);
                TTVideoEngineLog.d("DeviceMonitorUtils", X1D.LIZIZ(LIZ2));
                return -1;
            }
        }
        return -1;
    }
}
