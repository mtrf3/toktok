package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33310D5m extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33310D5m() {
        this.LIZJ.LJIIIIZZ(37.8f, 19.7f);
        this.LIZJ.LJIIIZ(4.9f, 4.9f, false, false, -5.57f, 1.76f);
        this.LIZJ.LJIIIZ(4.92f, 4.92f, false, false, -6.02f, 6.04f);
        this.LIZJ.LJIIL(1.45f, 5.4f);
        this.LIZJ.LJIIJ(-1.36f, 0.04f, -2.7f, 0.56f, -3.75f, 1.53f);
        this.LIZJ.LJIIIZ(4.5f, 4.5f, false, false, -0.45f, 6.15f);
        this.LIZJ.LIZJ(18.5f, 18.5f, true, true, 37.79f, 19.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-10.2f, -1.4f);
        this.LIZJ.LJIIJ(0.26f, 0.5f, 0.83f, 0.76f, 1.35f, 0.56f);
        this.LIZJ.LJIIL(1.26f, -0.47f);
        this.LIZJ.LJIIJ(0.52f, -0.2f, 0.79f, -0.77f, 0.55f, -1.27f);
        this.LIZJ.LIZJ(12.73f, 12.73f, false, false, 16.92f, 10.0f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, false, -0.72f, 1.18f);
        this.LIZJ.LJIIL(0.35f, 1.3f);
        this.LIZJ.LJIIJ(0.15f, 0.54f, 0.7f, 0.85f, 1.24f, 0.77f);
        this.LIZJ.LJIIIZ(9.38f, 9.38f, false, true, 9.82f, 5.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-17.1f, 7.6f);
        this.LIZJ.LJIIJ(-0.2f, -0.52f, -0.74f, -0.84f, -1.28f, -0.7f);
        this.LIZJ.LJIIL(-1.3f, 0.35f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, false, -0.67f, 1.21f);
        this.LIZJ.LJIIIZ(12.73f, 12.73f, false, false, 11.9f, 8.48f);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 0.97f, -0.48f, 0.93f, -1.03f);
        this.LIZJ.LJIIL(-0.1f, -1.35f);
        this.LIZJ.LJIIIZ(1.09f, 1.09f, false, false, -1.07f, -0.98f);
        this.LIZJ.LJIIIZ(9.38f, 9.38f, false, true, -8.41f, -5.99f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.0f, 1.1f);
        C32856Cuy.Ah(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(35.7f, 22.51f);
        dij.LJIIIZ(1.93f, 1.93f, false, false, -1.36f, 2.36f);
        dij.LJIIL(2.16f, 8.07f);
        dij.LJIIL(-1.65f, 0.45f);
        dij.LJIIL(-2.02f, -7.66f);
        dij.LJIIIZ(1.92f, 1.92f, true, false, -3.72f, 0.99f);
        dij.LJIIL(2.94f, 10.97f);
        dij.LJIIL(-2.93f, -1.5f);
        dij.LJIIIZ(2.81f, 2.81f, false, false, -3.18f, 0.44f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 0.19f, 2.36f);
        dij.LJIIL(5.43f, 3.61f);
        dij.LJIIIZ(11.3f, 11.3f, false, false, 11.13f, 0.78f);
        dij.LJIIIZ(7.53f, 7.53f, false, false, 4.03f, -8.75f);
        dij.LJIIL(-0.17f, -0.61f);
        dij.LJIILL(-0.05f);
        dij.LJIIL(-2.66f, -9.88f);
        dij.LJIIIZ(1.93f, 1.93f, true, false, -3.72f, 1.0f);
        dij.LJIIL(1.7f, 6.37f);
        dij.LJIIL(-1.65f, 0.45f);
        dij.LJIIL(-2.15f, -8.03f);
        dij.LJIIIZ(1.93f, 1.93f, false, false, -2.36f, -1.37f);
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
