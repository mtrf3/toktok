package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: X.F9z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38523F9z {
    public static NetworkInfo LIZ = null;
    public static boolean LIZIZ = true;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static long LJI;
    public static long LJII;
    public static C61V LJIIIIZZ;

    public static void LIZ() {
        if (!LIZLLL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LJI > 2000) {
            LIZIZ = true;
            LJI = currentTimeMillis;
        } else {
            if (LIZ != null || currentTimeMillis - LJII <= 200) {
                return;
            }
            LIZIZ = true;
            LJII = currentTimeMillis;
        }
    }

    public static void LIZIZ(Context context) {
        ConnectivityManager connectivityManager;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.setPriority(65535);
        C16880lQ.LJJLIIIJILLIZJL(new C38522F9y(), context, intentFilter);
        if (Build.VERSION.SDK_INT < 24 || (connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new FA0());
        } catch (Throwable unused) {
        }
    }
}
