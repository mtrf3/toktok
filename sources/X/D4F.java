package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4F extends AbstractC39455Fe7 {
    public D4F() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(39.0f, 22.0f);
        C32856Cuy.Dn(this.LIZJ);
        C32856Cuy.R2(this.LIZJ);
        this.LIZJ.LJII(14.47f, 6.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -0.87f, 1.0f);
        p2.LJIJ(30.0f);
        C32856Cuy.l6(this.LIZJ);
        C32856Cuy.Ed(this.LIZJ);
        C32856Cuy.t9(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJI(39.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(37.65f, 41.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p4.LJIILL(-5.0f);
        p4.LJIIJJI(-5.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.LJJJJZI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(5.0f);
        p5.LJIILL(-5.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.g0(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p6.LJIILL(5.0f);
        p6.LJIIJJI(5.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(34.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(-5.0f);
        p9.LJIILL(5.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.F(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
