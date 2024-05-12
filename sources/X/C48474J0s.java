package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.J0s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48474J0s extends ConnectivityManager.NetworkCallback {
    public C48474J0s(C48475J0t c48475J0t) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        WifiInfo wifiInfo;
        o.LJIIIZ(network, "network");
        try {
            wifiInfo = (WifiInfo) WifiInfo.class.newInstance();
        } catch (Throwable unused) {
            wifiInfo = null;
        }
        C48475J0t.LJLIL = wifiInfo;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        o.LJIIIZ(network, "network");
        o.LJIIIZ(networkCapabilities, "networkCapabilities");
        C48475J0t.LJLIL = (WifiInfo) networkCapabilities.getTransportInfo();
    }
}
