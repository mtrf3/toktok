package com.ss.bduploader.net;

import X.C16880lQ;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes7.dex */
public class NetUtils {
    public static String getNetExtraInfo(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo != null && networkInfo.isAvailable()) {
                return networkInfo.getExtraInfo();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo != null && networkInfo.isAvailable()) {
                return networkInfo.getType();
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        try {
            return C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
