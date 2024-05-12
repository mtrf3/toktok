package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64492g1 {
    public final EnumC78982UzC LIZ;
    public final Exception LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64492g1)) {
            return false;
        }
        C64492g1 c64492g1 = (C64492g1) obj;
        return this.LIZ == c64492g1.LIZ && o.LJ(this.LIZIZ, c64492g1.LIZIZ);
    }

    public final int hashCode() {
        EnumC78982UzC enumC78982UzC = this.LIZ;
        int hashCode = (enumC78982UzC == null ? 0 : enumC78982UzC.hashCode()) * 31;
        Exception exc = this.LIZIZ;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseWrapper(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", exception=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C64492g1(EnumC78982UzC enumC78982UzC, Exception exc) {
        this.LIZ = enumC78982UzC;
        this.LIZIZ = exc;
    }
}
