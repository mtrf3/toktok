package X;

import defpackage.q;

/* renamed from: X.Idf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47071Idf {
    public int LIZ;
    public String LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{taskType=");
        int i = this.LIZJ;
        String str2 = "N/A";
        if (1 == i) {
            str = "player";
        } else if (2 != i) {
            str = "N/A";
        } else {
            str = "preloader";
        }
        LIZ.append(str);
        LIZ.append(", action=");
        int i2 = this.LIZ;
        if (-1 == i2) {
            str2 = "und";
        } else if (i2 == 0) {
            str2 = "start";
        } else if (1 == i2) {
            str2 = "complete";
        } else if (2 == i2) {
            str2 = "cancel";
        }
        LIZ.append(str2);
        LIZ.append(", bytesLoaded=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", off=");
        LIZ.append(this.LJFF);
        LIZ.append(", endOff=");
        LIZ.append(this.LJI);
        LIZ.append(", fileKey: ");
        return q.LIZIZ(LIZ, this.LIZIZ, '}', LIZ);
    }
}
