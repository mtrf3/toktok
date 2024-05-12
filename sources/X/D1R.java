package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1R extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public D1R() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(2.25f, 22.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(21.75f, 21.75f, true, true, 41.98f, 8.0f);
        this.LIZJ.LJI(22.92f);
        this.LIZJ.LJIIIZ(7.47f, 7.47f, false, false, -1.07f, -1.04f);
        this.LIZJ.LIZJ(10.0f, 10.0f, false, false, 15.56f, 27.0f);
        this.LIZJ.LJIIJ(-2.43f, 0.0f, -4.72f, 0.63f, -6.5f, 2.07f);
        this.LIZJ.LJIIJ(-0.35f, 0.29f, -0.67f, 0.6f, -0.97f, 0.93f);
        this.LIZJ.LJI(3.77f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(21.7f, 21.7f, false, true, -1.52f, -8.0f);
        p2.LIZLLL();
        this.LIZJ.LJIILIIL(33.77f, -11.02f);
        this.LIZJ.LJIIJ(-0.33f, -0.33f, -1.0f, -0.3f, -1.41f, 0.0f);
        this.LIZJ.LJIIL(-0.88f, 0.62f);
        this.LIZJ.LJIIJ(-2.34f, 1.63f, -8.56f, 5.99f, -9.73f, 7.16f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LIZJ(2.94f, 2.94f, false, false, 24.0f, 23.0f);
        this.LIZJ.LJIIIZ(2.94f, 2.94f, false, false, 4.24f, 0.0f);
        this.LIZJ.LJIIJ(1.17f, -1.17f, 5.53f, -7.39f, 7.16f, -9.73f);
        this.LIZJ.LJIIL(0.62f, -0.88f);
        this.LIZJ.LJIIJ(0.3f, -0.4f, 0.33f, -1.08f, 0.0f, -1.41f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.5f, 47.0f);
        this.LIZJ.LJIIJJI(12.53f);
        this.LIZJ.LJIILL(-3.49f);
        this.LIZJ.LJIIJJI(-8.02f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.16f);
        this.LIZJ.LJII(18.65f, 40.0f);
        this.LIZJ.LJIIJ(1.8f, -1.32f, 2.98f, -2.78f, 2.98f, -5.17f);
        this.LIZJ.LJIIJ(0.0f, -2.94f, -2.37f, -4.83f, -6.07f, -4.83f);
        this.LIZJ.LJIIJ(-3.85f, 0.0f, -6.25f, 2.0f, -6.56f, 5.23f);
        this.LIZJ.LJIIL(3.9f, 0.66f);
        this.LIZJ.LJIIJ(0.17f, -1.74f, 0.95f, -2.66f, 2.4f, -2.66f);
        this.LIZJ.LJIIJ(1.32f, 0.0f, 1.96f, 0.85f, 1.96f, 1.91f);
        this.LIZJ.LJIIJ(0.0f, 1.01f, -0.54f, 2.03f, -1.93f, 3.07f);
        this.LIZJ.LJIIL(-5.84f, 4.38f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(47.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.3f, 47.0f);
        C32856Cuy.Q6(this.LIZJ);
        this.LIZJ.LJIIL(-4.02f, -6.65f);
        this.LIZJ.LJIIL(3.6f, -6.06f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-4.7f);
        this.LIZJ.LJIIL(-1.75f, 3.92f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-0.16f);
        this.LIZJ.LJIIL(-1.7f, -3.92f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(-4.8f);
        this.LIZJ.LJIIL(3.65f, 6.16f);
        this.LIZJ.LJIIL(-4.0f, 6.55f);
        C32856Cuy.k0(this.LIZJ);
        this.LIZJ.LJIIL(2.24f, -4.53f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(0.14f);
        this.LIZJ.LJII(34.3f, 47.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
