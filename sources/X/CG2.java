package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public final class CG2 implements CGL {
    public final java.util.Set<InterfaceC88472Yns<Float, C76800UCe>> LIZ = new LinkedHashSet();

    @Override // X.CGL
    public final void start() {
    }

    @Override // X.CGL
    public final void stop() {
    }

    @Override // X.CGL
    public final void LJFF() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        float f = C31032CFw.LIZ.LIZLLL;
        Iterator<InterfaceC88472Yns<Float, C76800UCe>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Float.valueOf(f));
        }
    }

    @Override // X.CGL
    public final void destroy() {
        this.LIZ.clear();
    }
}
