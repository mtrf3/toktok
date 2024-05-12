package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D36 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D36() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -15998821);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(34.54f, 29.72f);
        dij.LJIILL(3.18f);
        dij.LIZJ(2.11f, 2.11f, false, true, 32.23f, 35.0f);
        dij.LJIIIZ(21.0f, 21.0f, false, true, -9.15f, -3.25f);
        dij.LJIIIZ(20.65f, 20.65f, false, true, -6.36f, -6.34f);
        dij.LJIIJ(-1.79f, -2.76f, -2.9f, -5.9f, -3.25f, -9.18f);
        dij.LJIIIZ(2.11f, 2.11f, false, true, 2.1f, -2.3f);
        dij.LJIIJJI(3.19f);
        dij.LJIIIZ(2.12f, 2.12f, false, true, 2.12f, 1.82f);
        dij.LJIIJ(0.13f, 1.01f, 0.38f, 2.01f, 0.74f, 2.97f);
        dij.LJIIJ(0.29f, 0.77f, 0.1f, 1.65f, -0.48f, 2.23f);
        dij.LJIIL(-1.34f, 1.35f);
        dij.LJIIJ(1.5f, 2.64f, 3.7f, 4.84f, 6.36f, 6.34f);
        dij.LJIIL(1.34f, -1.34f);
        dij.LJIIIZ(2.12f, 2.12f, false, true, 2.24f, -0.48f);
        dij.LJIIJ(0.96f, 0.36f, 1.96f, 0.61f, 2.98f, 0.74f);
        dij.LJIIIZ(2.12f, 2.12f, false, true, 1.82f, 2.15f);
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
