package X;

/* renamed from: X.Ngb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59993Ngb {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final int LIZ() {
        return (this.LIZJ - this.LIZ) * (this.LIZLLL - this.LIZIZ);
    }

    public final C59993Ngb LIZIZ(C59993Ngb c59993Ngb) {
        return new C59993Ngb(Math.max(this.LIZ, c59993Ngb.LIZ), Math.max(this.LIZIZ, c59993Ngb.LIZIZ), Math.min(this.LIZJ, c59993Ngb.LIZJ), Math.min(this.LIZLLL, c59993Ngb.LIZLLL), c59993Ngb.LJ);
    }

    public C59993Ngb(int i, int i2, int i3, int i4, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = str;
    }
}
