package X;

import defpackage.b0;
import java.util.List;

/* loaded from: classes9.dex */
public final class IXX {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final List<String> LJFF;
    public final String LJI;
    public final int LJII;
    public final IVV LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public final boolean LIZ() {
        int i = this.LJIIIZ;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitRateInfo{bitRate=");
        LIZ.append(this.LIZ);
        LIZ.append(", gearName='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", qualityType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isBytevc1=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", urlKey='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", urlList=");
        LIZ.append(this.LJFF);
        LIZ.append(", checkSum='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", size=");
        LIZ.append(this.LJII);
        LIZ.append(", hdrType=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", hdrBit=");
        return b0.LIZJ(LIZ, this.LJIIJ, '}', LIZ);
    }

    public IXX(int i, String str, int i2, int i3, String str2, List<String> list, String str3, int i4, IVV ivv, int i5, int i6) {
        this.LJIIJ = 8;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = str2;
        this.LJFF = list;
        this.LJI = str3;
        this.LJII = i4;
        this.LJIIIIZZ = ivv;
        this.LJIIIZ = i5;
        this.LJIIJ = i6;
    }
}
