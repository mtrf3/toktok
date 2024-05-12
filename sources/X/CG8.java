package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CG8 implements CGL {
    public final java.util.Set<InterfaceC88472Yns<Long, C76800UCe>> LIZ = new LinkedHashSet();

    public static final long LIZ() {
        return B4U.LIZ().LLILLIZIL;
    }

    @Override // X.CGL
    public final synchronized void LJFF() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        Iterator<InterfaceC88472Yns<Long, C76800UCe>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Long.valueOf(B4U.LIZ().LLILLIZIL));
        }
    }

    @Override // X.CGL
    public final void start() {
    }

    @Override // X.CGL
    public final void stop() {
    }

    @Override // X.CGL
    public final void destroy() {
        this.LIZ.clear();
    }

    public final void LIZIZ(CGH notifyFilter) {
        o.LJIIIZ(notifyFilter, "notifyFilter");
        this.LIZ.add(notifyFilter);
    }
}
