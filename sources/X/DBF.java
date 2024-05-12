package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBF extends AbstractC39455Fe7 {
    public DBF() {
        C32856Cuy.R(this.LIZJ);
        this.LIZJ.LJIIJ(4.24f, 0.0f, 7.82f, 1.19f, 10.58f, 3.28f);
        this.LIZJ.LJIIL(-0.8f, 0.8f);
        this.LIZJ.LJIIIZ(25.5f, 25.5f, false, false, -1.92f, 2.15f);
        this.LIZJ.LJ(24.8f, 31.79f, 22.17f, 31.0f, 19.0f, 31.0f);
        C32856Cuy.Sl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(41.56f, 25.56f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -2.88f, 0.6f);
        this.LIZJ.LJIIJ(-0.19f, 0.15f, -0.39f, 0.36f, -0.56f, 0.52f);
        this.LIZJ.LJIIL(-5.53f, 5.54f);
        this.LIZJ.LJIIIZ(41.98f, 41.98f, false, false, -2.79f, 2.94f);
        this.LIZJ.LJIIIZ(22.0f, 22.0f, false, false, -3.14f, 5.12f);
        this.LIZJ.LJIIJ(-0.44f, 1.0f, -0.77f, 2.03f, -1.35f, 3.82f);
        this.LIZJ.LJIIL(-0.04f, 0.1f);
        C32856Cuy.j1(this.LIZJ);
        this.LIZJ.LJIIIZ(2.22f, 2.22f, false, false, -0.13f, 1.14f);
        this.LIZJ.LJIIIZ(2.2f, 2.2f, false, false, 2.73f, 1.8f);
        this.LIZJ.LJIIL(0.27f, -0.07f);
        this.LIZJ.LJIIL(0.12f, -0.04f);
        this.LIZJ.LJIIJ(1.79f, -0.58f, 2.82f, -0.92f, 3.81f, -1.36f);
        this.LIZJ.LJIIIZ(22.0f, 22.0f, false, false, 5.13f, -3.14f);
        this.LIZJ.LJIIJ(0.83f, -0.69f, 1.6f, -1.45f, 2.93f, -2.78f);
        this.LIZJ.LJIIL(5.54f, -5.54f);
        this.LIZJ.LJIIJ(0.17f, -0.17f, 0.37f, -0.37f, 0.53f, -0.56f);
        this.LIZJ.LJIIJ(0.19f, -0.22f, 0.44f, -0.56f, 0.6f, -1.03f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -0.6f, -2.87f);
        this.LIZJ.LJIIJ(-0.16f, -0.2f, -0.36f, -0.4f, -0.53f, -0.57f);
        this.LIZJ.LJIIL(-2.52f, -2.52f);
        this.LIZJ.LJIIJ(-0.17f, -0.16f, -0.37f, -0.37f, -0.56f, -0.53f);
        this.LIZJ.LJIIIZ(3.02f, 3.02f, false, false, -1.03f, -0.59f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.97f, 6.16f);
        this.LIZJ.LJIIL(-5.14f, 5.14f);
        this.LIZJ.LJIIIZ(40.16f, 40.16f, false, true, -2.73f, 2.6f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, -4.44f, 2.68f);
        this.LIZJ.LJIIL(0.1f, -0.25f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 2.58f, -4.2f);
        this.LIZJ.LJIIJ(0.54f, -0.66f, 1.16f, -1.29f, 2.6f, -2.72f);
        this.LIZJ.LJIIL(5.14f, -5.14f);
        this.LIZJ.LJIIL(1.89f, 1.89f);
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
