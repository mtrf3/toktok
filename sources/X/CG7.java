package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CG7 implements CGL {
    public final java.util.Set<InterfaceC88472Yns<Double, C76800UCe>> LIZ = new LinkedHashSet();

    @Override // X.CGL
    public final synchronized void LJFF() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        double LIZ = LIZ();
        Iterator<InterfaceC88472Yns<Double, C76800UCe>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Double.valueOf(LIZ));
        }
    }

    @Override // X.CGL
    public final void start() {
    }

    @Override // X.CGL
    public final void stop() {
    }

    public static final double LIZ() {
        Double d = C31023CFn.LIZ.get("cpu_speed");
        if (d == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return d.doubleValue();
    }

    @Override // X.CGL
    public final void destroy() {
        this.LIZ.clear();
    }

    public final synchronized void LIZIZ(CGC listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.add(listener);
    }
}
