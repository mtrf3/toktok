package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5E extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public D5E() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.Tf(this.LIZJ);
        this.LIZJ.LJIIIIZZ(5.0f, 17.04f);
        this.LIZJ.LJIIJ(0.0f, -2.3f, 1.89f, -4.16f, 4.21f, -4.16f);
        this.LIZJ.LJIIJJI(23.16f);
        this.LIZJ.LJIIIZ(4.19f, 4.19f, false, true, 4.2f, 4.16f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.06f);
        this.LIZJ.LIZJ(7.32f, 7.32f, false, true, 45.0f, 24.32f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(3.64f);
        this.LIZJ.LJIIJ(0.0f, 4.02f, -3.3f, 7.28f, -7.37f, 7.28f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-1.71f);
        this.LIZJ.LIZJ(10.53f, 10.53f, false, true, 26.05f, 42.0f);
        this.LIZJ.LJI(15.53f);
        this.LIZJ.LIZJ(10.46f, 10.46f, false, true, 5.0f, 31.6f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(17.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(31.58f, 14.04f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(1.05f);
        this.LIZJ.LJIIJ(1.75f, 0.0f, 3.16f, -1.4f, 3.16f, -3.12f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-3.64f);
        this.LIZJ.LJIIIZ(3.14f, 3.14f, false, false, -3.16f, -3.12f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-1.05f);
        this.LIZJ.LJIILL(9.88f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
