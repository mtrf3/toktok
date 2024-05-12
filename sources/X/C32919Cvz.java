package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32919Cvz extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32919Cvz() {
        this.LIZJ.LJIIIIZZ(19.47f, 25.66f);
        this.LIZJ.LJIIJ(1.83f, 0.0f, 2.56f, -1.0f, 2.56f, -2.21f);
        this.LIZJ.LJIIJ(0.0f, -1.22f, -0.73f, -2.21f, -2.56f, -2.21f);
        this.LIZJ.LJIIJ(-1.82f, 0.0f, -2.55f, 0.99f, -2.55f, 2.2f);
        this.LIZJ.LJIIJ(0.0f, 1.23f, 0.73f, 2.22f, 2.55f, 2.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.02f, 13.88f);
        this.LIZJ.LJIIJ(0.4f, 0.0f, 0.71f, -0.33f, 0.71f, -0.73f);
        this.LIZJ.LJIIJ(0.0f, -1.28f, 1.8f, -1.75f, 2.77f, -1.75f);
        this.LIZJ.LJIILJJIL(2.77f, 0.47f, 2.77f, 1.75f, true);
        this.LIZJ.LJIIJ(0.0f, 0.66f, -0.62f, 1.6f, -1.89f, 1.98f);
        this.LIZJ.LJIIJ(-1.22f, 0.37f, -2.7f, 1.55f, -2.7f, 3.46f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(0.3f);
        this.LIZJ.LJIIJ(0.0f, 0.44f, 0.33f, 0.79f, 0.75f, 0.79f);
        this.LIZJ.LJIIJJI(2.14f);
        this.LIZJ.LJIIJ(0.42f, 0.0f, 0.76f, -0.35f, 0.76f, -0.78f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-0.13f);
        this.LIZJ.LJIIIZ(0.42f, 0.42f, false, true, 0.08f, -0.04f);
        this.LIZJ.LJIIJ(2.27f, -0.68f, 4.52f, -2.72f, 4.52f, -5.58f);
        this.LIZJ.LJIIJ(0.0f, -3.46f, -3.37f, -5.5f, -6.43f, -5.5f);
        this.LIZJ.LJIIJ(-3.06f, 0.0f, -6.43f, 2.04f, -6.43f, 5.5f);
        this.LIZJ.LJIIJ(0.0f, 0.4f, 0.32f, 0.73f, 0.71f, 0.73f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(2.24f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.08f, 31.6f);
        dij.LJIILL(3.56f);
        C32856Cuy.oi(dij);
        dij.LJIIJJI(16.79f);
        dij.LJIIJ(0.26f, 0.0f, 0.5f, 0.1f, 0.7f, 0.28f);
        dij.LJIIL(5.12f, 4.94f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 3.39f, -1.43f);
        C32856Cuy.t9(dij);
        C32856Cuy.li(dij);
        C32856Cuy.ub(dij);
        dij.LJIJ(8.09f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        dij.LJI(8.11f);
        C32856Cuy.im(dij);
        dij.LJIIJJI(2.71f);
        dij.LIZLLL();
        dij.LJIILIIL(4.0f, 0.0f);
        dij.LJIIJJI(11.5f);
        C32856Cuy.ch(dij);
        C32856Cuy.s9(dij);
        dij.LJIIJJI(4.5f);
        C32856Cuy.An(dij);
        dij.LJIILL(18.24f);
        dij.LJIIL(-1.74f, -1.68f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, -3.47f, -1.4f);
        dij.LJI(20.08f);
        C32856Cuy.xn(dij);
        dij.LJIJ(31.6f);
        dij.LIZLLL();
        dij.LJIIIIZZ(8.11f, 6.1f);
        dij.LJIIJJI(22.47f);
        C32856Cuy.wm(dij);
        dij.LJIJ(25.6f);
        C32856Cuy.vm(dij);
        dij.LJI(12.37f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, -3.82f, 1.77f);
        dij.LJIIL(-2.44f, 2.88f);
        dij.LJIJ(8.1f);
        C32856Cuy.ed(dij);
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
