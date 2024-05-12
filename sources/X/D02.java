package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D02 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D02() {
        this.LIZJ.LJIIIIZZ(17.0f, 14.5f);
        C32856Cuy.LLZL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIILL(-2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p3.LJIIJJI(2.0f);
        C32856Cuy.di(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(33.0f, 17.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, true, 4.0f, 0.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -4.0f, 0.0f);
        this.LIZJ.LIZLLL();
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(31.0f, 19.5f);
        C32856Cuy.Sm(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.0f, 5.5f);
        dij.LJIIIZ(10.0f, 10.0f, false, false, -10.0f, 10.0f);
        dij.LJIILL(19.37f);
        dij.LJIIIZ(7.63f, 7.63f, false, false, 14.5f, 3.33f);
        dij.LJIIL(2.63f, -5.42f);
        dij.LJIIIZ(0.2f, 0.2f, false, true, 0.18f, -0.1f);
        dij.LJIIJJI(5.38f);
        dij.LJIIIZ(0.2f, 0.2f, false, true, 0.18f, 0.1f);
        dij.LJIIL(2.63f, 5.42f);
        dij.LIZJ(7.63f, 7.63f, false, false, 44.0f, 34.87f);
        dij.LJIJ(15.5f);
        dij.LJIIIZ(10.0f, 10.0f, false, false, -10.0f, -10.0f);
        C32856Cuy.LLLLIL(dij);
        dij.LJIILIIL(-6.0f, 10.0f);
        C32856Cuy.Yg(dij);
        dij.LJIIJJI(20.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, 6.0f);
        dij.LJIILL(19.37f);
        dij.LJIIIZ(3.63f, 3.63f, false, true, -6.9f, 1.58f);
        dij.LJIIL(-2.63f, -5.41f);
        dij.LJIIIZ(4.2f, 4.2f, false, false, -3.78f, -2.37f);
        dij.LJIIJJI(-5.38f);
        dij.LJIIIZ(4.2f, 4.2f, false, false, -3.78f, 2.37f);
        dij.LJIIL(-2.63f, 5.41f);
        dij.LIZJ(3.63f, 3.63f, false, true, 8.0f, 34.87f);
        dij.LJIJ(15.5f);
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
