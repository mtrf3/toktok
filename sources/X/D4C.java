package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4C extends AbstractC39455Fe7 {
    public D4C() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 11.0f);
        C32856Cuy.rj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(18.62f);
        C32856Cuy.tj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(22.72f);
        C32856Cuy.sj(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.35f);
        this.LIZJ.LJIIL(9.7f, 7.05f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.58f, -0.8f);
        this.LIZJ.LJIJ(16.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.59f, -0.8f);
        this.LIZJ.LJIIL(-9.7f, 7.04f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(15.0f);
        p5.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.V6(this.LIZJ);
        C32856Cuy.LLIZ(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(22.72f);
        C32856Cuy.wm(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(18.62f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p9.LJI(7.0f);
        p9.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        p9.LJIJ(15.0f);
        p9.LIZLLL();
        this.LIZJ.LJIILIIL(38.0f, 15.55f);
        this.LIZJ.LJIIL(-8.58f, -6.24f);
        this.LIZJ.LJII(43.0f, 18.07f);
        this.LIZJ.LJIILL(12.48f);
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
