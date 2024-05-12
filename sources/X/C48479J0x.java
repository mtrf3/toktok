package X;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: X.J0x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48479J0x {
    public static final boolean LIZ(Context context) {
        Object obj;
        TelephonyManager telephonyManager = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "phone");
        } else {
            obj = null;
        }
        if (obj instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) obj;
        }
        if (telephonyManager == null) {
            return false;
        }
        try {
            int simState = telephonyManager.getSimState();
            if (simState == 0 || simState == 1) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
