package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32934CwE extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32934CwE() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.l(this.LIZJ);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, false, 8.0f, 48.0f);
        C32856Cuy.LJJIIJZLJL(this.LIZJ);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -2.99f);
        C32856Cuy.A8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(24.0f, 4.39f);
        this.LIZJ.LJIIJ(9.83f, 0.0f, 17.8f, 7.94f, 17.8f, 17.73f);
        this.LIZJ.LJIIJ(0.0f, 3.27f, -0.89f, 6.33f, -2.44f, 8.96f);
        this.LIZJ.LJI(8.64f);
        this.LIZJ.LJIIIZ(17.59f, 17.59f, false, true, -2.44f, -8.96f);
        this.LIZJ.LJIIJ(0.0f, -9.8f, 7.97f, -17.73f, 17.8f, -17.73f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.93f, 37.14f);
        this.LIZJ.LJIIJ(0.0f, 2.14f, -1.49f, 3.76f, -4.51f, 3.76f);
        this.LIZJ.LJIIJ(-2.16f, 0.0f, -3.89f, -1.13f, -4.38f, -3.09f);
        this.LIZJ.LJIIL(2.78f, -0.8f);
        this.LIZJ.LJIIJ(0.2f, 1.0f, 0.85f, 1.4f, 1.66f, 1.4f);
        this.LIZJ.LJIIJ(0.93f, 0.0f, 1.52f, -0.55f, 1.52f, -1.4f);
        this.LIZJ.LJIIJ(0.0f, -0.8f, -0.56f, -1.41f, -1.77f, -1.41f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-1.63f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-2.4f);
        this.LIZJ.LJIIL(2.62f, -1.24f);
        C32856Cuy.ub(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-2.56f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(7.44f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(3.42f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-1.95f, 0.91f);
        this.LIZJ.LJIIJ(1.6f, 0.27f, 2.72f, 1.44f, 2.72f, 3.41f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.07f, 3.5f);
        C32856Cuy.tb(this.LIZJ);
        this.LIZJ.LJIIL(-1.57f, -2.99f);
        this.LIZJ.LJIIL(-1.64f, 2.98f);
        C32856Cuy.tb(this.LIZJ);
        this.LIZJ.LJIIL(2.7f, -4.35f);
        this.LIZJ.LJIIL(-2.46f, -4.06f);
        C32856Cuy.E6(this.LIZJ);
        this.LIZJ.LJIIL(1.3f, 2.53f);
        this.LIZJ.LJIIL(1.33f, -2.53f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(3.21f);
        this.LIZJ.LJIIL(-2.44f, 4.0f);
        this.LIZJ.LJII(34.14f, 45.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(20.67f, 22.11f);
        dij.LJIIJ(0.0f, -2.04f, 1.9f, -3.55f, 3.9f, -3.1f);
        dij.LJIIL(10.12f, 2.29f);
        dij.LJIIIZ(0.83f, 0.83f, false, true, 0.0f, 1.62f);
        dij.LJIIL(-10.12f, 2.3f);
        dij.LJIIJ(-2.0f, 0.44f, -3.9f, -1.07f, -3.9f, -3.11f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
