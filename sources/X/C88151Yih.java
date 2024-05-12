package X;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: X.Yih, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88151Yih extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ NetworkChangeNotifierAutoDetect LIZ;

    public C88151Yih(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.LIZ = networkChangeNotifierAutoDetect;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZ;
        if (networkChangeNotifierAutoDetect.LJIIJ) {
            networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        onAvailable(null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        onAvailable(null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        onAvailable(null);
    }
}
