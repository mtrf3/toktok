package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ZqO, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91176ZqO<ELEMENT> {
    public final CopyOnWriteArrayList<ELEMENT> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(ELEMENT element) {
        if (!this.LIZ.contains(element)) {
            this.LIZ.add(element);
        }
    }

    public final void LIZIZ(InterfaceC88472Yns<? super ELEMENT, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        C91377Ztd c91377Ztd = new C91377Ztd(action);
        Iterator<ELEMENT> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                c91377Ztd.LIZ(it.next());
            } catch (Exception unused) {
            }
        }
    }
}
