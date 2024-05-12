package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.IrK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47918IrK {
    public static boolean LIZ(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) C16880lQ.LLILL(context, "connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }
}
