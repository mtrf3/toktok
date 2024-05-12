package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1M0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M0 implements InterfaceC07790Sh {
    public final InterfaceC07790Sh LJLIL;
    public final InterfaceC07790Sh LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return (this.LJLILLLLZI.hashCode() * 31) + this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        return q.LIZIZ(LIZ, (String) LLLZLZ("", C49411wn.LJLIL), ']', LIZ);
    }

    @Override // X.InterfaceC07790Sh
    public final boolean I(InterfaceC88472Yns<? super C1M2, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        if (this.LJLIL.I(predicate) && this.LJLILLLLZI.I(predicate)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1M0) {
            C1M0 c1m0 = (C1M0) obj;
            if (o.LJ(this.LJLIL, c1m0.LJLIL) && o.LJ(this.LJLILLLLZI, c1m0.LJLILLLLZI)) {
                return true;
            }
        }
        return false;
    }

    public C1M0(InterfaceC07790Sh outer, InterfaceC07790Sh inner) {
        o.LJIIIZ(outer, "outer");
        o.LJIIIZ(inner, "inner");
        this.LJLIL = outer;
        this.LJLILLLLZI = inner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07790Sh
    public final <R> R LLLZLZ(R r, InterfaceC88471Ynr<? super R, ? super C1M2, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return (R) this.LJLILLLLZI.LLLZLZ(this.LJLIL.LLLZLZ(r, operation), operation);
    }
}
