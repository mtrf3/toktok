package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32993CxB extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32993CxB() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(21.4f, 23.9f);
        this.LIZJ.LJIIIZ(3.2f, 3.2f, false, false, 4.96f, 0.56f);
        this.LIZJ.LJIIIZ(3.17f, 3.17f, false, false, -0.56f, -4.94f);
        this.LIZJ.LJIIL(-8.78f, -5.5f);
        this.LIZJ.LJIIIZ(0.84f, 0.84f, false, false, -1.03f, 0.1f);
        this.LIZJ.LJIIIZ(0.83f, 0.83f, false, false, -0.12f, 1.04f);
        this.LIZJ.LJIIL(5.53f, 8.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.6f, 39.4f);
        this.LIZJ.LJIIJ(0.0f, -2.23f, 0.64f, -3.36f, 1.67f, -3.36f);
        this.LIZJ.LJIIJ(1.04f, 0.0f, 1.66f, 1.13f, 1.66f, 3.36f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILJJIL(-0.62f, 3.37f, -1.66f, 3.37f, true);
        this.LIZJ.LJIIJ(-1.03f, 0.0f, -1.67f, -1.14f, -1.67f, -3.37f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        C32856Cuy.r2(dij);
        dij.LJIILIIL(7.07f, 11.43f);
        dij.LJIIJ(-3.03f, 0.0f, -4.77f, 2.33f, -4.77f, 5.86f);
        dij.LJIIJ(0.0f, 3.54f, 1.74f, 5.87f, 4.77f, 5.87f);
        dij.LJIIJ(3.04f, 0.0f, 4.78f, -2.33f, 4.78f, -5.87f);
        dij.LJIIJ(0.0f, -3.53f, -1.74f, -5.86f, -4.78f, -5.86f);
        dij.LIZLLL();
        dij.LJIILIIL(6.52f, 11.55f);
        dij.LJIIJ(0.99f, 0.0f, 1.66f, -0.73f, 1.66f, -1.64f);
        dij.LJIIJ(0.0f, -0.9f, -0.67f, -1.62f, -1.66f, -1.62f);
        dij.LJIIJ(-1.0f, 0.0f, -1.67f, 0.73f, -1.67f, 1.62f);
        dij.LJIIJ(0.0f, 0.9f, 0.67f, 1.64f, 1.67f, 1.64f);
        dij.LIZLLL();
        dij.LJIILIIL(10.5f, -3.76f);
        dij.LJIIJ(0.0f, -2.44f, -1.64f, -3.82f, -4.57f, -3.82f);
        dij.LJIIJJI(-0.6f);
        dij.LJIIL(0.09f, -1.17f);
        dij.LJIIJJI(4.77f);
        dij.LJIILL(-2.56f);
        dij.LJIIJJI(-7.04f);
        dij.LJIIL(-0.4f, 6.18f);
        dij.LJIIJJI(2.54f);
        dij.LJIIJ(1.62f, 0.0f, 2.27f, 0.6f, 2.27f, 1.45f);
        dij.LJIIJ(0.0f, 0.8f, -0.51f, 1.37f, -1.44f, 1.37f);
        dij.LJIIJ(-0.75f, 0.0f, -1.33f, -0.38f, -1.57f, -1.37f);
        dij.LJIIL(-2.78f, 0.8f);
        dij.LJIIJ(0.45f, 1.91f, 2.03f, 3.07f, 4.42f, 3.07f);
        dij.LJIIJ(2.65f, 0.0f, 4.32f, -1.48f, 4.32f, -3.95f);
        dij.LIZLLL();
        dij.LJIILIIL(6.28f, 3.68f);
        C32856Cuy.i0(dij);
        dij.LJIIL(-2.73f, -4.41f);
        dij.LJIIL(2.44f, -4.0f);
        dij.LJIIJJI(-3.21f);
        C32856Cuy.t7(dij);
        dij.LJI(30.4f);
        C32856Cuy.od(dij);
        dij.LJII(35.0f, 42.03f);
        dij.LJIIL(1.57f, 2.98f);
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
