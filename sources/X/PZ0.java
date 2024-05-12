package X;

import defpackage.a1;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PZ0<T> extends PZ1<java.util.Map<String, T>> {
    public final Method LIZ;
    public final int LIZIZ;
    public final InterfaceC65017PfR<T, String> LIZJ;
    public final boolean LIZLLL;

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        String str2 = (String) this.LIZJ.LIZ(value);
                        if (str2 != null) {
                            if (this.LIZLLL) {
                                c64638PYk.LJIIIZ.LIZIZ(str, str2);
                            } else {
                                c64638PYk.LJIIIZ.LIZ(str, str2);
                            }
                        } else {
                            Method method = this.LIZ;
                            int i = this.LIZIZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Field map value '");
                            LIZ.append(value);
                            LIZ.append("' converted to null by ");
                            LIZ.append(this.LIZJ.getClass().getName());
                            LIZ.append(" for key '");
                            LIZ.append(str);
                            LIZ.append("'.");
                            throw C65138PhO.LJIIJ(method, i, X1D.LIZIZ(LIZ), new Object[0]);
                        }
                    } else {
                        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, a1.LJ("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                } else {
                    throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "Field map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw C65138PhO.LJIIJ(this.LIZ, this.LIZIZ, "Field map was null.", new Object[0]);
    }

    public PZ0(Method method, int i, InterfaceC65017PfR<T, String> interfaceC65017PfR, boolean z) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65017PfR;
        this.LIZLLL = z;
    }
}
