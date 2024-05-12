package X;

import android.os.Build;
import android.view.FrameMetrics;
import java.util.concurrent.ExecutorService;

/* renamed from: X.PRo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64460PRo extends AbstractC64456PRk implements InterfaceC64455PRj {
    @Override // X.InterfaceC64455PRj
    public final void LIZJ() {
    }

    @Override // X.InterfaceC64455PRj
    public final void LIZ(FrameMetrics frameMetrics) {
        int i;
        long currentTimeMillis;
        C64464PRs peekFirst;
        if (!this.LIZ || frameMetrics == null || (i = Build.VERSION.SDK_INT) < 24) {
            return;
        }
        long j = 1000000;
        long metric = (frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))))) / j;
        if (i >= 26) {
            currentTimeMillis = frameMetrics.getMetric(10);
        } else {
            currentTimeMillis = ((System.currentTimeMillis() * j) - frameMetrics.getMetric(8)) - 10000;
        }
        float f = ((float) metric) / PH9.LIZ;
        RunnableC64461PRp runnableC64461PRp = new RunnableC64461PRp(this, frameMetrics);
        ExecutorService executorService = VB5.LIZ;
        executorService.execute(runnableC64461PRp);
        if (f < 3.0f || (peekFirst = this.LIZIZ.peekFirst()) == null) {
            return;
        }
        executorService.execute(new RunnableC64462PRq(this, metric, currentTimeMillis, peekFirst));
    }

    @Override // X.InterfaceC64455PRj
    public final void LIZIZ(long j, long j2, boolean z) {
        C64464PRs peekFirst;
        if (this.LIZ && (peekFirst = this.LIZIZ.peekFirst()) != null && j2 - j > 5) {
            C64466PRu c64466PRu = new C64466PRu();
            c64466PRu.LIZ = j;
            c64466PRu.LIZIZ = j2;
            c64466PRu.LIZJ = false;
            peekFirst.LIZIZ.add(c64466PRu);
        }
    }
}
