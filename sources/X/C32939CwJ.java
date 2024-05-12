package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32939CwJ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32939CwJ() {
        this.LIZJ.LJIIIIZZ(17.5f, 14.0f);
        C32856Cuy.Lg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(21.5f, 17.5f);
        C32856Cuy.om(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.0f, 6.5f);
        dij.LIZJ(2.5f, 2.5f, false, true, 10.5f, 4.0f);
        C32856Cuy.LJIILLIIL(dij);
        dij.LIZJ(2.5f, 2.5f, false, true, 29.0f, 6.5f);
        C32856Cuy.e(dij);
        dij.LJIIJJI(8.5f);
        dij.LIZJ(2.5f, 2.5f, false, true, 40.0f, 9.5f);
        C32856Cuy.LJLLLLLL(dij);
        C32856Cuy.eg(dij);
        dij.LJIIJJI(-23.0f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, -2.5f, -2.5f);
        C32856Cuy.D9(dij);
        C32856Cuy.rb(dij);
        dij.LIZJ(2.5f, 2.5f, false, true, 8.0f, 27.5f);
        C32856Cuy.LJJJZ(dij);
        dij.LJIIIIZZ(15.0f, 30.0f);
        C32856Cuy.LJLIIL(dij);
        C32856Cuy.LJIJJ(dij);
        C32856Cuy.h9(dij);
        C32856Cuy.LJIIIZ(dij);
        dij.LJIILL(17.5f);
        C32856Cuy.eg(dij);
        C32856Cuy.LLLLILI(dij);
        dij.LJIIIIZZ(11.0f, 7.0f);
        dij.LJIILL(20.0f);
        dij.LJIIJJI(15.0f);
        dij.LJIJ(7.0f);
        C32856Cuy.LLLLIIL(dij);
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
