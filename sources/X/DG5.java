package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG5 extends AbstractC39455Fe7 {
    public DG5() {
        this.LIZJ.LJIIIIZZ(3.0f, 17.54f);
        this.LIZJ.LJ(3.0f, 10.32f, 8.36f, 4.5f, 15.86f, 4.5f);
        this.LIZJ.LJIIJ(3.96f, 0.0f, 6.64f, 2.0f, 7.37f, 2.94f);
        this.LIZJ.LJIIJ(0.73f, 0.94f, 0.77f, 1.56f, 0.8f, 1.8f);
        this.LIZJ.LJIIJ(0.02f, 0.56f, -0.02f, 1.11f, -0.05f, 1.67f);
        this.LIZJ.LJIIL(-0.59f, 3.5f);
        this.LIZJ.LJIIL(3.74f, 3.27f);
        this.LIZJ.LJIIJ(0.34f, 0.3f, 0.44f, 0.8f, 0.24f, 1.2f);
        this.LIZJ.LJIIL(-2.42f, 4.84f);
        this.LIZJ.LJIIL(1.7f, 3.72f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.5f, 1.33f);
        this.LIZJ.LJIIL(-1.83f, 0.83f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.32f, -0.5f);
        this.LIZJ.LJIIL(-2.28f, -5.03f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.01f, -0.86f);
        this.LIZJ.LJIIL(2.02f, -4.04f);
        this.LIZJ.LJIIL(-3.06f, -3.05f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.29f, -0.83f);
        this.LIZJ.LJIIL(0.6f, -4.84f);
        this.LIZJ.LJIIJ(0.09f, -1.46f, -3.15f, -1.95f, -4.14f, -1.95f);
        this.LIZJ.LJ(10.69f, 8.5f, 7.0f, 12.4f, 7.0f, 17.54f);
        this.LIZJ.LJIIJ(0.0f, 2.96f, 1.26f, 5.9f, 3.3f, 8.77f);
        this.LIZJ.LJIIIZ(49.16f, 49.16f, false, false, 7.34f, 7.85f);
        this.LIZJ.LJIIJ(1.89f, 1.7f, 3.9f, 3.46f, 6.14f, 4.66f);
        this.LIZJ.LJIIJ(0.2f, 0.1f, 0.23f, 0.11f, 0.43f, 0.0f);
        this.LIZJ.LJIIJ(2.25f, -1.2f, 4.25f, -2.99f, 6.16f, -4.67f);
        this.LIZJ.LJIIIZ(46.9f, 46.9f, false, false, 7.36f, -7.83f);
        this.LIZJ.LJIIJ(2.03f, -2.87f, 3.27f, -5.8f, 3.27f, -8.78f);
        this.LIZJ.LJIIJ(0.0f, -5.14f, -3.69f, -9.04f, -8.86f, -9.04f);
        this.LIZJ.LJIIJ(-0.78f, 0.0f, -1.48f, 0.09f, -2.12f, 0.23f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, -1.29f, -0.67f);
        this.LIZJ.LJIIL(-0.65f, -1.9f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, 0.64f, -1.23f);
        this.LIZJ.LJIIIZ(13.6f, 13.6f, false, true, 3.42f, -0.43f);
        this.LIZJ.LJ(39.64f, 4.5f, 45.0f, 10.32f, 45.0f, 17.54f);
        this.LIZJ.LJIIJ(0.0f, 4.1f, -1.71f, 7.85f, -4.0f, 11.09f);
        this.LIZJ.LJIIIZ(50.8f, 50.8f, false, true, -7.99f, 8.53f);
        this.LIZJ.LJIIJ(-2.3f, 2.01f, -4.9f, 4.53f, -7.83f, 5.62f);
        this.LIZJ.LJIIJ(-0.79f, 0.3f, -1.57f, 0.3f, -2.36f, 0.0f);
        this.LIZJ.LJIIJ(-2.93f, -1.08f, -5.56f, -3.6f, -7.84f, -5.63f);
        this.LIZJ.LJIIIZ(53.04f, 53.04f, false, true, -7.94f, -8.52f);
        this.LIZJ.LJ(4.74f, 25.4f, 3.0f, 21.65f, 3.0f, 17.54f);
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
