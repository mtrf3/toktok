package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D28 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D28() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16733196);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(20.02f, 23.38f);
        dij.LJIIIZ(4.93f, 4.93f, true, false, -0.02f, -9.86f);
        dij.LJIIIZ(4.93f, 4.93f, false, false, 0.02f, 9.86f);
        dij.LIZLLL();
        dij.LJIILIIL(8.62f, 9.88f);
        dij.LJIIIZ(8.63f, 8.63f, false, false, -8.62f, -8.64f);
        dij.LJIIIZ(8.63f, 8.63f, false, false, -8.62f, 8.64f);
        dij.LJIIJ(0.0f, 0.69f, 0.55f, 1.24f, 1.23f, 1.24f);
        dij.LJIIJJI(14.78f);
        dij.LJIIJ(0.68f, 0.0f, 1.23f, -0.55f, 1.23f, -1.24f);
        dij.LIZLLL();
        dij.LJIILIIL(1.66f, 0.0f);
        dij.LJIIJ(0.0f, -2.06f, -0.61f, -3.99f, -1.67f, -5.6f);
        dij.LJIIJ(0.26f, -0.3f, 0.75f, -0.48f, 1.59f, -0.48f);
        dij.LJIIIZ(6.4f, 6.4f, false, true, 6.38f, 6.4f);
        dij.LJIIJ(0.0f, 0.51f, -0.4f, 0.92f, -0.91f, 0.92f);
        C32856Cuy.vb(dij);
        dij.LJIILL(-1.24f);
        dij.LIZLLL();
        dij.LJIILIIL(3.56f, -10.65f);
        dij.LJIIIZ(3.65f, 3.65f, true, true, -7.3f, 0.01f);
        dij.LJIIIZ(3.65f, 3.65f, false, true, 7.3f, 0.0f);
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
