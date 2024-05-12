package d5b;

import X.C16880lQ;
import X.C78845Uwz;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

/* loaded from: classes12.dex */
public class c {
    public static BatteryManager LIZ;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static BatteryManager LIZ(Context context) {
        if (LIZ == null) {
            synchronized (c.class) {
                if (LIZ == null) {
                    LIZ = (BatteryManager) C16880lQ.LLILL(context, "batterymanager");
                }
            }
        }
        return LIZ;
    }

    public static long LIZIZ(Context context) {
        BatteryManager LIZ2;
        if (context == null || (LIZ2 = LIZ(context)) == null) {
            return -1L;
        }
        return LIZ2.getLongProperty(4);
    }

    public static float LIZJ(Context context) {
        BatteryManager LIZ2;
        if (context == null || (LIZ2 = LIZ(context)) == null) {
            return -1.0f;
        }
        float longProperty = (float) LIZ2.getLongProperty(2);
        if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
            return -1.0f;
        }
        if (C78845Uwz.LJ() || C78845Uwz.LIZLLL()) {
            if (longProperty < -10000.0f) {
                longProperty /= 1000.0f;
            }
            return -longProperty;
        }
        if (C78845Uwz.LIZJ()) {
            if (longProperty > 10000.0f) {
                return longProperty / 1000.0f;
            }
            return longProperty;
        }
        return longProperty / 1000.0f;
    }

    public static float LIZLLL(Context context) {
        Intent LJJLIIIJILLIZJL;
        if (context == null || (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return LJJLIIIJILLIZJL.getIntExtra("voltage", -1) / 1000.0f;
    }
}
