package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0N extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0N() {
        this.LIZJ.LJIIIIZZ(9.45f, 13.56f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -2.8f, 0.0f, -4.2f, 0.54f, -5.27f);
        p.LJIIIZ(5.0f, 5.0f, false, true, 2.19f, -2.19f);
        this.LIZJ.LJIIJ(1.06f, -0.54f, 2.47f, -0.54f, 5.27f, -0.54f);
        C32856Cuy.LJIIJJI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(2.8f, 0.0f, 4.2f, 0.0f, 5.27f, 0.54f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, true, 34.9f, 8.3f);
        this.LIZJ.LJIIJ(0.55f, 1.07f, 0.55f, 2.47f, 0.55f, 5.27f);
        C32856Cuy.LJLJJL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 2.8f, 0.0f, 4.2f, -0.55f, 5.27f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, true, 32.72f, 37.0f);
        this.LIZJ.LJIIJ(-1.07f, 0.55f, -2.47f, 0.55f, -5.27f, 0.55f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-10.0f);
        C32856Cuy.jj(this.LIZJ);
        this.LIZJ.LJIIJ(-0.54f, -1.07f, -0.54f, -2.47f, -0.54f, -5.27f);
        C32856Cuy.b1(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(18.64f, 8.65f);
        this.LIZJ.LJIIIZ(0.78f, 0.78f, false, false, 0.0f, -1.31f);
        this.LIZJ.LJIIL(-8.57f, -5.24f);
        this.LIZJ.LJIIJ(-0.48f, -0.3f, -1.07f, 0.07f, -1.07f, 0.65f);
        this.LIZJ.LJIJ(26.8f);
        this.LIZJ.LJIIJ(0.0f, 0.58f, 0.6f, 0.94f, 1.07f, 0.65f);
        this.LIZJ.LJIIL(8.57f, -5.24f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.78f, 42.53f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -0.84f, -0.97f);
        dij.LJIIJJI(10.64f);
        dij.LJIIJ(1.28f, 0.0f, 2.48f, 0.0f, 3.48f, -0.09f);
        dij.LJIIIZ(9.12f, 9.12f, false, false, 3.47f, -0.9f);
        dij.LJIIIZ(9.0f, 9.0f, false, false, 3.93f, -3.93f);
        dij.LJIIJ(0.61f, -1.2f, 0.82f, -2.4f, 0.9f, -3.47f);
        dij.LJIIJ(0.09f, -1.0f, 0.09f, -2.2f, 0.09f, -3.48f);
        dij.LJIJ(15.78f);
        dij.LJIIL(1.22f, 0.32f);
        dij.LJIIJ(2.7f, 0.73f, 4.06f, 1.09f, 4.95f, 1.9f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 1.54f, 2.67f);
        dij.LJIIJ(0.25f, 1.17f, -0.1f, 2.53f, -0.83f, 5.23f);
        dij.LJIIL(-4.14f, 15.46f);
        dij.LJIIJ(-0.73f, 2.7f, -1.1f, 4.05f, -1.9f, 4.95f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -2.67f, 1.54f);
        dij.LJIIJ(-1.18f, 0.25f, -2.53f, -0.11f, -5.23f, -0.84f);
        dij.LJIIL(-9.66f, -2.59f);
        dij.LJIIJ(-2.7f, -0.72f, -4.06f, -1.08f, -4.95f, -1.89f);
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
