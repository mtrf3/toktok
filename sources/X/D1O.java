package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1O extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D1O() {
        C32856Cuy.P0(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.5f, 13.25f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.75f, -0.75f);
        dij.LJIIJJI(-1.5f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.75f, 0.75f);
        dij.LJIILL(9.25f);
        dij.LJIIJJI(-9.25f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.75f, 0.75f);
        C32856Cuy.n1(dij);
        C32856Cuy.Go(dij);
        dij.LJIIJJI(9.25f);
        dij.LJIILL(9.25f);
        C32856Cuy.Go(dij);
        C32856Cuy.g0(dij);
        C32856Cuy.Ya(dij);
        dij.LJIJ(25.5f);
        dij.LJIIJJI(9.25f);
        C32856Cuy.Ya(dij);
        C32856Cuy.LJJJJZI(dij);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.75f, -0.75f);
        dij.LJI(25.5f);
        dij.LJIILL(-9.25f);
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
