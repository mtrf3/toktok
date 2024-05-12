package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33130CzO extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33130CzO() {
        this.LIZJ.LJIIIIZZ(27.0f, 29.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -1.5f, 2.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(4.2f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -2.0f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-4.2f);
        this.LIZJ.LIZJ(2.5f, 2.5f, true, true, 27.0f, 29.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.0f, 15.4f);
        C32856Cuy.ll(dij);
        dij.LJIILL(0.15f);
        C32856Cuy.wn(dij);
        dij.LJIILL(-0.15f);
        C32856Cuy.Lc(dij);
        dij.LJIILL(5.1f);
        dij.LJIIJJI(-2.5f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, 3.0f);
        dij.LJIILL(16.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        dij.LJIIJJI(22.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        C32856Cuy.b1(dij);
        C32856Cuy.gl(dij);
        C32856Cuy.u6(dij);
        dij.LJIILL(-5.1f);
        dij.LIZLLL();
        dij.LJIILIIL(17.5f, 7.1f);
        C32856Cuy.T5(dij);
        dij.LJIIJJI(-22.0f);
        C32856Cuy.xn(dij);
        C32856Cuy.b1(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(22.0f);
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
