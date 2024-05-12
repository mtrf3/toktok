package X;

import Y.ARunnableS44S0100000_8;
import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes9.dex */
public final class J1S extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ARunnableS44S0100000_8 LIZ;

    public J1S(ARunnableS44S0100000_8 aRunnableS44S0100000_8) {
        this.LIZ = aRunnableS44S0100000_8;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ("RetryScheduler", "onAvailable", "network onAvailable");
        }
        ((X4J) this.LIZ.l0).LJI(1, true);
    }
}
