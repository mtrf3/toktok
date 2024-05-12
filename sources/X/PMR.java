package X;

import android.os.Build;
import android.view.FrameMetrics;

/* loaded from: classes12.dex */
public class PMR extends AbstractC06100Lu implements CGS {
    public boolean LJLILLLLZI;
    public InterfaceC31063CHb LJLJI;

    public PMR(int i) {
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIJ(long j, long j2, String str) {
        InterfaceC31063CHb interfaceC31063CHb;
        if (Build.VERSION.SDK_INT < 24 && (interfaceC31063CHb = this.LJLJI) != null) {
            interfaceC31063CHb.LIZ((j2 - j) * 100, str);
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIL(String str, FrameMetrics frameMetrics, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJLJI.LIZ(((frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))))) / 1000000) * 100, str);
        }
    }
}
