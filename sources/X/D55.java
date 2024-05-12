package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D55 extends AbstractC39455Fe7 {
    public D55() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(14.0f, 4.0f);
        p.LJIIIZ(7.0f, 7.0f, false, false, -7.0f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(25.5f);
        C32856Cuy.Cc(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(38.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(6.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        p4.LJI(14.0f);
        p4.LIZLLL();
        this.LIZJ.LJIILIIL(-0.5f, 26.0f);
        C32856Cuy.da(this.LIZJ);
        C32856Cuy.LJIILJJIL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(12.5f);
        C32856Cuy.lo(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(8.0f);
        p6.LJIIJJI(4.0f);
        C32856Cuy.LJLJLLL(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(13.5f);
        p7.LIZLLL();
        p7.LJIILIIL(0.0f, 4.0f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.Ni(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
