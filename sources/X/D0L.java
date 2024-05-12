package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0L extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0L() {
        this.LIZJ.LJIIIIZZ(19.94f, 27.65f);
        C32856Cuy.gh(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(6.3f);
        C32856Cuy.e6(this.LIZJ);
        this.LIZJ.LJIILL(-0.71f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, -0.2f, -0.15f, -0.35f, -0.35f, -0.35f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-4.87f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.07f);
        this.LIZJ.LJIIL(2.76f, -2.33f);
        this.LIZJ.LJIIJ(1.36f, -1.16f, 2.06f, -2.17f, 2.06f, -3.43f);
        this.LIZJ.LJIIJ(0.0f, -1.78f, -1.26f, -2.85f, -3.3f, -2.85f);
        this.LIZJ.LJIIJ(-1.92f, 0.0f, -3.17f, 0.98f, -3.52f, 2.58f);
        this.LIZJ.LJIIJ(-0.04f, 0.18f, 0.1f, 0.35f, 0.28f, 0.39f);
        this.LIZJ.LJIIL(0.76f, 0.13f);
        this.LIZJ.LJIIJ(0.23f, 0.04f, 0.45f, -0.11f, 0.51f, -0.33f);
        this.LIZJ.LJIIJ(0.29f, -0.94f, 0.93f, -1.44f, 1.9f, -1.44f);
        this.LIZJ.LJIIJ(1.07f, 0.0f, 1.67f, 0.64f, 1.67f, 1.6f);
        this.LIZJ.LJIIJ(0.0f, 0.82f, -0.37f, 1.53f, -1.48f, 2.5f);
        this.LIZJ.LJIIL(-3.3f, 2.82f);
        this.LIZJ.LJIIIZ(0.35f, 0.35f, false, false, -0.12f, 0.27f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(1.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.46f, 27.7f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, false, 0.18f, 0.3f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(1.13f);
        this.LIZJ.LJIIJ(0.16f, 0.0f, 0.3f, -0.09f, 0.37f, -0.23f);
        this.LIZJ.LJIIL(3.95f, -7.73f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.11f, -0.46f);
        C32856Cuy.LJJJJZ(this.LIZJ);
        C32856Cuy.Y4(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-5.84f);
        C32856Cuy.Dg(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.19f, 0.16f, 0.35f, 0.35f, 0.35f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(4.72f);
        this.LIZJ.LJIIL(-4.27f, 8.19f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.55f, 23.07f);
        C32856Cuy.LLLIIL(this.LIZJ);
        this.LIZJ.LJIIJ(-1.23f, 0.0f, -2.07f, 1.46f, -2.07f, 3.82f);
        this.LIZJ.LJIIJ(0.0f, 2.37f, 0.84f, 3.82f, 2.07f, 3.82f);
        this.LIZJ.LJIIJ(1.24f, 0.0f, 2.06f, -1.45f, 2.06f, -3.82f);
        this.LIZJ.LJIIJ(0.0f, -2.36f, -0.82f, -3.82f, -2.06f, -3.82f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.s(dij);
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
