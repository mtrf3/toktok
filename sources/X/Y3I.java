package X;

import X.InterfaceC78686UuQ;
import X.InterfaceC86711Y1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y3I<T extends InterfaceC86711Y1j, E extends InterfaceC78686UuQ> {
    public C65776Prg LIZ;
    public final List<Y27<T, E>> LIZIZ = new ArrayList();

    public final void onEvent(InterfaceC88472Yns<? super Y3H<T, E>, C76800UCe> builder) {
        o.LJIIIZ(builder, "builder");
        C65776Prg c65776Prg = this.LIZ;
        Y3H y3h = new Y3H(c65776Prg);
        builder.invoke(y3h);
        if (c65776Prg != null) {
            C65776Prg c65776Prg2 = y3h.LIZIZ;
            if (c65776Prg2 == null) {
                c65776Prg2 = c65776Prg;
            }
            E e = y3h.LIZJ;
            if (e != null) {
                ((ArrayList) this.LIZIZ).add(new Y27(c65776Prg, c65776Prg2, e, y3h.LIZLLL, y3h.LJ));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
