package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3B extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D3B() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -14835214);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(38.2f, 13.53f);
        dij.LJIIJ(-0.81f, 0.55f, -2.68f, 1.35f, -3.6f, 1.35f);
        dij.LIZJ(5.62f, 5.62f, false, false, 30.43f, 13.0f);
        dij.LJIIJ(-3.2f, 0.0f, -5.78f, 2.73f, -5.78f, 6.1f);
        dij.LJIIJ(0.0f, 0.46f, 0.05f, 0.92f, 0.15f, 1.35f);
        dij.LJIIIZ(15.73f, 15.73f, false, true, -11.91f, -6.32f);
        dij.LJIIIZ(6.3f, 6.3f, false, false, 1.75f, 8.05f);
        dij.LJIIJ(-0.68f, 0.05f, -1.94f, -0.08f, -2.52f, -0.69f);
        dij.LJIIIZ(5.84f, 5.84f, false, false, 4.45f, 5.96f);
        dij.LJIIJ(-0.68f, 0.38f, -1.88f, 0.27f, -2.4f, 0.19f);
        dij.LJIIJ(0.18f, 1.8f, 2.56f, 4.13f, 5.16f, 4.13f);
        dij.LJIIJ(-0.93f, 1.14f, -4.42f, 3.19f, -8.33f, 2.54f);
        dij.LJ(13.66f, 36.0f, 16.76f, 37.0f, 20.04f, 37.0f);
        dij.LJIIJ(9.32f, 0.0f, 16.55f, -7.97f, 16.16f, -17.8f);
        C32856Cuy.q9(dij);
        dij.LJIIJ(0.85f, -0.6f, 1.99f, -1.7f, 2.8f, -3.12f);
        dij.LJIIJ(-0.47f, 0.28f, -1.89f, 0.83f, -3.2f, 0.96f);
        dij.LJIIIZ(6.44f, 6.44f, false, false, 2.4f, -3.3f);
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
