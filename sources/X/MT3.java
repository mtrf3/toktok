package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MT3<T> extends AbstractC56868MTo<T> {
    public final T LIZ;

    @Override // X.AbstractC56868MTo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MT3) && o.LJ(this.LIZ, ((MT3) obj).LIZ);
    }

    @Override // X.AbstractC56868MTo
    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeByClick(value=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    @Override // X.AbstractC56868MTo
    public final T LIZ() {
        return this.LIZ;
    }

    public MT3(T t) {
        this.LIZ = t;
    }
}
