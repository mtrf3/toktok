package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2D extends AbstractC39455Fe7 {
    public D2D() {
        this.LIZJ.LJIIIIZZ(12.4f, 13.3f);
        this.LIZJ.LJIIJ(-6.02f, 0.0f, -11.0f, 4.14f, -11.0f, 10.68f);
        this.LIZJ.LJIIJ(0.0f, 6.5f, 4.98f, 10.68f, 11.0f, 10.68f);
        this.LIZJ.LJIIJ(3.7f, 0.0f, 6.63f, -1.52f, 8.72f, -3.86f);
        this.LIZJ.LJIIL(0.13f, -0.14f);
        this.LIZJ.LJIILL(-7.24f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJIIJJI(-8.38f);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.65f);
        C32856Cuy.En(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(4.2f);
        this.LIZJ.LJIILL(1.64f);
        this.LIZJ.LJIIIZ(6.18f, 6.18f, false, true, -3.67f, 1.23f);
        this.LIZJ.LJIIJ(-3.3f, 0.0f, -5.7f, -2.5f, -5.7f, -5.96f);
        this.LIZJ.LJIIJ(0.0f, -3.47f, 2.4f, -5.96f, 5.7f, -5.96f);
        this.LIZJ.LJIIJ(1.87f, 0.0f, 3.4f, 1.07f, 4.25f, 2.34f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.65f, 0.16f);
        this.LIZJ.LJIIL(3.45f, -1.89f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.19f, -0.7f);
        this.LIZJ.LJIIIZ(9.68f, 9.68f, false, false, -8.54f, -4.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(12.18f, 0.32f);
        C32856Cuy.H5(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(3.18f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIJ(14.62f);
        C32856Cuy.Bn(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -3.18f);
        this.LIZJ.LJIILIIL(22.02f, 1.0f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJI(32.67f);
        C32856Cuy.H5(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(3.19f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIILL(-7.17f);
        this.LIZJ.LJIIJJI(8.53f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p5.LJIILL(-2.69f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJIIJJI(-8.53f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-3.13f);
        this.LIZJ.LJIIJJI(8.74f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p7.LJIILL(-2.69f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
