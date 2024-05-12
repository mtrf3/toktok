package X;

import java.util.List;

/* renamed from: X.Its, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48076Its {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;
    public final List<String> LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Extra{flag=");
        LIZ.append(this.LIZ);
        LIZ.append(", rawKey='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", key='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", from=");
        LIZ.append(this.LJ);
        LIZ.append(", to=");
        LIZ.append(this.LJFF);
        LIZ.append(", urls=");
        return C1NE.LIZIZ(LIZ, this.LJII, '}', LIZ);
    }

    public C48076Its(int i, String str, String str2, String str3, int i2, int i3, String str4, List<String> list, String str5) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = str4;
        this.LJII = list;
        this.LJIIIIZZ = str5;
    }
}
