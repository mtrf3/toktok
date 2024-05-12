package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D33 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D33() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -50314);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIILIIL(20.72f, 16.68f);
        dij.LJIIL(1.44f, -5.47f);
        dij.LJIIJ(0.5f, -1.86f, 3.18f, -1.7f, 3.44f, 0.2f);
        dij.LJIIL(0.68f, 4.81f);
        dij.LJIIJ(0.05f, 0.38f, 0.42f, 0.63f, 0.79f, 0.53f);
        dij.LJIIL(4.82f, -1.23f);
        dij.LJIIIZ(3.56f, 3.56f, false, true, 4.44f, 3.4f);
        dij.LJIIL(0.14f, 10.17f);
        dij.LJIIIZ(3.56f, 3.56f, false, true, -2.77f, 3.52f);
        dij.LJIIL(-8.84f, 2.01f);
        dij.LJIIIZ(2.21f, 2.21f, false, true, -2.66f, -1.74f);
        dij.LJIIL(-1.73f, -9.16f);
        dij.LJIIJ(-0.44f, -2.34f, -0.36f, -4.74f, 0.25f, -7.04f);
        dij.LIZLLL();
        dij.LJIIIIZZ(16.14f, 20.37f);
        dij.LJIIJ(0.78f, -0.12f, 1.5f, 0.4f, 1.63f, 1.18f);
        dij.LJII(19.8f, 34.3f);
        dij.LJIIJ(0.13f, 0.78f, -0.4f, 1.5f, -1.18f, 1.63f);
        dij.LJIIL(-1.84f, 0.3f);
        dij.LJIIJ(-1.3f, 0.2f, -2.51f, -0.68f, -2.72f, -1.98f);
        dij.LJIIL(-1.73f, -10.86f);
        dij.LJIIJ(-0.2f, -1.3f, 0.68f, -2.5f, 1.97f, -2.72f);
        dij.LJIIL(1.84f, -0.29f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        this.LIZ.add(LIZIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
