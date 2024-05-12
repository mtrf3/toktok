package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33391D8p extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33391D8p() {
        this.LIZJ.LJIIIIZZ(29.95f, 30.94f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, false, 2.15f, 0.0f);
        this.LIZJ.LJIIL(4.1f, -4.1f);
        this.LIZJ.LJIIL(4.11f, 4.1f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, 2.15f, -2.15f);
        this.LIZJ.LJIIL(-4.1f, -4.1f);
        this.LIZJ.LJIIL(4.1f, -4.11f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, -2.15f, -2.15f);
        this.LIZJ.LJIIL(-4.1f, 4.1f);
        this.LIZJ.LJIIL(-4.11f, -4.1f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, -2.15f, 2.14f);
        this.LIZJ.LJIIL(4.1f, 4.11f);
        this.LIZJ.LJIIL(-4.1f, 4.1f);
        this.LIZJ.LJIIJ(-0.6f, 0.6f, -0.6f, 1.56f, 0.0f, 2.16f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(36.2f, 64.17f);
        dij.LJIIJ(-1.58f, 0.0f, -3.03f, -0.8f, -3.9f, -2.12f);
        dij.LJIIL(-16.07f, -24.7f);
        dij.LJIIIZ(23.57f, 23.57f, false, true, -3.67f, -13.15f);
        dij.LJIIIZ(23.65f, 23.65f, true, true, 43.7f, 13.01f);
        dij.LJIIL(-0.08f, 0.14f);
        dij.LJII(44.1f, 55.88f);
        dij.LJIIJ(3.38f, 0.33f, 6.47f, 0.87f, 9.04f, 1.59f);
        dij.LJIIJ(5.03f, 1.4f, 7.58f, 3.34f, 7.58f, 5.77f);
        dij.LJIIJ(0.0f, 5.31f, -12.8f, 7.73f, -24.7f, 7.73f);
        dij.LJIIJ(-11.9f, 0.0f, -24.72f, -2.42f, -24.72f, -7.73f);
        dij.LJIIJ(0.0f, -4.45f, 8.7f, -6.31f, 13.87f, -7.03f);
        dij.LJIIIZ(1.52f, 1.52f, false, true, 0.42f, 3.0f);
        dij.LJIIJ(-8.58f, 1.2f, -11.24f, 3.37f, -11.24f, 4.02f);
        dij.LJIIJ(0.0f, 1.4f, 7.36f, 4.7f, 21.66f, 4.7f);
        dij.LJIILJJIL(21.67f, -3.3f, 21.67f, -4.7f, true);
        dij.LJIIJ(0.0f, -1.15f, -5.24f, -3.69f, -15.46f, -4.46f);
        dij.LJIIL(-2.13f, 3.28f);
        dij.LJIIIZ(4.62f, 4.62f, false, true, -3.9f, 2.12f);
        dij.LIZLLL();
        dij.LJIIIIZZ(18.85f, 35.8f);
        dij.LJIIL(16.0f, 24.59f);
        dij.LJIIJ(0.31f, 0.47f, 0.8f, 0.73f, 1.35f, 0.73f);
        dij.LJIIIZ(1.6f, 1.6f, false, false, 1.35f, -0.73f);
        dij.LJIIL(16.0f, -24.59f);
        dij.LJIIL(0.07f, -0.1f);
        dij.LJIIJ(2.1f, -3.3f, 3.2f, -7.1f, 3.2f, -11.02f);
        dij.LJIIJ(0.0f, -5.65f, -2.24f, -10.92f, -6.31f, -14.84f);
        dij.LIZJ(20.61f, 20.61f, false, false, 18.85f, 35.8f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
