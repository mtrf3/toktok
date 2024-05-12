package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5F extends AbstractC39455Fe7 {
    public D5F() {
        this.LIZJ.LJIIIIZZ(50.76f, 1.17f);
        this.LIZJ.LJIIJ(0.53f, 0.05f, 0.91f, 0.53f, 0.85f, 1.06f);
        this.LIZJ.LJIIL(-2.39f, 22.13f);
        this.LIZJ.LJIIJJI(16.1f);
        C32856Cuy.W8(this.LIZJ);
        this.LIZJ.LJI(48.88f);
        this.LIZJ.LJIIL(-1.86f, 17.22f);
        this.LIZJ.LJIIJJI(18.3f);
        C32856Cuy.W8(this.LIZJ);
        this.LIZJ.LJI(46.68f);
        C32856Cuy.ko(this.LIZJ);
        this.LIZJ.LJII(42.0f, 70.84f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, -0.86f, -1.06f);
        this.LIZJ.LJII(43.5f, 47.9f);
        this.LIZJ.LJI(26.46f);
        C32856Cuy.ko(this.LIZJ);
        this.LIZJ.LJIIL(-1.23f, -0.13f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, -0.85f, -1.06f);
        this.LIZJ.LJIIL(2.36f, -21.88f);
        C32856Cuy.V4(this.LIZJ);
        this.LIZJ.LJIJ(45.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.53f, 0.43f, -0.96f, 0.97f, -0.96f);
        this.LIZJ.LJIIJJI(17.51f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.86f, -17.22f);
        C32856Cuy.V4(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-1.24f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.53f, 0.43f, -0.96f, 0.97f, -0.96f);
        this.LIZJ.LJIIJJI(19.71f);
        C32856Cuy.t4(this.LIZJ);
        this.LIZJ.LJIIJ(0.52f, 0.05f, 0.9f, 0.53f, 0.85f, 1.06f);
        this.LIZJ.LJII(29.0f, 24.36f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(17.04f);
        C32856Cuy.t4(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-22.1f, 26.35f);
        this.LIZJ.LJII(26.8f, 44.74f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(17.04f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(1.86f, -17.22f);
        this.LIZJ.LJI(28.66f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
