package X;

import Y.ARunnableS12S1000000_6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEL extends EEN {
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
        Iterator it = ((ArrayList) C36093EEn.LIZLLL.LIZLLL(EFK.BACKGROUND)).iterator();
        while (it.hasNext()) {
            C37179EiV.LIZJ(false).execute(new ARunnableS12S1000000_6((String) it.next(), 5));
        }
    }
}
