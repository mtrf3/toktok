package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7L extends AbstractC39455Fe7 {
    public D7L() {
        this.LIZJ.LJIIIIZZ(12.35f, 5.77f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.46f, -1.33f);
        this.LIZJ.LJIIL(1.79f, -0.87f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.34f, 0.49f);
        this.LIZJ.LJIIL(2.03f, 4.44f);
        C32856Cuy.D6(this.LIZJ);
        C32856Cuy.N2(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-3.3f);
        this.LIZJ.LJIIIZ(40.05f, 40.05f, false, true, -4.81f, 9.62f);
        this.LIZJ.LJIIJ(2.48f, 2.0f, 3.81f, 2.88f, 6.21f, 3.98f);
        this.LIZJ.LJIIJ(0.5f, 0.23f, 0.73f, 0.8f, 0.53f, 1.3f);
        this.LIZJ.LJIIL(-0.75f, 1.81f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.37f, 0.52f);
        this.LIZJ.LJIIIZ(31.0f, 31.0f, false, true, -7.19f, -4.54f);
        this.LIZJ.LJIIIZ(25.5f, 25.5f, false, true, -10.81f, 6.44f);
        this.LIZJ.LJIIIZ(0.98f, 0.98f, false, true, -1.23f, -0.67f);
        this.LIZJ.LJIIL(-0.56f, -1.92f);
        this.LIZJ.LJIIJ(-0.15f, -0.53f, 0.16f, -1.08f, 0.68f, -1.25f);
        this.LIZJ.LJIIIZ(21.49f, 21.49f, false, false, 9.02f, -5.35f);
        this.LIZJ.LJIIIZ(28.33f, 28.33f, false, true, -5.73f, -9.94f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(5.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        C32856Cuy.zn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(8.63f);
        this.LIZJ.LJIIJ(-0.38f, -0.85f, -0.82f, -1.77f, -1.28f, -2.73f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.62f, 13.53f);
        this.LIZJ.LJIIIZ(34.9f, 34.9f, false, false, 3.46f, -6.8f);
        this.LIZJ.LJIIJJI(-7.47f);
        this.LIZJ.LJIIIZ(23.86f, 23.86f, false, false, 4.01f, 6.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.76f, 13.54f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(6.54f);
        this.LIZJ.LJII(33.0f, 24.49f);
        this.LIZJ.LJIIL(-3.27f, 8.35f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(10.16f, 9.25f);
        this.LIZJ.LJIIL(-2.06f, -5.25f);
        this.LIZJ.LJIIJJI(-9.66f);
        this.LIZJ.LJIIL(-2.06f, 5.25f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, 0.64f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-2.21f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, -1.37f);
        this.LIZJ.LJIIL(8.85f, -22.46f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.93f, -0.63f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(2.36f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.93f, 0.64f);
        this.LIZJ.LJIIL(8.67f, 22.46f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, 1.36f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(-2.03f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, -0.64f);
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
