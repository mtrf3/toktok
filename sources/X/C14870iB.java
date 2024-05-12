package X;

/* renamed from: X.0iB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14870iB {
    public static final C14870iB LJFF = new C14870iB(false, 0, true, 1, 1);
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final int hashCode() {
        return ((C07250Qf.LIZ(this.LIZJ, ((C16880lQ.LLJILJIL(this.LIZ) * 31) + this.LIZIZ) * 31, 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImeOptions(singleLine=");
        LIZ.append(this.LIZ);
        LIZ.append(", capitalization=");
        LIZ.append((Object) C14910iF.LIZ(this.LIZIZ));
        LIZ.append(", autoCorrect=");
        LIZ.append(this.LIZJ);
        LIZ.append(", keyboardType=");
        LIZ.append((Object) C14930iH.LIZ(this.LIZLLL));
        LIZ.append(", imeAction=");
        LIZ.append((Object) C14850i9.LIZ(this.LJ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14870iB)) {
            return false;
        }
        C14870iB c14870iB = (C14870iB) obj;
        if (this.LIZ == c14870iB.LIZ && this.LIZIZ == c14870iB.LIZIZ && this.LIZJ == c14870iB.LIZJ && this.LIZLLL == c14870iB.LIZLLL && this.LJ == c14870iB.LJ) {
            return true;
        }
        return false;
    }

    public C14870iB(boolean z, int i, boolean z2, int i2, int i3) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
