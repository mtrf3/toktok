package X;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class PZ6<T> extends PZ1<T> {
    public final Method LIZ;
    public final int LIZIZ;
    public final C64606PXe LIZJ;
    public final InterfaceC65017PfR<T, PVP> LIZLLL;

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, T t) {
        if (t == null) {
            return;
        }
        try {
            PVP LIZ = this.LIZLLL.LIZ(t);
            C64606PXe c64606PXe = this.LIZJ;
            C64552PVc c64552PVc = c64638PYk.LJIIIIZZ;
            c64552PVc.getClass();
            c64552PVc.LIZ(C64553PVd.LIZ(c64606PXe, LIZ));
        } catch (IOException e) {
            Method method = this.LIZ;
            int i = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unable to convert ");
            LIZ2.append(t);
            LIZ2.append(" to RequestBody");
            throw C65138PhO.LJIIJ(method, i, X1D.LIZIZ(LIZ2), e);
        }
    }

    public PZ6(Method method, int i, C64606PXe c64606PXe, InterfaceC65017PfR<T, PVP> interfaceC65017PfR) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = c64606PXe;
        this.LIZLLL = interfaceC65017PfR;
    }
}
