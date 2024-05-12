package com.ttnet.org.chromium.base;

import X.C16880lQ;
import X.O6T;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;

/* loaded from: classes9.dex */
public class RadioUtils {
    public static Boolean LIZ;
    public static Boolean LIZIZ;

    public static int getCellDataActivity() {
        TraceEvent LIZ2 = TraceEvent.LIZ("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) C16880lQ.LLILL(O6T.LIZ, "phone")).getDataActivity();
                if (LIZ2 != null) {
                    LIZ2.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (LIZ2 != null) {
                    LIZ2.close();
                    return -1;
                }
                return -1;
            }
        } catch (Throwable th) {
            if (LIZ2 != null) {
                try {
                    LIZ2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static int getCellSignalLevel() {
        TraceEvent LIZ2 = TraceEvent.LIZ("RadioUtils::getCellSignalLevel");
        try {
            int i = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) C16880lQ.LLILL(O6T.LIZ, "phone")).getSignalStrength();
                if (signalStrength != null) {
                    i = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (LIZ2 != null) {
                LIZ2.close();
            }
            return i;
        } catch (Throwable th) {
            if (LIZ2 != null) {
                try {
                    LIZ2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean isSupported() {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        int i = -1;
        if (LIZ == null) {
            if (O6T.LIZ.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z2 = true;
                LIZ = Boolean.valueOf(z2);
            }
            z2 = false;
            LIZ = Boolean.valueOf(z2);
        }
        if (!LIZ.booleanValue()) {
            return false;
        }
        if (LIZIZ == null) {
            try {
                i = O6T.LIZ.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid());
            } catch (RuntimeException unused) {
            }
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            LIZIZ = Boolean.valueOf(z);
        }
        if (!LIZIZ.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean isWifiConnected() {
        TraceEvent LIZ2 = TraceEvent.LIZ("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (LIZ2 != null) {
                    LIZ2.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (LIZ2 != null) {
                    LIZ2.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (LIZ2 != null) {
                LIZ2.close();
            }
            return hasTransport;
        } catch (Throwable th) {
            if (LIZ2 != null) {
                try {
                    LIZ2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
