package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33011CxT extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33011CxT() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, 6.0f);
        p2.LJIILL(22.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(12.5f);
        this.LIZJ.LJIIJ(0.78f, 0.0f, 1.27f, -0.88f, 0.94f, -1.59f);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, true, 19.98f, -19.98f);
        this.LIZJ.LJIIJ(0.7f, 0.34f, 1.58f, -0.15f, 1.58f, -0.94f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(13.0f);
        p4.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        C32856Cuy.W6(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILIIL(1.0f, 17.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(9.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p6.LJIILL(2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(9.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIILL(-2.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.zc(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(6.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p9.LJIILL(2.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJI(9.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p10.LJIILL(-2.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(46.0f, 33.0f);
        C32856Cuy.Qc(dij);
        dij.LJIILIIL(-13.95f, -5.78f);
        C32856Cuy.ln(dij);
        dij.LJII(32.17f, 33.0f);
        C32856Cuy.Fd(dij);
        dij.LJIIL(1.42f, 1.42f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        dij.LJII(35.0f, 35.83f);
        dij.LJIIL(2.95f, 2.95f);
        C32856Cuy.LJZI(dij);
        dij.LJII(37.83f, 33.0f);
        dij.LJIIL(2.95f, -2.95f);
        C32856Cuy.mc(dij);
        dij.LJII(35.0f, 30.17f);
        dij.LJIIL(-2.95f, -2.95f);
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
