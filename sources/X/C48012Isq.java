package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.nio.charset.StandardCharsets;

/* renamed from: X.Isq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48012Isq {
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
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "4354409433249271863");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static EnumC48011Isp LIZIZ(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null || !LJJLI.isAvailable()) {
                return EnumC48011Isp.NONE;
            }
            int type = LJJLI.getType();
            if (1 == type) {
                return EnumC48011Isp.WIFI;
            }
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
                if (C04330Ez.LIZ(context, new String(Base64.decode("YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=", 0), StandardCharsets.UTF_8)) != 0) {
                    return EnumC48011Isp.UNKNOWN;
                }
                int LIZ2 = LIZ(telephonyManager);
                if (LIZ2 != 3) {
                    if (LIZ2 != 20) {
                        if (LIZ2 != 5 && LIZ2 != 6) {
                            switch (LIZ2) {
                                case 8:
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (LIZ2) {
                                        case 12:
                                        case 14:
                                        case 15:
                                            break;
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                            return EnumC48011Isp.MOBILE_4G;
                                        default:
                                            return EnumC48011Isp.MOBILE;
                                    }
                            }
                        }
                    } else {
                        return EnumC48011Isp.MOBILE_5G;
                    }
                }
                return EnumC48011Isp.MOBILE_3G;
            }
            return EnumC48011Isp.MOBILE;
        } catch (Throwable unused) {
            return EnumC48011Isp.MOBILE;
        }
    }
}
