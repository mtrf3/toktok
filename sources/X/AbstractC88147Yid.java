package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: X.Yid, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC88147Yid {
    public NetworkChangeNotifierAutoDetect LIZ;

    public abstract void LIZ();

    public abstract void LIZIZ(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect);

    public final void LIZJ() {
        boolean z;
        NetworkCapabilities LIZJ;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZ;
        if (networkChangeNotifierAutoDetect.LJIIJ) {
            networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
            return;
        }
        if (networkChangeNotifierAutoDetect.LJIILIIL) {
            networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
        }
        ConnectivityManager.NetworkCallback networkCallback = networkChangeNotifierAutoDetect.LJFF;
        if (networkCallback != null) {
            try {
                C88148Yie c88148Yie = networkChangeNotifierAutoDetect.LJI;
                Handler handler = networkChangeNotifierAutoDetect.LIZIZ;
                c88148Yie.getClass();
                try {
                    c88148Yie.LIZ.registerDefaultNetworkCallback(networkCallback, handler);
                } catch (Throwable unused) {
                }
            } catch (RuntimeException unused2) {
                networkChangeNotifierAutoDetect.LJFF = null;
            }
        }
        if (networkChangeNotifierAutoDetect.LJFF == null) {
            try {
                if (C16880lQ.LJJLIIIJILLIZJL(networkChangeNotifierAutoDetect, O6T.LIZ, networkChangeNotifierAutoDetect.LIZJ) != null) {
                    z = true;
                } else {
                    z = false;
                }
                networkChangeNotifierAutoDetect.LJIIL = z;
            } catch (RuntimeException unused3) {
                networkChangeNotifierAutoDetect.LJIIL = false;
            }
        }
        networkChangeNotifierAutoDetect.LJIIJ = true;
        C88145Yib c88145Yib = networkChangeNotifierAutoDetect.LJIIIIZZ;
        if (c88145Yib == null) {
            return;
        }
        Network[] LIZJ2 = NetworkChangeNotifierAutoDetect.LIZJ(c88145Yib.LIZIZ.LJI, null);
        c88145Yib.LIZ = null;
        if (LIZJ2.length == 1 && (LIZJ = c88145Yib.LIZIZ.LJI.LIZJ(LIZJ2[0])) != null && LIZJ.hasTransport(4)) {
            c88145Yib.LIZ = LIZJ2[0];
        }
        try {
            C88148Yie c88148Yie2 = networkChangeNotifierAutoDetect.LJI;
            NetworkRequest networkRequest = networkChangeNotifierAutoDetect.LJIIIZ;
            C88145Yib c88145Yib2 = networkChangeNotifierAutoDetect.LJIIIIZZ;
            Handler handler2 = networkChangeNotifierAutoDetect.LIZIZ;
            c88148Yie2.getClass();
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    c88148Yie2.LIZ.registerNetworkCallback(networkRequest, c88145Yib2, handler2);
                } else {
                    c88148Yie2.LIZ.registerNetworkCallback(networkRequest, c88145Yib2);
                }
            } catch (Throwable unused4) {
            }
        } catch (RuntimeException unused5) {
            networkChangeNotifierAutoDetect.LJIILJJIL = true;
            networkChangeNotifierAutoDetect.LJIIIIZZ = null;
        }
        if (networkChangeNotifierAutoDetect.LJIILJJIL || !networkChangeNotifierAutoDetect.LJIILIIL) {
            return;
        }
        Network[] LIZJ3 = NetworkChangeNotifierAutoDetect.LIZJ(networkChangeNotifierAutoDetect.LJI, null);
        long[] jArr = new long[LIZJ3.length];
        for (int i = 0; i < LIZJ3.length; i++) {
            jArr[i] = NetworkChangeNotifierAutoDetect.LJ(LIZJ3[i]);
        }
        ((C88141YiX) networkChangeNotifierAutoDetect.LIZLLL).LIZ.LJI(jArr);
    }
}
