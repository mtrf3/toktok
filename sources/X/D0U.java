package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0U extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0U() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -50314);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.84f, 27.85f);
        dij.LJIIJ(-0.52f, 0.0f, -0.92f, -0.23f, -1.24f, -0.7f);
        dij.LJIIIZ(3.64f, 3.64f, false, true, -0.55f, -2.01f);
        dij.LJIILL(-4.37f);
        dij.LIZJ(7.91f, 7.91f, false, false, 24.0f, 13.0f);
        dij.LJIIIZ(7.91f, 7.91f, false, false, -8.05f, 7.77f);
        dij.LJIILL(4.37f);
        dij.LJIIJ(0.0f, 0.8f, -0.2f, 1.52f, -0.55f, 2.02f);
        dij.LJIIJ(-0.32f, 0.46f, -0.72f, 0.69f, -1.24f, 0.69f);
        dij.LJIIJ(-0.64f, 0.0f, -1.16f, 0.5f, -1.16f, 1.1f);
        dij.LJIIJ(0.0f, 0.6f, 0.52f, 1.1f, 1.16f, 1.1f);
        dij.LJIIJJI(19.68f);
        dij.LJIIJ(0.64f, 0.0f, 1.16f, -0.5f, 1.16f, -1.1f);
        dij.LJIIJ(0.0f, -0.6f, -0.52f, -1.1f, -1.16f, -1.1f);
        dij.LIZLLL();
        dij.LJIIIIZZ(20.7f, 32.22f);
        dij.LJIIJ(0.21f, -0.32f, 0.58f, -0.52f, 0.98f, -0.52f);
        dij.LJIIJJI(4.64f);
        dij.LJIIJ(0.4f, 0.0f, 0.77f, 0.2f, 0.98f, 0.52f);
        dij.LJIIJ(0.21f, 0.33f, 0.23f, 0.73f, 0.05f, 1.07f);
        dij.LJIIL(-1.03f, -0.49f);
        dij.LJIIL(1.03f, 0.5f);
        dij.LJIIL(-0.01f, 0.01f);
        dij.LJIIIZ(1.17f, 1.17f, false, true, -0.06f, 0.1f);
        dij.LJIIL(-0.16f, 0.22f);
        dij.LJIIJ(-0.13f, 0.17f, -0.32f, 0.37f, -0.59f, 0.58f);
        dij.LIZJ(4.1f, 4.1f, false, true, 24.0f, 35.0f);
        dij.LJIIIZ(4.1f, 4.1f, false, true, -2.53f, -0.8f);
        dij.LJIIIZ(3.3f, 3.3f, false, true, -0.81f, -0.89f);
        C32856Cuy.LJJJJL(dij);
        C32856Cuy.nb(dij);
        dij.LJIIL(1.03f, -0.5f);
        dij.LJIIL(-1.03f, 0.5f);
        dij.LJIIJ(-0.18f, -0.35f, -0.16f, -0.75f, 0.05f, -1.08f);
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
