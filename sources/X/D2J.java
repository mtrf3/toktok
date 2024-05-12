package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2J extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D2J() {
        this.LIZJ.LJIIIIZZ(39.25f, 65.5f);
        this.LIZJ.LIZJ(29.5f, 29.5f, true, false, 9.8f, 34.22f);
        this.LIZJ.LJIIL(4.13f, -4.12f);
        C32856Cuy.rk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(0.7f, 0.7f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.42f);
        this.LIZJ.LJIIL(-7.06f, 7.07f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(0.5f, 32.22f);
        C32856Cuy.uk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.71f, -0.7f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJIIL(4.18f, 4.17f);
        this.LIZJ.LJIIIZ(32.5f, 32.5f, true, true, 5.17f, 19.4f);
        this.LIZJ.LJIIIZ(0.98f, 0.98f, false, true, 0.13f, -1.22f);
        this.LIZJ.LJIIL(0.7f, -0.72f);
        this.LIZJ.LJIIIZ(1.03f, 1.03f, false, true, 1.61f, 0.18f);
        this.LIZJ.LIZJ(29.48f, 29.48f, false, false, 39.25f, 65.5f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(56.25f, 38.0f);
        C32856Cuy.yn(dij);
        dij.LJIIJJI(-18.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij.LJIJ(20.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.LJLJJL(dij);
        dij.LJIIJJI(16.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(1.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
