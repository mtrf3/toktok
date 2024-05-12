package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1H extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D1H() {
        this.LIZJ.LJIIIIZZ(19.47f, 17.57f);
        this.LIZJ.LJIIJ(0.52f, 0.0f, 0.93f, -0.41f, 0.93f, -0.93f);
        this.LIZJ.LJIIJ(0.0f, -1.65f, 2.37f, -2.24f, 3.64f, -2.24f);
        C32856Cuy.Ui(this.LIZJ);
        this.LIZJ.LIZLLL();
        C32856Cuy.ja(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.ue(dij);
        dij.LJIILIIL(-3.0f, 7.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        dij.LJIIJJI(28.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, 3.0f);
        dij.LJIILL(20.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        dij.LJI(14.46f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -4.67f, 2.23f);
        dij.LJII(7.0f, 39.68f);
        C32856Cuy.LLZLL(dij);
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
