package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33127CzL extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33127CzL() {
        this.LIZJ.LJIIIIZZ(18.2f, 4.0f);
        this.LIZJ.LJIIJ(-5.28f, 0.0f, -9.57f, 4.48f, -9.57f, 10.0f);
        this.LIZJ.LJIILJJIL(4.29f, 10.0f, 9.58f, 10.0f, true);
        this.LIZJ.LJIILJJIL(9.58f, -4.48f, 9.58f, -10.0f, true);
        this.LIZJ.LJIILJJIL(-4.3f, -10.0f, -9.58f, -10.0f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.2f, 27.0f);
        this.LIZJ.LJ(7.73f, 27.0f, 1.93f, 34.92f, 1.93f, 41.44f);
        this.LIZJ.LJ(1.92f, 45.0f, 3.83f, 45.0f, 10.54f, 45.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(8.63f);
        this.LIZJ.LJIILL(-7.71f);
        this.LIZJ.LJIIJ(0.0f, -2.21f, 1.71f, -4.0f, 3.83f, -4.0f);
        C32856Cuy.Eb(this.LIZJ);
        this.LIZJ.LJIIL(1.39f, -3.93f);
        this.LIZJ.LJIIIZ(17.33f, 17.33f, false, false, -9.0f, -2.36f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.61f, 30.47f);
        dij.LIZJ(1.94f, 1.94f, false, false, 32.85f, 29.0f);
        dij.LJIIJ(-0.84f, -0.04f, -1.6f, 0.49f, -1.89f, 1.3f);
        dij.LJII(28.5f, 37.3f);
        C32856Cuy.A6(dij);
        C32856Cuy.Zj(dij);
        dij.LJIIJJI(5.82f);
        dij.LJIIJ(0.8f, 0.0f, 1.52f, -0.53f, 1.8f, -1.31f);
        dij.LJIIL(0.86f, -2.44f);
        dij.LJIIL(2.36f, 8.99f);
        dij.LJIIJ(0.2f, 0.79f, 0.85f, 1.37f, 1.63f, 1.46f);
        dij.LJIIIZ(1.9f, 1.9f, false, false, 1.9f, -1.05f);
        dij.LJIIL(2.9f, -5.65f);
        C32856Cuy.Eh(dij);
        dij.LJIIJJI(-4.88f);
        dij.LJIIJ(-0.71f, 0.0f, -1.36f, 0.4f, -1.7f, 1.05f);
        dij.LJIIL(-1.16f, 2.28f);
        dij.LJIIL(-2.65f, -10.15f);
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
