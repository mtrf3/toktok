package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1F extends AbstractC39455Fe7 {
    public D1F() {
        this.LIZJ.LJIIIIZZ(32.82f, 12.77f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 1.69f, 1.7f);
        this.LIZJ.LJIIL(0.63f, 1.6f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.86f, 0.0f);
        this.LIZJ.LJIIL(0.63f, -1.6f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 1.7f, -1.7f);
        this.LIZJ.LJIIL(1.18f, -0.46f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.1f, -1.9f);
        this.LIZJ.LJIIL(-0.8f, -0.22f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, true, 37.6f, 8.3f);
        this.LIZJ.LJIIL(-0.58f, -1.63f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.88f, 0.0f);
        this.LIZJ.LJIIL(-0.58f, 1.63f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -2.03f, 1.9f);
        this.LIZJ.LJIIL(-0.79f, 0.21f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.1f, 1.9f);
        this.LIZJ.LJIIL(1.19f, 0.46f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.0f, 10.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(28.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.an(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(20.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.gd(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(19.0f);
        p3.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        C32856Cuy.LLLLLZIL(this.LIZJ);
        C32856Cuy.mj(this.LIZJ);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.oj(this.LIZJ);
        C32856Cuy.Cb(this.LIZJ);
        C32856Cuy.N2(this.LIZJ);
        C32856Cuy.Y2(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.7f, 6.03f);
        this.LIZJ.LIZJ(1.75f, 1.75f, false, false, 18.0f, 17.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(13.0f);
        p4.LJIIIZ(1.75f, 1.75f, false, false, 2.7f, 1.47f);
        p4.LJIIL(10.0f, -6.5f);
        p4.LJIIIZ(1.75f, 1.75f, false, false, 0.0f, -2.94f);
        p4.LJIIL(-10.0f, -6.5f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.54f, 24.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-5.04f, 3.28f);
        p5.LJIILL(-6.56f);
        this.LIZJ.LJII(26.54f, 24.0f);
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
