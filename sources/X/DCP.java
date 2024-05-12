package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCP extends AbstractC39455Fe7 {
    public DCP() {
        this.LIZJ.LJIIIIZZ(43.77f, 28.0f);
        this.LIZJ.LJIIJ(0.15f, -0.12f, 0.23f, -0.3f, 0.23f, -0.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(16.08f);
        this.LIZJ.LJIIIZ(2.81f, 2.81f, false, false, -2.86f, -2.77f);
        this.LIZJ.LJIIJJI(-5.71f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(7.77f);
        this.LIZJ.LIZJ(2.81f, 2.81f, false, false, 32.57f, 5.0f);
        this.LIZJ.LJI(15.43f);
        this.LIZJ.LJIIIZ(2.81f, 2.81f, false, false, -2.86f, 2.77f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(5.54f);
        this.LIZJ.LJI(6.86f);
        this.LIZJ.LIZJ(2.81f, 2.81f, false, false, 4.0f, 16.08f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(27.5f);
        this.LIZJ.LJIIJ(0.0f, 0.2f, 0.08f, 0.38f, 0.23f, 0.5f);
        this.LIZJ.LJIIIZ(8.7f, 8.7f, false, false, 5.48f, 1.92f);
        this.LIZJ.LJI(38.3f);
        this.LIZJ.LJIIJ(2.08f, 0.0f, 4.0f, -0.72f, 5.48f, -1.92f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.86f, 13.3f);
        this.LIZJ.LJIJ(9.16f);
        this.LIZJ.LJIIJJI(14.28f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(4.16f);
        this.LIZJ.LJI(16.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.28f, 11.08f);
        this.LIZJ.LIZJ(2.81f, 2.81f, false, true, 24.0f, 21.62f);
        this.LIZJ.LJIIIZ(2.81f, 2.81f, false, true, 2.86f, 2.76f);
        this.LIZJ.LIZJ(2.81f, 2.81f, false, true, 24.0f, 27.15f);
        this.LIZJ.LJIIIZ(2.81f, 2.81f, false, true, -2.86f, -2.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(44.0f, 31.21f);
        this.LIZJ.LJIIIZ(11.66f, 11.66f, false, true, -5.71f, 1.48f);
        this.LIZJ.LJI(9.7f);
        this.LIZJ.LJIIJ(-2.08f, 0.0f, -4.03f, -0.54f, -5.71f, -1.48f);
        this.LIZJ.LJIILL(7.02f);
        this.LIZJ.LIZJ(2.81f, 2.81f, false, false, 6.86f, 41.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(34.28f);
        this.LIZJ.LIZJ(2.81f, 2.81f, false, false, 44.0f, 38.23f);
        this.LIZJ.LJIILL(-7.02f);
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
