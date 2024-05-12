package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1D extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D1D() {
        C32856Cuy.xc(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.88f, 34.5f);
        dij.LJIIJ(2.78f, 0.0f, 4.6f, -1.27f, 5.78f, -2.81f);
        dij.LJIIIZ(0.48f, 0.48f, false, false, -0.18f, -0.72f);
        dij.LJIIL(-1.36f, -0.65f);
        dij.LJIIIZ(0.55f, 0.55f, false, false, -0.66f, 0.18f);
        dij.LJIIIZ(4.63f, 4.63f, false, true, -3.58f, 1.74f);
        dij.LJIIJ(-2.21f, 0.0f, -4.0f, -1.17f, -4.8f, -3.0f);
        dij.LJIIJJI(5.65f);
        C32856Cuy.LLJJI(dij);
        dij.LJIILL(-0.48f);
        C32856Cuy.LLJJIJI(dij);
        dij.LJIIJJI(-6.05f);
        dij.LJIIJ(-0.05f, -0.24f, -0.05f, -0.5f, -0.05f, -0.76f);
        dij.LJIIJ(0.0f, -0.28f, 0.02f, -0.54f, 0.05f, -0.83f);
        dij.LJIIJJI(6.05f);
        C32856Cuy.LLJJI(dij);
        dij.LJIILL(-0.47f);
        C32856Cuy.LLJJIJI(dij);
        dij.LJI(17.1f);
        dij.LJIIIZ(5.07f, 5.07f, false, true, 4.77f, -2.94f);
        dij.LJIIIZ(4.6f, 4.6f, false, true, 3.58f, 1.73f);
        dij.LJIIJ(0.16f, 0.2f, 0.44f, 0.29f, 0.67f, 0.17f);
        dij.LJIIL(1.35f, -0.67f);
        dij.LJIIIZ(0.47f, 0.47f, false, false, 0.18f, -0.7f);
        dij.LJIIIZ(6.89f, 6.89f, false, false, -5.78f, -2.79f);
        dij.LJIIJ(-3.67f, 0.0f, -6.67f, 2.02f, -7.65f, 5.2f);
        dij.LJIIJJI(-0.73f);
        C32856Cuy.z5(dij);
        dij.LJIILL(0.47f);
        C32856Cuy.Z4(dij);
        dij.LJIIJJI(0.44f);
        dij.LJIIJ(-0.03f, 0.29f, -0.05f, 0.55f, -0.05f, 0.83f);
        dij.LJIIJ(0.0f, 0.26f, 0.0f, 0.52f, 0.02f, 0.76f);
        dij.LJIIJJI(-0.41f);
        C32856Cuy.z5(dij);
        dij.LJIILL(0.48f);
        C32856Cuy.Z4(dij);
        dij.LJIIJJI(0.71f);
        dij.LJIIJ(0.96f, 3.22f, 3.97f, 5.26f, 7.67f, 5.26f);
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
