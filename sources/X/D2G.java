package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2G extends AbstractC39455Fe7 {
    public D2G() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(41.0f, 5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(25.02f);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(11.15f);
        this.LIZJ.LJIIL(-9.32f, 9.32f);
        C32856Cuy.kd(this.LIZJ);
        this.LIZJ.LJII(39.0f, 11.83f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(11.15f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p5.LJIIJJI(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p5.LJIJ(7.0f);
        C32856Cuy.sc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(11.83f, 39.0f);
        this.LIZJ.LJIIL(9.32f, -9.32f);
        C32856Cuy.w8(this.LIZJ);
        this.LIZJ.LJII(9.0f, 36.17f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(25.02f);
        C32856Cuy.w2(this.LIZJ);
        C32856Cuy.N9(this.LIZJ);
        C32856Cuy.Am(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(15.98f);
        C32856Cuy.xa(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(11.83f);
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
