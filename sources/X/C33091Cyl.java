package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33091Cyl extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33091Cyl() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(36.0f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(12.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(32.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(14.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p3.LJIILL(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(12.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        p4.LJIJ(8.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(24.0f);
        p5.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, 5.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(19.0f);
        C32856Cuy.Ob(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(8.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(42.97f, 45.8f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        dij.LJIIL(1.42f, -1.42f);
        C32856Cuy.D8(dij);
        dij.LJIIL(-4.24f, -4.25f);
        dij.LJIIL(4.24f, -4.24f);
        C32856Cuy.Q7(dij);
        C32856Cuy.F8(dij);
        dij.LJIIL(-4.25f, 4.24f);
        dij.LJIIL(-4.24f, -4.24f);
        C32856Cuy.Xk(dij);
        dij.LJIIL(4.24f, 4.24f);
        dij.LJIIL(-4.24f, 4.24f);
        C32856Cuy.Nh(dij);
        C32856Cuy.Dk(dij);
        dij.LJIIL(4.24f, -4.24f);
        dij.LJIIL(4.24f, 4.24f);
        dij.LIZLLL();
        C32856Cuy.Eo(dij);
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
