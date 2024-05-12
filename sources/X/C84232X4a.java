package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.X4a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84232X4a {
    public static final String LJ = C16880lQ.LJLLJ(C84232X4a.class);
    public static volatile int LJFF = 0;
    public static long LJI = -1;
    public static volatile C84232X4a LJII = null;
    public final X58 LIZ = X5H.LIZ;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public final VFT LIZJ = new VFT(this, PS1.LIZ);
    public long LIZLLL;

    public static C84232X4a LIZIZ() {
        if (LJII == null) {
            synchronized (C84232X4a.class) {
                if (LJII == null) {
                    LJII = new C84232X4a();
                }
            }
        }
        return LJII;
    }

    public static boolean LIZJ() {
        if (LJFF == 2) {
            return true;
        }
        return false;
    }

    public static void LJFF() {
        NetworkInfo LJJLI;
        int i;
        Context LJ2 = C84212X3g.LJ();
        if (LJ2 != null) {
            try {
                ConnectivityManager connectivityManager = X4Q.LIZJ;
                if (connectivityManager == null) {
                    connectivityManager = (ConnectivityManager) C16880lQ.LLILL(LJ2, "connectivity");
                    X4Q.LIZJ = connectivityManager;
                    if (connectivityManager == null) {
                    }
                }
                LJJLI = C16880lQ.LJJLI(connectivityManager);
            } catch (Exception unused) {
            }
            if (LJJLI != null && LJJLI.isAvailable()) {
                int type = LJJLI.getType();
                i = 1;
                if (1 != type) {
                    i = 2;
                }
                LJFF = i;
            }
        }
        i = 0;
        LJFF = i;
    }

    public final void LIZ() {
        long mobileRxBytes;
        try {
            LJFF();
            if (LJFF == 1) {
                mobileRxBytes = C16880lQ.LLLLLZ() - TrafficStats.getMobileRxBytes();
            } else {
                mobileRxBytes = TrafficStats.getMobileRxBytes();
            }
            long j = LJI;
            long j2 = mobileRxBytes - j;
            if (j >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    X58 x58 = this.LIZ;
                    x58.LIZ.addBandwidth(j2, uptimeMillis - this.LIZLLL);
                    this.LIZLLL = uptimeMillis;
                }
            }
            LJI = mobileRxBytes;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZLLL() {
        try {
            if (C65210PiY.LIZ()) {
                String str = LJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SamplingCounter = ");
                LIZ.append(this.LIZIZ);
                C65210PiY.LIZIZ(str, "startSampling", X1D.LIZIZ(LIZ));
            }
            if (this.LIZIZ.getAndIncrement() == 0) {
                this.LIZJ.sendEmptyMessage(1);
                this.LIZLLL = SystemClock.uptimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJ() {
        try {
            if (C65210PiY.LIZ()) {
                String str = LJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SamplingCounter = ");
                LIZ.append(this.LIZIZ);
                C65210PiY.LIZIZ(str, "stopSampling", X1D.LIZIZ(LIZ));
            }
            if (this.LIZIZ.decrementAndGet() == 0) {
                this.LIZJ.removeMessages(1);
                LIZ();
                LJI = -1L;
            }
        } catch (Throwable unused) {
        }
    }
}
