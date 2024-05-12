package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33013CxV extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33013CxV() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(42.0f, 11.4f);
        dij.LJIILL(25.2f);
        dij.LJIIIZ(3.6f, 3.6f, false, true, -3.6f, 3.6f);
        C32856Cuy.LLLLLIL(dij);
        dij.LIZJ(3.6f, 3.6f, false, true, 6.0f, 36.6f);
        dij.LJIJ(11.4f);
        dij.LJIIIZ(3.6f, 3.6f, false, true, 3.6f, -3.6f);
        dij.LJIIJJI(28.8f);
        dij.LJIIIZ(3.6f, 3.6f, false, true, 3.6f, 3.6f);
        dij.LIZLLL();
        dij.LJIILIIL(-25.2f, 0.0f);
        C32856Cuy.Ab(dij);
        dij.LJIILL(10.92f);
        dij.LJI(16.8f);
        dij.LJIJ(11.4f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 25.2f);
        dij.LJIJ(24.72f);
        C32856Cuy.Ab(dij);
        dij.LJIJ(36.6f);
        dij.LJI(16.8f);
        dij.LIZLLL();
        dij.LJIILIIL(18.0f, -19.8f);
        C32856Cuy.Lh(dij);
        dij.LJIILIIL(0.0f, 10.8f);
        dij.LJIILL(-7.2f);
        C32856Cuy.j0(dij);
        dij.LJIILL(7.2f);
        dij.LJIIJJI(-3.6f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 9.0f);
        C32856Cuy.Lh(dij);
        dij.LJIIIIZZ(13.2f, 11.4f);
        C32856Cuy.LLLLLIL(dij);
        dij.LJIILL(5.4f);
        dij.LJIIJJI(3.6f);
        dij.LJIILL(-5.4f);
        dij.LIZLLL();
        dij.LJIIIIZZ(9.6f, 31.2f);
        dij.LJIILL(5.4f);
        dij.LJIIJJI(3.6f);
        dij.LJIILL(-5.4f);
        dij.LJI(9.6f);
        dij.LIZLLL();
        dij.LJIILIIL(3.6f, -3.6f);
        dij.LJIILL(-7.2f);
        C32856Cuy.LLLLLIL(dij);
        dij.LJIILL(7.2f);
        C32856Cuy.j0(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
