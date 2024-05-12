package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33120CzE extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33120CzE() {
        this.LIZJ.LJIIIIZZ(4.0f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(37.0f);
        C32856Cuy.LLZ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(37.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJI(8.0f);
        C32856Cuy.K(this.LIZJ);
        C32856Cuy.V2(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(43.3f, 12.4f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.46f, -0.86f);
        C32856Cuy.Qn(dij);
        dij.LJIIL(-9.31f, 14.38f);
        dij.LJIIL(-9.3f, -6.76f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.88f, 0.6f);
        dij.LJII(9.79f, 33.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.13f, 0.59f);
        dij.LJIILL(3.65f);
        C32856Cuy.En(dij);
        dij.LJI(42.3f);
        C32856Cuy.Dn(dij);
        dij.LJIJ(12.39f);
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
