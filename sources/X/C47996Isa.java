package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.telephony.SubscriptionManager;

/* renamed from: X.Isa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47996Isa extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C47998Isc LIZ;

    public C47996Isa(C47998Isc c47998Isc) {
        this.LIZ = c47998Isc;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        if (defaultDataSubscriptionId != this.LIZ.LIZLLL) {
            this.LIZ.LIZLLL(defaultDataSubscriptionId);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.LIZ.LIZJ.set(-1);
    }
}
