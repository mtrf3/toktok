package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1B extends AbstractC39455Fe7 {
    public D1B() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(21.0f, 4.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        C32856Cuy.F1(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(9.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        p2.LJIILL(18.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, 5.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(18.0f);
        C32856Cuy.ni(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.0f);
        p4.LJIIJJI(7.0f);
        C32856Cuy.ul(this.LIZJ);
        this.LIZJ.LJIILIIL(11.0f, 24.0f);
        C32856Cuy.LJJZZI(this.LIZJ);
        C32856Cuy.li(this.LIZJ);
        C32856Cuy.LJIIIIZZ(this.LIZJ);
        C32856Cuy.n(this.LIZJ);
        C32856Cuy.xg(this.LIZJ);
        C32856Cuy.X(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.0f, 20.0f);
        C32856Cuy.xg(this.LIZJ);
        C32856Cuy.l7(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(21.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
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
