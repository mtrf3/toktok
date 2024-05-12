package X;

import X.InterfaceC78686UuQ;
import X.InterfaceC86711Y1j;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y23<T extends InterfaceC86711Y1j, E extends InterfaceC78686UuQ> {
    public final InterfaceC65350Pko<? extends T> LIZ;
    public final InterfaceC65350Pko<? extends T> LIZIZ;
    public final E LIZJ;
    public final List<InterfaceC88472Yns<Y23<T, E>, C76800UCe>> LIZLLL;
    public final List<InterfaceC88472Yns<Y23<T, E>, C76800UCe>> LJ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZJ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y23)) {
            return false;
        }
        Y23 y23 = (Y23) obj;
        if (!o.LJ(y23.LIZ, this.LIZ) || !o.LJ(y23.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Y23(InterfaceC65350Pko<? extends T> current, InterfaceC65350Pko<? extends T> next, E event, List<? extends InterfaceC88472Yns<? super Y23<T, E>, C76800UCe>> beforeTransitionActions, List<? extends InterfaceC88472Yns<? super Y23<T, E>, C76800UCe>> afterUpdateActions) {
        o.LJIIIZ(current, "current");
        o.LJIIIZ(next, "next");
        o.LJIIIZ(event, "event");
        o.LJIIIZ(beforeTransitionActions, "beforeTransitionActions");
        o.LJIIIZ(afterUpdateActions, "afterUpdateActions");
        this.LIZ = current;
        this.LIZIZ = next;
        this.LIZJ = event;
        this.LIZLLL = beforeTransitionActions;
        this.LJ = afterUpdateActions;
    }
}
