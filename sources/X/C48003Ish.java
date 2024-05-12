package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.Ish, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48003Ish {
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
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "-1638992172699369218");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static int LIZIZ(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isAvailable()) {
                int type = LJJLI.getType();
                if (1 == type) {
                    return 1;
                }
                if (type != 0) {
                    return 16;
                }
                int LIZ = LIZ((TelephonyManager) C16880lQ.LLILL(context, "phone"));
                if (LIZ != 3) {
                    if (LIZ != 20) {
                        if (LIZ == 5 || LIZ == 6) {
                            return 4;
                        }
                        switch (LIZ) {
                            case 8:
                            case 9:
                            case 10:
                                return 4;
                            default:
                                switch (LIZ) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        return 4;
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                        return 2;
                                    default:
                                        return 16;
                                }
                        }
                    }
                    return 2;
                }
                return 4;
            }
            return 0;
        } catch (Throwable unused) {
            return 16;
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
