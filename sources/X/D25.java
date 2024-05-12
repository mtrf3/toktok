package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D25 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D25() {
        this.LIZJ.LJIIIIZZ(11.9f, 38.7f);
        this.LIZJ.LJIIJ(-1.45f, -1.93f, -3.28f, -3.98f, -5.06f, -4.94f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, true, -0.09f, -0.27f);
        this.LIZJ.LJIIL(0.5f, -0.98f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, true, 0.26f, -0.09f);
        this.LIZJ.LJIIJ(2.11f, 1.12f, 4.13f, 3.43f, 5.59f, 5.38f);
        this.LIZJ.LJIIIZ(42.95f, 42.95f, false, true, 2.44f, 3.65f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, true, -0.07f, 0.28f);
        this.LIZJ.LJIIL(-0.96f, 0.53f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, true, -0.27f, -0.07f);
        this.LIZJ.LJIIIZ(15.81f, 15.81f, false, false, -0.56f, -0.91f);
        this.LIZJ.LJIIJ(-0.43f, -0.68f, -1.04f, -1.6f, -1.78f, -2.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.1f, 38.7f);
        this.LIZJ.LJIIJ(1.45f, -1.93f, 3.28f, -3.98f, 5.06f, -4.94f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, false, 0.09f, -0.27f);
        this.LIZJ.LJIIL(-0.5f, -0.98f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, false, -0.26f, -0.09f);
        this.LIZJ.LJIIJ(-2.11f, 1.12f, -4.13f, 3.43f, -5.59f, 5.38f);
        this.LIZJ.LJIIIZ(42.92f, 42.92f, false, false, -2.45f, 3.65f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, false, 0.07f, 0.28f);
        this.LIZJ.LJII(33.0f, 42.0f);
        this.LIZJ.LJIIL(0.48f, 0.27f);
        this.LIZJ.LJIIJ(0.1f, 0.06f, 0.22f, 0.02f, 0.27f, -0.07f);
        this.LIZJ.LJIIL(0.57f, -0.92f);
        this.LIZJ.LJIIJ(0.43f, -0.68f, 1.04f, -1.6f, 1.78f, -2.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.18f, 9.21f);
        this.LIZJ.LJ(13.18f, 11.42f, 12.0f, 15.0f, 12.0f, 20.47f);
        this.LIZJ.LJIIJ(0.0f, 4.35f, 1.4f, 8.53f, 3.62f, 11.6f);
        this.LIZJ.LJ(17.85f, 35.13f, 20.82f, 37.0f, 24.0f, 37.0f);
        this.LIZJ.LJIIJ(3.17f, 0.0f, 6.15f, -1.86f, 8.38f, -4.94f);
        this.LIZJ.LIZJ(20.07f, 20.07f, false, false, 36.0f, 20.46f);
        this.LIZJ.LJIIJ(0.0f, -5.46f, -1.18f, -9.04f, -3.18f, -11.25f);
        this.LIZJ.LJ(30.85f, 7.03f, 27.92f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LJIILJJIL(-6.85f, 1.03f, -8.82f, 3.21f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.49f, -1.34f);
        this.LIZJ.LJ(16.17f, 5.12f, 19.74f, 4.0f, 24.0f, 4.0f);
        this.LIZJ.LJIIJ(4.26f, 0.0f, 7.83f, 1.12f, 10.31f, 3.87f);
        this.LIZJ.LJIIJ(2.46f, 2.74f, 3.69f, 6.9f, 3.69f, 12.6f);
        this.LIZJ.LJIIJ(0.0f, 4.76f, -1.52f, 9.35f, -4.0f, 12.77f);
        this.LIZJ.LJ(31.52f, 36.65f, 28.0f, 39.0f, 24.0f, 39.0f);
        this.LIZJ.LJIILJJIL(-7.52f, -2.35f, -10.0f, -5.76f, true);
        this.LIZJ.LJIIJ(-2.48f, -3.42f, -4.0f, -8.01f, -4.0f, -12.77f);
        this.LIZJ.LJIIJ(0.0f, -5.7f, 1.23f, -9.86f, 3.69f, -12.6f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.74f, 27.51f);
        dij.LJIIJ(0.59f, 0.54f, 1.36f, 0.99f, 2.26f, 0.99f);
        dij.LJIIJ(0.9f, 0.0f, 1.67f, -0.45f, 2.26f, -0.99f);
        dij.LJIIJ(0.22f, -0.2f, 0.42f, -0.4f, 0.6f, -0.63f);
        C32856Cuy.r5(dij);
        dij.LJIIJ(0.24f, 0.14f, 0.31f, 0.45f, 0.14f, 0.67f);
        dij.LJIIIZ(7.44f, 7.44f, false, true, -0.96f, 1.06f);
        C32856Cuy.LLLZL(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
