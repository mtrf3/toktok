package X;

/* renamed from: X.Iiy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47400Iiy {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, Float> LIZLLL;
    public final long LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{");
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZJ);
        LIZ.append(", ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", ");
        return C0H1.LIZJ(LIZ, this.LJ, "}", LIZ);
    }

    public C47400Iiy(java.util.Map<String, Float> map) {
        this.LIZLLL = map;
        String LIZ = C47399Iix.LIZ(map);
        this.LIZIZ = LIZ;
        this.LIZJ = C47399Iix.LIZJ(LIZ);
        this.LIZ = C47399Iix.LIZIZ(LIZ);
        this.LJ = System.currentTimeMillis() / 1000;
    }
}
