package X;

import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: X.J1b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48483J1b {
    public NetworkCapabilities LIZ;
    public NetworkInfo LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL = -2;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isMainNetworkExist: ");
        if (this.LIZ != null) {
            str = "true, Capabilities";
        } else if (this.LIZIZ != null) {
            str = "true, Info";
        } else {
            str = "false";
        }
        Q89.LIZIZ(LIZ, str, '\n', "isAirplaneMode ");
        LIZ.append(this.LIZJ);
        LIZ.append('\n');
        LIZ.append("hasWifi ");
        LIZ.append(this.LJ);
        LIZ.append('\n');
        LIZ.append("isWifiOpen ");
        LIZ.append(this.LIZLLL);
        LIZ.append('\n');
        LIZ.append("isWifiInternet ");
        LIZ.append(this.LJFF);
        LIZ.append('\n');
        LIZ.append("isWifiValidate ");
        LIZ.append(this.LJI);
        LIZ.append('\n');
        LIZ.append("isWifiNeedPortal ");
        LIZ.append(this.LJII);
        LIZ.append('\n');
        LIZ.append("hasMobile ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append('\n');
        LIZ.append("isMobileInternet ");
        LIZ.append(this.LJIIIZ);
        LIZ.append('\n');
        LIZ.append("isMobileValidate ");
        LIZ.append(this.LJIIJ);
        LIZ.append('\n');
        LIZ.append("isVPNOpen ");
        LIZ.append(this.LJIIJJI);
        LIZ.append('\n');
        LIZ.append("isVPNConnect ");
        LIZ.append(this.LJIIL);
        LIZ.append('\n');
        LIZ.append("isProxySet ");
        return C48339Iy7.LIZJ(LIZ, this.LJIILIIL, '\n', LIZ);
    }
}
