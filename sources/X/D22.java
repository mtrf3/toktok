package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D22 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D22() {
        this.LIZJ.LJIIIIZZ(19.65f, 4.22f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 2.12f, 0.19f);
        this.LIZJ.LJIIL(7.6f, 5.8f);
        this.LIZJ.LJII(38.35f, 7.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 2.56f, 2.54f);
        this.LIZJ.LJIIL(-3.17f, 9.01f);
        this.LIZJ.LJIIL(5.83f, 7.57f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.63f, 3.22f);
        this.LIZJ.LJIIL(-9.54f, -0.23f);
        this.LIZJ.LJII(27.0f, 37.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.56f, -0.56f);
        this.LIZJ.LJIIL(-2.09f, -6.98f);
        this.LIZJ.LJII(8.12f, 42.7f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(5.29f, 41.3f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(13.23f, -13.22f);
        this.LIZJ.LJIIL(-6.97f, -2.05f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.57f, -3.56f);
        this.LIZJ.LJIIL(7.85f, -5.43f);
        this.LIZJ.LJIIL(-0.27f, -9.55f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.09f, -1.84f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.03f, 5.91f);
        this.LIZJ.LJIIL(0.18f, 6.45f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.86f, 1.7f);
        this.LIZJ.LJIIL(-5.3f, 3.66f);
        this.LIZJ.LJIIL(6.18f, 1.82f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.35f, 1.35f);
        this.LIZJ.LJIIL(1.85f, 6.17f);
        this.LIZJ.LJIIL(3.64f, -5.32f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.7f, -0.87f);
        this.LIZJ.LJIIL(6.44f, 0.15f);
        this.LIZJ.LJIIL(-3.94f, -5.1f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.3f, -1.89f);
        this.LIZJ.LJIIL(2.13f, -6.08f);
        this.LIZJ.LJIIL(-6.07f, 2.17f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.88f, -0.3f);
        this.LIZJ.LJIIL(-5.12f, -3.9f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(16.1f, 12.7f);
        dij.LJIIJ(0.13f, 0.52f, -0.55f, 0.85f, -0.89f, 0.42f);
        dij.LJIIL(-5.08f, -6.58f);
        dij.LJIIIZ(2.22f, 2.22f, true, true, 3.9f, -1.9f);
        C279417u.LIZIZ(dij, 2.06f, 8.05f, 14.53f, 14.14f);
        dij.LJIIJ(0.52f, 0.15f, 0.47f, 0.9f, -0.07f, 0.98f);
        dij.LJIIL(-8.24f, 1.11f);
        dij.LJIIIZ(2.22f, 2.22f, true, true, 0.3f, -4.33f);
        dij.LJIIL(8.0f, 2.24f);
        dij.LIZLLL();
        C32856Cuy.Qg(dij);
        dij.LJIIIIZZ(34.7f, 31.94f);
        dij.LJIIJ(-0.47f, -0.29f, -0.22f, -1.0f, 0.32f, -0.93f);
        dij.LJIIL(8.24f, 1.18f);
        dij.LJIIIZ(2.22f, 2.22f, true, true, -1.48f, 4.09f);
        dij.LJIIL(-7.09f, -4.34f);
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
