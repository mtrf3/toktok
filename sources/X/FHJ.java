package X;

import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHJ {
    public final FHG LIZ = FHG.LIZLLL;

    public static final boolean LIZIZ(String key) {
        o.LJIIJ(key, "key");
        C36732EbI.LIZLLL.getClass();
        boolean contains = ((HashSet) C36732EbI.LIZIZ.getValue()).contains(key);
        if (!contains && !C36732EbI.LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("launch_key:");
            LIZ.append(key);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        return contains;
    }

    public final void LIZ(String key) {
        o.LJIIJ(key, "key");
        FHG fhg = this.LIZ;
        fhg.getClass();
        FHC LIZIZ = FHC.LIZIZ();
        o.LJFF(LIZIZ, "DataProvider.getInstance()");
        InterfaceC38688FGi interfaceC38688FGi = LIZIZ.LIZLLL;
        if (interfaceC38688FGi != null && interfaceC38688FGi.LJ()) {
            if (fhg.LJIIIIZZ().contains(key)) {
                fhg.LJIIIIZZ().LIZ(key);
                return;
            }
            return;
        }
        fhg.LJIIIIZZ().LIZ(key);
    }
}
