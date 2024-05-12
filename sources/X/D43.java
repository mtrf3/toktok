package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D43 extends AbstractC39455Fe7 {
    public D43() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 19.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(11.17f);
        p2.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        p2.LJIIJJI(4.2f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, 1.46f, 0.63f);
        p2.LJIIL(8.88f, 9.5f);
        p2.LIZJ(2.0f, 2.0f, false, false, 25.0f, 41.93f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-7.48f);
        this.LIZJ.LJIIJ(0.0f, -0.4f, -0.16f, -0.78f, -0.44f, -1.06f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-2.7f, -2.7f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.86f, 0.35f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(5.83f);
        this.LIZJ.LJIIL(-5.41f, -5.8f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -4.39f, -1.9f);
        C32856Cuy.LLLLLZ(this.LIZJ);
        C32856Cuy.s9(this.LIZJ);
        C32856Cuy.yb(this.LIZJ);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.35f, -0.85f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-2.7f, -2.7f);
        this.LIZJ.LJIIIZ(1.21f, 1.21f, false, false, -1.06f, -0.4f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, false, 4.0f, 19.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.0f, 22.67f);
        this.LIZJ.LJIIL(6.42f, 6.42f);
        this.LIZJ.LJIIIZ(9.08f, 9.08f, false, false, -0.39f, -10.7f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, 0.04f, -1.46f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(1.41f, -1.41f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, 1.4f, 0.02f);
        this.LIZJ.LJIIIZ(13.12f, 13.12f, false, true, 0.4f, 16.42f);
        this.LIZJ.LJIIL(3.56f, 3.55f);
        this.LIZJ.LIZJ(18.17f, 18.17f, false, false, 37.4f, 12.0f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, true, 0.02f, -1.43f);
        C32856Cuy.t(this.LIZJ);
        this.LIZJ.LJIIIZ(0.97f, 0.97f, false, true, 1.4f, 0.02f);
        this.LIZJ.LJIIIZ(22.2f, 22.2f, false, true, 0.43f, 29.18f);
        this.LIZJ.LJIIL(4.94f, 4.94f);
        C32856Cuy.p5(this.LIZJ);
        this.LIZJ.LJII(6.21f, 9.54f);
        C32856Cuy.ci(this.LIZJ);
        this.LIZJ.LJIIL(5.93f, 5.93f);
        this.LIZJ.LJIIL(6.52f, -7.56f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LIZJ(2.0f, 2.0f, false, true, 25.0f, 6.38f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(16.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.2f, -7.2f);
        this.LIZJ.LJIIL(3.2f, 3.2f);
        this.LIZJ.LJIILL(-6.9f);
        this.LIZJ.LJIIL(-3.2f, 3.7f);
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
