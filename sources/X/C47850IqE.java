package X;

import Y.IDBReceiverS5S0000000_8;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.IqE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47850IqE {
    public static long LIZ = -1;
    public static boolean LIZIZ;
    public static final IDBReceiverS5S0000000_8 LIZJ = new IDBReceiverS5S0000000_8(2);

    public static NetworkInfo LIZ(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!LIZIZ) {
                IDBReceiverS5S0000000_8 iDBReceiverS5S0000000_8 = LIZJ;
                synchronized (iDBReceiverS5S0000000_8) {
                    if (!LIZIZ) {
                        LIZIZ = true;
                        C16880lQ.LJJLIIIJILLIZJL(iDBReceiverS5S0000000_8, C16880lQ.LLLLL(context), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                }
            }
            return C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean LIZIZ(Context context) {
        NetworkInfo LIZ2 = LIZ(context);
        if (LIZ2 != null && LIZ2.isConnected()) {
            return true;
        }
        return false;
    }
}
