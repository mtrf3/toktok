package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48071ud implements InterfaceC44931pZ {
    public boolean LJLIL;

    @Override // X.InterfaceC44931pZ
    public final Object LJIIL(InterfaceC23370vt interfaceC23370vt, Object obj) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48071ud) && this.LJLIL == ((C48071ud) obj).LJLIL;
    }

    public final int hashCode() {
        boolean z = this.LJLIL;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChildData(isTarget=");
        return C48339Iy7.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C48071ud(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC07790Sh
    public final boolean I(InterfaceC88472Yns<? super C1M2, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        return C48263Iwt.LIZ(this, predicate);
    }

    @Override // X.InterfaceC07790Sh
    public final InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh other) {
        o.LJIIIZ(other, "other");
        return C07780Sg.LIZ(this, other);
    }

    @Override // X.InterfaceC07790Sh
    public final <R> R LLLZLZ(R r, InterfaceC88471Ynr<? super R, ? super C1M2, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
