package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ivh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48189Ivh {
    public static InterfaceC48201Ivt LIZ;
    public static EnumC48190Ivi LIZIZ = EnumC48190Ivi.UNKNOWN;
    public static boolean LIZJ;
    public static long LIZLLL;

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
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "8629945440757742136");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ2.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static void LIZIZ(Context context) {
        InterfaceC48201Ivt interfaceC48201Ivt = LIZ;
        if (interfaceC48201Ivt != null && ((C48202Ivu) interfaceC48201Ivt).LIZIZ != EnumC48190Ivi.NONE) {
            LIZIZ = ((C48202Ivu) LIZ).LIZIZ;
            return;
        }
        if (!LIZJ && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            C16880lQ.LJJLIIIJILLIZJL(new C38501F9d(), C16880lQ.LLLLL(context), intentFilter);
            LIZJ = true;
        }
        if (LIZIZ == EnumC48190Ivi.UNKNOWN) {
            LIZIZ = LJ(context);
        }
    }

    public static String LIZJ(List list) {
        String encode;
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                String encode2 = URLEncoder.encode((String) pair.first, "UTF-8");
                String str = (String) pair.second;
                if (str != null) {
                    try {
                        encode = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    encode = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                C1DI.LIZIZ(sb, encode2, "=", encode);
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        return sb.toString();
    }

    public static String LIZLLL(EnumC48190Ivi enumC48190Ivi) {
        if (enumC48190Ivi == EnumC48190Ivi.WIFI) {
            return "wifi";
        }
        if (enumC48190Ivi == EnumC48190Ivi.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (enumC48190Ivi == EnumC48190Ivi.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE_2G) {
            return "2g";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE_3G) {
            return "3g";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE_3G_H) {
            return "3gh";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE_4G) {
            return "4g";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE_5G) {
            return "5g";
        }
        if (enumC48190Ivi == EnumC48190Ivi.MOBILE) {
            return "mobile";
        }
        return "";
    }

    public static EnumC48190Ivi LJ(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null || !LJJLI.isAvailable()) {
                return EnumC48190Ivi.NONE;
            }
            int type = LJJLI.getType();
            if (1 == type) {
                return EnumC48190Ivi.WIFI;
            }
            if (type == 0) {
                int LIZ2 = LIZ((TelephonyManager) C16880lQ.LLILL(context, "phone"));
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
                                            return EnumC48190Ivi.MOBILE_4G;
                                        default:
                                            return EnumC48190Ivi.MOBILE;
                                    }
                            }
                        }
                    } else {
                        return EnumC48190Ivi.MOBILE_5G;
                    }
                }
                return EnumC48190Ivi.MOBILE_3G;
            }
            return EnumC48190Ivi.MOBILE;
        } catch (Throwable unused) {
            return EnumC48190Ivi.MOBILE;
        }
    }

    public static boolean LJFF(Context context) {
        LIZIZ(context);
        if (System.currentTimeMillis() - LIZLLL > 2000) {
            LIZIZ = LJ(context);
            LIZLLL = System.currentTimeMillis();
        }
        return LIZIZ.isAvailable();
    }

    public static boolean LJI(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isAvailable()) {
                InterfaceC48201Ivt interfaceC48201Ivt = LIZ;
                if (interfaceC48201Ivt != null && ((C48202Ivu) interfaceC48201Ivt).LIZIZ != EnumC48190Ivi.NONE) {
                    if (((C48202Ivu) LIZ).LIZIZ != EnumC48190Ivi.WIFI) {
                        return false;
                    }
                    return true;
                }
                if (1 != LJJLI.getType()) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
