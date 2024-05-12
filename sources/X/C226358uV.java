package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226358uV implements C33Q {
    public final AbstractC226378uX LJLIL;

    public C226358uV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C226358uV) && o.LJ(this.LJLIL, ((C226358uV) obj).LJLIL);
    }

    public final int hashCode() {
        AbstractC226378uX abstractC226378uX = this.LJLIL;
        if (abstractC226378uX == null) {
            return 0;
        }
        return abstractC226378uX.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursEntranceState(entranceStrategy=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C226358uV(AbstractC226378uX abstractC226378uX) {
        this.LJLIL = abstractC226378uX;
    }
}
