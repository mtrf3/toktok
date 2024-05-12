package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.PBv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64051PBv {
    public static int LIZ(Context context, C64041PBl c64041PBl) {
        NetworkInfo LJJLI;
        Integer num;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            if (C04330Ez.LIZ(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (LJJLI = C16880lQ.LJJLI(connectivityManager)) != null && LJJLI.isAvailable() && LJJLI.getType() == 0 && c64041PBl != null) {
                InterfaceC64052PBw interfaceC64052PBw = c64041PBl.LIZ.LIZLLL;
                if (interfaceC64052PBw != null) {
                    num = Integer.valueOf(interfaceC64052PBw.LIZ(context));
                } else {
                    num = -1;
                }
                return num.intValue();
            }
            return -10000;
        } catch (Throwable unused) {
            return -10000;
        }
    }
}
