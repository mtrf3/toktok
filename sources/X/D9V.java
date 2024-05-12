package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9V extends AbstractC39455Fe7 {
    public D9V() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 26.0f);
        this.LIZJ.LJIIJ(-4.3f, 0.0f, -8.1f, -1.33f, -10.8f, -3.4f);
        this.LIZJ.LJIIJ(-2.38f, -1.81f, -3.83f, -4.13f, -4.14f, -6.6f);
        this.LIZJ.LJIIJ(-0.07f, -0.55f, -0.5f, -1.0f, -1.06f, -1.0f);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, 0.45f, -0.96f, 1.0f);
        this.LIZJ.LJIIJ(0.32f, 3.92f, 2.54f, 7.34f, 5.72f, 9.78f);
        this.LIZJ.LJIIJ(0.46f, 0.35f, 0.94f, 0.68f, 1.45f, 1.0f);
        this.LIZJ.LJII(9.5f, 31.46f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.37f, 1.37f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.73f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.36f, -0.37f);
        this.LIZJ.LJIIL(2.84f, -4.92f);
        this.LIZJ.LJIIJ(1.92f, 0.73f, 4.01f, 1.2f, 6.2f, 1.38f);
        C32856Cuy.Nb(this.LIZJ);
        this.LIZJ.LJIILL(-5.08f);
        this.LIZJ.LJIIIZ(22.8f, 22.8f, false, false, 6.89f, -1.65f);
        this.LIZJ.LJIIL(2.61f, 4.52f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.37f, 0.37f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(1.73f, -1.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.36f, -1.37f);
        this.LIZJ.LJIIL(-2.55f, -4.42f);
        this.LIZJ.LJIIJ(0.28f, -0.19f, 0.56f, -0.38f, 0.83f, -0.59f);
        this.LIZJ.LJIIJ(3.18f, -2.44f, 5.4f, -5.86f, 5.72f, -9.78f);
        this.LIZJ.LJIIJ(0.04f, -0.55f, -0.4f, -1.0f, -0.96f, -1.0f);
        C32856Cuy.LIZLLL(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, 0.45f, -1.06f, 1.0f);
        this.LIZJ.LJIIJ(-0.31f, 2.47f, -1.76f, 4.79f, -4.13f, 6.6f);
        this.LIZJ.LIZJ(17.88f, 17.88f, false, true, 24.0f, 26.0f);
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
