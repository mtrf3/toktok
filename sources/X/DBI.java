package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBI extends AbstractC39455Fe7 {
    public DBI() {
        this.LIZJ.LJIIIIZZ(27.0f, 6.63f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.5f, 0.92f);
        this.LIZJ.LJIIJ(-0.22f, 4.01f, -0.21f, 7.04f, 0.2f, 9.35f);
        this.LIZJ.LJIIJ(0.26f, 1.51f, 0.7f, 2.68f, 1.33f, 3.6f);
        this.LIZJ.LJIIJ(1.27f, -3.66f, 3.6f, -5.58f, 5.99f, -7.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.55f, 0.93f);
        this.LIZJ.LJIJ(14.3f);
        this.LIZJ.LJIIIZ(10.7f, 10.7f, false, false, -0.05f, 0.81f);
        this.LIZJ.LJIIJ(-0.03f, 0.55f, -0.04f, 1.32f, 0.0f, 2.2f);
        this.LIZJ.LJIIJ(0.1f, 1.77f, 0.42f, 3.8f, 1.25f, 5.26f);
        this.LIZJ.LJIIJ(1.99f, 3.52f, 1.36f, 8.05f, -0.42f, 11.64f);
        this.LIZJ.LJIIJ(-1.0f, 2.02f, -2.96f, 3.84f, -5.31f, 5.14f);
        this.LIZJ.LIZJ(16.86f, 16.86f, false, true, 24.0f, 41.5f);
        this.LIZJ.LJIIJ(-7.46f, 0.0f, -12.4f, -4.3f, -14.07f, -8.25f);
        this.LIZJ.LJIIJ(-1.14f, -2.7f, -1.08f, -5.9f, -0.44f, -8.58f);
        this.LIZJ.LJIIJ(0.32f, -1.34f, 0.8f, -2.6f, 1.38f, -3.63f);
        this.LIZJ.LJIIIZ(6.41f, 6.41f, false, true, 2.12f, -2.4f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.48f, 0.62f);
        this.LIZJ.LJIIJ(0.44f, 1.76f, 0.9f, 2.99f, 1.43f, 3.76f);
        this.LIZJ.LJIIJ(0.2f, 0.3f, 0.41f, 0.51f, 0.62f, 0.67f);
        this.LIZJ.LJIIJ(0.12f, -4.19f, 0.84f, -7.36f, 2.29f, -9.98f);
        this.LIZJ.LJIIJ(1.59f, -2.9f, 4.0f, -5.0f, 7.15f, -7.05f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, true, 27.0f, 6.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.5f, 9.53f);
        this.LIZJ.LJIIIZ(10.9f, 10.9f, false, false, -4.02f, 6.56f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.62f, 0.55f);
        this.LIZJ.LJIIJ(-1.74f, -1.45f, -2.68f, -3.44f, -3.14f, -6.02f);
        this.LIZJ.LJIIIZ(38.02f, 38.02f, false, true, -0.31f, -7.79f);
        this.LIZJ.LJIIIZ(16.06f, 16.06f, false, false, -4.85f, 5.21f);
        this.LIZJ.LJ(19.19f, 17.16f, 18.5f, 20.34f, 18.5f, 25.0f);
        C32856Cuy.yn(this.LIZJ);
        this.LIZJ.LJIIJ(-1.4f, 0.0f, -2.46f, -0.71f, -3.24f, -1.85f);
        this.LIZJ.LIZJ(10.6f, 10.6f, false, true, 13.0f, 21.4f);
        this.LIZJ.LJIIL(-0.39f, 0.62f);
        this.LIZJ.LJIIJ(-0.47f, 0.85f, -0.89f, 1.93f, -1.17f, 3.12f);
        this.LIZJ.LJIIJ(-0.58f, 2.4f, -0.6f, 5.14f, 0.33f, 7.34f);
        this.LIZJ.LJIIJ(1.35f, 3.19f, 5.56f, 7.02f, 12.23f, 7.02f);
        this.LIZJ.LJIIJ(2.46f, 0.0f, 4.96f, -0.74f, 7.07f, -1.9f);
        this.LIZJ.LJIIJ(2.11f, -1.18f, 3.72f, -2.74f, 4.5f, -4.29f);
        this.LIZJ.LJIIJ(1.6f, -3.26f, 2.0f, -7.04f, 0.46f, -9.76f);
        this.LIZJ.LJIIJ(-1.06f, -1.88f, -1.4f, -4.3f, -1.5f, -6.15f);
        this.LIZJ.LJIIIZ(25.5f, 25.5f, false, true, -0.03f, -1.24f);
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
