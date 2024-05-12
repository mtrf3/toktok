package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208128Eu<T> {
    public final SZP LIZ;
    public final A2G<T> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208128Eu)) {
            return false;
        }
        C208128Eu c208128Eu = (C208128Eu) obj;
        return this.LIZ == c208128Eu.LIZ && o.LJ(this.LIZIZ, c208128Eu.LIZIZ) && this.LIZJ == c208128Eu.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultPageSource(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fillData=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C208128Eu(SZP type, A2G<T> value, boolean z) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(value, "value");
        this.LIZ = type;
        this.LIZIZ = value;
        this.LIZJ = z;
    }
}
