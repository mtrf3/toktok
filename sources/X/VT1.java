package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VT1 {
    public final String LIZ;
    public final DialogC79783VSx LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VT1)) {
            return false;
        }
        VT1 vt1 = (VT1) obj;
        return o.LJ(this.LIZ, vt1.LIZ) && o.LJ(this.LIZIZ, vt1.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DialogC79783VSx dialogC79783VSx = this.LIZIZ;
        return hashCode + (dialogC79783VSx != null ? dialogC79783VSx.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OverlayData(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", dialogNG=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public VT1(String str, DialogC79783VSx dialogNG) {
        o.LJIIJ(dialogNG, "dialogNG");
        this.LIZ = str;
        this.LIZIZ = dialogNG;
    }
}
