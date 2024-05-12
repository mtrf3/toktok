package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.J0t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48475J0t implements J1T {
    public static volatile WifiInfo LJLIL;
    public static volatile boolean LJLILLLLZI;
    public static final C48475J0t LJLJI = new C48475J0t();

    static {
        WifiInfo wifiInfo;
        try {
            wifiInfo = (WifiInfo) WifiInfo.class.newInstance();
        } catch (Throwable unused) {
            wifiInfo = null;
        }
        LJLIL = wifiInfo;
    }

    public final void LIZIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Object LLILL = C16880lQ.LLILL(context, "connectivity");
                if (LLILL != null) {
                    ((ConnectivityManager) LLILL).registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), new C48474J0s(this));
                    LJLILLLLZI = true;
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    @Override // X.J1T
    public final boolean LIZ(InterfaceC66286Pzu store, String storeKey, int i, String str, String str2, String str3, C65300Pk0 c65300Pk0) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(storeKey, "storeKey");
        if (!LJLILLLLZI) {
            return true;
        }
        store.LIZIZ(storeKey, LJLIL);
        return false;
    }
}
