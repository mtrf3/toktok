package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCR extends AbstractC39455Fe7 {
    public DCR() {
        C32856Cuy.j2(this.LIZJ);
        this.LIZJ.LJIILIIL(4.74f, -5.13f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, false, 14.73f, 22.95f);
        this.LIZJ.LJIIJ(-0.12f, -0.6f, -0.18f, -1.18f, -0.19f, -1.58f);
        this.LIZJ.LJIIJ(-0.05f, -2.33f, -0.22f, -5.1f, -0.59f, -5.45f);
        this.LIZJ.LJIIJ(-0.4f, -0.39f, -1.99f, -3.2f, -3.1f, -5.23f);
        this.LIZJ.LJIIJ(-0.08f, -0.15f, -0.14f, -0.31f, -0.2f, -0.47f);
        this.LIZJ.LJIIJ(-0.3f, -0.97f, -0.78f, -2.09f, -1.76f, -2.38f);
        this.LIZJ.LJIIIZ(11.04f, 11.04f, false, true, -3.76f, -2.0f);
        this.LIZJ.LJIIIZ(12.6f, 12.6f, false, true, -1.75f, -1.99f);
        this.LIZJ.LJIIJ(-0.45f, -0.57f, -0.93f, -1.2f, -1.47f, -1.8f);
        this.LIZJ.LJIIJ(-0.57f, -0.63f, -1.35f, -1.46f, -1.9f, -2.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.82f, 6.04f);
        this.LIZJ.LJIIJ(-1.0f, 0.43f, -1.49f, 0.98f, -1.76f, 1.3f);
        this.LIZJ.LJIIJ(-0.43f, 0.49f, -0.36f, 1.23f, 0.15f, 1.63f);
        this.LIZJ.LJIIJ(0.67f, 0.53f, 1.89f, 0.09f, 1.82f, -0.66f);
        this.LIZJ.LJ(23.0f, 8.0f, 23.0f, 7.5f, 23.5f, 7.0f);
        this.LIZJ.LJIIJ(0.55f, -0.56f, 1.52f, -0.2f, 2.07f, 0.34f);
        this.LIZJ.LJIIJ(0.28f, 0.27f, 0.43f, 0.64f, 0.43f, 1.02f);
        this.LIZJ.LJIILL(4.11f);
        this.LIZJ.LJIIJ(0.03f, 0.6f, 0.07f, 1.74f, -0.43f, 3.03f);
        this.LIZJ.LJIIJ(-0.57f, 1.5f, -3.22f, 4.44f, -3.22f, 4.44f);
        this.LIZJ.LJIIIZ(2.97f, 2.97f, false, true, -2.94f, 1.11f);
        this.LIZJ.LJIIL(-0.63f, -0.12f);
        this.LIZJ.LJIIIZ(2.34f, 2.34f, false, false, -1.93f, 4.1f);
        this.LIZJ.LJIIJ(0.77f, 0.63f, 1.92f, 0.57f, 2.9f, 0.45f);
        this.LIZJ.LJIIIZ(7.22f, 7.22f, false, true, 5.82f, 1.97f);
        this.LIZJ.LJIIL(1.65f, 1.8f);
        this.LIZJ.LJIIJ(0.55f, 0.6f, 2.47f, 0.75f, 3.28f, 0.75f);
        this.LIZJ.LJIIJ(2.0f, 0.0f, 2.09f, 1.92f, 1.66f, 3.74f);
        this.LIZJ.LJIIL(-0.17f, 0.71f);
        this.LIZJ.LJIIJ(-0.15f, 0.6f, -0.44f, 1.15f, -0.86f, 1.6f);
        this.LIZJ.LJIIL(-3.74f, 3.93f);
        this.LIZJ.LJIIJ(-0.35f, 0.36f, -0.54f, 0.85f, -0.54f, 1.35f);
        this.LIZJ.LJIIJ(0.0f, 0.14f, -0.02f, 0.3f, -0.05f, 0.45f);
        this.LIZJ.LJIIIZ(18.02f, 18.02f, false, false, 14.4f, -12.45f);
        this.LIZJ.LJIIL(-3.0f, -6.66f);
        this.LIZJ.LJIIIZ(6.82f, 6.82f, false, true, 0.03f, -5.33f);
        this.LIZJ.LJIIJ(0.41f, -1.03f, 0.8f, -2.18f, 0.9f, -3.1f);
        this.LIZJ.LJIIIZ(17.99f, 17.99f, false, false, -16.31f, -8.2f);
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
