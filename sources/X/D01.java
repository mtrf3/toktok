package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D01 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D01() {
        this.LIZJ.LJIIIIZZ(24.24f, 23.17f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, 0.0f, 1.66f);
        this.LIZJ.LJIIL(-9.09f, 5.24f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, -1.43f, -0.82f);
        this.LIZJ.LJIILL(-10.5f);
        this.LIZJ.LJIIJ(0.0f, -0.73f, 0.8f, -1.2f, 1.43f, -0.83f);
        this.LIZJ.LJIIL(9.1f, 5.25f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.k6(dij);
        dij.LJIILL(-4.21f);
        C32856Cuy.qf(dij);
        C32856Cuy.V6(dij);
        dij.LJIILIIL(-2.0f, 6.0f);
        dij.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        dij.LJIIJJI(22.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        C32856Cuy.j(dij);
        dij.LJI(7.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LJIJ(15.0f);
        dij.LIZLLL();
        dij.LJIILIIL(38.0f, 14.42f);
        dij.LJII(35.08f, 24.0f);
        dij.LJII(43.0f, 18.58f);
        dij.LJIILL(10.84f);
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
