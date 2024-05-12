package X;

import defpackage.b0;

/* renamed from: X.GHv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41275GHv extends AbstractC41277GHx {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41275GHv) && this.LIZIZ == ((C41275GHv) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Edit(i=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C41275GHv(int i) {
        super(i);
        this.LIZIZ = i;
    }
}
