package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5P extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5P() {
        this.LIZJ.LJIIIIZZ(24.0f, 17.52f);
        this.LIZJ.LJIIIZ(6.62f, 6.62f, false, false, -8.95f, 0.46f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, 0.0f, 9.9f);
        this.LIZJ.LJIIL(7.54f, 7.53f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, false, 2.82f, 0.0f);
        this.LIZJ.LJIIL(7.54f, -7.53f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, 0.0f, -9.9f);
        this.LIZJ.LJIIIZ(6.62f, 6.62f, false, false, -8.95f, -0.46f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.99f, 3.62f);
        this.LIZJ.LJIIL(0.06f, 0.06f);
        this.LIZJ.LJII(24.0f, 23.14f);
        this.LIZJ.LJIIL(1.93f, -1.94f);
        this.LIZJ.LJIIL(0.06f, -0.06f);
        this.LIZJ.LJIIJ(1.27f, -1.5f, 3.03f, -1.43f, 4.13f, -0.33f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(3.0f, 3.0f, false, true, 0.0f, 4.24f);
        this.LIZJ.LJII(24.0f, 31.17f);
        this.LIZJ.LJIIL(-6.12f, -6.12f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.0f, 3.0f, false, true, 0.0f, -4.24f);
        this.LIZJ.LJIIJ(1.1f, -1.1f, 2.86f, -1.16f, 4.13f, 0.33f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.23f, 2.13f);
        dij.LJIIIZ(1.94f, 1.94f, false, false, -2.46f, 0.0f);
        dij.LJII(1.97f, 19.18f);
        dij.LIZJ(1.94f, 1.94f, false, false, 3.2f, 22.6f);
        dij.LJIIJJI(3.02f);
        dij.LJIIL(1.53f, 16.83f);
        dij.LJIIIZ(3.23f, 3.23f, false, false, 3.22f, 2.94f);
        dij.LJIIJJI(26.06f);
        dij.LJIIIZ(3.23f, 3.23f, false, false, 3.22f, -2.94f);
        dij.LJIIL(1.53f, -16.83f);
        dij.LJIIJJI(3.02f);
        dij.LJIIIZ(1.94f, 1.94f, false, false, 1.22f, -3.43f);
        dij.LJII(25.22f, 2.13f);
        dij.LIZLLL();
        dij.LJIILIIL(-16.6f, 16.6f);
        dij.LJII(24.0f, 6.14f);
        dij.LJIIL(15.38f, 12.6f);
        dij.LJIIJJI(-1.13f);
        dij.LJII(36.44f, 38.5f);
        dij.LJI(11.56f);
        dij.LJIIL(-1.8f, -19.76f);
        dij.LJI(8.61f);
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
