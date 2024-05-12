package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0zI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC25480zI implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C36381bm LIZIZ;

    public WindowOnFrameMetricsAvailableListenerC25480zI(C36381bm c36381bm, String str) {
        this.LIZIZ = c36381bm;
        this.LIZ = str;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, final int i) {
        this.LIZIZ.getClass();
        final FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        PF1 pf1 = this.LIZIZ.LJIILIIL;
        if (LLLLIIIILLL != pf1.LIZ) {
            pf1.LIZ(new Runnable() { // from class: X.0zH
                public final void LIZ() {
                    if (frameMetrics2.getMetric(9) == 0) {
                        AbstractC06100Lu abstractC06100Lu = C36381bm.LJJ;
                        if (abstractC06100Lu != null) {
                            WindowOnFrameMetricsAvailableListenerC25480zI windowOnFrameMetricsAvailableListenerC25480zI = WindowOnFrameMetricsAvailableListenerC25480zI.this;
                            if (windowOnFrameMetricsAvailableListenerC25480zI.LIZIZ.LJIJ) {
                                abstractC06100Lu.LJIIL(windowOnFrameMetricsAvailableListenerC25480zI.LIZ, frameMetrics2, i);
                                return;
                            }
                        }
                        Iterator it = ((CopyOnWriteArrayList) WindowOnFrameMetricsAvailableListenerC25480zI.this.LIZIZ.LIZLLL).iterator();
                        while (it.hasNext()) {
                            ((AbstractC06100Lu) it.next()).LJIIL(WindowOnFrameMetricsAvailableListenerC25480zI.this.LIZ, frameMetrics2, i);
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
            });
            return;
        }
        if (frameMetrics2.getMetric(9) != 0) {
            return;
        }
        AbstractC06100Lu abstractC06100Lu = C36381bm.LJJ;
        if (abstractC06100Lu != null && this.LIZIZ.LJIJ) {
            abstractC06100Lu.LJIIL(this.LIZ, frameMetrics2, i);
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((AbstractC06100Lu) it.next()).LJIIL(this.LIZ, frameMetrics2, i);
        }
    }
}
