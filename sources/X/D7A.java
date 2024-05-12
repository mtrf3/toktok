package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7A extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D7A() {
        this.LIZJ.LJIILIIL(19.65f, 19.96f);
        this.LIZJ.LJIIL(0.97f, -3.88f);
        this.LIZJ.LJIIJ(-1.16f, 0.08f, -1.99f, 0.67f, -2.23f, 1.66f);
        this.LIZJ.LJIIJ(-0.22f, 0.86f, 0.33f, 1.56f, 1.26f, 2.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(21.98f, 25.32f);
        this.LIZJ.LJIIL(-1.14f, 4.57f);
        this.LIZJ.LJIIJ(1.67f, 0.02f, 2.58f, -0.86f, 2.82f, -1.84f);
        this.LIZJ.LJIIJ(0.28f, -1.12f, -0.5f, -1.96f, -1.68f, -2.73f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.2f, 18.8f);
        dij.LJ(6.82f, 7.5f, 16.66f, 0.4f, 25.91f, 2.57f);
        dij.LJIIJ(9.26f, 2.16f, 14.95f, 12.86f, 12.31f, 24.18f);
        dij.LJIIJ(-2.63f, 11.32f, -12.47f, 18.4f, -21.73f, 16.24f);
        dij.LJ(7.24f, 40.83f, 1.55f, 30.12f, 4.2f, 18.81f);
        dij.LIZLLL();
        dij.LJIIIIZZ(25.3f, 12.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.72f, -1.22f);
        dij.LJIIL(-1.5f, -0.38f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.22f, 0.73f);
        dij.LJIIL(-0.5f, 2.04f);
        dij.LJIIJ(-3.24f, -0.23f, -5.7f, 1.39f, -6.35f, 3.99f);
        dij.LJIIJ(-0.8f, 3.25f, 1.36f, 5.0f, 3.75f, 6.37f);
        dij.LJIIL(-1.34f, 5.39f);
        dij.LJIIIZ(8.16f, 8.16f, false, true, -2.57f, -2.23f);
        dij.LJIIJ(-0.39f, -0.5f, -1.13f, -0.65f, -1.61f, -0.25f);
        dij.LJIIL(-0.86f, 0.73f);
        dij.LJIIIZ(0.93f, 0.93f, false, false, -0.2f, 1.24f);
        dij.LJIIIZ(9.99f, 9.99f, false, false, 4.5f, 3.48f);
        dij.LJIIL(-0.36f, 1.43f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.73f, 1.21f);
        dij.LJIIL(1.5f, 0.38f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.22f, -0.73f);
        dij.LJIIL(0.34f, -1.39f);
        dij.LJIIJ(3.95f, 0.46f, 6.26f, -1.51f, 6.94f, -4.22f);
        dij.LJIIJ(0.87f, -3.5f, -1.64f, -5.35f, -4.2f, -6.78f);
        dij.LJIIL(1.2f, -4.78f);
        dij.LJIIJ(0.8f, 0.44f, 1.54f, 1.02f, 2.15f, 1.74f);
        dij.LJIIJ(0.39f, 0.46f, 1.09f, 0.59f, 1.56f, 0.2f);
        dij.LJIIL(0.83f, -0.66f);
        dij.LJIIJ(0.4f, -0.32f, 0.5f, -0.89f, 0.19f, -1.29f);
        dij.LJIIIZ(9.64f, 9.64f, false, false, -3.98f, -2.99f);
        dij.LJIIL(0.5f, -2.02f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(43.33f, 31.02f);
        dij2.LJ(39.74f, 41.14f, 30.4f, 47.19f, 21.86f, 45.26f);
        dij2.LJIIJ(8.47f, -0.97f, 16.02f, -8.2f, 18.32f, -18.07f);
        dij2.LJIIJ(1.8f, -7.75f, -0.02f, -15.48f, -4.36f, -20.68f);
        dij2.LJIIJ(7.71f, 3.95f, 11.08f, 14.46f, 7.51f, 24.51f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
