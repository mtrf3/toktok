package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VSp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79775VSp {
    public final String LIZ;
    public final DialogC79776VSq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79775VSp)) {
            return false;
        }
        C79775VSp c79775VSp = (C79775VSp) obj;
        return o.LJ(this.LIZ, c79775VSp.LIZ) && o.LJ(this.LIZIZ, c79775VSp.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DialogC79776VSq dialogC79776VSq = this.LIZIZ;
        return hashCode + (dialogC79776VSq != null ? dialogC79776VSq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OverlayData(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", dialog=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C79775VSp(String str, DialogC79776VSq dialog) {
        o.LJIIJ(dialog, "dialog");
        this.LIZ = str;
        this.LIZIZ = dialog;
    }
}
