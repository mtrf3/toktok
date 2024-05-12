package X;

import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EkL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37293EkL implements InterfaceC88473Ynt<AbstractC29891Fh<?>, EnumC06330Mr, Long, C76800UCe> {
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(AbstractC29891Fh<?> component, EnumC06330Mr lifecycle, Long l) {
        long longValue = l.longValue();
        o.LJIIIZ(component, "component");
        o.LJIIIZ(lifecycle, "lifecycle");
        HashMap hashMap = (HashMap) ((HashMap) C37297EkP.LIZ.getValue()).get(C37297EkP.LIZIZ);
        if (hashMap != null) {
            String name = component.getClass().getName();
            String LJLLILLLL = s.LJLLILLLL('.', name, name);
            Object obj = hashMap.get(LJLLILLLL);
            if (obj == null) {
                obj = new EnumMap(EnumC06330Mr.class);
                hashMap.put(LJLLILLLL, obj);
            }
            EnumMap enumMap = (EnumMap) obj;
            if (enumMap.get(lifecycle) == null) {
                enumMap.put((EnumMap) lifecycle, (EnumC06330Mr) Long.valueOf(longValue));
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GlobalALSComponentMonitor ");
            LIZ.append(C37297EkP.LIZIZ);
            LIZ.append(" has no info");
            H78.LIZJ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
