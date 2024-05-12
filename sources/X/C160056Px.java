package X;

import defpackage.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6Px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160056Px {
    public final java.util.Map<String, Object> LIZ = new LinkedHashMap();

    public final Object LIZ(String str) {
        Object obj = ((LinkedHashMap) this.LIZ).get(str);
        if (obj != null) {
            return obj;
        }
        throw new Exception(i0.LJFF(str, " has not been registered"));
    }

    public final Object LIZIZ(C65776Prg c65776Prg) {
        Object obj = ((LinkedHashMap) this.LIZ).get(c65776Prg.LIZLLL());
        if (obj != null) {
            T2R.LJIILIIL(obj, c65776Prg);
            return obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c65776Prg);
        LIZ.append(" has not been registered");
        throw new Exception(X1D.LIZIZ(LIZ));
    }

    public final Object LIZJ(C65776Prg c65776Prg) {
        Object obj = ((LinkedHashMap) this.LIZ).get(c65776Prg.LIZLLL());
        if (obj != null) {
            T2R.LJIILIIL(obj, c65776Prg);
            return obj;
        }
        return null;
    }

    public final <T> void LIZLLL(T component) {
        o.LJIIIZ(component, "component");
        String LIZLLL = C65352Pkq.LIZ(component.getClass()).LIZLLL();
        if (LIZLLL != null) {
            this.LIZ.put(LIZLLL, component);
        }
    }
}
