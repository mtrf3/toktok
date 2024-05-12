package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.IvM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48168IvM {
    public static boolean LIZ(Context context) {
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

    public static boolean LIZIZ(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isAvailable()) {
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
}
