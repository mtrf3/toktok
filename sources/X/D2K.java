package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2K extends AbstractC39455Fe7 {
    public D2K() {
        this.LIZJ.LJIIIIZZ(40.5f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(24.53f);
        C32856Cuy.ef(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(9.93f);
        this.LIZJ.LJIIL(-8.87f, 8.87f);
        C32856Cuy.Ik(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(2.12f, 2.12f);
        C32856Cuy.Ek(this.LIZJ);
        this.LIZJ.LJII(38.0f, 13.54f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(9.93f);
        C32856Cuy.sa(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(7.5f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 40.5f, 5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.54f, 38.0f);
        this.LIZJ.LJIIL(8.87f, -8.88f);
        C32856Cuy.Hk(this.LIZJ);
        this.LIZJ.LJIIL(-2.12f, -2.12f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(10.0f, 34.46f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-9.93f);
        C32856Cuy.w2(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(40.5f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 7.5f, 43.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(15.97f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p10.LJIILL(-3.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-9.93f);
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
