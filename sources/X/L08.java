package X;

import Y.ACallableS112S0100000_9;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class L08 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(L04.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L06.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(L07.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(L05.LJLIL);
    public static final java.util.Map<Integer, String> LJ = new LinkedHashMap();

    public static void LIZIZ() {
        if (((Boolean) LIZLLL.getValue()).booleanValue()) {
            Iterator it = ((LinkedHashMap) LJ).keySet().iterator();
            while (it.hasNext()) {
                C16970lZ.LJII(((Number) it.next()).intValue());
            }
        }
    }

    public static final boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (LIZJ()) {
            C221018lt.LJFF("InboxJankOptimizationV2", "asyncJankMethod");
            C10K.LIZJ(new ACallableS112S0100000_9(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 31));
        } else {
            interfaceC65784Pro.invoke();
        }
    }
}
