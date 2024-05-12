package X;

import defpackage.b0;

/* renamed from: X.GHu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41274GHu extends AbstractC41277GHx {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41274GHu) && this.LIZIZ == ((C41274GHu) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Delete(i=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C41274GHu(int i) {
        super(i);
        this.LIZIZ = i;
    }
}
