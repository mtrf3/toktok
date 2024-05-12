package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33000CxI extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33000CxI() {
        C32856Cuy.U9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(19.0f, 19.0f, false, false, 3.6f, 11.21f);
        this.LIZJ.LJ(17.84f, 34.2f, 20.82f, 36.0f, 24.0f, 36.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(3.19f, 0.0f, 6.17f, -1.81f, 8.4f, -4.79f);
        this.LIZJ.LIZJ(19.0f, 19.0f, false, false, 36.0f, 20.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, -5.3f, -1.18f, -8.75f, -3.16f, -10.88f);
        C32856Cuy.LLILL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(21.0f, 21.0f, false, true, -4.0f, 12.41f);
        this.LIZJ.LJ(31.5f, 35.73f, 28.0f, 38.0f, 24.0f, 38.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILJJIL(-7.51f, -2.27f, -10.0f, -5.59f, true);
        this.LIZJ.LIZJ(21.0f, 21.0f, false, true, 10.0f, 20.0f);
        C32856Cuy.K7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.94f, 42.35f);
        C32856Cuy.t0(this.LIZJ);
        this.LIZJ.LJII(7.41f, 34.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(3.09f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p7.LJIILL(-1.0f);
        p7.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p7.LJIIJJI(-6.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        p9.LJIILL(6.0f);
        p9.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        C32856Cuy.bc(this.LIZJ);
        this.LIZJ.LJIILL(-3.09f);
        this.LIZJ.LJIIL(6.94f, 6.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.65f, 40.94f);
        C32856Cuy.e4(this.LIZJ);
        this.LIZJ.LJII(42.0f, 35.41f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(3.09f);
        p10.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p10.LJIIJJI(1.0f);
        p10.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p10.LJIILL(-6.0f);
        p10.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p10.LJIIJJI(-6.0f);
        p10.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        p10.LJIILL(1.0f);
        p10.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p10.LJIIJJI(3.09f);
        this.LIZJ.LJIIL(-6.94f, 6.94f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Zi(dij);
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
