package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33209D1p extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33209D1p() {
        this.LIZJ.LJIILIIL(20.6f, 7.0f);
        this.LIZJ.LJIIL(-3.52f, -3.52f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.8f, 0.8f, false, true, 0.0f, -1.13f);
        this.LIZJ.LJIIL(1.7f, -1.7f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, true, 1.13f, 0.0f);
        this.LIZJ.LJIIL(8.0f, 8.01f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, true, 0.0f, 1.13f);
        this.LIZJ.LJIIL(-8.0f, 8.02f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, true, -1.13f, 0.0f);
        this.LIZJ.LJIIL(-1.7f, -1.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.8f, 0.8f, false, true, 0.0f, -1.13f);
        this.LIZJ.LJII(21.06f, 11.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(11.5f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, 0.0f, 11.0f);
        C32856Cuy.LJJ(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(9.5f, 9.5f, false, true, 0.0f, 19.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(16.77f);
        this.LIZJ.LJIIIZ(7.5f, 7.5f, true, true, 0.28f, -4.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(36.5f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, false, 0.0f, -11.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-25.0f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, true, true, 0.0f, -19.0f);
        this.LIZJ.LJIIJJI(9.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.4f, 31.5f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, true, false, -7.0f, 0.0f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 7.0f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(38.5f, 16.7f);
        C32856Cuy.G2(dij);
        C32856Cuy.K0(dij);
        C32856Cuy.fe(dij);
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
