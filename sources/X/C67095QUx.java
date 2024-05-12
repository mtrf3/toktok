package X;

/* renamed from: X.QUx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67095QUx {
    public boolean LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public long LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PatchResult(success=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=~~~, errMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", timeConsumed=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C67095QUx(boolean z, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? "" : str2;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = 0L;
    }
}
