package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class PAL {
    public static final long[] LJIIL = {120000, LivePreviewNetworkSpeedThresholdSetting.DEFAULT, 600000, 1800000, 3600000};
    public volatile int LIZ;
    public volatile int LIZIZ;
    public volatile int LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;
    public List<String> LJFF;
    public volatile boolean LJIIJJI;
    public volatile boolean LJI = true;
    public final ConcurrentHashMap<String, Boolean> LJIIIZ = new ConcurrentHashMap<>();
    public volatile boolean LJIIJ = true;
    public final AtomicLong LJII = new AtomicLong(0);
    public final AtomicLong LJIIIIZZ = new AtomicLong();

    public final boolean LIZIZ() {
        int i;
        if (!this.LJI) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJII.get();
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
        this.LJI = false;
        this.LJII.set(System.currentTimeMillis());
    }

    public final void LJ() {
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
        this.LJI = false;
        this.LJII.set(System.currentTimeMillis());
    }

    public static long LIZ(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0L;
        }
        long[] jArr = LJIIL;
        if (i2 >= 5) {
            return jArr[4];
        }
        return jArr[i2];
    }

    public final void LIZLLL(List list) {
        if (C78915Uy7.LJIJJ(list) || !C78915Uy7.LJIJJ(this.LJFF)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                java.net.URL url = new java.net.URL((String) it.next());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("https://");
                LIZ.append(url.getHost());
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append("/monitor/collect/batch/");
                linkedList.add(X1D.LIZIZ(LIZ2));
            } catch (MalformedURLException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LJFF = linkedList;
    }
}
