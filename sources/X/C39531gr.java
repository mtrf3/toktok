package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39531gr<R> extends C17A {
    public final R LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39531gr) && o.LJ(this.LIZ, ((C39531gr) obj).LIZ);
    }

    public final int hashCode() {
        R r = this.LIZ;
        if (r == null) {
            return 0;
        }
        return r.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Right(b=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C39531gr(R r) {
        this.LIZ = r;
    }
}
