package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.o;

/* renamed from: X.AXs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26400AXs extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ Context LIZ;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        AY2.LIZ = false;
    }

    public C26400AXs(Context context) {
        this.LIZ = context;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC247499nV abstractC247499nV;
        o.LJIIIZ(network, "network");
        super.onAvailable(network);
        boolean LIZ = AY2.LIZ(this.LIZ);
        if (LIZ != AY2.LIZ) {
            C243649hI LIZ2 = C95I.LIZ();
            if (!LIZ2.LIZJ && (abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0)) != null && abstractC247499nV.LIZLLL() != null) {
                LIZ2.LIZIZ(5);
            }
        }
        AY2.LIZ = LIZ;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        o.LJIIIZ(network, "network");
        super.onLost(network);
        AY2.LIZ = false;
    }
}
