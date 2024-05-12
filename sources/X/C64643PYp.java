package X;

import java.lang.reflect.Method;

/* renamed from: X.PYp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64643PYp extends PZ1<C64606PXe> {
    public final Method LIZ;
    public final int LIZIZ;

    public C64643PYp(int i, Method method) {
        this.LIZ = method;
        this.LIZIZ = i;
    }

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, C64606PXe c64606PXe) {
        C64606PXe c64606PXe2 = c64606PXe;
        if (c64606PXe2 != null) {
            C64605PXd c64605PXd = c64638PYk.LJFF;
            c64605PXd.getClass();
            int length = c64606PXe2.LIZ.length / 2;
            for (int i = 0; i < length; i++) {
                c64605PXd.LIZIZ(c64606PXe2.LJ(i), c64606PXe2.LJIIJ(i));
            }
            return;
        }
        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "Headers parameter must not be null.", new Object[0]);
    }
}
