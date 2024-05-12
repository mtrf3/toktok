package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

/* loaded from: classes6.dex */
public final class C3O {
    public static BatteryManager LIZ;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static BatteryManager LIZ(Context context) {
        if (LIZ == null) {
            synchronized (C3O.class) {
                if (LIZ == null) {
                    LIZ = (BatteryManager) C16880lQ.LLILL(context, "batterymanager");
                }
            }
        }
        return LIZ;
    }

    public static double LIZIZ(Context context) {
        if (context != null && LIZ(context) != null) {
            return (LIZ(context).getLongProperty(5) * 1.0d) / 1000000.0d;
        }
        return -1.0d;
    }
}
