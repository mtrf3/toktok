package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13060fG {
    public final C0MC LIZ;
    public final InterfaceC65784Pro<InterfaceC13090fJ> LIZIZ;
    public final java.util.Map<Object, C13050fF> LIZJ;

    public final Object LIZIZ(Object obj) {
        C13050fF c13050fF = (C13050fF) ((LinkedHashMap) this.LIZJ).get(obj);
        if (c13050fF != null) {
            return c13050fF.LIZIZ;
        }
        InterfaceC13090fJ invoke = this.LIZIZ.invoke();
        Integer num = invoke.LJI().get(obj);
        if (num != null) {
            return invoke.LJFF(num.intValue());
        }
        return null;
    }

    public C13060fG(C0MC saveableStateHolder, IDqS420S0100000 iDqS420S0100000) {
        o.LJIIIZ(saveableStateHolder, "saveableStateHolder");
        this.LIZ = saveableStateHolder;
        this.LIZIZ = iDqS420S0100000;
        this.LIZJ = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LIZ(int i, Object key) {
        o.LJIIIZ(key, "key");
        C13050fF c13050fF = (C13050fF) ((LinkedHashMap) this.LIZJ).get(key);
        Object LJFF = this.LIZIZ.invoke().LJFF(i);
        if (c13050fF != null && ((Number) c13050fF.LIZJ.getValue()).intValue() == i && o.LJ(c13050fF.LIZIZ, LJFF)) {
            InterfaceC88471Ynr interfaceC88471Ynr = c13050fF.LIZLLL;
            if (interfaceC88471Ynr == null) {
                C40431iJ LJFF2 = C1DJ.LJFF(new IDqS189S0200000(c13050fF.LJ, c13050fF, 4), 1403994769, true);
                c13050fF.LIZLLL = LJFF2;
                return LJFF2;
            }
            return interfaceC88471Ynr;
        }
        C13050fF c13050fF2 = new C13050fF(this, i, key, LJFF);
        this.LIZJ.put(key, c13050fF2);
        InterfaceC88471Ynr interfaceC88471Ynr2 = c13050fF2.LIZLLL;
        if (interfaceC88471Ynr2 != null) {
            return interfaceC88471Ynr2;
        }
        C40431iJ LJFF3 = C1DJ.LJFF(new IDqS189S0200000(c13050fF2.LJ, c13050fF2, 4), 1403994769, true);
        c13050fF2.LIZLLL = LJFF3;
        return LJFF3;
    }
}
