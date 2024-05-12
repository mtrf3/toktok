package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAH extends AbstractC39455Fe7 {
    public DAH() {
        C32856Cuy.S5(this.LIZJ);
        this.LIZJ.LJIILIIL(2.74f, 6.9f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.76f, 0.62f, -1.38f, 1.38f, -1.38f);
        this.LIZJ.LJIIJJI(30.24f);
        this.LIZJ.LJIIJ(0.76f, 0.0f, 1.38f, 0.62f, 1.38f, 1.38f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.77f);
        p2.LJIIJ(0.0f, 0.76f, -0.62f, 1.38f, -1.38f, 1.38f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(8.88f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(-0.76f, 0.0f, -1.38f, -0.62f, -1.38f, -1.38f);
        this.LIZJ.LJIJ(16.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(26.13f, 16.58f);
        C32856Cuy.Fj(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.0f, 0.76f, -0.62f, 1.38f, -1.38f, 1.38f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.88f, -1.38f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-2.77f);
        p6.LJIIIZ(1.37f, 1.37f, true, true, 2.74f, 0.0f);
        p6.LJIILL(2.77f);
        this.LIZJ.LJIIIZ(1.38f, 1.38f, false, true, -2.76f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(12.38f, 1.38f);
        C32856Cuy.Fj(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.76f, -0.62f, 1.38f, -1.37f, 1.38f);
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
