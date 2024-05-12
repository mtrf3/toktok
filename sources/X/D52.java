package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D52 extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public D52() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(27.7f, 48.0f);
        C32856Cuy.E9(this.LIZJ);
        this.LIZJ.LJIIJJI(5.94f);
        this.LIZJ.LJIIL(1.07f, -6.8f);
        this.LIZJ.LJI(27.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-5.25f);
        this.LIZJ.LJIIJ(0.04f, -1.92f, 1.37f, -2.84f, 3.3f, -3.13f);
        this.LIZJ.LJIIJ(1.17f, -0.18f, 2.64f, -0.02f, 3.7f, 0.0f);
        this.LIZJ.LJIIL(0.01f, -5.55f);
        this.LIZJ.LJIILL(-0.41f);
        this.LIZJ.LJIIIZ(4.99f, 4.99f, false, false, -0.39f, -0.07f);
        this.LIZJ.LJIIJ(-2.21f, -0.3f, -4.14f, -0.56f, -6.38f, -0.29f);
        this.LIZJ.LJ(25.22f, 9.83f, 23.0f, 11.0f, 21.8f, 13.0f);
        this.LIZJ.LJIIIZ(10.22f, 10.22f, false, false, -1.55f, 5.04f);
        this.LIZJ.LJIIJ(-0.03f, 1.76f, 0.0f, 6.16f, 0.0f, 6.16f);
        C32856Cuy.p6(this.LIZJ);
        this.LIZJ.LJIIL(0.04f, 6.8f);
        this.LIZJ.LJIIJJI(6.25f);
        this.LIZJ.LJIIL(-0.05f, 17.0f);
        this.LIZJ.LJIIJJI(7.46f);
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
