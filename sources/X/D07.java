package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D07 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D07() {
        this.LIZJ.LJIIIIZZ(2.5f, 10.5f);
        C32856Cuy.Ce(this.LIZJ);
        C32856Cuy.LJJI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(8.0f, 8.0f, false, true, 8.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(12.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJIIJJI(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-12.0f);
        C32856Cuy.p4(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(12.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(2.0f);
        C32856Cuy.yn(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-12.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(8.0f, 8.0f, false, true, -8.0f, -8.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-26.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.3f, 27.61f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -3.61f, 1.74f);
        dij.LJIIJJI(0.15f);
        dij.LJIIJJI(-0.15f);
        C32856Cuy.j1(dij);
        dij.LJIIL(0.02f, 0.03f);
        dij.LJIIIZ(3.61f, 3.61f, false, false, 0.13f, 0.23f);
        dij.LJIIIZ(7.47f, 7.47f, false, false, 1.68f, 1.92f);
        dij.LJIIIZ(9.26f, 9.26f, false, false, 5.98f, 1.95f);
        dij.LJIIJ(2.77f, 0.0f, 4.71f, -0.92f, 5.98f, -1.95f);
        dij.LJIIIZ(7.47f, 7.47f, false, false, 1.8f, -2.15f);
        dij.LJIIL(0.02f, -0.03f);
        dij.LJIILL(-0.01f);
        dij.LJIIJJI(0.01f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -3.6f, -1.75f);
        dij.LJIIL(-0.01f, 0.02f);
        dij.LJIIL(-0.11f, 0.17f);
        dij.LJIIJ(-0.12f, 0.16f, -0.32f, 0.4f, -0.63f, 0.65f);
        dij.LJIIIZ(5.3f, 5.3f, false, true, -3.46f, 1.05f);
        dij.LJIIIZ(5.3f, 5.3f, false, true, -3.46f, -1.05f);
        dij.LJIIIZ(3.47f, 3.47f, false, true, -0.74f, -0.82f);
        dij.LJIILL(-0.02f);
        dij.LIZLLL();
        dij.LJIIIIZZ(19.5f, 17.5f);
        C32856Cuy.je(dij);
        dij.LJIIIIZZ(33.5f, 17.5f);
        C32856Cuy.je(dij);
        dij.LJIIIIZZ(39.5f, 35.5f);
        C32856Cuy.LLIZLLLIL(dij);
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
