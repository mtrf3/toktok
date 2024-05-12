package com.bytedance.bdlocation.utils;

import X.C16880lQ;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes9.dex */
public class NetworkUtil {
    public static boolean checkVPN(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    return networkCapabilities.hasTransport(4);
                }
            } else {
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean isWifiProxy(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            int parseInt = CastIntegerProtector.parseInt(property2);
            if (TextUtils.isEmpty(property) || parseInt == -1) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
