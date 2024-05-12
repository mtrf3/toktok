package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66342j0 {
    public final EnumC66332iz LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66342j0)) {
            return false;
        }
        C66342j0 c66342j0 = (C66342j0) obj;
        return this.LIZ == c66342j0.LIZ && o.LJ(this.LIZIZ, c66342j0.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.getValue());
        LIZ.append(':');
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C66342j0(EnumC66332iz type, String id) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(id, "id");
        this.LIZ = type;
        this.LIZIZ = id;
    }
}
