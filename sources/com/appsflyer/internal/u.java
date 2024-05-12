package com.appsflyer.internal;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static final class b {
        public static final u valueOf = new u();
    }

    public static String com_appsflyer_internal_u_android_telephony_TelephonyManager_getNetworkOperatorName(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "2309626391053107442"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : telephonyManager.getNetworkOperatorName();
    }

    public static String com_appsflyer_internal_u_android_telephony_TelephonyManager_getSimOperatorName(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100918, "android/telephony/TelephonyManager", "getSimOperatorName", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "2309626391053107442"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : telephonyManager.getSimOperatorName();
    }

    public static boolean AFInAppEventType(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static a valueOf(Context context) {
        String str;
        String str2;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo LLLZL = C16880lQ.LLLZL(connectivityManager, allNetworks[i]);
                    if (AFInAppEventType(LLLZL)) {
                        if (1 == LLLZL.getType()) {
                            str3 = "WIFI";
                        } else if (LLLZL.getType() == 0) {
                            str3 = "MOBILE";
                        }
                    } else {
                        i++;
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            str2 = com_appsflyer_internal_u_android_telephony_TelephonyManager_getSimOperatorName(telephonyManager);
            try {
                str4 = com_appsflyer_internal_u_android_telephony_TelephonyManager_getNetworkOperatorName(telephonyManager);
                if (str4 == null || str4.isEmpty()) {
                    if (2 == telephonyManager.getPhoneType()) {
                        str4 = "CDMA";
                    }
                }
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.valueOf("Exception while collecting network info. ", th);
                str2 = str4;
                str4 = str;
                return new a(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new a(str3, str4, str2);
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final String AFInAppEventParameterName;
        public final String AFKeystoreWrapper;
        public final String values;

        public a(String str, String str2, String str3) {
            this.AFInAppEventParameterName = str;
            this.AFKeystoreWrapper = str2;
            this.values = str3;
        }
    }
}
