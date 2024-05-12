package X;

import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: X.VnA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class WindowOnFrameMetricsAvailableListenerC80784VnA implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ C80770Vmw LIZ;

    public WindowOnFrameMetricsAvailableListenerC80784VnA(C80770Vmw c80770Vmw) {
        this.LIZ = c80770Vmw;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(3) / 1000000;
        C80770Vmw c80770Vmw = this.LIZ;
        if (c80770Vmw.LJII == VIQ.WAIT_OPT) {
            if (metric <= 5) {
                c80770Vmw.LJIIIZ++;
            } else {
                c80770Vmw.LJIIIZ = 0;
            }
            if (c80770Vmw.LJIIIZ >= C80770Vmw.LJIIJJI) {
                c80770Vmw.LJ();
                this.LIZ.LJIIIZ = 0;
            }
        }
    }
}
