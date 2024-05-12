package X;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: X.IsA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47970IsA implements InterfaceC47972IsC {
    public final WifiManager LIZ;

    public C47970IsA(Context context) {
        WifiManager wifiManager;
        try {
            wifiManager = (WifiManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "wifi");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            wifiManager = null;
        }
        this.LIZ = wifiManager;
    }
}
