package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.IwH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48225IwH {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Object obj) {
        if (obj != null && (obj instanceof Context)) {
            try {
                Object LLILL = C16880lQ.LLILL((Context) obj, "connectivity");
                if (LLILL != null) {
                    NetworkInfo networkInfo = C16880lQ.LJJLI((ConnectivityManager) LLILL);
                    o.LJFF(networkInfo, "networkInfo");
                    return networkInfo.isConnected();
                }
                throw new C37692Eqm("null cannot be cast to non-null type android.net.ConnectivityManager");
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
