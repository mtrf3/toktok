package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72362si extends AbstractC72372sj {
    public final C72382sk LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72362si) && o.LJ(this.LIZ, ((C72362si) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KidsProfileHeader(userData=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C72362si(C72382sk c72382sk) {
        this.LIZ = c72382sk;
    }
}
