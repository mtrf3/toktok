package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33244D2y extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33244D2y() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(20.18f, 11.25f);
        dij.LJIIJ(1.5f, 0.0f, 0.51f, 4.57f, 2.43f, 6.5f);
        dij.LJIIJ(1.92f, 1.9f, 6.49f, 0.89f, 6.49f, 2.43f);
        dij.LJIIJ(0.0f, 1.53f, -4.57f, 0.51f, -6.5f, 2.43f);
        dij.LJIIJ(-1.9f, 1.92f, -0.96f, 6.49f, -2.43f, 6.49f);
        dij.LJIIJ(-1.46f, 0.0f, -0.51f, -4.57f, -2.43f, -6.5f);
        dij.LJIIJ(-1.92f, -1.9f, -6.49f, -0.92f, -6.49f, -2.43f);
        dij.LJIIJ(0.0f, -1.5f, 4.57f, -0.51f, 6.5f, -2.43f);
        dij.LJIIJ(1.9f, -1.92f, 0.91f, -6.49f, 2.43f, -6.49f);
        dij.LIZLLL();
        dij.LJIILIIL(10.62f, 13.6f);
        dij.LJIIJ(0.94f, 0.0f, 0.59f, 2.81f, 1.86f, 4.09f);
        dij.LJIIJ(1.28f, 1.27f, 4.09f, 0.92f, 4.09f, 1.86f);
        dij.LJIIJ(0.0f, 0.94f, -2.81f, 0.59f, -4.09f, 1.86f);
        dij.LJIIJ(-1.27f, 1.28f, -0.9f, 4.09f, -1.86f, 4.09f);
        dij.LJIIJ(-0.95f, 0.0f, -0.59f, -2.81f, -1.86f, -4.09f);
        dij.LJIIJ(-1.28f, -1.27f, -4.09f, -0.9f, -4.09f, -1.86f);
        dij.LJIIJ(0.0f, -0.95f, 2.81f, -0.59f, 4.09f, -1.86f);
        dij.LJIIJ(1.27f, -1.28f, 0.92f, -4.09f, 1.86f, -4.09f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.88f, 7.0f);
        dij.LJIIJ(-3.8f, 0.0f, -5.71f, 0.0f, -7.17f, 0.74f);
        dij.LJIIIZ(6.8f, 6.8f, false, false, -2.97f, 2.97f);
        dij.LJ(7.0f, 12.17f, 7.0f, 14.07f, 7.0f, 17.88f);
        dij.LJIILL(12.24f);
        dij.LJIIJ(0.0f, 3.8f, 0.0f, 5.71f, 0.74f, 7.17f);
        dij.LJIIIZ(6.8f, 6.8f, false, false, 2.97f, 2.97f);
        dij.LJIIJ(1.46f, 0.74f, 3.36f, 0.74f, 7.17f, 0.74f);
        dij.LJIIJJI(12.24f);
        dij.LJIIJ(3.8f, 0.0f, 5.71f, 0.0f, 7.17f, -0.74f);
        dij.LJIIIZ(6.8f, 6.8f, false, false, 2.97f, -2.97f);
        dij.LJIIJ(0.74f, -1.46f, 0.74f, -3.36f, 0.74f, -7.17f);
        dij.LJIJ(17.88f);
        dij.LJIIJ(0.0f, -3.8f, 0.0f, -5.71f, -0.74f, -7.17f);
        dij.LJIIIZ(6.8f, 6.8f, false, false, -2.97f, -2.97f);
        dij.LJ(35.83f, 7.0f, 33.93f, 7.0f, 30.12f, 7.0f);
        dij.LJI(17.88f);
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
