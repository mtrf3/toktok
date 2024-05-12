package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3K extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3K() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16726295);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(28.54f, 18.85f);
        dij.LJIILL(-5.24f);
        dij.LJIIJ(0.0f, -1.53f, -0.82f, -2.87f, -2.04f, -3.61f);
        dij.LJIIJ(-1.18f, -0.72f, -2.52f, -0.02f, -3.08f, 1.25f);
        dij.LJII(18.0f, 21.38f);
        dij.LJIILL(16.5f);
        dij.LJIIJ(0.0f, 0.2f, 0.17f, 0.37f, 0.38f, 0.37f);
        dij.LJIIJJI(15.86f);
        dij.LJIIJ(1.4f, 0.02f, 2.59f, -1.0f, 2.8f, -2.39f);
        dij.LJIIL(1.93f, -13.4f);
        dij.LJIIIZ(2.82f, 2.82f, false, false, -2.8f, -3.23f);
        dij.LJIIJJI(-7.26f);
        dij.LJIIIZ(0.38f, 0.38f, false, true, -0.37f, -0.38f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.37f, 21.32f);
        dij.LJIIJ(0.21f, 0.0f, 0.38f, 0.17f, 0.38f, 0.38f);
        dij.LJIILL(16.17f);
        dij.LJIIJ(0.0f, 0.21f, -0.17f, 0.38f, -0.37f, 0.38f);
        dij.LJI(12.9f);
        dij.LJIIIZ(3.15f, 3.15f, false, true, -3.16f, -2.77f);
        dij.LJIJ(24.25f);
        dij.LJIIJ(0.21f, -1.6f, 1.57f, -2.95f, 3.16f, -2.93f);
        dij.LJIIJJI(2.46f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
