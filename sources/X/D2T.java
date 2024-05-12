package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2T extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D2T() {
        this.LIZJ.LJIIIIZZ(30.4f, 22.25f);
        this.LIZJ.LJIIIZ(8.76f, 8.76f, false, true, -2.6f, 2.32f);
        this.LIZJ.LJIIJ(-2.4f, 1.45f, -4.35f, 1.5f, -6.01f, 0.92f);
        this.LIZJ.LJIIJ(-1.6f, -0.56f, -3.07f, -1.78f, -4.42f, -3.31f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, false, -0.7f, -0.05f);
        this.LIZJ.LJIIL(-1.5f, 1.39f);
        this.LIZJ.LJIIJ(-0.2f, 0.2f, -0.23f, 0.52f, -0.04f, 0.74f);
        this.LIZJ.LJIIJ(1.53f, 1.77f, 3.42f, 3.42f, 5.71f, 4.23f);
        this.LIZJ.LJIIJ(2.54f, 0.9f, 5.38f, 0.68f, 8.45f, -1.19f);
        this.LIZJ.LJIIIZ(11.67f, 11.67f, false, false, 3.62f, -3.33f);
        this.LIZJ.LJIIIZ(0.52f, 0.52f, false, false, -0.14f, -0.72f);
        this.LIZJ.LJII(31.1f, 22.1f);
        this.LIZJ.LJIIJ(-0.23f, -0.16f, -0.54f, -0.09f, -0.7f, 0.15f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 4.5f);
        dij.LJ(13.5f, 4.5f, 4.5f, 11.64f, 4.5f, 21.0f);
        dij.LJIILJJIL(9.0f, 16.5f, 19.5f, 16.5f, true);
        dij.LJIIJJI(0.5f);
        C32856Cuy.N9(dij);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 2.17f, 1.34f);
        dij.LJIIIZ(40.15f, 40.15f, false, false, 10.66f, -7.67f);
        dij.LJIIJ(3.4f, -3.54f, 6.17f, -8.14f, 6.17f, -13.67f);
        dij.LJIIJ(0.0f, -9.36f, -9.0f, -16.5f, -19.5f, -16.5f);
        dij.LIZLLL();
        dij.LJIIIIZZ(7.5f, 21.0f);
        dij.LJIIJ(0.0f, -7.21f, 7.12f, -13.5f, 16.5f, -13.5f);
        dij.LJIIJ(9.38f, 0.0f, 16.5f, 6.29f, 16.5f, 13.5f);
        dij.LJIIJ(0.0f, 4.47f, -2.23f, 8.37f, -5.33f, 11.58f);
        dij.LJIIIZ(35.74f, 35.74f, false, true, -7.67f, 5.9f);
        dij.LJIJ(34.5f);
        C32856Cuy.A6(dij);
        dij.LJIIJ(-9.38f, 0.0f, -16.5f, -6.29f, -16.5f, -13.5f);
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
