package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08410Ur<T> {
    public final T LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08410Ur)) {
            return false;
        }
        C08410Ur c08410Ur = (C08410Ur) obj;
        return o.LJ(this.LIZ, c08410Ur.LIZ) && this.LIZIZ == c08410Ur.LIZIZ && this.LIZJ == c08410Ur.LIZJ && o.LJ(this.LIZLLL, c08410Ur.LIZLLL);
    }

    public final int hashCode() {
        T t = this.LIZ;
        return this.LIZLLL.hashCode() + ((((((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Range(item=");
        LIZ.append(this.LIZ);
        LIZ.append(", start=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", end=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tag=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C08410Ur(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }

    public C08410Ur(T t, int i, int i2, String tag) {
        o.LJIIIZ(tag, "tag");
        this.LIZ = t;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = tag;
        if (i <= i2) {
            return;
        }
        "Reversed range is not supported".toString();
        throw new IllegalArgumentException("Reversed range is not supported");
    }
}
