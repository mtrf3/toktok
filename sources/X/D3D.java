package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3D extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D3D() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -14298266);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(30.9f, 25.61f);
        dij.LJIIJ(-0.32f, -0.16f, -1.9f, -0.94f, -2.2f, -1.05f);
        dij.LJIIJ(-0.3f, -0.1f, -0.51f, -0.16f, -0.73f, 0.16f);
        dij.LJIIJ(-0.21f, 0.33f, -0.83f, 1.05f, -1.02f, 1.27f);
        dij.LJIIJ(-0.19f, 0.21f, -0.37f, 0.24f, -0.7f, 0.08f);
        dij.LJIIJ(-0.32f, -0.16f, -1.36f, -0.5f, -2.6f, -1.6f);
        dij.LJIIIZ(9.72f, 9.72f, false, true, -1.79f, -2.23f);
        dij.LJIIJ(-0.18f, -0.33f, -0.02f, -0.5f, 0.15f, -0.66f);
        dij.LJIIJ(0.14f, -0.15f, 0.32f, -0.38f, 0.48f, -0.57f);
        dij.LJIIJ(0.16f, -0.19f, 0.21f, -0.32f, 0.32f, -0.54f);
        dij.LJIIJ(0.11f, -0.21f, 0.06f, -0.4f, -0.02f, -0.56f);
        dij.LJIIJ(-0.09f, -0.16f, -0.73f, -1.75f, -1.0f, -2.4f);
        dij.LJIIJ(-0.26f, -0.63f, -0.53f, -0.54f, -0.72f, -0.55f);
        dij.LJIIL(-0.62f, -0.01f);
        dij.LJIIJ(-0.22f, 0.0f, -0.57f, 0.08f, -0.86f, 0.4f);
        dij.LJIIJ(-0.3f, 0.32f, -1.13f, 1.1f, -1.13f, 2.7f);
        dij.LJIIJ(0.0f, 1.58f, 1.15f, 3.11f, 1.32f, 3.33f);
        dij.LJIIJ(0.16f, 0.21f, 2.27f, 3.47f, 5.5f, 4.87f);
        dij.LJIIJ(0.77f, 0.33f, 1.38f, 0.53f, 1.84f, 0.68f);
        dij.LJIIJ(0.78f, 0.24f, 1.48f, 0.21f, 2.04f, 0.13f);
        dij.LJIIJ(0.62f, -0.1f, 1.9f, -0.78f, 2.17f, -1.54f);
        dij.LJIIJ(0.27f, -0.75f, 0.27f, -1.4f, 0.2f, -1.53f);
        dij.LJIIJ(-0.09f, -0.13f, -0.3f, -0.22f, -0.63f, -0.38f);
        dij.LIZLLL();
        dij.LJIILIIL(-5.88f, 8.04f);
        dij.LJIIJ(-1.93f, 0.0f, -3.82f, -0.52f, -5.47f, -1.5f);
        dij.LJIIL(-0.39f, -0.23f);
        dij.LJIIL(-4.06f, 1.06f);
        dij.LJIIL(1.08f, -3.95f);
        dij.LJIIL(-0.25f, -0.41f);
        dij.LJIIIZ(10.75f, 10.75f, false, true, 16.68f, -13.3f);
        dij.LJIIIZ(10.74f, 10.74f, false, true, -7.59f, 18.32f);
        dij.LIZLLL();
        dij.LJIILIIL(9.13f, -19.86f);
        dij.LJIIIZ(12.93f, 12.93f, false, false, -20.32f, 15.58f);
        dij.LJII(12.0f, 36.04f);
        dij.LJIIL(6.84f, -1.8f);
        dij.LJIIIZ(12.93f, 12.93f, false, false, 15.3f, -20.47f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
