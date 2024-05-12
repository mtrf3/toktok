package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1X extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D1X() {
        this.LIZJ.LJIIIIZZ(39.49f, 39.48f);
        this.LIZJ.LJ(37.26f, 41.71f, 33.07f, 43.0f, 24.0f, 43.0f);
        this.LIZJ.LJIILJJIL(-13.27f, -1.3f, -15.5f, -3.52f, true);
        this.LIZJ.LJ(6.3f, 37.26f, 5.0f, 33.06f, 5.0f, 24.0f);
        this.LIZJ.LJIILLIIL(6.3f, 10.74f, 8.52f, 8.52f, true);
        this.LIZJ.LJ(10.74f, 6.29f, 14.95f, 5.0f, 24.0f, 5.0f);
        this.LIZJ.LJIILJJIL(13.25f, 1.3f, 15.48f, 3.52f, true);
        this.LIZJ.LJ(41.7f, 10.74f, 43.0f, 14.94f, 43.0f, 24.0f);
        this.LIZJ.LJIILJJIL(-1.3f, 13.26f, -3.51f, 15.48f, true);
        this.LIZJ.LIZLLL();
        C32856Cuy.LLLLLLIL(this.LIZJ);
        this.LIZJ.LJ(42.17f, 47.0f, 47.0f, 42.16f, 47.0f, 24.0f);
        this.LIZJ.LJIILLIIL(42.17f, 1.0f, 24.0f, 1.0f, true);
        this.LIZJ.LJ(5.85f, 1.0f, 1.0f, 5.84f, 1.0f, 24.0f);
        this.LIZJ.LJIILJJIL(4.84f, 23.0f, 23.0f, 23.0f, true);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(31.47f, 13.46f);
        dij.LJIIL(1.5f, 0.01f);
        dij.LJIIIZ(4.94f, 4.94f, false, true, -5.0f, 4.88f);
        dij.LJIILL(10.7f);
        dij.LJIIJ(0.0f, 0.19f, -0.02f, 0.35f, -0.05f, 0.51f);
        dij.LJIIJ(-0.29f, 2.2f, -2.16f, 4.02f, -5.1f, 4.8f);
        dij.LJIIJ(-3.2f, 0.87f, -6.25f, -0.17f, -6.82f, -2.3f);
        dij.LJIIJ(-0.58f, -2.14f, 1.56f, -4.56f, 4.76f, -5.42f);
        dij.LJIIJ(1.04f, -0.28f, 2.16f, -0.4f, 3.2f, -0.33f);
        C32856Cuy.o9(dij);
        dij.LJIIIZ(3.53f, 3.53f, false, true, 3.6f, -3.54f);
        dij.LJIIJJI(3.91f);
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
