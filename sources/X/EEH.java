package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEH implements EEA {
    public final List<EEA> LIZ = new ArrayList();

    @Override // X.EEA
    public final void LIZ(EEY component) {
        o.LJIIIZ(component, "component");
        Iterator<EEA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(component);
        }
    }

    @Override // X.EEA
    public final void LIZIZ(EEY component) {
        o.LJIIIZ(component, "component");
        Iterator<EEA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(component);
        }
    }
}
