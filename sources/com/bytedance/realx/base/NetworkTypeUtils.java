package com.bytedance.realx.base;

import X.C03880Dg;
import X.C04330Ez;
import X.C16880lQ;
import X.C1DI;
import X.C39519Ff9;
import X.C65300Pk0;
import X.V0N;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class NetworkTypeUtils {
    public static String debugInfo = "";
    public static NetworkTypeInterceptor sNetworkTypeInterceptor;

    /* loaded from: classes9.dex */
    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6);

        public final int nativeInt;

        public boolean isAvailable() {
            if (this != NONE) {
                return true;
            }
            return false;
        }

        public int getValue() {
            return this.nativeInt;
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) V0N.LJJJ(NetworkType.class, str);
        }

        NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* loaded from: classes9.dex */
    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    public static Object com_bytedance_realx_base_NetworkTypeUtils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5700147749728152960"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    /* renamed from: com.bytedance.realx.base.NetworkTypeUtils$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType = iArr;
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_5G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String getDebugInfo() {
        return debugInfo;
    }

    /* loaded from: classes7.dex */
    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        public final int nativeInt;

        public static CompressType valueOf(String str) {
            return (CompressType) V0N.LJJJ(CompressType.class, str);
        }

        CompressType(int i) {
            this.nativeInt = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getNetWorkTypeThroughBPEA(android.content.Context r10) {
        /*
            java.lang.String r0 = "phone"
            java.lang.Object r6 = X.C16880lQ.LLILL(r10, r0)
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6
            r5 = -1
            java.lang.String r0 = "com.bytedance.bpea.entry.api.device.info.TelephonyManagerEntry"
            java.lang.Class r10 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = "com.bytedance.bpea.basics.Cert"
            java.lang.Class r7 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = "com.bytedance.bpea.cert.token.TokenCert"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = "getNetworkType"
            r3 = 2
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L6c
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            r9 = 0
            r1[r9] = r0     // Catch: java.lang.Exception -> L6c
            r8 = 1
            r1[r8] = r7     // Catch: java.lang.Exception -> L6c
            java.lang.reflect.Method r7 = r10.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = "with"
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L6c
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r9] = r0     // Catch: java.lang.Exception -> L6c
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L6c
            if (r7 == 0) goto L76
            if (r4 == 0) goto L76
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6c
            r3[r9] = r6     // Catch: java.lang.Exception -> L6c
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = "bpea-rtc_generic_device_info"
            r2[r9] = r0     // Catch: java.lang.Exception -> L6c
            r1 = 0
            java.lang.Object r0 = r4.invoke(r1, r2)     // Catch: java.lang.Exception -> L6c
            r3[r8] = r0     // Catch: java.lang.Exception -> L6c
            java.lang.Object r0 = com_bytedance_realx_base_NetworkTypeUtils_java_lang_reflect_Method_invoke(r7, r1, r3)     // Catch: java.lang.Exception -> L6c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L6c
            int r3 = r0.intValue()     // Catch: java.lang.Exception -> L6c
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = com.bytedance.realx.base.NetworkTypeUtils.debugInfo     // Catch: java.lang.Exception -> L6d
            r1.append(r0)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = " getNetworkType through BPEA;"
            r1.append(r0)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L6d
            com.bytedance.realx.base.NetworkTypeUtils.debugInfo = r0     // Catch: java.lang.Exception -> L6d
            goto L74
        L6c:
            r3 = -1
        L6d:
            java.lang.String r1 = "NetworkTypeUtils"
            java.lang.String r0 = "BPEA not exist"
            com.bytedance.realx.base.RXLogging.i(r1, r0)
        L74:
            if (r3 != r5) goto L90
        L76:
            int r0 = r6.getDataNetworkType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r0.intValue()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = com.bytedance.realx.base.NetworkTypeUtils.debugInfo
            java.lang.String r0 = " getNetworkType through system;"
            java.lang.String r0 = X.JBR.LJFF(r2, r1, r0, r2)
            com.bytedance.realx.base.NetworkTypeUtils.debugInfo = r0
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.NetworkTypeUtils.getNetWorkTypeThroughBPEA(android.content.Context):int");
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        try {
            switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[networkType.ordinal()]) {
                case 1:
                    return "wifi";
                case 2:
                    return "2g";
                case 3:
                    return "3g";
                case 4:
                    return "4g";
                case 5:
                    return "5g";
                case 6:
                    return "mobile";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context, null);
        if (networkType == NetworkType.MOBILE || networkType == NetworkType.MOBILE_2G) {
            return true;
        }
        return false;
    }

    public static boolean isIpv4(String str) {
        return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", str);
    }

    public static boolean isIpv6(String str) {
        return Pattern.matches("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$", str);
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null) {
                return false;
            }
            if (!LJJLI.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isAvailable()) {
                NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
                if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
                    if (sNetworkTypeInterceptor.getNetworkType() != NetworkType.WIFI) {
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

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context, null));
    }

    public static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String encode = encode((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = encode(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            C1DI.LIZIZ(sb, encode, "=", str2);
        }
        return sb.toString();
    }

    public static NetworkType getNetworkType(Context context, Intent intent) {
        int subtype;
        NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
        if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
            return sNetworkTypeInterceptor.getNetworkType();
        }
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null) {
                LJJLI.isAvailable();
            } else if (intent != null && ((LJJLI = isNetWorkConnected(context, intent)) == null || !LJJLI.isAvailable())) {
                RXLogging.i("NetworkTypeUtils", "-----------info is null");
                return NetworkType.NONE;
            }
            int type = LJJLI.getType();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkInfo type:");
            LIZ.append(type);
            debugInfo = X1D.LIZIZ(LIZ);
            if (1 == type) {
                return NetworkType.WIFI;
            }
            if (type == 0) {
                if (C04330Ez.LIZ(context, "android.permission.READ_PHONE_STATE") == 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(debugInfo);
                    LIZ2.append(" getNetworkType through TelephoneManager;");
                    debugInfo = X1D.LIZIZ(LIZ2);
                    subtype = getNetWorkTypeThroughBPEA(context);
                } else {
                    subtype = LJJLI.getSubtype();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(debugInfo);
                    LIZ3.append(" getNetworkType through ConnectivityManager;");
                    debugInfo = X1D.LIZIZ(LIZ3);
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(debugInfo);
                LIZ4.append(" TelephonyManager type:");
                LIZ4.append(subtype);
                debugInfo = X1D.LIZIZ(LIZ4);
                switch (subtype) {
                    case 0:
                        return NetworkType.UNKNOWN;
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return NetworkType.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return NetworkType.MOBILE_3G;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case 18:
                        return NetworkType.MOBILE_4G;
                    case 19:
                    default:
                        return NetworkType.UNKNOWN;
                    case 20:
                        return NetworkType.MOBILE_5G;
                }
            }
            return NetworkType.MOBILE;
        } catch (Throwable th) {
            debugInfo = th.toString();
            return NetworkType.UNKNOWN;
        }
    }

    public static NetworkInfo isNetWorkConnected(Context context, Intent intent) {
        NetworkInfo networkInfo;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo.getState() && networkInfo.isAvailable()) {
                if (networkInfo.getType() == 1 || networkInfo.getType() == 0) {
                    RXLogging.i("NetworkTypeUtils", "-------networkInfo wifi or mobile is connected");
                }
                return networkInfo;
            }
            RXLogging.i("NetworkTypeUtils", "------networkInfo is discconnected");
        }
        return null;
    }

    public static void registerReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            C16880lQ.LJJLIIIJILLIZJL(broadcastReceiver, C16880lQ.LLLLL(context), intentFilter);
        }
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            C16880lQ.LJJLIIIJL(C16880lQ.LLLLL(context), broadcastReceiver);
        }
    }
}
