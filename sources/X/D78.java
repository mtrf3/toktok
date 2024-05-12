package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D78 extends AbstractC39455Fe7 {
    public D78() {
        this.LIZJ.LJIIIIZZ(20.51f, 7.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(6.0f, 6.0f, false, false, -3.97f, 1.5f);
        this.LIZJ.LJIIL(-12.46f, 11.0f);
        C32856Cuy.xj(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.32f, 4.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, 1.32f, -0.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(40.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(22.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(20.51f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.32f, -0.5f);
        this.LIZJ.LJIIL(-12.47f, -11.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, -3.0f);
        this.LIZJ.LJIIL(12.47f, -11.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.6f, 6.7f);
        C32856Cuy.Ik(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJII(26.17f, 24.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(-4.38f, 4.38f);
        C32856Cuy.Df(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJII(29.0f, 26.83f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIL(4.38f, 4.38f);
        C32856Cuy.LJZI(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJII(31.83f, 24.0f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIL(4.38f, -4.38f);
        C32856Cuy.mc(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJII(29.0f, 21.17f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIIL(-4.38f, -4.38f);
        DIJ p15 = this.LIZJ;
        o.LJIIIZ(p15, "p");
        p15.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
        p15.LJIIL(-1.42f, 1.42f);
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
