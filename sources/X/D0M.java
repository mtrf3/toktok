package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0M extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0M() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(3.0f, 10.0f);
        C32856Cuy.oj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(13.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        p3.LJIILL(28.0f);
        p3.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(7.0f);
        p4.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        C32856Cuy.LLZLI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILIIL(4.0f, 1.0f);
        C32856Cuy.o5(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(26.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(8.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIJ(11.0f);
        p7.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(28.0f, 39.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(11.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIJ(27.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.r8(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(12.0f);
        C32856Cuy.u7(dij);
        C32856Cuy.r8(dij);
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
