package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D08 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D08() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(37.5f, 0.0f);
        this.LIZJ.LJIIJ(-1.43f, 0.0f, -1.12f, 5.14f, -3.24f, 7.26f);
        this.LIZJ.LJIILLIIL(27.0f, 9.06f, 27.0f, 10.5f, true);
        this.LIZJ.LJIIJ(0.0f, 1.43f, 5.14f, 1.12f, 7.26f, 3.25f);
        this.LIZJ.LJ(36.4f, 15.87f, 36.06f, 21.0f, 37.5f, 21.0f);
        this.LIZJ.LJIIJ(1.43f, 0.0f, 1.12f, -5.13f, 3.25f, -7.25f);
        this.LIZJ.LJ(42.87f, 11.62f, 48.0f, 11.93f, 48.0f, 10.5f);
        this.LIZJ.LJIILJJIL(-5.13f, -1.12f, -7.25f, -3.24f, true);
        this.LIZJ.LJ(38.62f, 5.14f, 38.93f, 0.0f, 37.5f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(2.65f, 23.24f);
        this.LIZJ.LJIIJ(0.0f, -11.56f, 9.0f, -21.04f, 20.35f, -21.57f);
        this.LIZJ.LJIIIZ(0.97f, 0.97f, false, true, 1.0f, 0.98f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.7f);
        this.LIZJ.LJIIJ(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.03f);
        this.LIZJ.LIZJ(16.79f, 16.79f, false, false, 7.35f, 23.24f);
        C32856Cuy.O(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-2.7f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        this.LIZJ.LJIJ(23.24f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.65f, 24.24f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(2.7f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(44.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 0.99f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-2.7f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        this.LIZJ.LJIJ(24.24f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(37.0f, 30.31f);
        C32856Cuy.LLLLZIL(dij);
        C32856Cuy.J4(dij);
        dij.LJIILL(4.31f);
        dij.LJ(11.0f, 36.52f, 16.82f, 46.0f, 24.0f, 46.0f);
        dij.LJIILJJIL(13.0f, -9.48f, 13.0f, -15.69f, true);
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
