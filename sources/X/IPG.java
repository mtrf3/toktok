package X;

/* loaded from: classes9.dex */
public final class IPG {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public Object LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public java.util.Map LJIIJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaError{sourceId='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", codecType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isDash=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJ);
        LIZ.append(", errorExtra=");
        LIZ.append(this.LJFF);
        LIZ.append(", extraInfo=");
        LIZ.append(this.LJI);
        LIZ.append(", playUrl='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public IPG(int i, int i2, int i3, Object obj, String str) {
        this.LIZ = str;
        this.LIZIZ = i == 1;
        this.LIZJ = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = obj;
    }
}
