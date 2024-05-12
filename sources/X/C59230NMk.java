package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NMk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59230NMk {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public boolean LJFF;

    public C59230NMk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59230NMk)) {
            return false;
        }
        C59230NMk c59230NMk = (C59230NMk) obj;
        return o.LJ(this.LIZ, c59230NMk.LIZ) && o.LJ(this.LIZIZ, c59230NMk.LIZIZ) && this.LIZJ == c59230NMk.LIZJ && this.LIZLLL == c59230NMk.LIZLLL && o.LJ(this.LJ, c59230NMk.LJ) && this.LJFF == c59230NMk.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = (C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJ, (LJ + i2) * 31, 31);
        if (!this.LJFF) {
            i = 0;
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogData(tag=");
        LIZ.append(this.LIZ);
        LIZ.append(", refer=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", useSystemBrowserInApp=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isThirdPage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", sessionId=");
        LIZ.append(this.LJ);
        LIZ.append(", shouldLog=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C59230NMk(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = 0;
        this.LIZLLL = true;
        this.LJ = "";
        this.LJFF = true;
    }
}
