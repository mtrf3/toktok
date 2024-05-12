package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AY2 {
    public static boolean LIZ;

    public static boolean LIZ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            Object LLILL = C16880lQ.LLILL(context, "connectivity");
            if (LLILL != null) {
                NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
                if (LJJLI == null || !LJJLI.isConnected()) {
                    return false;
                }
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }
}
