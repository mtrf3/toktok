package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4W extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4W() {
        this.LIZJ.LJIIIIZZ(24.93f, 4.25f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 1.9f, 0.7f);
        this.LIZJ.LJIIL(13.26f, 7.66f);
        this.LIZJ.LJIIIZ(3.7f, 3.7f, false, true, 1.35f, 5.04f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, -0.42f, 0.12f);
        this.LIZJ.LJIIL(-11.0f, -6.35f);
        this.LIZJ.LJIIL(-10.5f, 18.19f);
        this.LIZJ.LJIIL(10.6f, 6.67f);
        this.LIZJ.LJIIJ(0.24f, 0.14f, 0.3f, 0.44f, 0.17f, 0.67f);
        this.LIZJ.LJIIL(-1.01f, 1.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.67f, 0.2f);
        this.LIZJ.LJIIL(-11.08f, -5.85f);
        this.LIZJ.LJIIL(-1.25f, 2.16f);
        this.LIZJ.LJIIL(10.99f, 6.35f);
        this.LIZJ.LJIIJ(0.15f, 0.09f, 0.2f, 0.27f, 0.11f, 0.42f);
        this.LIZJ.LJIIIZ(3.7f, 3.7f, false, true, -5.04f, 1.35f);
        this.LIZJ.LJII(9.08f, 35.7f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -2.2f, -8.2f);
        this.LIZJ.LJII(18.63f, 7.15f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 6.3f, -2.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.8f, 33.23f);
        this.LIZJ.LJII(26.56f, 9.42f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-0.86f, -0.5f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -4.1f, 1.1f);
        this.LIZJ.LJII(10.85f, 28.64f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 1.1f, 4.1f);
        Q7L.LIZLLL(this.LIZJ, "p", 0.86f, 0.5f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(28.53f, 14.02f);
        dij.LJIIL(10.6f, 6.67f);
        dij.LJIIJ(0.23f, 0.15f, 0.3f, 0.44f, 0.16f, 0.68f);
        C32856Cuy.de(dij);
        dij.LJIIIIZZ(36.13f, 25.89f);
        dij.LJIIL(-10.6f, -6.68f);
        dij.LJIIL(-2.0f, 3.47f);
        dij.LJIIL(11.08f, 5.84f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.67f, -0.2f);
        dij.LJIIL(1.01f, -1.76f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.16f, -0.67f);
        dij.LIZLLL();
        dij.LJIIIIZZ(22.53f, 24.41f);
        dij.LJIIL(10.6f, 6.68f);
        dij.LJIIJ(0.23f, 0.14f, 0.3f, 0.44f, 0.16f, 0.67f);
        C32856Cuy.de(dij);
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
