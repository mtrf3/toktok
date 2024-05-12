package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2X extends AbstractC39455Fe7 {
    public D2X() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(11.0f, 8.0f);
        C32856Cuy.rj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(24.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        p2.LJIIJJI(26.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        p2.LJIJ(12.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        p2.LJI(11.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.LLIZ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(26.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(24.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(11.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIILIIL(4.0f, 15.5f);
        C32856Cuy.Ac(this.LIZJ);
        this.LIZJ.LJIILIIL(10.0f, 5.0f);
        C32856Cuy.Ac(this.LIZJ);
        this.LIZJ.LJIILIIL(5.5f, -5.5f);
        C32856Cuy.Og(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 32.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p6.LJIIJJI(6.0f);
        C32856Cuy.N5(this.LIZJ);
        C32856Cuy.LJII(this.LIZJ);
        C32856Cuy.wa(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
