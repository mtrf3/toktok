package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.Isj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48005Isj {
    public static int LIZ(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C48001Isf.LIZ.getAndSet(true)) {
                C48001Isf.LIZ().LIZIZ();
            }
            int LIZ = C48001Isf.LIZ().LIZ();
            if (!C48001Isf.LIZJ && LIZ == -1) {
                return 0;
            }
            return LIZ;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "7518557543059375157");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static EnumC48006Isk LIZIZ(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null || !LJJLI.isAvailable()) {
                return EnumC48006Isk.NONE;
            }
            int type = LJJLI.getType();
            if (1 == type) {
                return EnumC48006Isk.WIFI;
            }
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
                if (telephonyManager == null) {
                    return EnumC48006Isk.MOBILE;
                }
                if (LIZ(telephonyManager) == 3 || LIZ(telephonyManager) == 5 || LIZ(telephonyManager) == 6 || LIZ(telephonyManager) == 8 || LIZ(telephonyManager) == 9 || LIZ(telephonyManager) == 10 || LIZ(telephonyManager) == 12 || LIZ(telephonyManager) == 14 || LIZ(telephonyManager) == 15) {
                    return EnumC48006Isk.MOBILE_3G;
                }
                if (LIZ(telephonyManager) == 13) {
                    return EnumC48006Isk.MOBILE_4G;
                }
                return EnumC48006Isk.MOBILE;
            }
            return EnumC48006Isk.MOBILE;
        } catch (Throwable unused) {
            return EnumC48006Isk.MOBILE;
        }
    }

    public static boolean LIZJ(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null) {
                return false;
            }
            if (!LJJLI.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
