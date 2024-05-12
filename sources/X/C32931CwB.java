package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32931CwB extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32931CwB() {
        this.LIZJ.LJIIIIZZ(22.0f, 28.0f);
        C32856Cuy.ec(this.LIZJ);
        C32856Cuy.an(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-1.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJI(22.0f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(21.0f, 41.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(28.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bl(this.LIZJ);
        C32856Cuy.h6(this.LIZJ);
        C32856Cuy.c1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(22.0f, 52.0f);
        C32856Cuy.ec(this.LIZJ);
        C32856Cuy.LJIJ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-1.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJI(22.0f);
        p3.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.5f, 2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LJIIJJI(-1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(5.09f);
        C32856Cuy.t6(dij);
        dij.LJIIJ(-3.31f, 0.0f, -6.0f, 2.72f, -6.0f, 6.08f);
        dij.LJIILL(51.74f);
        dij.LIZJ(6.04f, 6.04f, false, false, 17.0f, 71.0f);
        C32856Cuy.LJJIIZI(dij);
        dij.LJIIJ(3.31f, 0.0f, 6.0f, -2.73f, 6.0f, -6.09f);
        dij.LJIJ(13.17f);
        dij.LJIIIZ(6.04f, 6.04f, false, false, -6.0f, -6.08f);
        dij.LJIIJJI(-7.5f);
        dij.LJIJ(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LJIIJJI(-1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(5.09f);
        dij.LJIIJJI(-17.0f);
        dij.LJIJ(2.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-3.0f, 8.13f);
        C32856Cuy.L8(dij);
        C32856Cuy.LJIIZILJ(dij);
        C32856Cuy.L8(dij);
        dij.LJI(55.0f);
        dij.LJIIJ(1.66f, 0.0f, 3.0f, 1.36f, 3.0f, 3.04f);
        dij.LJIILL(51.74f);
        dij.LJIIIZ(3.02f, 3.02f, false, true, -3.0f, 3.05f);
        C32856Cuy.t6(dij);
        dij.LJIIJ(-1.66f, 0.0f, -3.0f, -1.37f, -3.0f, -3.05f);
        dij.LJIJ(13.17f);
        dij.LJIIIZ(3.02f, 3.02f, false, true, 3.0f, -3.04f);
        C32856Cuy.q0(dij);
        dij.LIZLLL();
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
