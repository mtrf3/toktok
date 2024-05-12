package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.E0a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35716E0a {
    public int LIZ;
    public final Object LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C35716E0a() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35716E0a)) {
            return false;
        }
        C35716E0a c35716E0a = (C35716E0a) obj;
        return this.LIZ == c35716E0a.LIZ && o.LJ(this.LIZIZ, c35716E0a.LIZIZ) && this.LIZJ == c35716E0a.LIZJ && this.LIZLLL == c35716E0a.LIZLLL;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Object obj = this.LIZIZ;
        return ((((i + (obj == null ? 0 : obj.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Item(pos=");
        LIZ.append(this.LIZ);
        LIZ.append(", id=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZJ);
        LIZ.append(", newStatus=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C35716E0a(Object obj, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        obj = (i & 2) != 0 ? null : obj;
        this.LIZ = i2;
        this.LIZIZ = obj;
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }
}
