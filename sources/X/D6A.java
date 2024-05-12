package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6A extends AbstractC39455Fe7 {
    public D6A() {
        this.LIZJ.LJIIIIZZ(37.7f, 15.0f);
        this.LIZJ.LJIILL(19.7f);
        this.LIZJ.LJIIL(3.48f, -3.7f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.99f, -0.03f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.46f, 1.37f);
        this.LIZJ.LJIIJ(0.28f, 0.26f, 0.3f, 0.7f, 0.03f, 0.99f);
        this.LIZJ.LJIIL(-6.26f, 6.66f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.3f, 2.3f, false, true, -3.34f, 0.01f);
        this.LIZJ.LJIIL(-6.36f, -6.66f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.02f, -0.99f);
        this.LIZJ.LJIIL(1.45f, -1.38f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.99f, 0.02f);
        this.LIZJ.LJIIL(4.14f, 4.34f);
        C32856Cuy.m9(this.LIZJ);
        this.LIZJ.LJIIIZ(4.3f, 4.3f, false, false, -4.3f, -4.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-3.5f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.7f, -0.7f);
        C32856Cuy.f(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f);
        C32856Cuy.H6(this.LIZJ);
        this.LIZJ.LJIIIZ(7.7f, 7.7f, false, true, 7.7f, 7.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.84f, 17.34f);
        this.LIZJ.LJII(13.7f, 13.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(20.0f);
        this.LIZJ.LJIIIZ(4.3f, 4.3f, false, false, 4.3f, 4.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(3.5f);
        this.LIZJ.LJIIJ(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        C32856Cuy.A1(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(0.7f, 0.7f, false, true, -0.7f, 0.7f);
        C32856Cuy.u6(this.LIZJ);
        this.LIZJ.LJIIIZ(7.7f, 7.7f, false, true, -7.7f, -7.7f);
        this.LIZJ.LJIJ(13.63f);
        this.LIZJ.LJIIL(-3.48f, 3.7f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.99f, 0.03f);
        this.LIZJ.LJII(4.37f, 16.0f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.03f, -0.98f);
        this.LIZJ.LJIIL(6.26f, -6.67f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(2.3f, 2.3f, false, true, 3.34f, -0.01f);
        this.LIZJ.LJIIL(6.36f, 6.66f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.02f, 0.99f);
        this.LIZJ.LJIIL(-1.45f, 1.38f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.99f, -0.02f);
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
