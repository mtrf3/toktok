package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1U extends AbstractC39455Fe7 {
    public D1U() {
        this.LIZJ.LJIIIIZZ(22.5f, 2.0f);
        C32856Cuy.z5(this.LIZJ);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.lo(this.LIZJ);
        C32856Cuy.LJJZZI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p.LJIIJJI(-3.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.1f, 12.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, -1.89f, 4.14f);
        this.LIZJ.LJII(14.04f, 24.0f);
        this.LIZJ.LJIIJJI(19.91f);
        this.LIZJ.LJIIL(6.84f, -7.86f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 38.9f, 12.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(9.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 43.5f);
        C32856Cuy.A9(this.LIZJ);
        C32856Cuy.LJIILLIIL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(15.5f);
        C32856Cuy.S1(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.64f, 5.19f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.12f, -0.7f);
        this.LIZJ.LJIIL(2.46f, -1.72f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(0.5f, 0.5f, false, true, 0.7f, 0.13f);
        this.LIZJ.LJIIL(3.72f, 5.32f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(0.5f, 0.5f, false, true, -0.12f, 0.7f);
        this.LIZJ.LJIIL(-2.46f, 1.72f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, -0.13f);
        this.LIZJ.LJII(11.64f, 5.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(22.14f, -2.4f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.7f, 0.12f);
        this.LIZJ.LJIIL(-3.73f, 5.32f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.13f, 0.7f);
        this.LIZJ.LJIIL(2.45f, 1.72f);
        this.LIZJ.LJIIJ(0.23f, 0.16f, 0.54f, 0.1f, 0.7f, -0.12f);
        this.LIZJ.LJIIL(3.73f, -5.33f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.12f, -0.7f);
        this.LIZJ.LJII(33.78f, 2.8f);
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
