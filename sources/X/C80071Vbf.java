package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Vbf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80071Vbf<Element> {
    public final CopyOnWriteArrayList<Element> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Element element) {
        if (!this.LIZ.contains(element)) {
            this.LIZ.add(element);
        }
    }

    public final void LIZIZ(InterfaceC88472Yns<? super Element, C76800UCe> action) {
        o.LJIIJ(action, "action");
        C80072Vbg c80072Vbg = new C80072Vbg(action);
        Iterator<Element> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                c80072Vbg.LIZ(it.next());
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZJ(Element element) {
        this.LIZ.remove(element);
    }
}
