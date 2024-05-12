package X;

/* renamed from: X.07H, reason: invalid class name */
/* loaded from: classes.dex */
public class C07H {
    public int LIZ;
    public int LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public long LJFF;
    public float LJII;
    public int LJIIIIZZ;
    public long LJ = Long.MIN_VALUE;
    public long LJI = -1;

    public final float LIZ(long j) {
        long j2 = this.LJ;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.LJI;
        if (j3 < 0 || j < j3) {
            return C07J.LIZIZ(((float) (j - j2)) / this.LIZ, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.LJII;
        return (C07J.LIZIZ(((float) (j - j3)) / this.LJIIIIZZ, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
