package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D42 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D42() {
        this.LIZJ.LJIIIIZZ(31.0f, 9.1f);
        this.LIZJ.LJIIJ(0.0f, -0.3f, -0.26f, -0.54f, -0.55f, -0.49f);
        this.LIZJ.LJIIJ(-1.37f, 0.23f, -2.7f, 0.76f, -3.79f, 1.28f);
        this.LIZJ.LIZJ(22.93f, 22.93f, false, false, 24.0f, 11.43f);
        this.LIZJ.LJIIIZ(21.8f, 21.8f, false, false, -2.66f, -1.54f);
        this.LIZJ.LJIIJ(-1.81f, -0.88f, -4.35f, -1.78f, -6.58f, -1.22f);
        this.LIZJ.LJIIJ(-3.32f, 0.84f, -5.93f, 3.1f, -6.74f, 6.76f);
        this.LIZJ.LJIIJ(-0.56f, 2.54f, 0.08f, 4.9f, 0.89f, 6.85f);
        this.LIZJ.LJIIJ(0.36f, 0.88f, 0.78f, 1.71f, 1.14f, 2.45f);
        this.LIZJ.LJIIL(0.11f, 0.22f);
        this.LIZJ.LJIIJ(0.4f, 0.81f, 0.72f, 1.46f, 0.89f, 2.0f);
        this.LIZJ.LJIIIZ(55.39f, 55.39f, false, true, 1.38f, 5.4f);
        this.LIZJ.LJIIJ(0.23f, 1.05f, 0.46f, 2.07f, 0.7f, 2.98f);
        this.LIZJ.LJIIJ(0.33f, 1.2f, 0.7f, 2.33f, 1.23f, 3.23f);
        this.LIZJ.LJIIIZ(4.28f, 4.28f, false, false, 2.32f, 2.03f);
        this.LIZJ.LJIIJ(0.85f, 0.29f, 1.6f, -0.07f, 2.14f, -0.5f);
        this.LIZJ.LJIIIZ(7.08f, 7.08f, false, false, 1.44f, -1.77f);
        this.LIZJ.LJIIJ(0.87f, -1.4f, 1.69f, -3.32f, 2.39f, -5.18f);
        this.LIZJ.LJIIJ(0.17f, -0.47f, 0.68f, -0.8f, 1.35f, -0.8f);
        this.LIZJ.LJIILJJIL(1.18f, 0.33f, 1.35f, 0.8f, true);
        this.LIZJ.LJIIJ(0.7f, 1.86f, 1.52f, 3.78f, 2.39f, 5.18f);
        this.LIZJ.LJIIJ(0.43f, 0.7f, 0.9f, 1.33f, 1.44f, 1.77f);
        this.LIZJ.LJIIJ(0.53f, 0.43f, 1.29f, 0.79f, 2.14f, 0.5f);
        this.LIZJ.LJIIJ(2.06f, -0.68f, 2.81f, -2.68f, 3.38f, -4.87f);
        this.LIZJ.LJIIJ(0.2f, -0.75f, 0.37f, -1.55f, 0.57f, -2.4f);
        this.LIZJ.LJIIJ(0.4f, -1.84f, 0.88f, -3.93f, 1.68f, -6.36f);
        this.LIZJ.LJIIJ(0.3f, -0.92f, 0.72f, -1.78f, 1.16f, -2.65f);
        this.LIZJ.LJIIL(0.34f, -0.65f);
        this.LIZJ.LJIIL(0.5f, -0.95f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, false, -0.44f, -0.71f);
        this.LIZJ.LJIIJJI(-1.14f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.44f, 0.27f);
        this.LIZJ.LJIIL(-0.22f, 0.41f);
        this.LIZJ.LJIIL(-0.37f, 0.71f);
        this.LIZJ.LJIIJ(-0.46f, 0.9f, -0.93f, 1.87f, -1.29f, 2.94f);
        this.LIZJ.LJIIIZ(68.17f, 68.17f, false, false, -1.77f, 6.68f);
        this.LIZJ.LJIIJ(-0.18f, 0.82f, -0.35f, 1.56f, -0.51f, 2.2f);
        this.LIZJ.LJIIJ(-0.59f, 2.26f, -1.14f, 3.16f, -2.07f, 3.48f);
        this.LIZJ.LJIIIZ(0.73f, 0.73f, false, true, -0.26f, -0.16f);
        this.LIZJ.LJIIIZ(5.2f, 5.2f, false, true, -1.0f, -1.26f);
        this.LIZJ.LJIIJ(-0.76f, -1.23f, -1.53f, -3.0f, -2.22f, -4.84f);
        this.LIZJ.LIZJ(3.36f, 3.36f, false, false, 24.0f, 30.35f);
        this.LIZJ.LJIIJ(-1.26f, 0.0f, -2.68f, 0.63f, -3.22f, 2.08f);
        this.LIZJ.LJIIIZ(29.46f, 29.46f, false, true, -2.22f, 4.84f);
        this.LIZJ.LJIIIZ(5.2f, 5.2f, false, true, -1.0f, 1.26f);
        this.LIZJ.LJIIIZ(0.73f, 0.73f, false, true, -0.26f, 0.16f);
        this.LIZJ.LJIIJ(-0.44f, -0.15f, -0.83f, -0.5f, -1.21f, -1.14f);
        this.LIZJ.LJIIJ(-0.39f, -0.67f, -0.71f, -1.58f, -1.02f, -2.74f);
        this.LIZJ.LJIIJ(-0.24f, -0.87f, -0.45f, -1.82f, -0.68f, -2.87f);
        this.LIZJ.LJIIL(-0.24f, -1.04f);
        this.LIZJ.LJIIJ(-0.33f, -1.43f, -0.7f, -2.98f, -1.2f, -4.56f);
        this.LIZJ.LJIIJ(-0.22f, -0.7f, -0.6f, -1.5f, -1.0f, -2.28f);
        this.LIZJ.LJIIL(-0.1f, -0.22f);
        this.LIZJ.LJIIJ(-0.38f, -0.74f, -0.76f, -1.51f, -1.1f, -2.33f);
        this.LIZJ.LJIIJ(-0.74f, -1.8f, -1.2f, -3.7f, -0.77f, -5.65f);
        this.LIZJ.LJIIJ(0.62f, -2.82f, 2.58f, -4.57f, 5.26f, -5.25f);
        this.LIZJ.LJIIJ(1.5f, -0.37f, 3.46f, 0.23f, 5.22f, 1.08f);
        this.LIZJ.LJIIIZ(20.92f, 20.92f, false, true, 2.9f, 1.72f);
        this.LIZJ.LJIIL(0.03f, 0.03f);
        C32856Cuy.Z(this.LIZJ);
        this.LIZJ.LJIIL(0.02f, 0.02f);
        this.LIZJ.LJIIL(2.6f, 1.74f);
        this.LIZJ.LJIIJ(0.24f, 0.15f, 0.55f, 0.09f, 0.7f, -0.14f);
        this.LIZJ.LJIIL(0.56f, -0.83f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.14f, -0.7f);
        this.LIZJ.LJIIL(-1.34f, -0.88f);
        this.LIZJ.LJIIJ(0.48f, -0.3f, 1.08f, -0.64f, 1.74f, -0.96f);
        this.LIZJ.LJIIIZ(12.6f, 12.6f, false, true, 3.03f, -1.07f);
        this.LIZJ.LJIIIZ(0.53f, 0.53f, false, false, 0.43f, -0.5f);
        this.LIZJ.LJIJ(9.08f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.28f, 29.6f);
        this.LIZJ.LJIIJJI(-0.02f);
        this.LIZJ.LJIIJJI(0.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-13.44f, 0.0f);
        this.LIZJ.LJIIJJI(0.02f);
        this.LIZJ.LJIIJJI(-0.02f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(38.0f, 9.0f);
        dij.LJIIJ(0.33f, 0.0f, 0.47f, 0.55f, 0.64f, 1.24f);
        dij.LJIIJ(0.19f, 0.74f, 0.41f, 1.63f, 0.95f, 2.17f);
        dij.LJIILJJIL(1.43f, 0.76f, 2.17f, 0.95f, true);
        dij.LJIIJ(0.69f, 0.17f, 1.24f, 0.31f, 1.24f, 0.64f);
        dij.LJIILJJIL(-0.55f, 0.47f, -1.24f, 0.64f, true);
        dij.LJIIJ(-0.74f, 0.19f, -1.63f, 0.41f, -2.17f, 0.95f);
        dij.LJIILJJIL(-0.76f, 1.43f, -0.95f, 2.17f, true);
        dij.LJIIJ(-0.17f, 0.69f, -0.31f, 1.24f, -0.64f, 1.24f);
        dij.LJIILJJIL(-0.47f, -0.55f, -0.64f, -1.24f, true);
        dij.LJIIJ(-0.19f, -0.74f, -0.41f, -1.63f, -0.95f, -2.17f);
        dij.LJIILJJIL(-1.43f, -0.76f, -2.17f, -0.95f, true);
        dij.LJIIJ(-0.69f, -0.17f, -1.24f, -0.31f, -1.24f, -0.64f);
        dij.LJIILJJIL(0.55f, -0.47f, 1.24f, -0.64f, true);
        dij.LJIIJ(0.74f, -0.19f, 1.63f, -0.41f, 2.17f, -0.95f);
        dij.LJIILJJIL(0.76f, -1.43f, 0.95f, -2.17f, true);
        dij.LJIIJ(0.17f, -0.69f, 0.31f, -1.24f, 0.64f, -1.24f);
        dij.LIZLLL();
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
