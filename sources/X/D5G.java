package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5G extends AbstractC39455Fe7 {
    public D5G() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(1.0f, 15.0f);
        p.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, -6.0f);
        p.LJIIJJI(22.0f);
        p.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, 6.0f);
        this.LIZJ.LJIILL(4.21f);
        this.LIZJ.LJIIL(9.18f, -6.28f);
        this.LIZJ.LIZJ(1.8f, 1.8f, false, true, 47.0f, 14.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(33.6f);
        this.LIZJ.LJIIIZ(1.8f, 1.8f, false, true, -2.82f, 1.48f);
        this.LIZJ.LJII(35.0f, 28.8f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(33.0f);
        p3.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, 6.0f);
        p3.LJI(7.0f);
        p3.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, -6.0f);
        p3.LJIJ(15.0f);
        p3.LIZLLL();
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(6.0f, -2.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(18.0f);
        p5.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(22.0f);
        p6.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.xm(this.LIZJ);
        C32856Cuy.V6(this.LIZJ);
        this.LIZJ.LJIILIIL(28.08f, 11.0f);
        this.LIZJ.LJII(43.0f, 29.42f);
        this.LIZJ.LJIJ(18.58f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJII(35.08f, 24.0f);
        p7.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
