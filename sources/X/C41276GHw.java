package X;

import defpackage.b0;

/* renamed from: X.GHw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41276GHw extends AbstractC41277GHx {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41276GHw) && this.LIZIZ == ((C41276GHw) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Save(i=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C41276GHw(int i) {
        super(i);
        this.LIZIZ = i;
    }
}
