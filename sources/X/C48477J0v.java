package X;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* renamed from: X.J0v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48477J0v implements InterfaceC64727Pal {
    public final /* synthetic */ C64830PcQ LIZ;

    @Override // X.InterfaceC64727Pal
    public final String getNetworkOperator() {
        TelephonyManager telephonyManager;
        Object LLIZ = C16880lQ.LLIZ("phone", this.LIZ.LIZ);
        if ((LLIZ instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) LLIZ) != null) {
            C39405FdJ.LJFF.getClass();
            return C39571Ffz.LIZJ(telephonyManager);
        }
        return "";
    }

    @Override // X.InterfaceC64727Pal
    public final String getSimOperator() {
        TelephonyManager telephonyManager;
        Object LLIZ = C16880lQ.LLIZ("phone", this.LIZ.LIZ);
        if ((LLIZ instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) LLIZ) != null) {
            C39405FdJ.LJFF.getClass();
            return C39571Ffz.LJI(telephonyManager);
        }
        return "";
    }

    @Override // X.InterfaceC64727Pal
    public final int getWifiFrequency() {
        WifiManager wifiManager;
        WifiInfo LIZ;
        Integer valueOf;
        Object LLIZ = C16880lQ.LLIZ("wifi", this.LIZ.LIZ);
        if ((LLIZ instanceof WifiManager) && (wifiManager = (WifiManager) LLIZ) != null && (LIZ = C47975IsF.LIZ(wifiManager)) != null && (valueOf = Integer.valueOf(LIZ.getFrequency())) != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC64727Pal
    public final int getWifiRssi() {
        WifiManager wifiManager;
        Integer LIZIZ;
        Object LLIZ = C16880lQ.LLIZ("wifi", this.LIZ.LIZ);
        if ((LLIZ instanceof WifiManager) && (wifiManager = (WifiManager) LLIZ) != null && (LIZIZ = C47975IsF.LIZIZ(wifiManager)) != null) {
            return LIZIZ.intValue();
        }
        return 0;
    }

    public C48477J0v(C64830PcQ c64830PcQ) {
        this.LIZ = c64830PcQ;
    }
}
