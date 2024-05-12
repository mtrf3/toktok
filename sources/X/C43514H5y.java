package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.H5y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43514H5y {
    public final int LIZ = 3;
    public final ArrayList<H63> LIZIZ = new ArrayList<>();
    public int LIZJ;

    public final double LIZ() {
        Iterator<H63> it = this.LIZIZ.iterator();
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        while (it.hasNext()) {
            H63 next = it.next();
            d += next.LIZIZ - next.LIZ;
        }
        return d / this.LIZIZ.size();
    }

    public final H63 LIZIZ() {
        int size = this.LIZIZ.size();
        int i = this.LIZ;
        if (size == i) {
            return (H63) ListProtector.get(this.LIZIZ, ((this.LIZJ + i) - 1) % i);
        }
        if (!this.LIZIZ.isEmpty()) {
            return (H63) ORZ.LLFF(this.LIZIZ);
        }
        return null;
    }
}
