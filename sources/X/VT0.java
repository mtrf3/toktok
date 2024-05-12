package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VT0 {
    public final String LIZ;
    public final DialogC79782VSw LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VT0)) {
            return false;
        }
        VT0 vt0 = (VT0) obj;
        return o.LJ(this.LIZ, vt0.LIZ) && o.LJ(this.LIZIZ, vt0.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OverlayData(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", dialogNG=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public VT0(String str, DialogC79782VSw dialogNG) {
        o.LJIIIZ(dialogNG, "dialogNG");
        this.LIZ = str;
        this.LIZIZ = dialogNG;
    }
}
