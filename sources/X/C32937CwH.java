package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32937CwH extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32937CwH() {
        this.LIZJ.LJIIIIZZ(15.0f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        p.LJIILL(2.0f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        p2.LJIILL(18.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, 5.0f);
        C32856Cuy.Hm(this.LIZJ);
        C32856Cuy.F4(this.LIZJ);
        this.LIZJ.LJIILL(-9.88f);
        this.LIZJ.LIZJ(41.0f, 41.0f, false, false, 21.0f, 28.0f);
        this.LIZJ.LJIIJ(7.57f, 0.0f, 13.5f, -2.18f, 16.25f, -3.4f);
        this.LIZJ.LIZJ(4.7f, 4.7f, false, false, 40.0f, 20.25f);
        C32856Cuy.y3(this.LIZJ);
        C32856Cuy.LJ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        C32856Cuy.LLLLILI(this.LIZJ);
        this.LIZJ.LJIILIIL(13.0f, 7.0f);
        C32856Cuy.p6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(12.0f);
        C32856Cuy.tk(this.LIZJ);
        this.LIZJ.LJIIIIZZ(6.09f, 20.8f);
        this.LIZJ.LJII(6.0f, 20.78f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(17.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(28.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        this.LIZJ.LJIILL(3.26f);
        this.LIZJ.LJIIJ(0.0f, 0.37f, -0.19f, 0.6f, -0.38f, 0.68f);
        this.LIZJ.LIZJ(36.66f, 36.66f, false, true, 9.38f, 22.1f);
        this.LIZJ.LJIIIZ(32.28f, 32.28f, false, true, -3.3f, -1.3f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.0f, 28.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LJIIJJI(-2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(7.0f);
        C32856Cuy.to(dij);
        C32856Cuy.F0(dij);
        dij.LJIILL(7.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        dij.LJIIJJI(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIILL(-7.0f);
        C32856Cuy.c5(dij);
        dij.LJIIJJI(-7.0f);
        dij.LJIILL(-7.0f);
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
