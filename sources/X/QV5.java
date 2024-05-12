package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class QV5 {
    public long LIZ;
    public String LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public String LJ;
    public QW9 LJFF;
    public long LJI;
    public byte[] LJII;
    public String LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadItem{id=");
        LIZ.append(this.LIZ);
        LIZ.append(", syncId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", business=");
        LIZ.append(this.LIZJ);
        LIZ.append(", did='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", uid='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", bucket=");
        LIZ.append(this.LJFF);
        LIZ.append(", cursor=");
        LIZ.append(this.LJI);
        LIZ.append(", data=");
        LIZ.append(Arrays.toString(this.LJII));
        LIZ.append(", md5='");
        return C77800Ug8.LIZJ(LIZ, this.LJIIIIZZ, '\'', '}', LIZ);
    }
}
