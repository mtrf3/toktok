package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33046Cy2 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33046Cy2() {
        this.LIZJ.LJIIIIZZ(32.34f, 40.87f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, true, -1.08f, -2.6f);
        this.LIZJ.LJIIL(4.12f, -4.13f);
        this.LIZJ.LJII(31.26f, 30.0f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, true, 2.16f, -2.15f);
        this.LIZJ.LJIIL(4.12f, 4.12f);
        this.LIZJ.LJIIL(4.13f, -4.12f);
        this.LIZJ.LIZJ(1.53f, 1.53f, false, true, 43.82f, 30.0f);
        this.LIZJ.LJIIL(-4.12f, 4.13f);
        this.LIZJ.LJIIL(4.12f, 4.12f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, true, -2.15f, 2.16f);
        this.LIZJ.LJIIL(-4.13f, -4.12f);
        this.LIZJ.LJIIL(-4.12f, 4.12f);
        this.LIZJ.LJIIJ(-0.3f, 0.3f, -0.69f, 0.45f, -1.08f, 0.45f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(28.01f, 6.97f);
        C32856Cuy.Z1(dij);
        C32856Cuy.Z1(dij);
        dij.LJIIJJI(8.03f);
        dij.LJIIJ(0.84f, 0.0f, 1.53f, 0.69f, 1.53f, 1.53f);
        dij.LJIILL(31.47f);
        dij.LJIIJ(0.0f, 16.3f, -6.05f, 19.03f, -10.9f, 21.22f);
        dij.LJIIJ(-0.2f, 0.1f, -0.42f, 0.14f, -0.64f, 0.14f);
        dij.LJI(6.67f);
        dij.LJIIIZ(1.53f, 1.53f, false, true, -0.63f, -2.92f);
        dij.LJIIJ(4.69f, -2.11f, 9.11f, -4.11f, 9.11f, -18.44f);
        C32856Cuy.LLZZLLIL(dij);
        dij.LJIIJ(0.0f, -0.84f, 0.68f, -1.53f, 1.53f, -1.53f);
        dij.LJIIJJI(8.28f);
        dij.LJIJ(2.56f);
        dij.LJIIIZ(1.53f, 1.53f, true, true, 3.06f, 0.0f);
        dij.LJIILL(4.41f);
        dij.LIZLLL();
        dij.LJIILIIL(19.06f, 6.42f);
        dij.LJIILL(-3.36f);
        dij.LJIIJJI(-8.0f);
        dij.LJIILL(3.36f);
        dij.LJIIIZ(1.52f, 1.52f, true, true, -3.04f, 0.0f);
        dij.LJIILL(-3.36f);
        dij.LJIIJJI(-8.0f);
        dij.LJIILL(3.36f);
        dij.LJIIIZ(1.52f, 1.52f, true, true, -3.06f, 0.0f);
        dij.LJIILL(-3.36f);
        dij.LJI(18.2f);
        dij.LJIILL(29.94f);
        dij.LJIIJ(0.0f, 10.78f, -2.64f, 15.63f, -5.84f, 18.3f);
        dij.LJIIJJI(35.47f);
        dij.LJIIJ(4.57f, -2.07f, 8.8f, -4.27f, 8.8f, -18.3f);
        dij.LJIJ(10.03f);
        C32856Cuy.wb(dij);
        dij.LJIILL(3.36f);
        dij.LJIIIZ(1.52f, 1.52f, true, true, -3.06f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(66.12f, 70.97f);
        dij2.LJI(24.85f);
        dij2.LJIIJ(-0.84f, 0.0f, -1.53f, -0.68f, -1.53f, -1.53f);
        dij2.LJIILL(-4.42f);
        dij2.LJIIIZ(1.53f, 1.53f, true, true, 3.06f, 0.0f);
        dij2.LJIILL(2.9f);
        dij2.LJIIJJI(38.2f);
        C32856Cuy.LLZZLLIL(dij2);
        dij2.LJIIIZ(1.53f, 1.53f, true, true, 3.06f, 0.0f);
        dij2.LJIILL(60.94f);
        dij2.LJIIJ(0.0f, 0.85f, -0.68f, 1.53f, -1.52f, 1.53f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
