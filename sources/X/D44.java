package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D44 extends AbstractC39455Fe7 {
    public D44() {
        this.LIZJ.LJIILIIL(13.0f, 6.0f);
        this.LIZJ.LJIIL(3.08f, 10.0f);
        C32856Cuy.F0(this.LIZJ);
        this.LIZJ.LJII(20.0f, 6.0f);
        C32856Cuy.X(this.LIZJ);
        this.LIZJ.LJIIIIZZ(3.4f, 10.69f);
        this.LIZJ.LJ(3.0f, 11.8f, 3.0f, 13.2f, 3.0f, 16.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(9.08f);
        this.LIZJ.LJII(9.03f, 6.1f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, -5.64f, 4.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.08f, 16.0f);
        this.LIZJ.LJII(24.0f, 6.0f);
        C32856Cuy.F0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(3.08f, 10.0f);
        C32856Cuy.X(this.LIZJ);
        this.LIZJ.LJIIIIZZ(35.0f, 6.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(3.08f, 10.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(45.0f);
        this.LIZJ.LJIIJ(0.0f, -2.8f, 0.0f, -4.19f, -0.4f, -5.31f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, -4.29f, -4.3f);
        this.LIZJ.LJ(39.2f, 6.0f, 37.8f, 6.0f, 35.0f, 6.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(3.0f, 31.8f);
        C32856Cuy.q9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(42.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(12.8f);
        C32856Cuy.pa(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(14.2f);
        p7.LJIIJ(-3.92f, 0.0f, -5.88f, 0.0f, -7.38f, -0.76f);
        p7.LJIIIZ(7.0f, 7.0f, false, true, -3.06f, -3.06f);
        this.LIZJ.LJ(3.0f, 37.68f, 3.0f, 35.72f, 3.0f, 31.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(22.2f, -7.7f);
        this.LIZJ.LJIIJ(-0.34f, -1.18f, -0.6f, -2.1f, -1.2f, -2.1f);
        this.LIZJ.LJIILJJIL(-0.86f, 0.92f, -1.2f, 2.1f, true);
        this.LIZJ.LJIIJ(-0.36f, 1.27f, -0.81f, 2.83f, -1.84f, 3.86f);
        this.LIZJ.LJIIJ(-1.03f, 1.03f, -2.59f, 1.48f, -3.86f, 1.84f);
        this.LIZJ.LJIIJ(-1.18f, 0.34f, -2.1f, 0.6f, -2.1f, 1.2f);
        this.LIZJ.LJIILJJIL(0.92f, 0.86f, 2.1f, 1.2f, true);
        this.LIZJ.LJIIJ(1.27f, 0.36f, 2.83f, 0.81f, 3.86f, 1.84f);
        this.LIZJ.LJIIJ(1.03f, 1.03f, 1.48f, 2.59f, 1.84f, 3.86f);
        this.LIZJ.LJIIJ(0.34f, 1.18f, 0.6f, 2.1f, 1.2f, 2.1f);
        this.LIZJ.LJIILJJIL(0.86f, -0.92f, 1.2f, -2.1f, true);
        this.LIZJ.LJIIJ(0.36f, -1.27f, 0.81f, -2.83f, 1.84f, -3.86f);
        this.LIZJ.LJIIJ(1.03f, -1.03f, 2.59f, -1.48f, 3.86f, -1.84f);
        this.LIZJ.LJIIJ(1.18f, -0.34f, 2.1f, -0.6f, 2.1f, -1.2f);
        this.LIZJ.LJIILJJIL(-0.92f, -0.86f, -2.1f, -1.2f, true);
        this.LIZJ.LJIIJ(-1.27f, -0.36f, -2.83f, -0.81f, -3.86f, -1.84f);
        this.LIZJ.LJIIJ(-1.03f, -1.03f, -1.48f, -2.59f, -1.84f, -3.86f);
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
