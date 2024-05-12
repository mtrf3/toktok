package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32947CwR extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32947CwR() {
        this.LIZJ.LJIIIIZZ(13.0f, 8.0f);
        C32856Cuy.LJIJI(this.LIZJ);
        C32856Cuy.wm(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(16.5f);
        C32856Cuy.Zn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(10.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.o6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p3.LJIILL(28.0f);
        p3.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(12.5f);
        C32856Cuy.Dc(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(13.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(10.0f);
        p6.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        p6.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(28.43f, 15.59f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.19f, 0.68f);
        dij.LJIIL(-9.5f, 16.46f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.69f, 0.18f);
        dij.LJIIL(-0.86f, -0.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.19f, -0.68f);
        dij.LJIIL(9.5f, -16.46f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.69f, -0.18f);
        C279417u.LIZIZ(dij, 0.86f, 0.5f, 30.6f, 29.89f);
        C32856Cuy.g9(dij);
        dij.LJIIL(4.6f, 4.6f);
        dij.LJIIL(4.6f, -4.6f);
        C32856Cuy.g9(dij);
        dij.LJIIL(0.7f, 0.7f);
        dij.LJIIJ(0.2f, 0.2f, 0.2f, 0.52f, 0.01f, 0.71f);
        dij.LJIIL(-4.6f, 4.6f);
        dij.LJIIL(4.6f, 4.6f);
        C32856Cuy.LLIILZL(dij);
        C32856Cuy.Wf(dij);
        dij.LJIIL(-4.6f, -4.6f);
        dij.LJIIL(-4.6f, 4.6f);
        C32856Cuy.l4(dij);
        dij.LJIIL(4.6f, -4.6f);
        dij.LJIIL(-4.6f, -4.6f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, -0.7f);
        dij.LJIIL(0.7f, -0.71f);
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
