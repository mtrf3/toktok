package X;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import kotlin.jvm.internal.o;

/* renamed from: X.IsF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47975IsF {
    public static WifiInfo LIZ(WifiManager wifiManager) {
        WifiInfo connectionInfo;
        if (!C39248Fam.LJIIIZ || C39248Fam.LIZ() || C39248Fam.LJIIJ == null) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Landroid/net/wifi/WifiInfo;", "488521261608735277");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", wifiManager, objArr, "android.net.wifi.WifiInfo", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", null, objArr, wifiManager, c65300Pk0, false);
                connectionInfo = (WifiInfo) LIZJ.LIZIZ;
            } else {
                connectionInfo = wifiManager.getConnectionInfo();
                c03880Dg.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", connectionInfo, objArr, wifiManager, c65300Pk0, true);
            }
            C39248Fam.LJIIJ = connectionInfo;
            return C39248Fam.LJIIJ;
        }
        return C39248Fam.LJIIJ;
    }

    public static Integer LIZIZ(WifiManager receiver$0) {
        o.LJIIJ(receiver$0, "receiver$0");
        WifiInfo LIZ = LIZ(receiver$0);
        if (LIZ != null) {
            return Integer.valueOf(LIZ.getRssi());
        }
        return null;
    }
}
