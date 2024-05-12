package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D39 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D39() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -3927552);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIILIIL(13.89f, 21.88f);
        dij.LJIIL(6.77f, 3.46f);
        dij.LJIIJ(1.3f, 0.67f, 1.1f, 2.68f, -0.31f, 3.05f);
        dij.LJIIL(-7.3f, 1.9f);
        dij.LJIIIZ(1.48f, 1.48f, false, true, -1.26f, -0.23f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, -0.66f, -1.16f);
        dij.LJIIJ(-0.22f, -2.05f, -0.01f, -4.12f, 0.61f, -6.08f);
        dij.LJIIIZ(1.64f, 1.64f, false, true, 0.87f, -0.98f);
        dij.LJIIIZ(1.49f, 1.49f, false, true, 1.28f, 0.04f);
        dij.LIZLLL();
        dij.LJIILIIL(2.99f, 17.04f);
        dij.LJIIIZ(13.2f, 13.2f, false, false, 5.4f, 2.29f);
        dij.LJIIIZ(1.48f, 1.48f, false, false, 1.23f, -0.34f);
        dij.LJIIIZ(1.61f, 1.61f, false, false, 0.57f, -1.2f);
        dij.LJIIL(0.27f, -7.9f);
        dij.LJIIJ(0.04f, -1.51f, -1.74f, -2.27f, -2.7f, -1.14f);
        dij.LJII(16.6f, 36.5f);
        dij.LJIIIZ(1.65f, 1.65f, false, false, -0.38f, 1.28f);
        dij.LJIIIZ(1.68f, 1.68f, false, false, 0.66f, 1.14f);
        dij.LIZLLL();
        dij.LJIILIIL(9.87f, -7.83f);
        dij.LJIIL(4.0f, 6.7f);
        dij.LJIIIZ(1.6f, 1.6f, false, false, 1.06f, 0.74f);
        dij.LJIIIZ(1.49f, 1.49f, false, false, 1.24f, -0.35f);
        dij.LJIIIZ(14.06f, 14.06f, false, false, 3.58f, -4.81f);
        dij.LJIIIZ(1.7f, 1.7f, false, false, -0.36f, -1.9f);
        dij.LJIIIZ(1.55f, 1.55f, false, false, -0.56f, -0.35f);
        dij.LJIIL(-7.16f, -2.44f);
        dij.LJIIJ(-1.38f, -0.46f, -2.57f, 1.12f, -1.8f, 2.41f);
        dij.LIZLLL();
        dij.LJIILIIL(10.07f, -9.41f);
        dij.LJIIIZ(14.05f, 14.05f, false, false, -3.42f, -4.94f);
        dij.LJIIIZ(1.53f, 1.53f, false, false, -1.22f, -0.4f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, -1.09f, 0.71f);
        dij.LJIIL(-4.21f, 6.55f);
        dij.LJIIJ(-0.8f, 1.26f, 0.32f, 2.9f, 1.71f, 2.47f);
        dij.LJIIL(7.24f, -2.17f);
        dij.LJIIIZ(1.63f, 1.63f, false, false, 1.12f, -1.55f);
        dij.LJIIJ(0.0f, -0.23f, -0.04f, -0.46f, -0.12f, -0.67f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.2f, 6.92f);
        dij.LJIIIZ(1.56f, 1.56f, false, false, -0.8f, 0.98f);
        dij.LJIIIZ(1.7f, 1.7f, false, false, 0.13f, 1.3f);
        dij.LJIIL(7.07f, 12.85f);
        dij.LJIIJ(0.8f, 1.44f, 2.9f, 0.84f, 2.9f, -0.82f);
        dij.LJIJ(6.4f);
        dij.LJIIIZ(1.68f, 1.68f, false, false, -0.5f, -1.2f);
        dij.LJIIIZ(1.53f, 1.53f, false, false, -1.17f, -0.43f);
        dij.LJIIJ(-2.64f, 0.22f, -5.23f, 0.95f, -7.63f, 2.15f);
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
