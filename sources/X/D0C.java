package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0C extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0C() {
        this.LIZJ.LJIIIIZZ(29.75f, 27.75f);
        this.LIZJ.LJIIIZ(6.25f, 6.25f, true, true, 12.5f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(3.13f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(1.88f);
        this.LIZJ.LJIIJ(1.72f, 0.0f, 3.12f, 1.4f, 3.12f, 3.12f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(8.13f);
        this.LIZJ.LJIIJ(0.0f, 1.72f, -1.4f, 3.12f, -3.13f, 3.12f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(27.89f);
        this.LIZJ.LJIIIZ(3.12f, 3.12f, false, true, -3.13f, -3.13f);
        C32856Cuy.H9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.73f, 1.4f, -3.13f, 3.13f, -3.13f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(1.87f);
        this.LIZJ.LJIILL(-3.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(10.0f, 0.0f);
        this.LIZJ.LJIIIZ(3.75f, 3.75f, true, false, -7.5f, 0.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(3.13f);
        C32856Cuy.q0(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-3.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-11.88f, 5.63f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(0.62f, 0.62f, false, false, -0.62f, 0.62f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(8.13f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJ(0.0f, 0.34f, 0.28f, 0.62f, 0.63f, 0.62f);
        this.LIZJ.LJIIJJI(16.25f);
        this.LIZJ.LJIIJ(0.34f, 0.0f, 0.62f, -0.28f, 0.62f, -0.63f);
        C32856Cuy.H9(this.LIZJ);
        this.LIZJ.LJIIIZ(0.62f, 0.62f, false, false, -0.63f, -0.63f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJI(27.89f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.31f, 11.07f);
        dij.LJ(6.31f, 39.7f, 13.78f, 61.24f, 36.0f, 68.6f);
        dij.LJIIJ(22.22f, -7.36f, 29.69f, -28.89f, 27.69f, -57.53f);
        dij.LJ(50.96f, 10.36f, 36.0f, 1.4f, 36.0f, 1.4f);
        dij.LJIILJJIL(-14.96f, 8.96f, -27.69f, 9.67f, true);
        dij.LIZLLL();
        dij.LJIIIIZZ(43.96f, 8.5f);
        dij.LJIIJ(4.78f, 2.08f, 11.0f, 4.33f, 17.11f, 5.1f);
        dij.LJIIJ(0.68f, 13.07f, -0.76f, 24.3f, -4.67f, 33.08f);
        dij.LJIIJ(-3.98f, 8.94f, -10.55f, 15.48f, -20.4f, 18.98f);
        dij.LJIIJ(-9.85f, -3.5f, -16.42f, -10.04f, -20.4f, -18.98f);
        dij.LJIIJ(-3.9f, -8.79f, -5.35f, -20.0f, -4.67f, -33.08f);
        dij.LJIIJ(6.1f, -0.77f, 12.33f, -3.02f, 17.1f, -5.1f);
        dij.LIZJ(98.57f, 98.57f, false, false, 36.0f, 4.59f);
        dij.LJIIL(1.24f, 0.67f);
        dij.LJIIJ(1.65f, 0.87f, 3.98f, 2.05f, 6.72f, 3.25f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
