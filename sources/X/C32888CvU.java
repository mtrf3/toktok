package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32888CvU extends AbstractC39455Fe7 {
    public C32888CvU() {
        this.LIZJ.LJIIIIZZ(14.0f, 6.0f);
        C32856Cuy.hl(this.LIZJ);
        C32856Cuy.A1(this.LIZJ);
        C32856Cuy.wn(this.LIZJ);
        C32856Cuy.n(this.LIZJ);
        C32856Cuy.ra(this.LIZJ);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(5.0f, 0.0f);
        C32856Cuy.P(this.LIZJ);
        this.LIZJ.LJIILIIL(-6.0f, 9.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, true, false, -2.0f, 0.0f);
        p2.LJIILL(3.0f);
        p2.LJIIIZ(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        p2.LJIILL(-3.0f);
        p2.LIZLLL();
        p2.LJIILIIL(0.0f, 7.0f);
        p2.LJIIIZ(1.0f, 1.0f, true, false, -2.0f, 0.0f);
        p2.LJIILL(3.0f);
        p2.LJIIIZ(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        p2.LJIILL(-3.0f);
        p2.LIZLLL();
        p2.LJIILIIL(0.0f, 7.0f);
        p2.LJIIIZ(1.0f, 1.0f, true, false, -2.0f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(3.0f);
        p3.LJIIIZ(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        p3.LJIILL(-3.0f);
        p3.LIZLLL();
        p3.LJIILIIL(0.0f, 7.0f);
        p3.LJIIIZ(1.0f, 1.0f, true, false, -2.0f, 0.0f);
        C32856Cuy.A1(this.LIZJ);
        C32856Cuy.jl(this.LIZJ);
        C32856Cuy.ra(this.LIZJ);
        C32856Cuy.ck(this.LIZJ);
        this.LIZJ.LJIILIIL(6.0f, 3.0f);
        C32856Cuy.P(this.LIZJ);
        this.LIZJ.LJIILIIL(7.0f, -33.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, true, false, 0.0f, 2.0f);
        p4.LJIIJJI(8.0f);
        C32856Cuy.An(this.LIZJ);
        this.LIZJ.LJIILL(29.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJIIJJI(-8.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, true, false, 0.0f, 2.0f);
        p6.LJIIJJI(8.0f);
        C32856Cuy.il(this.LIZJ);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.gl(this.LIZJ);
        C32856Cuy.Y(this.LIZJ);
        this.LIZJ.LJIILIIL(-4.0f, 10.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, true, true, 2.0f, 0.0f);
        C32856Cuy.E1(this.LIZJ);
        C32856Cuy.vn(this.LIZJ);
        C32856Cuy.h1(this.LIZJ);
        this.LIZJ.LJIILIIL(8.0f, -1.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p9.LJIILL(6.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        p10.LJIILL(-6.0f);
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
