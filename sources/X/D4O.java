package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4O extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4O() {
        this.LIZJ.LJIIIIZZ(38.0f, 20.74f);
        this.LIZJ.LJIIJ(-1.09f, -0.3f, -2.23f, -0.48f, -3.4f, -0.53f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(9.44f);
        this.LIZJ.LJII(15.0f, 11.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(37.0f);
        p2.LJIIIZ(7.0f, 7.0f, true, true, -7.0f, -7.0f);
        p2.LJIIJJI(3.6f);
        p2.LJIJ(7.4f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.87f, -1.0f);
        p2.LJIIL(24.4f, -3.18f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.13f, 1.0f);
        this.LIZJ.LJIILL(16.53f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(36.07f, 28.31f);
        dij.LJIIJ(0.42f, 0.13f, 0.9f, 0.03f, 1.18f, -0.31f);
        dij.LJIIL(1.54f, -1.85f);
        dij.LJIIJ(0.32f, -0.38f, 0.21f, -0.96f, -0.24f, -1.17f);
        dij.LIZJ(11.0f, 11.0f, false, false, 23.05f, 36.0f);
        dij.LJI(20.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.38f, 0.82f);
        dij.LJIIL(4.56f, 5.47f);
        dij.LJIIJ(0.2f, 0.24f, 0.57f, 0.24f, 0.77f, 0.0f);
        dij.LJII(30.0f, 36.82f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.39f, -0.82f);
        dij.LJIIJJI(-2.55f);
        dij.LJIIIZ(7.0f, 7.0f, false, true, 9.0f, -7.69f);
        dij.LIZLLL();
        dij.LJIIIIZZ(29.45f, 45.02f);
        dij.LJIIJ(-0.45f, -0.2f, -0.56f, -0.79f, -0.24f, -1.17f);
        dij.LJII(30.75f, 42.0f);
        dij.LJIIIZ(1.1f, 1.1f, false, true, 1.18f, -0.31f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, 9.0f, -7.62f);
        dij.LJIIJJI(-2.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.39f, -0.82f);
        dij.LJIIL(4.56f, -5.47f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.77f, 0.0f);
        dij.LJIIL(4.56f, 5.47f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.38f, 0.82f);
        dij.LJIIJJI(-2.44f);
        dij.LJIIIZ(11.0f, 11.0f, false, true, -15.51f, 10.95f);
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
