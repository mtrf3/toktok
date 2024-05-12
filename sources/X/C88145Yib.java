package X;

import Y.ARunnableS0S0111100_16;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: X.Yib, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88145Yib extends ConnectivityManager.NetworkCallback {
    public Network LIZ;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect LIZIZ;

    public C88145Yib(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.LIZIZ = networkChangeNotifierAutoDetect;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        TraceEvent LIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onAvailable");
        try {
            NetworkCapabilities LIZJ = this.LIZIZ.LJI.LIZJ(network);
            if (LIZ(network, LIZJ)) {
                if (LIZ != null) {
                    LIZ.close();
                    return;
                }
                return;
            }
            boolean z = false;
            if (LIZJ != null) {
                if (LIZJ.hasTransport(4) && ((network2 = this.LIZ) == null || !network.equals(network2))) {
                    z = true;
                }
                if (z) {
                    this.LIZ = network;
                }
            } else {
                z = false;
            }
            this.LIZIZ.LJFF(new ARunnableS0S0111100_16(this, NetworkChangeNotifierAutoDetect.LJ(network), this.LIZIZ.LJI.LIZ(network), z, 0));
            if (LIZ != null) {
                LIZ.close();
            }
        } catch (Throwable th) {
            if (LIZ != null) {
                try {
                    LIZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        TraceEvent LIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onLost");
        try {
            Network network2 = this.LIZ;
            boolean z = true;
            if (network2 != null && !network2.equals(network)) {
                if (LIZ != null) {
                    LIZ.close();
                    return;
                }
                return;
            }
            Network network3 = this.LIZ;
            if (network3 == null || !network3.equals(network)) {
                z = false;
            }
            this.LIZIZ.LJFF(new RunnableC88144Yia(this, network, z));
            if (this.LIZ != null) {
                this.LIZ = null;
                for (Network network4 : NetworkChangeNotifierAutoDetect.LIZJ(this.LIZIZ.LJI, network)) {
                    onAvailable(network4);
                }
                this.LIZIZ.LJFF(new RunnableC88143YiZ(this, this.LIZIZ.LIZLLL().LIZIZ()));
            }
            if (LIZ != null) {
                LIZ.close();
            }
        } catch (Throwable th) {
            if (LIZ != null) {
                try {
                    LIZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final boolean LIZ(Network network, NetworkCapabilities networkCapabilities) {
        Network network2 = this.LIZ;
        if (network2 != null && !network2.equals(network)) {
            return true;
        }
        if (networkCapabilities == null && (networkCapabilities = this.LIZIZ.LJI.LIZJ(network)) == null) {
            return true;
        }
        if (networkCapabilities.hasTransport(4)) {
            this.LIZIZ.LJI.getClass();
            if (!C88148Yie.LJFF(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean z;
        TraceEvent LIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (LIZ(network, networkCapabilities)) {
                if (LIZ != null) {
                    LIZ.close();
                    return;
                }
                return;
            }
            long LJ = NetworkChangeNotifierAutoDetect.LJ(network);
            int LIZ2 = this.LIZIZ.LJI.LIZ(network);
            Network network2 = this.LIZ;
            if (network2 != null && network2.equals(network)) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ.LJFF(new ARunnableS0S0111100_16(this, LJ, LIZ2, z, 1));
            if (LIZ != null) {
                LIZ.close();
            }
        } catch (Throwable th) {
            if (LIZ != null) {
                try {
                    LIZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        TraceEvent LIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onLosing");
        try {
            if (LIZ(network, null)) {
                if (LIZ != null) {
                    LIZ.close();
                }
            } else {
                this.LIZIZ.LJFF(new RunnableC88146Yic(this, NetworkChangeNotifierAutoDetect.LJ(network)));
                if (LIZ != null) {
                    LIZ.close();
                }
            }
        } catch (Throwable th) {
            if (LIZ != null) {
                try {
                    LIZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
