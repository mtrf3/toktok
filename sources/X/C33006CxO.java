package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33006CxO extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33006CxO() {
        this.LIZJ.LJIIIIZZ(21.0f, 28.5f);
        C32856Cuy.Q3(this.LIZJ);
        this.LIZJ.LJIIIIZZ(29.5f, 31.0f);
        C32856Cuy.ug(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(29.5f, 8.5f);
        dij.LJIIIZ(5.5f, 5.5f, false, true, -3.5f, 5.13f);
        C32856Cuy.n9(dij);
        dij.LJIIJJI(8.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, 6.0f);
        C32856Cuy.LJLJJI(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, 6.0f);
        dij.LJI(14.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, -6.0f);
        C32856Cuy.u9(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, -6.0f);
        dij.LJIIJJI(8.0f);
        dij.LJIILL(-2.37f);
        dij.LJIIIZ(5.5f, 5.5f, true, true, 7.5f, -5.13f);
        dij.LIZLLL();
        dij.LJIIIIZZ(24.0f, 10.0f);
        C32856Cuy.I3(dij);
        dij.LJIIIIZZ(14.0f, 20.0f);
        C32856Cuy.ym(dij);
        C32856Cuy.LJLJJI(dij);
        C32856Cuy.Nd(dij);
        C32856Cuy.u9(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        dij.LJI(14.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(43.0f, 25.0f);
        C32856Cuy.F3(dij2);
        C32856Cuy.T(dij2);
        dij2.LJIIIIZZ(3.0f, 25.0f);
        C32856Cuy.F3(dij2);
        dij2.LJI(3.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
