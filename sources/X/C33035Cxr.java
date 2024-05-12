package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33035Cxr extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33035Cxr() {
        this.LIZJ.LJIIIIZZ(20.67f, 19.0f);
        this.LIZJ.LJIIJ(0.0f, 1.54f, -1.0f, 2.78f, -2.22f, 2.78f);
        this.LIZJ.LJIIJ(-1.22f, 0.0f, -2.22f, -1.24f, -2.22f, -2.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILJJIL(1.0f, -2.78f, 2.22f, -2.78f, true);
        this.LIZJ.LJIIJ(1.23f, 0.0f, 2.22f, 1.25f, 2.22f, 2.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.77f, 19.0f);
        this.LIZJ.LJIIJ(0.0f, 1.54f, -1.0f, 2.78f, -2.22f, 2.78f);
        this.LIZJ.LJIIJ(-1.23f, 0.0f, -2.22f, -1.24f, -2.22f, -2.77f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILJJIL(1.0f, -2.78f, 2.22f, -2.78f, true);
        this.LIZJ.LJIIJ(1.22f, 0.0f, 2.22f, 1.25f, 2.22f, 2.78f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(41.25f, 26.69f);
        dij.LJIIIZ(0.86f, 0.86f, false, false, 0.25f, -0.52f);
        dij.LJIJ(10.68f);
        dij.LJIIIZ(4.19f, 4.19f, false, false, -4.19f, -4.18f);
        dij.LJI(10.7f);
        dij.LJIIIZ(4.19f, 4.19f, false, false, -4.19f, 4.19f);
        dij.LJIJ(37.3f);
        dij.LJIIIZ(4.19f, 4.19f, false, false, 4.19f, 4.19f);
        dij.LJIIJJI(15.39f);
        dij.LJIIJ(0.23f, 0.0f, 0.45f, -0.09f, 0.6f, -0.25f);
        C279417u.LIZIZ(dij, 14.57f, -14.56f, 10.69f, 8.2f);
        dij.LJI(37.3f);
        dij.LJIIJ(1.37f, 0.0f, 2.48f, 1.11f, 2.48f, 2.48f);
        dij.LJIILL(14.53f);
        dij.LJIIJJI(-7.05f);
        dij.LJIIIZ(7.52f, 7.52f, false, false, -7.4f, 6.19f);
        dij.LJIIJ(-0.42f, 0.04f, -0.87f, 0.05f, -1.34f, 0.05f);
        dij.LJIIJ(-3.01f, 0.0f, -5.08f, -0.78f, -6.38f, -1.54f);
        dij.LJIIIZ(8.06f, 8.06f, false, true, -1.82f, -1.45f);
        dij.LJIIL(-0.68f, 0.52f);
        dij.LJIIL(-0.68f, 0.52f);
        dij.LJIIIZ(0.86f, 0.86f, false, true, 1.36f, -1.04f);
        dij.LJIIL(-0.68f, 0.52f);
        dij.LJIIL(-0.68f, 0.52f);
        C32856Cuy.i1(dij);
        C32856Cuy.kb(dij);
        dij.LJIIIZ(2.67f, 2.67f, false, false, 0.15f, 0.18f);
        dij.LJIIJ(0.1f, 0.1f, 0.24f, 0.26f, 0.43f, 0.43f);
        dij.LJIIJ(0.37f, 0.35f, 0.94f, 0.8f, 1.71f, 1.26f);
        dij.LJIIJ(1.55f, 0.9f, 3.92f, 1.78f, 7.25f, 1.78f);
        dij.LJIIJ(0.42f, 0.0f, 0.83f, -0.02f, 1.22f, -0.04f);
        dij.LJIILL(6.65f);
        dij.LJI(10.7f);
        dij.LIZJ(2.47f, 2.47f, false, true, 8.2f, 37.3f);
        dij.LJIJ(10.7f);
        dij.LJIIJ(0.0f, -1.37f, 1.11f, -2.48f, 2.48f, -2.48f);
        dij.LIZLLL();
        dij.LJIILIIL(27.88f, 18.73f);
        dij.LJII(26.94f, 38.57f);
        dij.LJIILL(-5.83f);
        dij.LJIIJ(0.0f, -3.2f, 2.6f, -5.8f, 5.8f, -5.8f);
        dij.LJIIJJI(5.83f);
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
