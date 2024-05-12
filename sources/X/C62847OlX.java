package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OlX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62847OlX<T> {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final N27 LIZLLL;
    public final T LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62847OlX)) {
            return false;
        }
        C62847OlX c62847OlX = (C62847OlX) obj;
        return o.LJ(this.LIZ, c62847OlX.LIZ) && this.LIZIZ == c62847OlX.LIZIZ && this.LIZJ == c62847OlX.LIZJ && this.LIZLLL == c62847OlX.LIZLLL && o.LJ(this.LJ, c62847OlX.LJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZLLL.hashCode() + (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31)) * 31;
        T t = this.LJ;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewConfig(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZJ);
        LIZ.append(", animType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", content=");
        return U26.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C62847OlX(String name, int i, int i2, N27 animType, T t) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(animType, "animType");
        this.LIZ = name;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = animType;
        this.LJ = t;
    }
}
