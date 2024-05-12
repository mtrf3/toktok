package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33551DEt extends AbstractC39455Fe7 {
    public C33551DEt() {
        this.LIZJ.LJIIIIZZ(21.23f, 6.03f);
        this.LIZJ.LJIIIZ(2.97f, 2.97f, false, true, 5.33f, 0.0f);
        this.LIZJ.LJIIL(1.69f, 3.45f);
        this.LIZJ.LIZJ(24.76f, 24.76f, false, true, 37.0f, 7.61f);
        this.LIZJ.LJIIJ(2.62f, 0.0f, 5.16f, 0.7f, 6.57f, 2.63f);
        this.LIZJ.LJIIJ(1.1f, 1.48f, 1.31f, 3.33f, 1.0f, 5.21f);
        this.LIZJ.LJIIJ(-0.3f, 1.87f, -1.16f, 3.9f, -2.39f, 5.94f);
        this.LIZJ.LJIIJ(-2.47f, 4.1f, -6.63f, 8.55f, -11.87f, 12.46f);
        this.LIZJ.LJIIJ(-5.25f, 3.9f, -10.7f, 6.6f, -15.3f, 7.78f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, false, true, -6.33f, 0.55f);
        this.LIZJ.LJIIJ(-1.87f, -0.25f, -3.56f, -1.0f, -4.65f, -2.5f);
        this.LIZJ.LJIIJ(-1.44f, -1.97f, -1.36f, -4.55f, -0.53f, -7.07f);
        this.LIZJ.LJIIJ(0.81f, -2.47f, 2.42f, -5.18f, 4.61f, -7.87f);
        this.LIZJ.LJIIL(-3.07f, -3.02f);
        this.LIZJ.LJIIIZ(2.97f, 2.97f, false, true, 1.65f, -5.05f);
        this.LIZJ.LJIIL(10.05f, -1.47f);
        this.LIZJ.LJIIL(4.48f, -9.17f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.81f, 9.17f);
        this.LIZJ.LJIIL(9.99f, 1.46f);
        this.LIZJ.LJIIJ(0.05f, 0.0f, 0.1f, 0.02f, 0.14f, 0.03f);
        this.LIZJ.LJIIJ(0.22f, -0.62f, 0.38f, -1.2f, 0.47f, -1.73f);
        this.LIZJ.LJIIJ(0.22f, -1.36f, 0.0f, -2.3f, -0.46f, -2.93f);
        this.LIZJ.LJIIJ(-0.57f, -0.79f, -1.9f, -1.4f, -4.18f, -1.4f);
        this.LIZJ.LJIIJ(-2.09f, 0.0f, -4.67f, 0.51f, -7.43f, 1.56f);
        this.LIZJ.LJIIL(1.47f, 3.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.0f, 2.74f);
        this.LIZJ.LJII(23.9f, 7.4f);
        this.LIZJ.LJIIL(-5.15f, 10.53f);
        this.LIZJ.LJII(7.2f, 19.63f);
        this.LIZJ.LJIIL(8.36f, 8.21f);
        this.LIZJ.LJIIL(-1.87f, 11.01f);
        this.LIZJ.LJIIL(0.6f, -0.14f);
        this.LIZJ.LJIIJ(4.15f, -1.06f, 9.24f, -3.55f, 14.25f, -7.28f);
        this.LIZJ.LJIIJ(5.01f, -3.73f, 8.88f, -7.91f, 11.1f, -11.6f);
        this.LIZJ.LJIIL(0.19f, -0.31f);
        this.LIZJ.LJIIL(-10.79f, -1.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-16.7f, 10.94f);
        this.LIZJ.LJIIL(-2.07f, -2.03f);
        this.LIZJ.LJIIIZ(22.6f, 22.6f, false, false, -3.93f, 6.7f);
        this.LIZJ.LJIIJ(-0.69f, 2.1f, -0.5f, 3.51f, 0.1f, 4.34f);
        this.LIZJ.LJIIJ(0.47f, 0.63f, 1.3f, 1.12f, 2.65f, 1.3f);
        this.LIZJ.LJIIJ(0.45f, 0.07f, 0.95f, 0.1f, 1.48f, 0.08f);
        this.LIZJ.LJIIL(1.77f, -10.39f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(16.06f, 10.0f);
        this.LIZJ.LJIIIZ(0.42f, 0.42f, false, true, -0.03f, -0.71f);
        this.LIZJ.LJIIIZ(73.36f, 73.36f, false, false, 7.02f, -5.27f);
        this.LIZJ.LJIIIZ(0.42f, 0.42f, false, true, 0.69f, 0.25f);
        this.LIZJ.LJIIL(1.14f, 6.73f);
        this.LIZJ.LJIIIZ(2.02f, 2.02f, false, true, -2.92f, 2.14f);
        this.LIZJ.LJIIL(-5.9f, -3.13f);
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
