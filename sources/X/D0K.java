package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0K extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0K() {
        this.LIZJ.LJIIIIZZ(4.0f, 39.79f);
        this.LIZJ.LJ(4.0f, 42.1f, 6.13f, 44.0f, 8.75f, 44.0f);
        C32856Cuy.z6(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.66f, 0.0f, 1.19f, -0.47f, 1.19f, -1.05f);
        C32856Cuy.LJJJLL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.59f, -0.53f, -1.06f, -1.19f, -1.06f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.2f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(8.2f);
        this.LIZJ.LJIIJJI(29.6f);
        this.LIZJ.LJIILL(14.74f);
        this.LIZJ.LJIIJ(0.0f, 0.58f, 0.54f, 1.05f, 1.2f, 1.05f);
        this.LIZJ.LJIIJJI(1.81f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.66f, 0.0f, 1.19f, -0.47f, 1.19f, -1.05f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(8.2f);
        this.LIZJ.LJ(42.0f, 5.9f, 39.87f, 4.0f, 37.25f, 4.0f);
        this.LIZJ.LJI(8.75f);
        this.LIZJ.LJ(6.13f, 4.0f, 4.0f, 5.89f, 4.0f, 8.21f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(39.8f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.5f, 18.74f);
        dij.LJIIJ(0.0f, 0.58f, -0.53f, 1.05f, -1.19f, 1.05f);
        dij.LJI(14.7f);
        C32856Cuy.ej(dij);
        dij.LJI(31.3f);
        dij.LJIIJ(0.66f, 0.0f, 1.19f, 0.47f, 1.19f, 1.05f);
        dij.LJIILL(2.1f);
        dij.LIZLLL();
        dij.LJIIIIZZ(24.19f, 28.21f);
        dij.LJIIJ(0.0f, 0.58f, -0.53f, 1.05f, -1.19f, 1.05f);
        dij.LJIIJJI(-8.31f);
        C32856Cuy.ej(dij);
        C32856Cuy.z6(dij);
        dij.LJIIJ(0.66f, 0.0f, 1.19f, 0.47f, 1.19f, 1.06f);
        dij.LJIILL(2.1f);
        dij.LIZLLL();
        dij.LJIIIIZZ(33.63f, 24.63f);
        dij.LJIIIZ(8.0f, 8.0f, true, false, 4.17f, 14.82f);
        dij.LJIIL(3.23f, 3.24f);
        dij.LJIIJ(0.57f, 0.56f, 1.48f, 0.56f, 2.04f, 0.0f);
        dij.LJIIL(0.62f, -0.62f);
        dij.LJIIJ(0.56f, -0.56f, 0.56f, -1.47f, 0.0f, -2.03f);
        dij.LJIIL(-3.24f, -3.24f);
        dij.LJIIIZ(8.0f, 8.0f, false, false, -6.83f, -12.17f);
        dij.LIZLLL();
        dij.LJIILIIL(-4.26f, 8.0f);
        dij.LJIIIZ(4.25f, 4.25f, true, true, 8.5f, 0.0f);
        dij.LJIIIZ(4.25f, 4.25f, false, true, -8.5f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
