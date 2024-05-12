package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D86 extends AbstractC39455Fe7 {
    public D86() {
        this.LIZJ.LJIILIIL(18.41f, 15.58f);
        this.LIZJ.LJIIL(0.56f, -8.73f);
        C32856Cuy.Ra(this.LIZJ);
        C32856Cuy.G0(this.LIZJ);
        this.LIZJ.LJIIL(0.56f, -8.73f);
        C32856Cuy.Ra(this.LIZJ);
        this.LIZJ.LJIIJJI(8.09f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.28f, 0.0f, 0.5f, 0.2f, 0.5f, 0.46f);
        this.LIZJ.LJIILL(0.92f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, 0.25f, -0.22f, 0.46f, -0.5f, 0.46f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-8.2f);
        this.LIZJ.LJIIL(-0.53f, 8.25f);
        this.LIZJ.LJIIJJI(7.73f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.28f, 0.0f, 0.5f, 0.2f, 0.5f, 0.46f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(0.91f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, 0.25f, -0.22f, 0.46f, -0.5f, 0.46f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-7.85f);
        C32856Cuy.h8(this.LIZJ);
        C32856Cuy.LJIIIZ(this.LIZJ);
        C32856Cuy.h8(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(9.5f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJ(-0.28f, 0.0f, -0.5f, -0.2f, -0.5f, -0.46f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(-0.91f);
        this.LIZJ.LJIIJ(0.0f, -0.26f, 0.22f, -0.46f, 0.5f, -0.46f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJJI(8.26f);
        this.LIZJ.LJIIL(0.53f, -8.25f);
        this.LIZJ.LJI(10.5f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJ(-0.28f, 0.0f, -0.5f, -0.2f, -0.5f, -0.46f);
        this.LIZJ.LJIILL(-0.92f);
        this.LIZJ.LJIIJ(0.0f, -0.25f, 0.22f, -0.46f, 0.5f, -0.46f);
        this.LIZJ.LJIIJJI(7.91f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.89f, 1.84f);
        this.LIZJ.LJIIL(-0.53f, 8.25f);
        C32856Cuy.G0(this.LIZJ);
        this.LIZJ.LJIIL(0.52f, -8.25f);
        C32856Cuy.Y(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
