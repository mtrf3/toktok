package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0Y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0Y() {
        this.LIZJ.LJIILIIL(30.34f, 30.18f);
        this.LIZJ.LJIIL(-8.09f, -4.24f);
        this.LIZJ.LJIIL(-8.11f, 4.24f);
        this.LIZJ.LJIIJJI(16.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.25f, 22.03f);
        this.LIZJ.LJIIL(8.04f, -4.2f);
        this.LIZJ.LJI(14.14f);
        this.LIZJ.LJIIL(8.11f, 4.2f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(9.25f, 5.25f);
        C32856Cuy.rj(dij);
        dij.LJIILL(29.5f);
        C32856Cuy.tj(dij);
        dij.LJIIJJI(29.5f);
        C32856Cuy.sj(dij);
        dij.LJIJ(9.25f);
        C32856Cuy.qj(dij);
        dij.LJI(9.25f);
        dij.LIZLLL();
        dij.LJIILIIL(27.74f, 9.07f);
        dij.LJIILL(3.91f);
        dij.LJII(26.05f, 24.0f);
        dij.LJIIL(10.94f, 5.7f);
        dij.LJIILL(3.98f);
        dij.LJIIL(-4.7f, -2.5f);
        dij.LJIILL(0.2f);
        dij.LJIIJ(0.0f, 1.53f, -1.12f, 2.48f, -2.74f, 2.48f);
        dij.LJI(14.63f);
        dij.LJIIJ(-1.7f, 0.0f, -2.73f, -0.95f, -2.73f, -2.48f);
        dij.LJIILL(-3.94f);
        dij.LJII(18.49f, 24.0f);
        dij.LJIIL(-6.6f, -3.41f);
        dij.LJIILL(-3.94f);
        dij.LJIIJ(0.0f, -1.56f, 1.04f, -2.5f, 2.74f, -2.5f);
        dij.LJIIJJI(14.92f);
        dij.LJIIJ(1.62f, 0.0f, 2.74f, 0.94f, 2.74f, 2.5f);
        dij.LJIILL(0.14f);
        dij.LJIIL(4.7f, -2.47f);
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
