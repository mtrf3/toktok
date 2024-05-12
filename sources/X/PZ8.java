package X;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class PZ8<T> extends PZ1<T> {
    public final Method LIZ;
    public final int LIZIZ;
    public final InterfaceC65017PfR<T, PVP> LIZJ;

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, T t) {
        if (t != null) {
            try {
                c64638PYk.LJIIJ = this.LIZJ.LIZ(t);
                return;
            } catch (IOException e) {
                Method method = this.LIZ;
                int i = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unable to convert ");
                LIZ.append(t);
                LIZ.append(" to RequestBody");
                throw C65138PhO.LJIIJJI(method, e, i, X1D.LIZIZ(LIZ), new Object[0]);
            }
        }
        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "Body parameter value must not be null.", new Object[0]);
    }

    public PZ8(Method method, int i, InterfaceC65017PfR<T, PVP> interfaceC65017PfR) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65017PfR;
    }
}
