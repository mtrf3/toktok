package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D81 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D81() {
        this.LIZJ.LJIIIIZZ(19.77f, 5.24f);
        this.LIZJ.LJIIJ(0.68f, -0.35f, 1.5f, -0.27f, 2.1f, 0.19f);
        this.LIZJ.LJIIL(7.5f, 5.72f);
        this.LIZJ.LJIIL(8.9f, -3.17f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, 2.53f, 2.51f);
        this.LIZJ.LJIIL(-3.13f, 8.9f);
        this.LIZJ.LJIIL(5.77f, 7.46f);
        this.LIZJ.LJIIIZ(1.97f, 1.97f, false, true, -1.61f, 3.18f);
        this.LIZJ.LJIIL(-9.44f, -0.22f);
        this.LIZJ.LJIIL(-5.33f, 7.78f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, -3.53f, -0.55f);
        this.LIZJ.LJIIL(-2.07f, -6.89f);
        this.LIZJ.LJII(8.37f, 43.22f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, true, -1.4f, 0.0f);
        this.LIZJ.LJIIL(-1.4f, -1.4f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, true, 0.0f, -1.4f);
        this.LIZJ.LJIIL(13.08f, -13.05f);
        this.LIZJ.LJIIL(-6.89f, -2.02f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, -0.57f, -3.52f);
        this.LIZJ.LJIIL(7.77f, -5.36f);
        this.LIZJ.LJIIL(-0.27f, -9.42f);
        this.LIZJ.LJIIJ(-0.02f, -0.76f, 0.4f, -1.46f, 1.08f, -1.81f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(16.26f, 13.6f);
        dij.LJIIJ(0.13f, 0.52f, -0.55f, 0.85f, -0.87f, 0.43f);
        dij.LJIIL(-5.03f, -6.5f);
        dij.LJIIJ(-0.85f, -1.1f, -0.48f, -2.7f, 0.77f, -3.3f);
        dij.LJIIIZ(2.2f, 2.2f, false, true, 3.1f, 1.42f);
        C279417u.LIZIZ(dij, 2.03f, 7.95f, 14.7f, 15.03f);
        dij.LJIIJ(0.52f, 0.15f, 0.47f, 0.9f, -0.06f, 0.97f);
        dij.LJIIL(-8.15f, 1.1f);
        dij.LJIIIZ(2.2f, 2.2f, true, true, 0.3f, -4.29f);
        C279417u.LIZIZ(dij, 7.92f, 2.22f, 32.76f, 33.55f);
        dij.LJIIJ(0.02f, -0.54f, 0.76f, -0.67f, 0.96f, -0.17f);
        dij.LJIIL(3.06f, 7.61f);
        dij.LJIIIZ(2.19f, 2.19f, true, true, -4.23f, 0.76f);
        C279417u.LIZIZ(dij, 0.21f, -8.2f, 34.64f, 32.6f);
        dij.LJIIJ(-0.45f, -0.29f, -0.2f, -1.0f, 0.33f, -0.92f);
        dij.LJIIL(8.14f, 1.16f);
        dij.LJIIIZ(2.19f, 2.19f, true, true, -1.45f, 4.04f);
        dij.LJIIL(-7.02f, -4.29f);
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
