package X;

import X.InterfaceC78686UuQ;
import X.InterfaceC86711Y1j;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y27<T extends InterfaceC86711Y1j, E extends InterfaceC78686UuQ> {
    public final InterfaceC65350Pko<? extends T> LIZ;
    public final InterfaceC65350Pko<? extends T> LIZIZ;
    public final E LIZJ;
    public final List<InterfaceC88472Yns<Y23<T, E>, C76800UCe>> LIZLLL;
    public final List<InterfaceC88472Yns<Y23<T, E>, C76800UCe>> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public Y27(InterfaceC65350Pko<? extends T> interfaceC65350Pko, InterfaceC65350Pko<? extends T> next, E e, List<? extends InterfaceC88472Yns<? super Y23<T, E>, C76800UCe>> beforeTransitionActions, List<? extends InterfaceC88472Yns<? super Y23<T, E>, C76800UCe>> afterTransitionActions) {
        o.LJIIIZ(next, "next");
        o.LJIIIZ(beforeTransitionActions, "beforeTransitionActions");
        o.LJIIIZ(afterTransitionActions, "afterTransitionActions");
        this.LIZ = interfaceC65350Pko;
        this.LIZIZ = next;
        this.LIZJ = e;
        this.LIZLLL = beforeTransitionActions;
        this.LJ = afterTransitionActions;
    }
}
