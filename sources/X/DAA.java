package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAA extends AbstractC39455Fe7 {
    public DAA() {
        this.LIZJ.LJIIIIZZ(9.0f, 27.18f);
        this.LIZJ.LJIIJ(0.0f, -1.84f, 0.75f, -4.1f, 2.11f, -6.58f);
        this.LIZJ.LJIIIZ(43.34f, 43.34f, false, true, 5.11f, -7.19f);
        this.LIZJ.LJIIIZ(53.18f, 53.18f, false, true, 5.53f, -5.57f);
        this.LIZJ.LIZJ(20.6f, 20.6f, false, true, 24.0f, 6.14f);
        this.LIZJ.LJIIL(0.25f, 0.15f);
        this.LIZJ.LJIIJ(0.51f, 0.33f, 1.2f, 0.85f, 2.0f, 1.55f);
        this.LIZJ.LJIIIZ(53.18f, 53.18f, false, true, 5.53f, 5.57f);
        this.LIZJ.LJIIIZ(43.34f, 43.34f, false, true, 5.1f, 7.19f);
        this.LIZJ.LJIIJ(1.37f, 2.48f, 2.12f, 4.74f, 2.12f, 6.58f);
        this.LIZJ.LJ(39.0f, 35.34f, 32.3f, 42.0f, 24.0f, 42.0f);
        this.LIZJ.LJIILLIIL(9.0f, 35.34f, 9.0f, 27.18f, true);
        this.LIZJ.LIZLLL();
        C32856Cuy.p7(this.LIZJ);
        this.LIZJ.LJIIJ(-0.58f, 0.0f, -1.09f, 0.2f, -1.38f, 0.34f);
        this.LIZJ.LJIIJ(-0.34f, 0.16f, -0.7f, 0.37f, -1.05f, 0.6f);
        this.LIZJ.LJIIJ(-0.71f, 0.46f, -1.54f, 1.1f, -2.42f, 1.86f);
        C32856Cuy.LJJJJJ(this.LIZJ);
        this.LIZJ.LJIIJ(-0.88f, -0.76f, -1.7f, -1.4f, -2.42f, -1.86f);
        this.LIZJ.LJIIJ(-0.35f, -0.23f, -0.7f, -0.44f, -1.05f, -0.6f);
        this.LIZJ.LJIIJ(-0.29f, -0.13f, -0.8f, -0.34f, -1.38f, -0.34f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.87f, 23.06f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.11f, -1.4f);
        this.LIZJ.LJIIL(-1.52f, -1.31f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.4f, 0.1f);
        this.LIZJ.LJIIL(-4.01f, 4.68f);
        this.LIZJ.LJIIL(-4.48f, -4.1f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.82f, 0.11f);
        this.LIZJ.LJIIL(-5.32f, 5.77f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.06f, 1.41f);
        this.LIZJ.LJIIL(1.46f, 1.36f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.42f, -0.06f);
        this.LIZJ.LJIIL(3.97f, -4.3f);
        this.LIZJ.LJIIL(4.53f, 4.15f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.87f, -0.17f);
        this.LIZJ.LJIIL(5.35f, -6.24f);
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
