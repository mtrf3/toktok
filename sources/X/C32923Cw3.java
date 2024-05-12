package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32923Cw3 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32923Cw3() {
        this.LIZJ.LJIIIIZZ(36.0f, 34.5f);
        this.LIZJ.LJ(36.0f, 28.7f, 30.63f, 24.0f, 24.0f, 24.0f);
        this.LIZJ.LJIILJJIL(-12.0f, 4.7f, -12.0f, 10.5f, true);
        this.LIZJ.LJIIJ(0.0f, 0.83f, 0.77f, 1.5f, 1.71f, 1.5f);
        this.LIZJ.LJI(34.3f);
        this.LIZJ.LJIIJ(0.94f, 0.0f, 1.71f, -0.67f, 1.71f, -1.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.0f, 16.0f);
        C32856Cuy.Im(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.0f, 8.5f);
        dij.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        dij.LJI(38.0f);
        C32856Cuy.An(dij);
        C32856Cuy.lc(dij);
        C32856Cuy.qj(dij);
        dij.LJIIJJI(-5.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        dij.LJIILL(2.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.5f, 9.0f);
        C32856Cuy.ne(dij);
        C32856Cuy.rj(dij);
        C32856Cuy.lc(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(5.5f);
        dij.LIZLLL();
        dij.LJIIIIZZ(9.0f, 32.5f);
        C32856Cuy.H4(dij);
        C32856Cuy.tj(dij);
        C32856Cuy.n0(dij);
        C32856Cuy.ne(dij);
        C32856Cuy.xn(dij);
        dij.LJIILL(-5.5f);
        dij.LIZLLL();
        dij.LJIIIIZZ(32.5f, 39.0f);
        C32856Cuy.LJJLIIIJLJLI(dij);
        C32856Cuy.P6(dij);
        C32856Cuy.sj(dij);
        dij.LJIILL(-5.5f);
        C32856Cuy.H4(dij);
        C32856Cuy.yn(dij);
        dij.LJIIJJI(-5.5f);
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
