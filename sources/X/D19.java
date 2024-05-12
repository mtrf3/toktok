package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D19 extends AbstractC39455Fe7 {
    public D19() {
        this.LIZJ.LJIIIIZZ(37.88f, 40.7f);
        C32856Cuy.Zh(this.LIZJ);
        this.LIZJ.LJII(35.0f, 32.18f);
        this.LIZJ.LJIILL(-3.39f);
        C32856Cuy.qf(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(11.83f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-4.7f, -4.7f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(4.29f, 5.7f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(33.59f, 33.59f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.83f, 13.0f);
        C32856Cuy.F6(this.LIZJ);
        C32856Cuy.wm(this.LIZJ);
        this.LIZJ.LJIILL(13.17f);
        this.LIZJ.LJII(15.83f, 13.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(19.25f, 11.0f);
        this.LIZJ.LJII(43.0f, 18.58f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(10.84f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJII(35.08f, 24.0f);
        p4.LIZLLL();
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(1.0f, 15.0f);
        this.LIZJ.LJIIJ(0.0f, -1.71f, 0.72f, -3.26f, 1.87f, -4.35f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(2.83f, 2.83f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 5.0f, 15.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(18.0f);
        p7.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(20.22f);
        this.LIZJ.LJIIL(3.7f, 3.69f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 29.0f, 39.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJI(7.0f);
        p10.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, -6.0f);
        p10.LJIJ(15.0f);
        p10.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
