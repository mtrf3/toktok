package X;

import X.C1M3;
import kotlin.jvm.internal.o;

/* renamed from: X.1iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40451iL<N extends C1M3> extends AbstractC014804a implements C1M2 {
    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    public abstract N LIZ();

    public abstract C1M3 LIZIZ();

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (!(b instanceof AbstractC40451iL)) {
            return false;
        }
        o.LJIIIZ(b, "b");
        if (AbstractC40451iL.class != b.getClass()) {
            return false;
        }
        return o.LJ(null, null);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
