package X;

/* renamed from: X.0gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13810gT {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final String toString() {
        return C16880lQ.LLLZ("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL)});
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        ?? r1 = this.LIZ;
        int i = r1;
        if (this.LIZIZ) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.LIZJ) {
            i2 = i + 256;
        }
        if (this.LIZLLL) {
            return i2 + 4096;
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13810gT)) {
            return false;
        }
        C13810gT c13810gT = (C13810gT) obj;
        if (this.LIZ == c13810gT.LIZ && this.LIZIZ == c13810gT.LIZIZ && this.LIZJ == c13810gT.LIZJ && this.LIZLLL == c13810gT.LIZLLL) {
            return true;
        }
        return false;
    }

    public C13810gT(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
