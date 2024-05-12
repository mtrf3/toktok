package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32991Cx9 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32991Cx9() {
        this.LIZJ.LJIIIIZZ(8.63f, 2.0f);
        C32856Cuy.rj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(34.0f);
        C32856Cuy.tj(this.LIZJ);
        this.LIZJ.LJIIJJI(12.83f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.71f, -1.7f);
        this.LIZJ.LJIIL(-2.78f, -2.79f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, -2.83f);
        this.LIZJ.LJIIL(6.36f, -6.36f);
        C32856Cuy.LLLIZZ(this.LIZJ);
        this.LIZJ.LJIIL(2.14f, 2.13f);
        C32856Cuy.a4(this.LIZJ);
        this.LIZJ.LJIIL(8.29f, -8.28f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.29f, -0.7f);
        C32856Cuy.d(this.LIZJ);
        C32856Cuy.qj(this.LIZJ);
        this.LIZJ.LJI(8.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.0f, 17.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJI(14.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-3.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.t5(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(21.0f, 28.6f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-7.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.x9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(7.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(2.6f);
        C32856Cuy.Vl(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(45.42f, 30.41f);
        C32856Cuy.xk(dij);
        dij.LJIIL(-12.93f, 13.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.83f, 0.01f);
        dij.LJIIL(-6.0f, -6.0f);
        C32856Cuy.uk(dij);
        dij.LJIIL(2.82f, -2.82f);
        C32856Cuy.pk(dij);
        dij.LJIIL(3.16f, 3.16f);
        dij.LJIIL(10.1f, -10.16f);
        C32856Cuy.pk(dij);
        dij.LJIIL(2.84f, 2.82f);
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
