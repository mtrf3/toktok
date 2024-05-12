package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9RY, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9RY extends AbstractC236819Rd {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9RY) && o.LJ(this.LIZ, ((C9RY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Invalid(error=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C9RY(String error) {
        o.LJIIIZ(error, "error");
        this.LIZ = error;
    }
}
