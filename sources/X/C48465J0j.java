package X;

import J.N;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.J0j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48465J0j extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityManager LIZ;

    public C48465J0j(ConnectivityManager connectivityManager) {
        this.LIZ = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        NetworkCapabilities networkCapabilities = this.LIZ.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
            N.MeYG7FqD(true);
        } else {
            N.MeYG7FqD(false);
        }
    }
}
