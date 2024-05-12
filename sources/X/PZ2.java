package X;

import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class PZ2 extends PZ1<Object> {
    public final Method LIZ;
    public final int LIZIZ;

    public PZ2(int i, Method method) {
        this.LIZ = method;
        this.LIZIZ = i;
    }

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, Object obj) {
        if (obj != null) {
            c64638PYk.LIZJ = obj.toString();
            return;
        }
        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "@Url parameter is null.", new Object[0]);
    }
}
