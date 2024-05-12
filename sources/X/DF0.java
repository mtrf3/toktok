package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF0 extends AbstractC39455Fe7 {
    public DF0() {
        this.LIZJ.LJIIIIZZ(16.37f, 13.08f);
        this.LIZJ.LJIIJ(0.19f, 0.74f, -0.77f, 1.21f, -1.24f, 0.6f);
        this.LIZJ.LJII(13.0f, 10.96f);
        this.LIZJ.LJIIIZ(1.42f, 1.42f, true, true, 2.5f, -1.22f);
        this.LIZJ.LJIIL(0.86f, 3.35f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.34f, 2.23f);
        this.LIZJ.LJIIJ(0.74f, 0.2f, 0.66f, 1.28f, -0.1f, 1.38f);
        this.LIZJ.LJIIL(-3.42f, 0.46f);
        this.LIZJ.LJIIIZ(1.42f, 1.42f, true, true, 0.2f, -2.77f);
        this.LIZJ.LJIIL(3.32f, 0.93f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.04f, -6.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.07f, 0.1f);
        this.LIZJ.LJIIL(6.45f, 4.89f);
        this.LIZJ.LJIIL(7.66f, -2.71f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.27f, 1.27f);
        this.LIZJ.LJIIL(-2.69f, 7.6f);
        this.LIZJ.LJIIL(4.96f, 6.38f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.81f, 1.62f);
        this.LIZJ.LJIIL(-8.12f, -0.2f);
        this.LIZJ.LJIIL(-4.59f, 6.66f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.78f, -0.28f);
        this.LIZJ.LJIIL(-2.0f, -6.63f);
        this.LIZJ.LJIIL(-11.43f, 11.54f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, 0.0f);
        p.LJIIL(-0.72f, -0.7f);
        p.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, -0.7f);
        this.LIZJ.LJII(20.07f, 26.4f);
        this.LIZJ.LJIIL(-6.7f, -1.95f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.28f, -1.78f);
        this.LIZJ.LJIIL(6.67f, -4.59f);
        this.LIZJ.LJIIL(-0.23f, -8.05f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.54f, -0.92f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.52f, 2.95f);
        this.LIZJ.LJIIL(0.19f, 6.51f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.44f, 0.85f);
        this.LIZJ.LJIIL(-5.38f, 3.7f);
        this.LIZJ.LJIIL(6.28f, 1.83f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.68f, 0.68f);
        this.LIZJ.LJIIL(1.88f, 6.24f);
        this.LIZJ.LJIIL(3.71f, -5.38f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.85f, -0.44f);
        this.LIZJ.LJIIL(6.56f, 0.16f);
        this.LIZJ.LJIIL(-4.0f, -5.15f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.15f, -0.95f);
        this.LIZJ.LJIIL(2.17f, -6.14f);
        this.LIZJ.LJIIL(-6.19f, 2.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, -0.15f);
        this.LIZJ.LJIIL(-5.23f, -3.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.28f, 19.27f);
        this.LIZJ.LJIIJ(-0.74f, -0.2f, -1.23f, 0.76f, -0.63f, 1.23f);
        this.LIZJ.LJIIL(2.7f, 2.16f);
        this.LIZJ.LJIIIZ(1.42f, 1.42f, true, false, 1.26f, -2.47f);
        this.LIZJ.LJIIL(-3.33f, -0.92f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.27f, 2.3f);
        this.LIZJ.LJIIJ(-0.2f, -0.74f, -1.27f, -0.68f, -1.38f, 0.07f);
        this.LIZJ.LJIIL(-0.52f, 3.42f);
        this.LIZJ.LJIIIZ(1.42f, 1.42f, true, false, 2.77f, -0.14f);
        this.LIZJ.LJIIL(-0.87f, -3.35f);
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
