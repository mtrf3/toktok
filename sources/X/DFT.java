package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFT extends AbstractC39455Fe7 {
    public DFT() {
        this.LIZJ.LJIIIIZZ(24.0f, 2.22f);
        this.LIZJ.LIZJ(21.89f, 21.89f, true, false, 24.0f, 46.0f);
        this.LIZJ.LJIIIZ(21.89f, 21.89f, false, false, 0.0f, -43.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.5f, 20.8f);
        this.LIZJ.LJIIL(0.23f, 0.25f);
        this.LIZJ.LJIIJ(0.54f, 0.6f, 1.02f, 1.22f, 1.46f, 1.8f);
        this.LIZJ.LJIIJ(0.63f, 0.8f, 1.19f, 1.52f, 1.74f, 1.97f);
        this.LIZJ.LJIIJ(1.1f, 0.9f, 2.38f, 1.57f, 3.75f, 1.98f);
        this.LIZJ.LJIIJ(0.97f, 0.3f, 1.44f, 1.4f, 1.75f, 2.38f);
        this.LIZJ.LJIIJ(0.05f, 0.16f, 0.12f, 0.31f, 0.2f, 0.46f);
        this.LIZJ.LJIIJ(1.1f, 2.03f, 2.67f, 4.82f, 3.08f, 5.2f);
        this.LIZJ.LJIIJ(0.36f, 0.34f, 0.52f, 2.94f, 0.58f, 5.21f);
        this.LIZJ.LIZJ(16.24f, 16.24f, false, true, 8.5f, 20.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(31.23f, 8.67f);
        this.LIZJ.LJIIIZ(16.26f, 16.26f, false, true, -12.44f, 10.62f);
        this.LIZJ.LJIIL(0.08f, -0.08f);
        this.LIZJ.LJIIL(3.72f, -3.92f);
        this.LIZJ.LJIIJ(0.42f, -0.44f, 0.71f, -0.98f, 0.85f, -1.58f);
        this.LIZJ.LJIIL(0.17f, -0.71f);
        this.LIZJ.LJIIJ(0.43f, -1.8f, 0.35f, -3.72f, -1.64f, -3.72f);
        this.LIZJ.LJIIJ(-0.8f, 0.0f, -2.72f, -0.16f, -3.27f, -0.75f);
        this.LIZJ.LJIIL(-1.63f, -1.79f);
        this.LIZJ.LJIIIZ(7.18f, 7.18f, false, false, -5.8f, -1.96f);
        this.LIZJ.LJIIJ(-0.97f, 0.12f, -2.12f, 0.19f, -2.88f, -0.44f);
        this.LIZJ.LJIIIZ(2.33f, 2.33f, false, true, 1.92f, -4.08f);
        this.LIZJ.LJIIL(0.62f, 0.12f);
        this.LIZJ.LJIIJ(1.11f, 0.22f, 2.25f, -0.21f, 2.93f, -1.11f);
        this.LIZJ.LJIIJ(0.0f, 0.0f, 2.63f, -2.92f, 3.2f, -4.41f);
        this.LIZJ.LJIIJ(0.5f, -1.29f, 0.46f, -2.42f, 0.44f, -3.02f);
        this.LIZJ.LJIIJ(-0.05f, -1.36f, -0.01f, -2.73f, -0.01f, -4.08f);
        this.LIZJ.LJIIJ(0.0f, -0.22f, -0.05f, -0.43f, -0.14f, -0.62f);
        this.LIZJ.LJIIJ(4.76f, 0.42f, 8.93f, 2.9f, 11.62f, 6.54f);
        this.LIZJ.LJIIJ(-0.12f, 0.9f, -0.52f, 2.12f, -0.92f, 3.1f);
        this.LIZJ.LJIIIZ(6.78f, 6.78f, false, false, -0.03f, 5.32f);
        this.LIZJ.LJIIL(3.21f, 6.57f);
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
