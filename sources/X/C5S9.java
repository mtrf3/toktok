package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.5S9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S9 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C5S9() {
        this(0, 0, 0, 0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5S9)) {
            return false;
        }
        C5S9 c5s9 = (C5S9) obj;
        return o.LJ(this.LIZ, c5s9.LIZ) && o.LJ(this.LIZIZ, c5s9.LIZIZ) && this.LIZJ == c5s9.LIZJ && this.LIZLLL == c5s9.LIZLLL && this.LJ == c5s9.LJ && this.LJFF == c5s9.LJFF;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewMediaState(videoPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", vTrimIn=");
        LIZ.append(this.LIZJ);
        LIZ.append(", vTrimOut=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", aTrimIn=");
        LIZ.append(this.LJ);
        LIZ.append(", aTrimOut=");
        return b0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C5S9(int i, int i2, int i3, int i4, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }
}
