package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9T extends AbstractC39455Fe7 {
    public D9T() {
        this.LIZJ.LJIIIIZZ(11.63f, 7.78f);
        this.LIZJ.LIZJ(3.76f, 3.76f, false, true, 15.38f, 4.0f);
        this.LIZJ.LJIIJJI(14.47f);
        this.LIZJ.LJIIJ(0.47f, 0.0f, 0.93f, 0.18f, 1.28f, 0.5f);
        this.LIZJ.LJIIL(10.25f, 9.32f);
        this.LIZJ.LJIIJ(0.4f, 0.36f, 0.62f, 0.86f, 0.62f, 1.4f);
        this.LIZJ.LJIILL(24.65f);
        this.LIZJ.LJIIIZ(3.76f, 3.76f, false, true, -3.75f, 3.77f);
        this.LIZJ.LJI(20.77f);
        this.LIZJ.LJIIJ(0.53f, -0.99f, 0.82f, -2.11f, 0.82f, -3.3f);
        this.LIZJ.LJIILL(-2.36f);
        this.LIZJ.LJIIJ(0.0f, -0.52f, 0.43f, -0.95f, 0.95f, -0.95f);
        this.LIZJ.LJIIJJI(3.7f);
        this.LIZJ.LJIIJ(2.95f, 0.0f, 4.53f, -1.89f, 4.35f, -6.45f);
        this.LIZJ.LJIIJ(-0.2f, -4.87f, -6.2f, -12.42f, -13.27f, -12.42f);
        this.LIZJ.LJIIJ(-2.04f, 0.0f, -3.97f, 0.45f, -5.7f, 1.27f);
        this.LIZJ.LJIJ(7.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(5.0f, 31.69f);
        this.LIZJ.LJIIJ(0.35f, -5.48f, 5.13f, -9.76f, 10.9f, -9.76f);
        this.LIZJ.LJIIJ(5.77f, 0.0f, 10.55f, 4.28f, 10.9f, 9.76f);
        this.LIZJ.LJIIJ(0.05f, 0.9f, -0.68f, 1.57f, -1.5f, 1.57f);
        this.LIZJ.LJIIJJI(-6.27f);
        this.LIZJ.LJIIIZ(0.76f, 0.76f, false, false, -0.76f, 0.75f);
        this.LIZJ.LJIILL(6.66f);
        this.LIZJ.LIZJ(5.15f, 5.15f, false, true, 13.05f, 46.0f);
        this.LIZJ.LJIIIZ(5.12f, 5.12f, false, true, -5.2f, -4.86f);
        this.LIZJ.LJIIIZ(0.45f, 0.45f, false, true, 0.46f, -0.47f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.84f);
        this.LIZJ.LJIIJ(0.27f, 0.0f, 0.47f, 0.21f, 0.52f, 0.47f);
        this.LIZJ.LJIIJ(0.16f, 0.74f, 0.72f, 1.08f, 1.38f, 1.08f);
        this.LIZJ.LJIIJ(0.79f, 0.0f, 1.42f, -0.48f, 1.42f, -1.55f);
        C32856Cuy.H9(this.LIZJ);
        this.LIZJ.LJIIIZ(0.76f, 0.76f, false, false, -0.75f, -0.75f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(6.5f);
        this.LIZJ.LJIIJ(-0.82f, 0.0f, -1.55f, -0.68f, -1.5f, -1.57f);
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
