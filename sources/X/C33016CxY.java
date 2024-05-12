package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33016CxY extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33016CxY() {
        this.LIZJ.LJIIIIZZ(23.92f, 15.15f);
        this.LIZJ.LJII(20.55f, 26.2f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(6.9f);
        this.LIZJ.LJIIL(-3.37f, -11.05f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-0.16f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(16.0f, 6.0f);
        C32856Cuy.U1(dij);
        dij.LJIIJJI(16.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        dij.LJIJ(12.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        C32856Cuy.LLLLJ(dij);
        dij.LJIILIIL(-1.17f, 29.0f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, -0.57f, -0.8f);
        dij.LJIIL(6.78f, -20.51f);
        dij.LIZJ(1.0f, 1.0f, false, true, 22.0f, 13.0f);
        dij.LJIIJJI(4.02f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.95f, 0.69f);
        dij.LJIIL(6.78f, 20.52f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, -0.57f, 0.79f);
        dij.LJIIJJI(-2.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.95f, -0.71f);
        dij.LJIIL(-1.57f, -5.16f);
        dij.LJIIJJI(-8.7f);
        dij.LJIIL(-1.57f, 5.16f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.95f, 0.7f);
        dij.LJIIJJI(-2.3f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(2.0f, 11.0f);
        C32856Cuy.Ka(dij2);
        dij2.LJI(3.0f);
        dij2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.LLZLL(dij2);
        dij2.LJIIIIZZ(42.0f, 11.0f);
        C32856Cuy.Ka(dij2);
        C32856Cuy.LLIIII(dij2);
        C32856Cuy.LLZLL(dij2);
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
