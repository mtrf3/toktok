package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0Q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0Q() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16733196);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(11.19f, 23.0f);
        dij.LJIIJ(0.0f, -6.23f, 5.96f, -10.9f, 12.81f, -10.9f);
        dij.LJIIJ(6.85f, 0.0f, 12.81f, 4.67f, 12.81f, 10.9f);
        dij.LJIIJ(0.0f, 3.65f, -1.83f, 6.68f, -4.04f, 8.98f);
        dij.LJIIIZ(26.04f, 26.04f, false, true, -6.92f, 4.98f);
        dij.LIZJ(1.28f, 1.28f, false, true, 24.0f, 35.82f);
        dij.LJIILL(-1.93f);
        dij.LJIIJ(-6.85f, 0.0f, -12.81f, -4.67f, -12.81f, -10.9f);
        dij.LIZLLL();
        dij.LJIILIIL(7.36f, 1.92f);
        C32856Cuy.ib(dij);
        dij.LJIILIIL(5.45f, 0.0f);
        C32856Cuy.ib(dij);
        dij.LJIILIIL(7.05f, -1.6f);
        dij.LJIIIZ(1.6f, 1.6f, true, false, -3.2f, 0.0f);
        dij.LJIIIZ(1.6f, 1.6f, false, false, 3.2f, 0.0f);
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
