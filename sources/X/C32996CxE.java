package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32996CxE extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32996CxE() {
        this.LIZJ.LJIIIIZZ(27.94f, 14.0f);
        this.LIZJ.LJIIJ(0.0f, 2.76f, 2.26f, 5.0f, 5.06f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(3.33f);
        this.LIZJ.LJIIJ(-1.9f, 0.0f, -3.65f, -0.62f, -5.06f, -1.66f);
        this.LIZJ.LJIILL(6.94f);
        this.LIZJ.LJIIJ(0.0f, 3.53f, -2.9f, 6.39f, -6.47f, 6.39f);
        this.LIZJ.LIZJ(6.43f, 6.43f, false, true, 15.0f, 27.61f);
        this.LIZJ.LJIIIZ(6.43f, 6.43f, false, true, 7.31f, -6.33f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(3.39f);
        this.LIZJ.LJIIIZ(3.1f, 3.1f, false, false, -0.84f, -0.11f);
        this.LIZJ.LJIIJ(-1.71f, 0.0f, -3.1f, 1.36f, -3.1f, 3.05f);
        this.LIZJ.LJIIIZ(3.07f, 3.07f, false, false, 3.1f, 3.06f);
        this.LIZJ.LJIIJ(1.7f, 0.0f, 3.1f, -1.37f, 3.1f, -3.06f);
        C32856Cuy.l9(this.LIZJ);
        this.LIZJ.LJIIJJI(3.37f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.0f, 2.0f);
        C32856Cuy.Kf(dij);
        C32856Cuy.LJLLLL(dij);
        C32856Cuy.Mf(dij);
        C32856Cuy.LJIJI(dij);
        C32856Cuy.Lf(dij);
        dij.LJIJ(9.0f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, -7.0f, -7.0f);
        C32856Cuy.LLLLIL(dij);
        dij.LJIILIIL(-3.0f, 7.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        dij.LJIIJJI(20.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, 3.0f);
        C32856Cuy.LJLLLL(dij);
        C32856Cuy.hi(dij);
        C32856Cuy.T9(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
