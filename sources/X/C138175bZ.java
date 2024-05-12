package X;

/* renamed from: X.5bZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C138175bZ {
    public final int LIZ;
    public final int LIZIZ;

    public final String LIZ(int i) {
        int i2 = this.LIZ;
        if (i2 != -1 && i2 < 100 && i2 >= 10) {
            int i3 = this.LIZIZ;
            if (i3 != -1 && i3 < 1000 && i3 >= 100) {
                if (i < 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('-');
                    LIZ.append(this.LIZ);
                    LIZ.append(this.LIZIZ);
                    LIZ.append(Math.abs(i));
                    return X1D.LIZIZ(LIZ);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LIZ);
                LIZ2.append(this.LIZIZ);
                LIZ2.append(i);
                return X1D.LIZIZ(LIZ2);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("module code ");
            throw new IllegalArgumentException(C08380Uo.LIZ(LIZ3, this.LIZIZ, " must be more than 10, less than 100", LIZ3));
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("source code ");
        throw new IllegalArgumentException(C08380Uo.LIZ(LIZ4, this.LIZ, " must be more than 10, less than 100", LIZ4));
    }

    public C138175bZ(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
