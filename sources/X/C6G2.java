package X;

/* renamed from: X.6G2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6G2 {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public final float LJFF;

    public C6G2(float f, float f2, int i) {
        float f3;
        float f4;
        if ((i & 1) != 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        f = (i & 8) != 0 ? 0.0f : f;
        f2 = (i & 16) != 0 ? 0.0f : f2;
        float f5 = (i & 32) == 0 ? 0.0f : 1.0f;
        this.LIZ = f3;
        this.LIZIZ = f4;
        this.LIZJ = 0.0f;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = f5;
    }
}
