package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D32 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D32() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -13318311);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(6.1f, 31.79f);
        dij.LJIIJ(0.62f, 0.0f, 1.1f, -0.48f, 1.1f, -1.07f);
        dij.LJIIJ(0.0f, -9.68f, 7.55f, -17.6f, 16.8f, -17.6f);
        dij.LJIIJ(9.26f, 0.0f, 16.8f, 7.92f, 16.8f, 17.6f);
        dij.LJIIJ(0.0f, 0.59f, 0.5f, 1.07f, 1.1f, 1.07f);
        dij.LJIIJ(0.62f, 0.0f, 1.1f, -0.48f, 1.1f, -1.07f);
        dij.LJ(43.0f, 19.86f, 34.47f, 11.0f, 24.0f, 11.0f);
        dij.LJIILLIIL(5.0f, 19.86f, 5.0f, 30.72f, true);
        dij.LJIIJ(0.0f, 0.59f, 0.5f, 1.07f, 1.1f, 1.07f);
        dij.LIZLLL();
        dij.LJIILIIL(17.92f, -8.34f);
        dij.LJIIJ(2.07f, 0.0f, 3.84f, -1.79f, 3.84f, -4.1f);
        dij.LJIIIZ(3.9f, 3.9f, false, false, -3.84f, -3.97f);
        dij.LJIIIZ(3.93f, 3.93f, false, false, -3.85f, 4.0f);
        dij.LJIIIZ(3.97f, 3.97f, false, false, 3.85f, 4.07f);
        dij.LIZLLL();
        dij.LJIIIIZZ(12.0f, 31.78f);
        dij.LJIIJ(0.6f, 0.0f, 1.1f, -0.48f, 1.1f, -1.06f);
        dij.LJIIJ(0.0f, -4.05f, 2.14f, -7.76f, 5.52f, -9.78f);
        dij.LJIIIZ(5.1f, 5.1f, false, true, -0.1f, -2.37f);
        dij.LJIIIZ(13.4f, 13.4f, false, false, -7.63f, 12.15f);
        dij.LJIIJ(0.0f, 0.58f, 0.49f, 1.06f, 1.1f, 1.06f);
        dij.LIZLLL();
        dij.LJIILIIL(24.0f, 0.0f);
        dij.LJIIJ(0.62f, 0.0f, 1.1f, -0.48f, 1.1f, -1.06f);
        dij.LJIIJ(0.0f, -5.23f, -2.99f, -9.95f, -7.58f, -12.13f);
        dij.LJIIJ(0.15f, 0.78f, 0.1f, 1.61f, -0.11f, 2.38f);
        dij.LJIIJ(3.38f, 2.0f, 5.5f, 5.7f, 5.5f, 9.75f);
        dij.LJIIJ(0.0f, 0.58f, 0.5f, 1.06f, 1.1f, 1.06f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.67f, 32.0f);
        dij.LJIIJJI(12.68f);
        dij.LJIIJ(1.06f, 0.0f, 1.7f, -0.48f, 1.7f, -1.3f);
        dij.LJIIJ(0.0f, -2.36f, -3.1f, -5.62f, -8.03f, -5.62f);
        dij.LJIIJ(-4.94f, 0.0f, -8.06f, 3.26f, -8.06f, 5.63f);
        dij.LJIIJ(0.0f, 0.81f, 0.65f, 1.29f, 1.71f, 1.29f);
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
