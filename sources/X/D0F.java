package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0F extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0F() {
        this.LIZJ.LJIIIIZZ(10.0f, 16.0f);
        C32856Cuy.mn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LLLFF(this.LIZJ);
        C32856Cuy.X(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(3.0f, 15.0f);
        C32856Cuy.Gn(dij);
        dij.LJIILL(18.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        dij.LJI(8.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        dij.LJIJ(15.0f);
        dij.LIZLLL();
        C32856Cuy.Kn(dij);
        dij.LJIILL(18.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.an(dij);
        dij.LJIJ(15.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.W6(dij);
        dij.LJIIIIZZ(43.0f, 28.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 0.0f, -8.0f);
        dij.LJIILL(8.0f);
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
