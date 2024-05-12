package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32940CwK extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32940CwK() {
        this.LIZJ.LJIIIIZZ(37.5f, 48.7f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, true, false, -3.0f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(9.14f);
        C32856Cuy.I7(this.LIZJ);
        this.LIZJ.LJIJ(48.7f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.0f, 27.0f);
        C32856Cuy.LJJZZIII(dij);
        dij.LJIIIZ(17.0f, 17.0f, false, true, 34.0f, 0.0f);
        dij.LJIILL(8.0f);
        dij.LJIIJJI(8.0f);
        C32856Cuy.Zg(dij);
        dij.LJIILL(30.95f);
        C32856Cuy.Xg(dij);
        C32856Cuy.m6(dij);
        C32856Cuy.Wg(dij);
        C32856Cuy.G9(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, -6.0f);
        dij.LJIIJJI(8.0f);
        dij.LIZLLL();
        dij.LJIILIIL(31.0f, -8.0f);
        dij.LJIIIZ(14.0f, 14.0f, true, false, -28.0f, 0.0f);
        dij.LJIILL(8.0f);
        C32856Cuy.LJJII(dij);
        dij.LJIILL(-8.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(11.0f, 30.0f);
        C32856Cuy.hl(dij);
        dij.LJIILL(30.95f);
        C32856Cuy.jl(dij);
        dij.LJIIJJI(50.0f);
        C32856Cuy.il(dij);
        C32856Cuy.G9(dij);
        C32856Cuy.gl(dij);
        C32856Cuy.LLLLIIL(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
