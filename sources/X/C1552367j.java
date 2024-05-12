package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.67j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1552367j {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1552367j)) {
            return false;
        }
        C1552367j c1552367j = (C1552367j) obj;
        return o.LJ(this.LIZ, c1552367j.LIZ) && this.LIZIZ == c1552367j.LIZIZ && this.LIZJ == c1552367j.LIZJ && this.LIZLLL == c1552367j.LIZLLL && this.LJ == c1552367j.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerCompileParam(draftDir=");
        LIZ.append(this.LIZ);
        LIZ.append(", targetWidth=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", targetHeight=");
        LIZ.append(this.LIZJ);
        LIZ.append(", videoWidth=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", videoHeight=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C1552367j(String str, int i, int i2, int i3, int i4) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }
}
