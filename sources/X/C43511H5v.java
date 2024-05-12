package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.H5v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43511H5v {
    public final C43458H3u LIZ;
    public final int LIZIZ;
    public final C43514H5y LIZJ;
    public final H62 LIZLLL;
    public final HashMap<C42982Gtu, Double> LJ;
    public long LJFF;
    public double LJI;
    public double LJII;
    public long LJIIIIZZ;
    public final double LJIIIZ;
    public double LJIIJ;

    public C43511H5v() {
        throw null;
    }

    public C43511H5v(ArrayList stageOrder, C43458H3u c43458H3u) {
        o.LJIIIZ(stageOrder, "stageOrder");
        this.LIZ = c43458H3u;
        this.LIZIZ = 100;
        Iterator it = stageOrder.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C42982Gtu) it.next()).LJLILLLLZI;
        }
        if (i == this.LIZIZ) {
            this.LIZJ = new C43514H5y();
            this.LIZLLL = new H62(stageOrder);
            this.LJ = new HashMap<>();
            this.LJFF = -1L;
            this.LJIIIZ = 0.5d;
            return;
        }
        throw new RuntimeException("ProgressCalculatorNew totalProgress not equal");
    }

    public final void LIZ(float f, Object tag) {
        o.LJIIIZ(tag, "tag");
        H62 h62 = this.LIZLLL;
        h62.getClass();
        Iterator<C42982Gtu> it = h62.LIZ.iterator();
        while (it.hasNext()) {
            C42982Gtu next = it.next();
            if (o.LJ(next.LJLIL, tag)) {
                this.LJ.put(next, Double.valueOf(f * next.LJLILLLLZI));
                Iterator<Map.Entry<C42982Gtu, Double>> it2 = this.LJ.entrySet().iterator();
                double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                while (it2.hasNext()) {
                    d2 += it2.next().getValue().doubleValue();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.LIZJ.LIZIZ.isEmpty()) {
                    H63 LIZIZ = this.LIZJ.LIZIZ();
                    if (LIZIZ == null) {
                        return;
                    }
                    double d3 = d2 - LIZIZ.LIZIZ;
                    long j = currentTimeMillis - LIZIZ.LIZJ;
                    if (j > 0) {
                        double d4 = this.LJIIIZ;
                        this.LJI = ((1 - d4) * this.LJI) + (((d3 * 1.0d) / j) * d4);
                    }
                }
                C43514H5y c43514H5y = this.LIZJ;
                H63 LIZIZ2 = c43514H5y.LIZIZ();
                if (LIZIZ2 != null) {
                    d = LIZIZ2.LIZIZ;
                }
                H63 h63 = new H63(d, d2, currentTimeMillis, this.LJIIJ);
                if (c43514H5y.LIZIZ.size() < c43514H5y.LIZ) {
                    c43514H5y.LIZIZ.add(h63);
                    if (c43514H5y.LIZIZ.size() != c43514H5y.LIZ) {
                        return;
                    }
                    c43514H5y.LIZJ = 0;
                    return;
                }
                ListProtector.set(c43514H5y.LIZIZ, c43514H5y.LIZJ, h63);
                int i = c43514H5y.LIZJ + 1;
                c43514H5y.LIZJ = i;
                c43514H5y.LIZJ = i % c43514H5y.LIZ;
                return;
            }
        }
    }
}
