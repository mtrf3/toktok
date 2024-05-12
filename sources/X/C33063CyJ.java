package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33063CyJ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33063CyJ() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 10.0f);
        p.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(28.0f);
        p2.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, 3.0f);
        this.LIZJ.LJIILL(14.42f);
        C32856Cuy.vn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(10.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.Y2(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(28.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        this.LIZJ.LJIIJJI(11.18f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, true, true, 0.0f, 2.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(10.0f);
        p6.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        p6.LJIJ(10.0f);
        p6.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(28.55f, 25.84f);
        dij.LJIIIZ(1.95f, 1.95f, false, false, 0.0f, -3.38f);
        dij.LJIIL(-6.63f, -3.8f);
        dij.LJIIJ(-1.3f, -0.73f, -2.92f, 0.2f, -2.92f, 1.7f);
        dij.LJIILL(7.58f);
        dij.LJIIJ(0.0f, 1.5f, 1.62f, 2.44f, 2.92f, 1.7f);
        I9A.LIZIZ(dij, 6.63f, -3.8f, -1.57f, -1.69f);
        dij.LJIIL(-5.73f, 3.27f);
        dij.LJIILL(-6.54f);
        dij.LJIIL(5.73f, 3.27f);
        dij.LIZLLL();
        dij.LJIIIIZZ(41.0f, 34.0f);
        dij.LJIIIZ(1.0f, 1.0f, true, false, -2.0f, 0.0f);
        dij.LJIILL(5.95f);
        C32856Cuy.wn(dij);
        dij.LJIJ(34.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(34.0f, 29.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(10.0f);
        C32856Cuy.vn(dij);
        C32856Cuy.D9(dij);
        C32856Cuy.Wl(dij);
        dij.LJIIIIZZ(29.0f, 34.0f);
        dij.LJIIIZ(1.0f, 1.0f, true, false, -2.0f, 0.0f);
        dij.LJIILL(6.0f);
        dij.LJIIIZ(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        dij.LJIILL(-6.0f);
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
