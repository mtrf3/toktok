package X;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes7.dex */
public final class FA0 extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        C38523F9z.LIZIZ = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
    }
}
