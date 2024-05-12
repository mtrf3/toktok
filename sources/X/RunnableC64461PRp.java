package X;

import android.os.Build;
import android.view.FrameMetrics;
import java.util.Iterator;

/* renamed from: X.PRp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64461PRp implements Runnable {
    public final /* synthetic */ C64460PRo LJLIL;
    public final /* synthetic */ FrameMetrics LJLILLLLZI;

    public RunnableC64461PRp(C64460PRo c64460PRo, FrameMetrics frameMetrics) {
        this.LJLIL = c64460PRo;
        this.LJLILLLLZI = frameMetrics;
    }

    public final void LIZ() {
        long metric;
        long metric2;
        C64460PRo c64460PRo = this.LJLIL;
        FrameMetrics frameMetrics = this.LJLILLLLZI;
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            c64460PRo.getClass();
            return;
        }
        C64464PRs peekFirst = c64460PRo.LIZIZ.peekFirst();
        if (peekFirst == null) {
            return;
        }
        if (i >= 26) {
            metric = frameMetrics.getMetric(11);
            metric2 = frameMetrics.getMetric(1);
        } else {
            System.currentTimeMillis();
            frameMetrics.getMetric(8);
            metric = frameMetrics.getMetric(0);
            metric2 = frameMetrics.getMetric(1);
        }
        long j = (metric2 + metric) / 1000000;
        Iterator<C64466PRu> it = peekFirst.LIZIZ.iterator();
        while (it.hasNext()) {
            C64466PRu next = it.next();
            if (next.LIZ <= j && next.LIZIZ >= j) {
                next.LIZJ = true;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
