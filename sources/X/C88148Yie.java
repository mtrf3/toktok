package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StrictMode;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.io.IOException;
import java.net.Socket;

/* renamed from: X.Yie, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88148Yie {
    public final ConnectivityManager LIZ;

    public final Network LIZIZ() {
        Network network;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                network = this.LIZ.getActiveNetwork();
            } catch (Throwable unused) {
                network = null;
            }
            if (network != null) {
                return network;
            }
        } else {
            network = null;
        }
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI(this.LIZ);
            if (LJJLI == null) {
                return null;
            }
            for (Network network2 : NetworkChangeNotifierAutoDetect.LIZJ(this, null)) {
                NetworkInfo LJ = LJ(network2);
                if (LJ != null && (LJ.getType() == LJJLI.getType() || LJ.getType() == 17)) {
                    if (network != null && Build.VERSION.SDK_INT >= 29) {
                        if (LJ.getDetailedState() != NetworkInfo.DetailedState.CONNECTING) {
                            NetworkInfo LJ2 = LJ(network);
                            if (LJ2 != null) {
                                LJ2.getDetailedState();
                            }
                        }
                    }
                    network = network2;
                }
            }
            return network;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public C88148Yie(Context context) {
        this.LIZ = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
    }

    public static boolean LJFF(Network network) {
        Socket socket = new Socket();
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            C38645FEr c38645FEr = new C38645FEr(null, vmPolicy);
            try {
                network.bindSocket(socket);
                c38645FEr.close();
                try {
                    socket.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } finally {
                try {
                } catch (IOException unused2) {
                    return false;
                }
            }
        } catch (IOException unused3) {
            socket.close();
            return false;
        } catch (Throwable th) {
            try {
                socket.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    public final int LIZ(Network network) {
        NetworkInfo LIZLLL = LIZLLL(network);
        if (LIZLLL != null && LIZLLL.isConnected()) {
            return NetworkChangeNotifierAutoDetect.LIZIZ(LIZLLL.getType(), LIZLLL.getSubtype());
        }
        return 6;
    }

    public final NetworkCapabilities LIZJ(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return this.LIZ.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public final NetworkInfo LIZLLL(Network network) {
        NetworkInfo LJ = LJ(network);
        if (LJ != null && LJ.getType() == 17) {
            try {
                return C16880lQ.LJJLI(this.LIZ);
            } catch (Throwable unused) {
                return null;
            }
        }
        return LJ;
    }

    public final NetworkInfo LJ(Network network) {
        try {
            try {
                return C16880lQ.LLLZL(this.LIZ, network);
            } catch (Throwable unused) {
                return C16880lQ.LLLZL(this.LIZ, network);
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
