package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.Iss, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48014Iss extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (network == null) {
            return;
        }
        C16880lQ.LLLZL(C48013Isr.LIZIZ, network);
        NetworkCapabilities networkCapabilities = C48013Isr.LIZIZ.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
            try {
                synchronized (C48013Isr.class) {
                    C48013Isr.LIZJ = network;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            if (C48013Isr.LJI()) {
                for (Network network2 : C48013Isr.LIZIZ.getAllNetworks()) {
                    C16880lQ.LLLZL(C48013Isr.LIZIZ, network2);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ConnectivityManager connectivityManager;
        if (network == null || (connectivityManager = C48013Isr.LIZIZ) == null || C48013Isr.LIZJ == null) {
            return;
        }
        C16880lQ.LLLZL(connectivityManager, network);
        if (C48013Isr.LIZJ(network) == C48013Isr.LIZJ(C48013Isr.LIZJ)) {
            try {
                synchronized (C48013Isr.class) {
                    C48013Isr.LIZJ = null;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            if (!C48013Isr.LJI()) {
                return;
            }
            for (Network network2 : C48013Isr.LIZIZ.getAllNetworks()) {
                C16880lQ.LLLZL(C48013Isr.LIZIZ, network2);
            }
        } catch (Throwable unused2) {
        }
    }
}
