package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3V extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D3V() {
        this.LIZJ.LJIIIIZZ(54.89f, 5.56f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.79f, 0.56f);
        this.LIZJ.LJIIL(0.14f, 3.07f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.38f, 0.74f);
        this.LIZJ.LJIIL(2.42f, 1.88f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.57f, 1.79f);
        this.LIZJ.LJIIL(-3.06f, 0.14f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.74f, 0.39f);
        this.LIZJ.LJIIL(-1.89f, 2.41f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.78f, -0.57f);
        this.LIZJ.LJIIL(-0.15f, -3.06f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.38f, -0.74f);
        this.LIZJ.LJIIL(-2.42f, -1.88f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.57f, -1.8f);
        this.LIZJ.LJIIL(3.06f, -0.13f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.75f, -0.39f);
        this.LIZJ.LJIIL(1.88f, -2.41f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.68f, 13.5f);
        dij.LJIIIZ(5.5f, 5.5f, false, true, 5.47f, -5.0f);
        C32856Cuy.T6(dij);
        dij.LJIIIZ(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        dij.LJI(16.15f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, -2.49f, 2.27f);
        dij.LJIIL(-0.6f, 6.73f);
        dij.LJI(57.3f);
        dij.LJIIIZ(5.5f, 5.5f, false, true, 5.48f, 5.05f);
        dij.LJIIL(2.85f, 35.0f);
        dij.LJIIIZ(5.5f, 5.5f, false, true, -5.48f, 5.95f);
        dij.LJI(11.88f);
        dij.LJIIIZ(5.5f, 5.5f, false, true, -5.48f, -6.0f);
        I9A.LIZIZ(dij, 4.28f, -47.0f, 2.1f, 10.0f);
        dij.LJII(9.39f, 60.77f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, 2.49f, 2.73f);
        dij.LJIIJJI(48.28f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, 2.5f, -2.7f);
        dij.LJIIL(-2.86f, -35.0f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, -2.49f, -2.3f);
        dij.LJI(12.78f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(30.97f, 48.0f);
        dij2.LJIIIZ(1.48f, 1.48f, false, true, -1.04f, -2.52f);
        dij2.LJIIL(3.98f, -3.98f);
        dij2.LJIIL(-3.98f, -3.98f);
        dij2.LJIIIZ(1.48f, 1.48f, false, true, 2.09f, -2.09f);
        dij2.LJII(36.0f, 39.41f);
        dij2.LJIIL(3.98f, -3.98f);
        dij2.LJIIIZ(1.48f, 1.48f, false, true, 2.09f, 2.09f);
        dij2.LJIIL(-3.98f, 3.98f);
        dij2.LJIIL(3.98f, 3.98f);
        dij2.LJIIIZ(1.47f, 1.47f, false, true, -2.09f, 2.09f);
        dij2.LJII(36.0f, 43.58f);
        dij2.LJIIL(-3.98f, 3.99f);
        dij2.LJIIJ(-0.3f, 0.29f, -0.67f, 0.43f, -1.05f, 0.43f);
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
