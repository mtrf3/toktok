package X;

import defpackage.a1;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PZ7<T> extends PZ1<java.util.Map<String, T>> {
    public final Method LIZ;
    public final int LIZIZ;
    public final InterfaceC65017PfR<T, PVP> LIZJ;
    public final String LIZLLL;

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        C64606PXe LJII = C64606PXe.LJII("Content-Disposition", a1.LJ("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.LIZLLL);
                        PVP pvp = (PVP) this.LIZJ.LIZ(value);
                        C64552PVc c64552PVc = c64638PYk.LJIIIIZZ;
                        c64552PVc.getClass();
                        c64552PVc.LIZ(C64553PVd.LIZ(LJII, pvp));
                    } else {
                        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, a1.LJ("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                } else {
                    throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "Part map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "Part map was null.", new Object[0]);
    }

    public PZ7(Method method, int i, InterfaceC65017PfR<T, PVP> interfaceC65017PfR, String str) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65017PfR;
        this.LIZLLL = str;
    }
}
