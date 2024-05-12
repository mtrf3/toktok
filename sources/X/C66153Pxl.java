package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pxl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66153Pxl {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66153Pxl)) {
            return false;
        }
        C66153Pxl c66153Pxl = (C66153Pxl) obj;
        return o.LJ(this.LIZ, c66153Pxl.LIZ) && this.LIZIZ == c66153Pxl.LIZIZ && this.LIZJ == c66153Pxl.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentProviderConfig(permissionType=");
        LIZ.append(this.LIZ);
        LIZ.append(", queryApiId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", applyBatchApiId=");
        return C08380Uo.LIZ(LIZ, this.LIZJ, ")", LIZ);
    }

    public C66153Pxl(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
