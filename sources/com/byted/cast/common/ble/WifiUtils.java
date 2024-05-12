package com.byted.cast.common.ble;

import X.C16880lQ;
import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes29.dex */
public class WifiUtils {
    public static int getIpAdress(Context context) {
        return getWifiManager(context).getDhcpInfo().ipAddress;
    }

    public static int getNetMaskInt(Context context) {
        return getWifiManager(context).getDhcpInfo().netmask;
    }

    public static WifiManager getWifiManager(Context context) {
        return (WifiManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "wifi");
    }

    public static boolean isInSameLAN(Context context, int i, int i2) {
        if (context == null) {
            return false;
        }
        if ((getNetMaskInt(context) & getIpAdress(context)) != (i & i2)) {
            return false;
        }
        return true;
    }
}
