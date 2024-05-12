package com.ttnet.org.chromium.net;

import J.N;
import X.C16880lQ;
import X.O6T;
import android.net.ConnectivityManager;

/* loaded from: classes7.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    public final ConnectivityManager LIZ = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity");
    public final long LIZIZ;
    public boolean LIZJ;

    public void disableNotifications() {
        this.LIZJ = false;
        this.LIZ.removeDefaultNetworkActiveListener(this);
    }

    public void enableNotifications() {
        this.LIZJ = true;
        this.LIZ.addDefaultNetworkActiveListener(this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.LIZJ) {
            onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.LIZ.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        N.M5aI8A5Z(this.LIZIZ);
    }

    public NetworkActiveNotifier(long j) {
        this.LIZIZ = j;
    }

    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }
}
