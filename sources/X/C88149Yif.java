package X;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: X.Yif, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88149Yif extends ConnectivityManager.NetworkCallback {
    public LinkProperties LIZ;
    public NetworkCapabilities LIZIZ;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect LIZJ;

    public C88149Yif(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.LIZJ = networkChangeNotifierAutoDetect;
    }

    public final C88150Yig LIZ(Network network) {
        int i;
        int i2 = -1;
        if (this.LIZIZ.hasTransport(1) || this.LIZIZ.hasTransport(5)) {
            i = 1;
        } else {
            if (this.LIZIZ.hasTransport(0)) {
                NetworkInfo LJ = this.LIZJ.LJI.LJ(network);
                if (LJ != null) {
                    i2 = LJ.getSubtype();
                }
                i = 0;
                return new C88150Yig(true, i, i2, !this.LIZIZ.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.LJ(network)), null, this.LIZ.isPrivateDnsActive(), this.LIZ.getPrivateDnsServerName());
            }
            if (this.LIZIZ.hasTransport(3)) {
                i = 9;
            } else if (this.LIZIZ.hasTransport(2)) {
                i = 7;
            } else if (this.LIZIZ.hasTransport(4)) {
                NetworkInfo LIZLLL = this.LIZJ.LJI.LIZLLL(network);
                if (LIZLLL != null) {
                    i = LIZLLL.getType();
                } else {
                    i = 17;
                }
            } else {
                i = -1;
            }
        }
        i2 = -1;
        return new C88150Yig(true, i, i2, !this.LIZIZ.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.LJ(network)), null, this.LIZ.isPrivateDnsActive(), this.LIZ.getPrivateDnsServerName());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.LIZ = null;
        this.LIZIZ = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.LIZ = null;
        this.LIZIZ = null;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect.LJIIJ) {
            networkChangeNotifierAutoDetect.LIZ(new C88150Yig(false, -1, -1, false, null, null, false, ""));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.LIZIZ = networkCapabilities;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect.LJIIJ && this.LIZ != null && networkCapabilities != null) {
            networkChangeNotifierAutoDetect.LIZ(LIZ(network));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.LIZ = linkProperties;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect.LJIIJ && linkProperties != null && this.LIZIZ != null) {
            networkChangeNotifierAutoDetect.LIZ(LIZ(network));
        }
    }
}
