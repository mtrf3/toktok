package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32926Cw6 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32926Cw6() {
        this.LIZJ.LJIIIIZZ(1.9f, 5.0f);
        C32856Cuy.Zj(this.LIZJ);
        C32856Cuy.d0(this.LIZJ);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.09f, 0.0f);
        C32856Cuy.k0(this.LIZJ);
        this.LIZJ.LJIIL(6.26f, 24.13f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 15.8f, 35.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(22.34f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 2.37f, -1.72f);
        this.LIZJ.LJIIL(5.18f, -15.73f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, -2.38f, -3.28f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-4.32f);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(0.4f);
        C32856Cuy.w5(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(1.75f);
        this.LIZJ.LJII(37.04f, 31.0f);
        this.LIZJ.LJI(16.95f);
        this.LIZJ.LJII(10.7f, 6.87f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 8.27f, 5.0f);
        C32856Cuy.LLLLLLLZIL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, -0.13f, 0.0f);
        this.LIZJ.LJI(1.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.16f, 45.0f);
        C32856Cuy.P2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(41.66f, 41.5f);
        C32856Cuy.en(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(23.9f, 10.26f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.02f, 0.13f);
        dij.LJIILL(3.88f);
        dij.LJIIJJI(-2.93f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.13f, 0.0f);
        dij.LJI(17.9f);
        C32856Cuy.Zj(dij);
        dij.LJIIJJI(0.41f);
        C32856Cuy.w5(dij);
        C32856Cuy.n0(dij);
        C32856Cuy.B8(dij);
        C32856Cuy.LJJZ(dij);
        C32856Cuy.n0(dij);
        C32856Cuy.w5(dij);
        dij.LJIIJJI(0.4f);
        C32856Cuy.xa(dij);
        dij.LJIIJJI(-2.94f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.14f, 0.0f);
        dij.LJIIJJI(-2.92f);
        dij.LJIILL(-5.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.01f, -0.09f);
        dij.LJIILL(-0.42f);
        C32856Cuy.P7(dij);
        C32856Cuy.LJLZ(dij);
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
