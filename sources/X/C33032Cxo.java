package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33032Cxo extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33032Cxo() {
        this.LIZJ.LJIIIIZZ(39.0f, 13.0f);
        C32856Cuy.A6(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIILL(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p.LJIIJJI(15.0f);
        C32856Cuy.ki(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(23.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(9.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.c3(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(18.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(30.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LJJLL(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-8.5f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(6.5f, 6.5f, true, true, 0.0f, -13.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(40.0f);
        p9.LJIILL(-5.0f);
        C32856Cuy.Xl(this.LIZJ);
        this.LIZJ.LJIILIIL(1.0f, 10.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(-8.5f);
        C32856Cuy.N4(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJI(40.0f);
        p11.LJIILL(-5.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(11.0f, 13.0f);
        dij.LJIILL(4.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        dij.LJIIJJI(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIILL(-4.0f);
        dij.LJIIJJI(4.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIILL(-2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LJIIJJI(-4.0f);
        C32856Cuy.W0(dij);
        C32856Cuy.C1(dij);
        C32856Cuy.LLLLLL(dij);
        C32856Cuy.LJJIJIIJIL(dij);
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
