package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.Ism, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48008Ism {
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
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "-7429784146108752118");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static String LIZIZ(Context context) {
        EnumC48010Iso enumC48010Iso;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            if (connectivityManager == null) {
                enumC48010Iso = EnumC48010Iso.NONE;
            } else {
                NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
                if (LJJLI == null || !LJJLI.isAvailable()) {
                    enumC48010Iso = EnumC48010Iso.NONE;
                } else {
                    int type = LJJLI.getType();
                    if (1 == type) {
                        enumC48010Iso = EnumC48010Iso.WIFI;
                    } else if (type == 0) {
                        int LIZ = LIZ((TelephonyManager) C16880lQ.LLILL(context, "phone"));
                        if (LIZ != 3) {
                            if (LIZ != 20) {
                                if (LIZ != 5 && LIZ != 6) {
                                    switch (LIZ) {
                                        default:
                                            switch (LIZ) {
                                                case 12:
                                                case 14:
                                                case 15:
                                                    break;
                                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                    enumC48010Iso = EnumC48010Iso.MOBILE_4G;
                                                    break;
                                                default:
                                                    enumC48010Iso = EnumC48010Iso.MOBILE;
                                                    break;
                                            }
                                        case 8:
                                        case 9:
                                        case 10:
                                            enumC48010Iso = EnumC48010Iso.MOBILE_3G;
                                            break;
                                    }
                                }
                            } else {
                                enumC48010Iso = EnumC48010Iso.MOBILE_5G;
                            }
                        }
                        enumC48010Iso = EnumC48010Iso.MOBILE_3G;
                    } else {
                        enumC48010Iso = EnumC48010Iso.MOBILE;
                    }
                }
            }
        } catch (Throwable unused) {
            enumC48010Iso = EnumC48010Iso.MOBILE;
        }
        switch (C48009Isn.LIZ[enumC48010Iso.ordinal()]) {
            case 1:
                return "wifi";
            case 2:
                return "2g";
            case 3:
                return "3g";
            case 4:
                return "4g";
            case 5:
                return "mobile";
            case 6:
                return "5g";
            default:
                return "";
        }
    }

    public static boolean LIZJ(Context context) {
        NetworkInfo LJJLI;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            if (connectivityManager == null || (LJJLI = C16880lQ.LJJLI(connectivityManager)) == null) {
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
