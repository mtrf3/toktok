package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6O extends AbstractC39455Fe7 {
    public D6O() {
        this.LIZJ.LJIIIIZZ(26.74f, 44.45f);
        this.LIZJ.LJIIJ(-1.2f, 0.65f, -2.75f, 0.83f, -4.2f, -0.05f);
        this.LIZJ.LJIIIZ(7.24f, 7.24f, false, true, -3.52f, -6.2f);
        C32856Cuy.LJJLL(this.LIZJ);
        this.LIZJ.LJIIJJI(-8.48f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -5.48f, -6.3f);
        this.LIZJ.LJIIL(2.41f, -15.73f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, 5.49f, -4.67f);
        this.LIZJ.LJI(37.9f);
        this.LIZJ.LIZJ(6.04f, 6.04f, false, true, 44.0f, 12.0f);
        this.LIZJ.LJIILL(12.22f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.02f, 0.27f);
        this.LIZJ.LJIIJ(-0.39f, 2.9f, -2.89f, 5.46f, -6.07f, 5.42f);
        this.LIZJ.LJIIJJI(-3.36f);
        this.LIZJ.LJIIL(-5.3f, 11.75f);
        this.LIZJ.LJIIIZ(5.93f, 5.93f, false, true, -2.51f, 2.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.52f, -18.54f);
        this.LIZJ.LJI(37.96f);
        this.LIZJ.LJIIJ(0.88f, 0.02f, 1.84f, -0.74f, 2.04f, -1.84f);
        this.LIZJ.LJIJ(12.15f);
        this.LIZJ.LJIIIZ(2.04f, 2.04f, false, false, -2.04f, -1.65f);
        this.LIZJ.LJI(35.26f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(25.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.0f, -15.41f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(12.92f);
        this.LIZJ.LJIIJ(-0.73f, -0.01f, -1.38f, 0.54f, -1.5f, 1.27f);
        this.LIZJ.LJII(9.03f, 27.5f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 1.5f, 1.72f);
        this.LIZJ.LJIIJJI(10.51f);
        C32856Cuy.wm(this.LIZJ);
        this.LIZJ.LJIILL(6.99f);
        this.LIZJ.LJIIJ(0.0f, 1.18f, 0.62f, 2.21f, 1.57f, 2.78f);
        this.LIZJ.LJIIJ(0.08f, 0.05f, 0.15f, 0.0f, 0.23f, -0.04f);
        this.LIZJ.LJIIJ(0.35f, -0.2f, 0.61f, -0.56f, 0.77f, -0.91f);
        this.LIZJ.LJIIL(5.66f, -12.55f);
        this.LIZJ.LJIJ(10.5f);
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
