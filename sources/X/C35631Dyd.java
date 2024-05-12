package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Dyd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35631Dyd extends AbstractC35632Dye {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35631Dyd)) {
            return false;
        }
        C35631Dyd c35631Dyd = (C35631Dyd) obj;
        return this.LIZ == c35631Dyd.LIZ && o.LJ(this.LIZIZ, c35631Dyd.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Invalid(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", description=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35631Dyd(int i, String description) {
        o.LJIIIZ(description, "description");
        this.LIZ = i;
        this.LIZIZ = description;
    }
}
