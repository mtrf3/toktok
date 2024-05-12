package com.ss.ttm.net;

import X.C16880lQ;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes7.dex */
public final class AVNetwork {
    public static int getNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo LJJLI;
        try {
            connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
        } catch (Throwable unused) {
        }
        if (connectivityManager == null || (LJJLI = C16880lQ.LJJLI(connectivityManager)) == null) {
            C16880lQ.LJLLJ(AVNetwork.class);
            return 0;
        }
        int type = LJJLI.getType();
        if (type == 1) {
            C16880lQ.LJLLJ(AVNetwork.class);
            return 1;
        }
        if (type == 0) {
            C16880lQ.LJLLJ(AVNetwork.class);
            return 2;
        }
        return 0;
    }
}
