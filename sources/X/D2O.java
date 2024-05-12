package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2O extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D2O() {
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -15876365);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(13.63f, 14.9f);
        dij.LJIIIZ(2.1f, 2.1f, false, false, -2.09f, 2.09f);
        C32856Cuy.E9(dij);
        dij.LJIIJ(0.0f, 1.16f, 0.94f, 2.1f, 2.1f, 2.1f);
        dij.LJIIJJI(20.73f);
        dij.LJIIIZ(2.1f, 2.1f, false, false, 2.09f, -2.1f);
        C32856Cuy.o9(dij);
        dij.LJIIIZ(2.1f, 2.1f, false, false, -2.1f, -2.1f);
        dij.LJI(13.64f);
        dij.LIZLLL();
        dij.LJIILIIL(20.1f, 2.48f);
        dij.LJII(24.0f, 24.11f);
        dij.LJIIL(-9.72f, -6.73f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, -0.82f, 0.43f);
        dij.LJIILL(1.28f);
        dij.LJII(24.0f, 26.4f);
        dij.LJIIL(10.54f, -7.3f);
        dij.LJIILL(-1.28f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, -0.82f, -0.43f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
