package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33048Cy4 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33048Cy4() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(22.2f, 19.52f);
        this.LIZJ.LJIIIZ(3.17f, 3.17f, false, false, -0.56f, 4.94f);
        this.LIZJ.LJIIIZ(3.2f, 3.2f, false, false, 4.96f, -0.56f);
        this.LIZJ.LJIIL(5.53f, -8.74f);
        this.LIZJ.LJIIIZ(0.83f, 0.83f, false, false, -0.11f, -1.03f);
        this.LIZJ.LJIIIZ(0.84f, 0.84f, false, false, -1.04f, -0.12f);
        this.LIZJ.LJIIL(-8.78f, 5.5f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        C32856Cuy.r2(dij);
        dij.LJIIIIZZ(14.63f, 45.0f);
        dij.LJIIJJI(8.52f);
        dij.LJIILL(-2.64f);
        dij.LJI(18.1f);
        dij.LJIIL(2.88f, -2.09f);
        dij.LJIIJ(1.17f, -0.84f, 1.95f, -1.91f, 1.95f, -3.52f);
        dij.LJIIJ(0.0f, -1.98f, -1.62f, -3.24f, -4.14f, -3.24f);
        dij.LJIIJ(-2.63f, 0.0f, -4.3f, 1.36f, -4.5f, 3.53f);
        dij.LJIIL(2.8f, 0.46f);
        dij.LJIIJ(0.11f, -0.96f, 0.6f, -1.48f, 1.47f, -1.48f);
        dij.LJIIJ(0.83f, 0.0f, 1.25f, 0.46f, 1.25f, 1.08f);
        dij.LJIIJ(0.0f, 0.65f, -0.38f, 1.15f, -1.23f, 1.8f);
        dij.LJIIL(-3.95f, 3.04f);
        dij.LJIILL(3.06f);
        dij.LIZLLL();
        dij.LJIILIIL(16.07f, 0.0f);
        C32856Cuy.i0(dij);
        dij.LJIIL(-2.74f, -4.41f);
        dij.LJIIL(2.45f, -4.0f);
        dij.LJI(30.4f);
        C32856Cuy.t7(dij);
        dij.LJIIJJI(-3.25f);
        dij.LJII(27.0f, 40.66f);
        dij.LJIIL(-2.7f, 4.35f);
        C32856Cuy.i0(dij);
        dij.LJIIL(1.64f, -2.98f);
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
