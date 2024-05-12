package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4L extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4L() {
        this.LIZJ.LJIIIIZZ(22.11f, 24.78f);
        this.LIZJ.LJIIIZ(1.85f, 1.85f, false, true, 3.19f, 0.0f);
        this.LIZJ.LJIIL(1.38f, 2.36f);
        this.LIZJ.LJIIL(2.68f, 0.58f);
        this.LIZJ.LJIIJ(1.38f, 0.3f, 1.92f, 1.97f, 0.98f, 3.02f);
        this.LIZJ.LJIIL(-1.83f, 2.03f);
        this.LIZJ.LJIIL(0.28f, 2.72f);
        this.LIZJ.LJIIIZ(1.84f, 1.84f, false, true, -2.58f, 1.86f);
        this.LIZJ.LJIIL(-2.5f, -1.1f);
        this.LIZJ.LJIIL(-2.52f, 1.1f);
        this.LIZJ.LJIIIZ(1.84f, 1.84f, false, true, -2.57f, -1.86f);
        this.LIZJ.LJIIL(0.27f, -2.72f);
        this.LIZJ.LJIIL(-1.82f, -2.03f);
        this.LIZJ.LJIIIZ(1.83f, 1.83f, false, true, 0.98f, -3.02f);
        this.LIZJ.LJIIL(2.68f, -0.58f);
        this.LIZJ.LJIIL(1.38f, -2.36f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.8f, 4.1f);
        this.LIZJ.LJIIJ(-0.26f, 0.44f, -0.7f, 0.76f, -1.2f, 0.87f);
        this.LIZJ.LJIIL(-1.53f, 0.33f);
        this.LIZJ.LJIIL(1.05f, 1.16f);
        this.LIZJ.LJIIJ(0.34f, 0.38f, 0.5f, 0.9f, 0.45f, 1.4f);
        this.LIZJ.LJIIL(-0.15f, 1.56f);
        this.LIZJ.LJIIL(1.43f, -0.63f);
        this.LIZJ.LJIIJ(0.47f, -0.2f, 1.01f, -0.2f, 1.49f, 0.0f);
        this.LIZJ.LJIIL(1.43f, 0.63f);
        this.LIZJ.LJIIL(-0.16f, -1.55f);
        this.LIZJ.LJIIJ(-0.05f, -0.52f, 0.12f, -1.03f, 0.46f, -1.41f);
        this.LIZJ.LJIIL(1.05f, -1.16f);
        this.LIZJ.LJIIL(-1.53f, -0.33f);
        this.LIZJ.LJIIJ(-0.51f, -0.11f, -0.95f, -0.43f, -1.2f, -0.87f);
        this.LIZJ.LJIIL(-0.8f, -1.35f);
        this.LIZJ.LJIIL(-0.78f, 1.35f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.03f, 11.58f);
        dij.LJIIIZ(2.7f, 2.7f, false, true, 2.3f, -3.05f);
        dij.LJIIL(32.2f, -4.5f);
        dij.LJIIIZ(2.7f, 2.7f, false, true, 3.07f, 2.3f);
        dij.LJIIL(0.75f, 5.34f);
        dij.LJIIIZ(2.7f, 2.7f, false, true, -2.3f, 3.04f);
        dij.LJII(17.1f, 17.92f);
        dij.LJIIJJI(23.18f);
        dij.LJIIIZ(2.7f, 2.7f, false, true, 2.71f, 2.7f);
        dij.LJIJ(41.3f);
        dij.LJIIIZ(2.7f, 2.7f, false, true, -2.71f, 2.7f);
        dij.LJI(7.77f);
        dij.LJIIIZ(2.7f, 2.7f, false, true, -2.71f, -2.7f);
        dij.LJIJ(20.62f);
        dij.LJIIJ(0.0f, -0.74f, 0.3f, -1.42f, 0.8f, -1.9f);
        dij.LJIIIZ(2.69f, 2.69f, false, true, -1.08f, -1.8f);
        I9A.LIZIZ(dij, -0.75f, -5.34f, 4.2f, 3.95f);
        dij.LJIIL(30.42f, -4.25f);
        dij.LJIIL(-0.5f, -3.57f);
        dij.LJIIL(-30.42f, 4.26f);
        dij.LJIIL(0.5f, 3.56f);
        dij.LIZLLL();
        dij.LJIILIIL(0.44f, 5.99f);
        dij.LJIJ(40.4f);
        dij.LJI(39.4f);
        dij.LJIJ(21.52f);
        dij.LJI(8.67f);
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
