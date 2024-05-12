package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0I extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0I() {
        this.LIZJ.LJIIIIZZ(36.25f, 46.56f);
        this.LIZJ.LJIIJ(-4.1f, 0.0f, -7.3f, -4.64f, -7.3f, -10.56f);
        this.LIZJ.LJIIJ(0.0f, -5.92f, 3.2f, -10.56f, 7.3f, -10.56f);
        this.LIZJ.LJIILJJIL(7.32f, 4.64f, 7.32f, 10.56f, true);
        this.LIZJ.LJIIJ(0.0f, 5.92f, -3.22f, 10.56f, -7.32f, 10.56f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, -18.07f);
        this.LIZJ.LJIIJ(-2.27f, 0.0f, -4.26f, 3.5f, -4.26f, 7.51f);
        this.LIZJ.LJIIJ(0.0f, 4.0f, 1.99f, 7.52f, 4.26f, 7.52f);
        this.LIZJ.LJIIJ(2.28f, 0.0f, 4.27f, -3.52f, 4.27f, -7.52f);
        this.LIZJ.LJIIJ(0.0f, -4.0f, -2.0f, -7.51f, -4.27f, -7.51f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(21.86f, 38.54f);
        this.LIZJ.LJIIJJI(-7.52f);
        C32856Cuy.LLIIJI(this.LIZJ);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, true, true, 3.04f, 0.15f);
        this.LIZJ.LJIIL(-0.42f, 8.45f);
        this.LIZJ.LJIIJJI(5.91f);
        C32856Cuy.w0(this.LIZJ);
        this.LIZJ.LJIILL(18.08f);
        C32856Cuy.Uf(this.LIZJ);
        this.LIZJ.LJIIIIZZ(56.13f, 38.54f);
        this.LIZJ.LJI(48.6f);
        C32856Cuy.LLIIJI(this.LIZJ);
        this.LIZJ.LJIIJ(0.05f, -0.85f, 0.77f, -1.5f, 1.6f, -1.44f);
        this.LIZJ.LJIIJ(0.84f, 0.04f, 1.49f, 0.75f, 1.44f, 1.6f);
        this.LIZJ.LJIIL(-0.42f, 8.44f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.9f);
        C32856Cuy.w0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(9.93f);
        this.LIZJ.LJIIIZ(1.56f, 1.56f, false, true, 0.0f, 0.25f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(7.9f);
        C32856Cuy.Uf(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(49.85f, 70.97f);
        dij.LJIIJJI(-27.7f);
        dij.LJIIJ(-0.4f, 0.0f, -0.8f, -0.16f, -1.08f, -0.45f);
        dij.LJIIL(-19.6f, -19.6f);
        dij.LJIIIZ(1.52f, 1.52f, false, true, -0.44f, -1.07f);
        dij.LJIILL(-27.7f);
        dij.LJIIJ(0.0f, -0.4f, 0.16f, -0.8f, 0.45f, -1.08f);
        dij.LJIIL(19.6f, -19.6f);
        dij.LJIIJ(0.28f, -0.28f, 0.67f, -0.44f, 1.07f, -0.44f);
        dij.LJIIJJI(27.7f);
        dij.LJIIJ(0.4f, 0.0f, 0.8f, 0.16f, 1.08f, 0.45f);
        dij.LJIIL(19.59f, 19.59f);
        dij.LJIIJ(0.28f, 0.28f, 0.45f, 0.67f, 0.45f, 1.07f);
        dij.LJIILL(27.71f);
        dij.LJIIJ(0.0f, 0.4f, -0.17f, 0.8f, -0.45f, 1.08f);
        dij.LJIIL(-19.6f, 19.59f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, -1.07f, 0.45f);
        dij.LIZLLL();
        dij.LJIILIIL(-27.07f, -3.04f);
        dij.LJIIJJI(26.44f);
        dij.LJIIL(18.7f, -18.7f);
        dij.LJIJ(22.77f);
        dij.LJIIL(-18.7f, -18.7f);
        dij.LJI(22.78f);
        dij.LJIIL(-18.7f, 18.7f);
        dij.LJIILL(26.44f);
        dij.LJIIL(18.7f, 18.7f);
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
