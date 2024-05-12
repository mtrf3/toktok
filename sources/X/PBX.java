package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class PBX {
    public static final long[] LJIILJJIL = {120000, LivePreviewNetworkSpeedThresholdSetting.DEFAULT, 600000, 1800000, 3600000};
    public volatile int LIZ;
    public volatile int LIZIZ;
    public volatile int LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;
    public PBY LJIIL;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIIIZ = true;
    public final List<String> LJFF = new ArrayList();
    public final List<String> LJI = new ArrayList();
    public final List<String> LJII = new ArrayList();
    public final List<String> LJIIIIZZ = new ArrayList();
    public final AtomicLong LJIIJ = new AtomicLong(0);
    public final AtomicLong LJIIJJI = new AtomicLong();

    public final boolean LIZIZ() {
        int i;
        if (!this.LJIIIZ) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJIIJ.get();
            if (this.LIZIZ > this.LIZLLL) {
                i = this.LIZIZ;
            } else {
                i = this.LIZLLL;
            }
            long j = i;
            if (j <= this.LJ) {
                j = this.LJ;
            }
            if (currentTimeMillis <= j) {
                return false;
            }
        }
        return true;
    }

    public final void LIZJ() {
        if (this.LIZ == 0) {
            this.LIZ = 1;
            this.LIZIZ = 300000;
        } else if (this.LIZ == 1) {
            this.LIZ = 2;
            this.LIZIZ = 900000;
        } else if (this.LIZ == 2) {
            this.LIZ = 3;
            this.LIZIZ = 1800000;
        } else {
            this.LIZ = 4;
            this.LIZIZ = 1800000;
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("longBackOff:");
            LIZ.append(this.LIZIZ);
            LIZ.append(" netFailCount:");
            LIZ.append(this.LIZ);
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
        }
        this.LJIIIZ = false;
        this.LJIIJ.set(System.currentTimeMillis());
    }

    public final void LIZLLL() {
        if (this.LIZJ == 0) {
            this.LIZJ = 1;
            this.LIZLLL = 30000;
        } else if (this.LIZJ == 1) {
            this.LIZJ = 2;
            this.LIZLLL = 60000;
        } else if (this.LIZJ == 2) {
            this.LIZJ = 3;
            this.LIZLLL = 120000;
        } else if (this.LIZJ == 3) {
            this.LIZJ = 4;
            this.LIZLLL = 240000;
        } else {
            this.LIZJ = 5;
            this.LIZLLL = 300000;
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shortStopInterval:");
            LIZ.append(this.LIZLLL);
            LIZ.append(" shortFailCount:");
            LIZ.append(this.LIZJ);
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
        }
        this.LJIIIZ = false;
        this.LJIIJ.set(System.currentTimeMillis());
    }

    public static long LIZ(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0L;
        }
        long[] jArr = LJIILJJIL;
        if (i2 >= 5) {
            return jArr[4];
        }
        return jArr[i2];
    }
}
