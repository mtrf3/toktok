package X;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: X.Fcu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39380Fcu {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(C39380Fcu.class);
    }

    public static String LIZIZ() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(EF7.LIZIZ(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            C39405FdJ.LJFF.getClass();
            str = C39571Ffz.LIZJ(telephonyManager);
            return str;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public static int LIZ(Context context) {
        String str = "-1";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            if (telephonyManager != null) {
                C39405FdJ.LJFF.getClass();
                str = C39571Ffz.LJI(telephonyManager);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if ("46000".equals(str) || "46002".equals(str) || "46007".equals(str)) {
            return 3;
        }
        if ("46001".equals(str) || "46006".equals(str) || "46009".equals(str)) {
            return 2;
        }
        if ("46003".equals(str) || "46005".equals(str) || "46011".equals(str)) {
            return 1;
        }
        return 0;
    }
}
