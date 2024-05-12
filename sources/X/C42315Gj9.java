package X;

import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gj9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42315Gj9 {
    public static int LIZ = -1;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C42316GjA.LJLIL);

    public static final ICreativePerformanceMonitorService LIZ() {
        return (ICreativePerformanceMonitorService) LIZIZ.getValue();
    }

    public static final void LIZJ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (!((Boolean) C52467KiV.LIZ.getValue()).booleanValue()) {
            return;
        }
        LIZ().stopBlockMonitor(scene);
        LIZ().stopFpsMonitor(scene);
    }

    public static final void LIZIZ(String scene, int i, long j) {
        o.LJIIIZ(scene, "scene");
        if (((Boolean) C52467KiV.LIZ.getValue()).booleanValue()) {
            if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
                return;
            }
            LIZ().startBlockMonitor(scene, i, j, new C42314Gj8());
            LIZ().startFpsMonitor(scene, j, new C42313Gj7(scene));
        }
    }
}
