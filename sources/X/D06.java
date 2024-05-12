package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D06 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D06() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(15.0f, 27.0f);
        C32856Cuy.W4(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.0f, 34.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(14.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.LLLLJ(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(13.0f, 2.0f);
        C32856Cuy.bh(dij);
        C32856Cuy.LJLLLLLL(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        dij.LJIIJJI(22.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        C32856Cuy.f(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        dij.LJI(13.0f);
        dij.LIZLLL();
        dij.LJIILIIL(22.0f, 4.0f);
        C32856Cuy.LJJJJIZL(dij);
        dij.LJI(13.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.Dj(dij);
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
