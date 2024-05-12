package X;

/* loaded from: classes11.dex */
public final class O58 {
    public static final O5A LJI = O5A.JPG;
    public static final O5A LJII = O5A.HEIF;
    public O5A LIZ = LJI;
    public int LIZIZ = 75;
    public O5A LIZJ = LJII;
    public String LIZLLL = "";
    public String LJ = "";
    public java.util.Map<String, String> LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageInfo(targetFormat=");
        LIZ.append(this.LIZ);
        LIZ.append(", compressRate=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", srcFormat=");
        LIZ.append(this.LIZJ);
        LIZ.append(", src='");
        LIZ.append(this.LIZLLL);
        LIZ.append("', extPath='");
        return JBR.LJFF(LIZ, this.LJ, "')", LIZ);
    }
}
