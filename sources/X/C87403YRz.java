package X;

/* renamed from: X.YRz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87403YRz {
    public final double LIZ;
    public long LIZJ;
    public int LIZLLL;
    public final C87401YRx LIZIZ = new C87401YRx();
    public final C87401YRx LJ = new C87401YRx();
    public boolean LJFF = false;

    public C87403YRz(double d) {
        this.LIZ = 1.0d / (d * 6.283185307179586d);
    }

    public final void LIZ(C87401YRx c87401YRx, long j, double d) {
        this.LIZLLL++;
        if (!this.LJFF) {
            C87401YRx c87401YRx2 = this.LIZIZ;
            c87401YRx2.getClass();
            c87401YRx2.LIZ = c87401YRx.LIZ;
            c87401YRx2.LIZIZ = c87401YRx.LIZIZ;
            c87401YRx2.LIZJ = c87401YRx.LIZJ;
            this.LIZJ = j;
            this.LJFF = true;
            return;
        }
        if (j < this.LIZJ) {
            this.LIZJ = j;
            return;
        }
        double d2 = d * (j - r0) * 1.0E-9d;
        if (d2 < 0.001d || d2 > 1.0d) {
            this.LIZJ = j;
            return;
        }
        double d3 = d2 / (this.LIZ + d2);
        this.LIZIZ.LJ(1.0d - d3);
        C87401YRx c87401YRx3 = this.LJ;
        c87401YRx3.getClass();
        c87401YRx3.LIZ = c87401YRx.LIZ;
        c87401YRx3.LIZIZ = c87401YRx.LIZIZ;
        c87401YRx3.LIZJ = c87401YRx.LIZJ;
        this.LJ.LJ(d3);
        C87401YRx c87401YRx4 = this.LJ;
        C87401YRx c87401YRx5 = this.LIZIZ;
        c87401YRx5.LJFF(c87401YRx5.LIZ + c87401YRx4.LIZ, c87401YRx5.LIZIZ + c87401YRx4.LIZIZ, c87401YRx5.LIZJ + c87401YRx4.LIZJ);
        this.LIZJ = j;
    }
}
