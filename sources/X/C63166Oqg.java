package X;

/* renamed from: X.Oqg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63166Oqg {
    public boolean LIZ = true;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Info{isFullContinue:");
        LIZ.append(this.LIZ);
        LIZ.append(", step:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", originSize:");
        LIZ.append(this.LIZJ);
        LIZ.append(", continueSize:");
        V10.LJFF(LIZ, this.LIZLLL, ", maxIndex:", 0L);
        C0MT.LIZLLL(LIZ, ", baseIndex:", 0L, ", indexRange:");
        LIZ.append(C63272OsO.LJIILJJIL(null));
        LIZ.append(", leakRange:");
        LIZ.append(C63272OsO.LJIILJJIL(null));
        LIZ.append(", continueRange:");
        LIZ.append(C63272OsO.LJIILJJIL(null));
        LIZ.append(", beforeRepaired:");
        LIZ.append(C63272OsO.LJIILIIL(null));
        LIZ.append(", afterRepaired:");
        LIZ.append(C63272OsO.LJIILIIL(null));
        LIZ.append(", costTime:");
        return C0H1.LIZJ(LIZ, this.LJ, "}", LIZ);
    }
}
