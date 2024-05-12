package com.ss.mediakit.net;

import X.C16880lQ;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes9.dex */
public class NetUtils {
    public static long getNetId(Network network) {
        if (network == null) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return CastIntegerProtector.parseInt(network.toString());
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
