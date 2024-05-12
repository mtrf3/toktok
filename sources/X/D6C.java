package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6C extends AbstractC39455Fe7 {
    public D6C() {
        this.LIZJ.LJIIIIZZ(36.37f, 3.61f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.73f, 0.73f);
        this.LIZJ.LJIIL(-0.13f, 3.14f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.31f, 0.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(2.3f, 2.15f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.73f, 1.73f);
        this.LIZJ.LJIIL(-3.14f, -0.14f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.77f, 0.32f);
        this.LIZJ.LJIIL(-1.13f, 1.21f);
        this.LIZJ.LJIIJJI(1.45f);
        this.LIZJ.LJIIJ(2.6f, 0.0f, 4.76f, 2.01f, 4.96f, 4.6f);
        this.LIZJ.LJIIL(0.23f, 3.07f);
        this.LIZJ.LJIIL(0.47f, 7.11f);
        this.LIZJ.LJIIL(0.73f, 10.37f);
        this.LIZJ.LIZJ(4.97f, 4.97f, false, true, 37.7f, 44.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(10.3f);
        this.LIZJ.LJIIIZ(4.97f, 4.97f, false, true, -4.96f, -5.33f);
        this.LIZJ.LJIIL(0.73f, -10.37f);
        this.LIZJ.LJIIL(0.76f, -10.17f);
        this.LIZJ.LJIIJ(0.0f, -0.07f, 0.0f, -0.14f, 0.02f, -0.2f);
        this.LIZJ.LJIIL(0.52f, -7.16f);
        this.LIZJ.LJIIIZ(4.97f, 4.97f, false, true, 4.96f, -4.61f);
        C32856Cuy.B6(this.LIZJ);
        C32856Cuy.An(this.LIZJ);
        this.LIZJ.LJIILL(1.98f);
        C32856Cuy.yn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(12.32f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 0.92f);
        this.LIZJ.LJIIL(-0.18f, 2.5f);
        this.LIZJ.LJIIJ(0.21f, -0.02f, 0.64f, -0.03f, 0.64f, -0.03f);
        this.LIZJ.LJI(32.08f);
        this.LIZJ.LJIIL(0.12f, -2.8f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.32f, -0.76f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-2.3f, -2.15f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.73f, -1.73f);
        this.LIZJ.LJIIL(3.14f, 0.13f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.78f, -0.31f);
        this.LIZJ.LJIIL(2.14f, -2.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.73f, 21.23f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-1.98f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p5.LJIILL(1.0f);
        this.LIZJ.LJIIIZ(7.96f, 7.96f, true, false, 15.92f, 0.0f);
        C32856Cuy.Vn(this.LIZJ);
        C32856Cuy.Xl(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
