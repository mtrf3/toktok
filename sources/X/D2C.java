package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2C extends AbstractC39455Fe7 {
    public D2C() {
        this.LIZJ.LJIIIIZZ(7.5f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(15.97f);
        C32856Cuy.E3(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-9.93f);
        this.LIZJ.LJIIL(8.87f, 8.87f);
        C32856Cuy.w6(this.LIZJ);
        this.LIZJ.LJII(10.0f, 13.54f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(9.93f);
        C32856Cuy.bk(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(7.5f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 7.5f, 5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.46f, 38.0f);
        this.LIZJ.LJIIL(-8.87f, -8.88f);
        C32856Cuy.vk(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(2.12f, -2.12f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJII(38.0f, 34.46f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-9.93f);
        C32856Cuy.r(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(40.5f);
        C32856Cuy.eg(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(24.53f);
        C32856Cuy.u5(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(9.93f);
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
