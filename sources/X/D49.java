package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D49 extends AbstractC39455Fe7 {
    public D49() {
        this.LIZJ.LJIIIIZZ(12.0f, 9.0f);
        C32856Cuy.Zk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.5f);
        p.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(12.0f);
        p2.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(12.0f);
        p3.LIZLLL();
        p3.LJIILIIL(7.5f, 3.0f);
        p3.LJI(12.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(7.5f);
        C32856Cuy.q0(this.LIZJ);
        C32856Cuy.LLZLLIL(this.LIZJ);
        C32856Cuy.J3(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.0f, 25.5f);
        C32856Cuy.hl(this.LIZJ);
        C32856Cuy.J9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        p5.LJIIJJI(7.5f);
        p5.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-7.5f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        p7.LJI(12.0f);
        p7.LIZLLL();
        p7.LJIILIIL(7.5f, 3.0f);
        p7.LJI(12.0f);
        C32856Cuy.J9(this.LIZJ);
        C32856Cuy.q0(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-7.5f);
        p9.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.5f, 12.0f);
        C32856Cuy.el(this.LIZJ);
        C32856Cuy.N6(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, 3.0f);
        p10.LJIILL(7.5f);
        p10.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-7.5f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        p12.LJIJ(12.0f);
        p12.LIZLLL();
        this.LIZJ.LJIILIIL(3.0f, 0.0f);
        C32856Cuy.N6(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIILL(7.5f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIIJJI(-7.5f);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
