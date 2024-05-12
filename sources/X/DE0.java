package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE0 extends AbstractC39455Fe7 {
    public DE0() {
        this.LIZJ.LJIIIIZZ(23.06f, 36.9f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.45f);
        this.LIZJ.LJIILJJIL(0.74f, -0.08f, 1.12f, -0.48f, false);
        this.LIZJ.LJIIJ(0.35f, -0.36f, 0.34f, -1.06f, 0.34f, -1.06f);
        this.LIZJ.LJIILJJIL(-0.05f, -3.23f, 1.47f, -3.7f, true);
        this.LIZJ.LJIIJ(1.5f, -0.47f, 3.44f, 3.12f, 5.49f, 4.5f);
        this.LIZJ.LJIIJ(1.55f, 1.05f, 2.72f, 0.82f, 2.72f, 0.82f);
        this.LIZJ.LJIIL(5.48f, -0.08f);
        this.LIZJ.LJIILJJIL(2.86f, -0.17f, 1.5f, -2.38f, false);
        this.LIZJ.LJIIJ(-0.1f, -0.19f, -0.79f, -1.64f, -4.07f, -4.64f);
        this.LIZJ.LJIIJ(-3.43f, -3.13f, -2.97f, -2.62f, 1.17f, -8.04f);
        this.LIZJ.LJIIJ(2.51f, -3.3f, 3.52f, -5.32f, 3.2f, -6.18f);
        this.LIZJ.LJIIJ(-0.3f, -0.82f, -2.15f, -0.6f, -2.15f, -0.6f);
        this.LIZJ.LJIIL(-6.16f, 0.03f);
        this.LIZJ.LJIILJJIL(-0.46f, -0.06f, -0.8f, 0.14f, false);
        this.LIZJ.LJIIJ(-0.33f, 0.2f, -0.54f, 0.65f, -0.54f, 0.65f);
        this.LIZJ.LJIILLIIL(33.3f, 18.43f, 32.0f, 20.6f, true);
        this.LIZJ.LJIIJ(-2.74f, 4.58f, -3.84f, 4.82f, -4.29f, 4.54f);
        this.LIZJ.LJIIJ(-1.04f, -0.67f, -0.78f, -2.67f, -0.78f, -4.09f);
        this.LIZJ.LJIIJ(0.0f, -4.44f, 0.68f, -6.3f, -1.34f, -6.77f);
        this.LIZJ.LJIIIZ(10.7f, 10.7f, false, false, -2.87f, -0.28f);
        this.LIZJ.LJIIJ(-2.2f, -0.03f, -4.07f, 0.0f, -5.12f, 0.51f);
        this.LIZJ.LJIIJ(-0.7f, 0.34f, -1.24f, 1.09f, -0.91f, 1.13f);
        this.LIZJ.LJIIJ(0.4f, 0.06f, 1.33f, 0.25f, 1.82f, 0.9f);
        this.LIZJ.LJIIJ(0.63f, 0.85f, 0.6f, 2.75f, 0.6f, 2.75f);
        this.LIZJ.LJIILJJIL(0.37f, 5.23f, -0.84f, 5.88f, true);
        this.LIZJ.LJIIJ(-0.83f, 0.44f, -1.97f, -0.47f, -4.42f, -4.63f);
        this.LIZJ.LJIIJ(-1.25f, -2.13f, -2.2f, -4.48f, -2.2f, -4.48f);
        this.LIZJ.LJIILJJIL(-0.18f, -0.44f, -0.5f, -0.68f, true);
        this.LIZJ.LJIIJ(-0.4f, -0.28f, -0.96f, -0.37f, -0.96f, -0.37f);
        this.LIZJ.LJIIL(-5.85f, 0.03f);
        this.LIZJ.LJIILJJIL(-0.88f, 0.03f, -1.2f, 0.4f, false);
        this.LIZJ.LJIIJ(-0.3f, 0.34f, -0.03f, 1.03f, -0.03f, 1.03f);
        this.LIZJ.LJIILLIIL(7.7f, 27.03f, 12.9f, 32.35f, true);
        this.LIZJ.LJIIJ(4.76f, 4.87f, 10.17f, 4.55f, 10.17f, 4.55f);
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
