package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class QV2 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public byte[] LJ;
    public String LJFF;
    public long LJI;
    public EnumC68499QuV LJII;
    public QV1 LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public QW9 LJIIJJI;
    public String LJIIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SyncLog{syncId='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", did='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", uid='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", syncCursor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", data=");
        LIZ.append(Arrays.toString(this.LJ));
        LIZ.append(", md5='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", business=");
        LIZ.append(this.LJI);
        LIZ.append(", consumeType=");
        LIZ.append(this.LJII);
        LIZ.append(", dataType=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", publishTs=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", receiveTs=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", bucket=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", reqId='");
        return C77800Ug8.LIZJ(LIZ, this.LJIIL, '\'', '}', LIZ);
    }
}
