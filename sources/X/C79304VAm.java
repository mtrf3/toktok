package X;

/* renamed from: X.VAm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79304VAm {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;
    public int LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadParam{url='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", format='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", protocol='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", resolution='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", enableProbeStartupBitrate='");
        LIZ.append(this.LJI);
        LIZ.append('\'');
        LIZ.append(", probeStartupBitrate='");
        LIZ.append(this.LJII);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
