package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AbX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26555AbX {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26555AbX)) {
            return false;
        }
        C26555AbX c26555AbX = (C26555AbX) obj;
        return o.LJ(this.LIZ, c26555AbX.LIZ) && o.LJ(this.LIZIZ, c26555AbX.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" - ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C26555AbX(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
