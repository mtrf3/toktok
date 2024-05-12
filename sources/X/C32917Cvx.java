package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32917Cvx extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32917Cvx() {
        this.LIZJ.LJIIIIZZ(25.07f, 22.87f);
        this.LIZJ.LJ(24.77f, 21.82f, 24.53f, 21.0f, 24.0f, 21.0f);
        this.LIZJ.LJIILJJIL(-0.76f, 0.82f, -1.07f, 1.87f, true);
        this.LIZJ.LJIIJ(-0.32f, 1.13f, -0.72f, 2.51f, -1.64f, 3.42f);
        this.LIZJ.LJIIJ(-0.9f, 0.92f, -2.3f, 1.32f, -3.42f, 1.64f);
        this.LIZJ.LJIIJ(-1.05f, 0.3f, -1.87f, 0.54f, -1.87f, 1.07f);
        this.LIZJ.LJIILJJIL(0.82f, 0.76f, 1.87f, 1.07f, true);
        this.LIZJ.LJIIJ(1.13f, 0.32f, 2.51f, 0.72f, 3.42f, 1.64f);
        this.LIZJ.LJIIJ(0.92f, 0.9f, 1.32f, 2.3f, 1.64f, 3.42f);
        this.LIZJ.LJIIJ(0.3f, 1.05f, 0.54f, 1.87f, 1.07f, 1.87f);
        this.LIZJ.LJIILJJIL(0.76f, -0.82f, 1.07f, -1.87f, true);
        this.LIZJ.LJIIJ(0.32f, -1.13f, 0.72f, -2.51f, 1.64f, -3.42f);
        this.LIZJ.LJIIJ(0.9f, -0.92f, 2.3f, -1.32f, 3.42f, -1.64f);
        this.LIZJ.LJIIJ(1.05f, -0.3f, 1.87f, -0.54f, 1.87f, -1.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILJJIL(-0.82f, -0.76f, -1.87f, -1.07f, true);
        this.LIZJ.LJIIJ(-1.13f, -0.32f, -2.51f, -0.72f, -3.42f, -1.64f);
        this.LIZJ.LJIIJ(-0.92f, -0.9f, -1.32f, -2.3f, -1.64f, -3.42f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.0f, 6.0f);
        C32856Cuy.Pc(dij);
        C32856Cuy.LJJII(dij);
        C32856Cuy.Lf(dij);
        C32856Cuy.k9(dij);
        dij.LJIIIZ(7.0f, 7.0f, false, false, -7.0f, -7.0f);
        dij.LJI(10.0f);
        dij.LIZLLL();
        dij.LJIILIIL(11.16f, 4.0f);
        dij.LJIIL(1.48f, 4.9f);
        dij.LJIIJJI(-5.69f);
        dij.LJII(15.48f, 10.0f);
        dij.LJIIJJI(5.68f);
        dij.LIZLLL();
        dij.LJIILIIL(4.18f, 0.0f);
        dij.LJIIJJI(5.75f);
        dij.LJIIL(1.48f, 4.9f);
        dij.LJIIJJI(-5.75f);
        dij.LJII(25.34f, 10.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(41.0f, 14.9f);
        dij.LJIIJJI(-4.25f);
        dij.LJII(35.27f, 10.0f);
        C32856Cuy.P6(dij);
        C32856Cuy.fl(dij);
        dij.LJIILL(1.9f);
        dij.LIZLLL();
        dij.LJIIIIZZ(10.0f, 10.0f);
        C32856Cuy.f0(dij);
        dij.LJIIL(1.47f, 4.9f);
        C32856Cuy.LLLLLLZZ(dij);
        dij.LJIJ(13.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        dij.LIZLLL();
        dij.LJIILIIL(31.0f, 9.0f);
        C32856Cuy.LJLJJLL(dij);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        dij.LJI(10.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        C32856Cuy.q9(dij);
        dij.LJIIJJI(34.0f);
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
