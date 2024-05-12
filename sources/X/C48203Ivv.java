package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Ivv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48203Ivv {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C48001Isf.LIZ.getAndSet(true)) {
                C48001Isf.LIZ().LIZIZ();
            }
            int LIZ2 = C48001Isf.LIZ().LIZ();
            if (!C48001Isf.LIZJ && LIZ2 == -1) {
                return 0;
            }
            return LIZ2;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "-5650715990831803960");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static final EnumC48204Ivw LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            Object LLILL = C16880lQ.LLILL(context, "connectivity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
            if (LJJLI == null || !LJJLI.isAvailable()) {
                return EnumC48204Ivw.NONE;
            }
            int type = LJJLI.getType();
            if (1 == type) {
                return EnumC48204Ivw.WIFI;
            }
            if (type == 0) {
                Object LLILL2 = C16880lQ.LLILL(context, "phone");
                o.LJII(LLILL2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                switch (LIZ((TelephonyManager) LLILL2)) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return EnumC48204Ivw.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return EnumC48204Ivw.MOBILE_3G;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return EnumC48204Ivw.MOBILE_4G;
                    default:
                        return EnumC48204Ivw.MOBILE;
                }
            }
            return EnumC48204Ivw.MOBILE;
        } catch (Throwable unused) {
            return EnumC48204Ivw.MOBILE;
        }
    }

    public static final boolean LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        EnumC48204Ivw LIZIZ = LIZIZ(context);
        if (EnumC48204Ivw.MOBILE_2G == LIZIZ || EnumC48204Ivw.MOBILE_3G == LIZIZ || EnumC48204Ivw.MOBILE_4G == LIZIZ || EnumC48204Ivw.MOBILE == LIZIZ) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJFF(Context context) {
        try {
            Object LLILL = C16880lQ.LLILL(context, "connectivity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
            if (LJJLI != null && LJJLI.isAvailable()) {
                if (1 == LJJLI.getType()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
