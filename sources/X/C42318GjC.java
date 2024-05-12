package X;

import Y.ARunnableS8S1100000_7;
import android.os.Handler;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import kotlin.jvm.internal.o;

/* renamed from: X.GjC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42318GjC {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HTO.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C42317GjB.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C42319GjD.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C42320GjE.LJLIL);

    public static ICreativePerformanceMonitorService LIZ() {
        return (ICreativePerformanceMonitorService) LIZIZ.getValue();
    }

    public static void LIZIZ(String eventName, java.util.Map map) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(map, "map");
        if (((Boolean) LIZLLL.getValue()).booleanValue()) {
            ((Handler) LIZ.getValue()).postDelayed(new ARunnableS8S1100000_7(map, eventName, 0), ((Number) LIZJ.getValue()).longValue());
        } else {
            GXR.LIZ(eventName, map);
        }
    }
}
