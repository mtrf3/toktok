package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEK extends EEN {
    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    @Override // X.EEN, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        Iterator it = ((ArrayList) C36093EEn.LIZLLL.LIZLLL(EFK.MAIN)).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(str);
        }
    }
}
