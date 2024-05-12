package X;

import Y.ARunnableS38S0100000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5OG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OG {
    public static final boolean LIZ() {
        return o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL());
    }

    public static final void LIZIZ(Runnable runnable) {
        C43045Guv.LIZLLL(new AqS152S0100000_2(runnable, 325), 0L);
    }

    public static final void LIZJ(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        LIZIZ(new ARunnableS38S0100000_2(action, (InterfaceC65784Pro<C76800UCe>) 87));
    }
}
