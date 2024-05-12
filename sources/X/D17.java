package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D17 extends AbstractC39455Fe7 {
    public D17() {
        this.LIZJ.LJIIIIZZ(18.03f, 9.0f);
        this.LIZJ.LJIILL(2.32f);
        this.LIZJ.LJIIJJI(11.94f);
        C32856Cuy.g(this.LIZJ);
        this.LIZJ.LJI(18.03f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(14.94f, 2.32f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(39.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bl(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-1.77f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(38.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(3.5f, 3.5f, false, true, -3.5f, 3.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(14.27f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, -3.5f, -3.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(14.32f);
        C32856Cuy.l7(this.LIZJ);
        C32856Cuy.Ij(this.LIZJ);
        this.LIZJ.LJIIJJI(6.03f);
        C32856Cuy.LLZZLLIL(this.LIZJ);
        C32856Cuy.fg(this.LIZJ);
        this.LIZJ.LJIIJJI(12.94f);
        C32856Cuy.gg(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(2.82f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.26f, 3.0f);
        this.LIZJ.LJI(13.77f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(38.5f);
        C32856Cuy.Z4(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(19.46f);
        C32856Cuy.LLJJI(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIJ(14.32f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-14.46f, 18.2f);
        C32856Cuy.Hh(this.LIZJ);
        this.LIZJ.LJIILIIL(7.46f, 0.0f);
        C32856Cuy.Hh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
