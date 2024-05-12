package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33121CzF extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33121CzF() {
        this.LIZJ.LJIIIIZZ(18.81f, 23.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p.LJIIJJI(10.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIILL(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C40084FoG.LJ(this.LIZJ, "p", -10.0f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.65f, 3.2f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 5.37f, -1.77f);
        dij.LJIIL(10.71f, 5.4f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 1.77f, 5.38f);
        dij.LJIIL(-1.22f, 2.52f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 4.7f, 6.41f);
        dij.LJIIL(-1.5f, 16.58f);
        dij.LIZJ(8.0f, 8.0f, false, true, 34.53f, 45.0f);
        dij.LJI(13.48f);
        dij.LJIIIZ(8.0f, 8.0f, false, true, -7.97f, -7.28f);
        dij.LJIIL(-1.5f, -16.58f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 5.4f, -6.51f);
        C32856Cuy.nl(dij);
        dij.LJIIJJI(7.82f);
        dij.LJIIL(1.42f, -2.8f);
        dij.LIZLLL();
        dij.LJIIIIZZ(36.6f, 11.1f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.37f, -1.05f);
        dij.LJIIL(-9.29f, -4.69f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -1.08f, 0.37f);
        dij.LJIIL(-1.03f, 2.2f);
        dij.LJIIJ(0.36f, 0.6f, 0.57f, 1.3f, 0.57f, 2.06f);
        dij.LJIILL(4.6f);
        C32856Cuy.M6(dij);
        dij.LJIIL(1.6f, -3.49f);
        dij.LIZLLL();
        dij.LJIIIIZZ(13.33f, 18.6f);
        dij.LJI(9.99f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.18f);
        dij.LJIIL(1.5f, 16.58f);
        dij.LIZJ(4.0f, 4.0f, false, false, 13.49f, 41.0f);
        dij.LJIIJJI(21.04f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 3.98f, -3.64f);
        dij.LJII(40.0f, 20.78f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -1.99f, -2.18f);
        dij.LJI(13.33f);
        dij.LIZLLL();
        dij.LJIILIIL(8.08f, -4.0f);
        dij.LJIILL(-3.8f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.8f, -0.8f);
        dij.LJIIJJI(-6.4f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.8f, 0.8f);
        dij.LJIILL(3.8f);
        dij.LJIIJJI(8.0f);
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
