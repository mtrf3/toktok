package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1E extends AbstractC39455Fe7 {
    public D1E() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(25.29f, 4.0f);
        this.LIZJ.LJIIJ(2.16f, 0.0f, 3.91f, 0.0f, 5.33f, 0.12f);
        this.LIZJ.LJIIJ(1.45f, 0.11f, 2.74f, 0.37f, 3.92f, 0.97f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(10.0f, 10.0f, false, true, 4.37f, 4.37f);
        this.LIZJ.LJIIJ(0.6f, 1.18f, 0.86f, 2.47f, 0.97f, 3.92f);
        this.LIZJ.LJIIJ(0.12f, 1.42f, 0.12f, 3.17f, 0.12f, 5.33f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(19.46f);
        C32856Cuy.t1(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-7.3f, 7.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.82f, 0.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-7.3f, -7.3f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        C32856Cuy.El(this.LIZJ);
        this.LIZJ.LJII(36.0f, 38.17f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(18.8f);
        this.LIZJ.LJIIJ(0.0f, -2.27f, 0.0f, -3.86f, -0.1f, -5.1f);
        this.LIZJ.LJIIIZ(6.38f, 6.38f, false, false, -0.55f, -2.42f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -2.63f, -2.63f);
        this.LIZJ.LJIIIZ(6.38f, 6.38f, false, false, -2.43f, -0.55f);
        this.LIZJ.LJ(29.06f, 8.0f, 27.47f, 8.0f, 25.2f, 8.0f);
        C32856Cuy.h6(this.LIZJ);
        C32856Cuy.L(this.LIZJ);
        this.LIZJ.LJIIJJI(3.29f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.0f, 10.83f);
        C32856Cuy.F2(this.LIZJ);
        this.LIZJ.LJII(8.0f, 10.83f);
        this.LIZJ.LJIILL(18.46f);
        this.LIZJ.LJIIJ(0.0f, 2.16f, 0.0f, 3.91f, 0.12f, 5.33f);
        this.LIZJ.LJIIJ(0.11f, 1.46f, 0.37f, 2.74f, 0.97f, 3.92f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, false, false, 4.37f, 4.37f);
        this.LIZJ.LJIIJ(1.18f, 0.6f, 2.47f, 0.86f, 3.92f, 0.97f);
        this.LIZJ.LJIIJ(1.42f, 0.12f, 3.17f, 0.12f, 5.33f, 0.12f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(26.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.Oi(this.LIZJ);
        C32856Cuy.tb(this.LIZJ);
        this.LIZJ.LJIIJ(-2.27f, 0.0f, -3.86f, 0.0f, -5.1f, -0.1f);
        this.LIZJ.LJIIIZ(6.38f, 6.38f, false, true, -2.42f, -0.55f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -2.63f, -2.63f);
        this.LIZJ.LJIIIZ(6.38f, 6.38f, false, true, -0.55f, -2.43f);
        this.LIZJ.LJIIIZ(69.4f, 69.4f, false, true, -0.1f, -5.09f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIJ(10.83f);
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
