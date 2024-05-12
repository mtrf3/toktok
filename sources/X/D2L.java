package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2L extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D2L() {
        this.LIZJ.LJIIIIZZ(33.0f, 36.0f);
        C32856Cuy.ta(this.LIZJ);
        C32856Cuy.J0(this.LIZJ);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, true, true, 0.0f, -24.0f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, false, true, 0.0f, 24.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(31.0f, 23.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(3.0f);
        dij.LJIIJJI(3.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.I(dij);
        dij.LIZLLL();
        C32856Cuy.kf(dij);
        C32856Cuy.Cm(dij);
        dij.LJI(5.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(4.0f, 33.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.ic(dij);
        dij.LJI(5.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij.LJIILL(-2.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
