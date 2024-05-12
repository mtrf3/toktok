package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.XaW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85096XaW<ELEMENT> {
    public final CopyOnWriteArrayList<ELEMENT> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(InterfaceC88472Yns<? super ELEMENT, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        C85097XaX c85097XaX = new C85097XaX(action);
        Iterator<ELEMENT> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                c85097XaX.LIZ(it.next());
            } catch (Exception unused) {
            }
        }
    }
}
