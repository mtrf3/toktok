package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33038Cxu extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33038Cxu() {
        this.LIZJ.LJIIIIZZ(37.0f, 2.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(6.0f);
        p.LJIIJJI(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-6.0f);
        p.LJIILL(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIILL(-6.0f);
        p.LJIIJJI(-6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIILL(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p.LJIIJJI(6.0f);
        p.LJIJ(3.0f);
        C32856Cuy.sk(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 10.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LJI(7.0f);
        dij.LJIIJ(-2.1f, 0.0f, -4.0f, 1.9f, -4.0f, 4.0f);
        dij.LJIILL(28.16f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.54f, 0.84f);
        dij.LJIIL(6.96f, -4.5f);
        dij.LJIIL(5.0f, -3.19f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 1.08f, -0.31f);
        C32856Cuy.u6(dij);
        dij.LJIILL(10.38f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.45f, 0.9f);
        dij.LJIIL(6.13f, -3.07f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 0.9f, -0.21f);
        C32856Cuy.S6(dij);
        C32856Cuy.LLLLZI(dij);
        dij.LJIIJJI(-6.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(5.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJI(16.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.55f, 0.16f);
        dij.LJIIL(-3.13f, 2.03f);
        dij.LJIIL(-4.84f, 3.28f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.78f, -0.41f);
        dij.LJIJ(14.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(15.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIILL(-2.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.0f, 29.7f);
        C32856Cuy.H9(dij);
        C32856Cuy.LJIILIIL(dij);
        dij.LJIIJ(2.1f, 0.0f, 4.0f, -1.9f, 4.0f, -4.0f);
        C32856Cuy.LJJL(dij);
        dij.LJIIJJI(2.5f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(10.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJI(26.24f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.45f, 0.1f);
        dij.LJIIL(-3.07f, 1.54f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.72f, -0.45f);
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
