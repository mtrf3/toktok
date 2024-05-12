package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D94 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D94() {
        this.LIZJ.LJIIIIZZ(14.53f, 22.65f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.06f, 1.7f);
        this.LIZJ.LJIIJ(1.16f, 0.72f, 2.8f, 1.22f, 4.6f, 1.54f);
        this.LIZJ.LJIIJ(1.82f, 0.33f, 3.88f, 0.49f, 5.93f, 0.49f);
        this.LIZJ.LJIILJJIL(4.1f, -0.16f, 5.93f, -0.49f, true);
        this.LIZJ.LJIIJ(1.8f, -0.32f, 3.44f, -0.82f, 4.6f, -1.54f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, true, false, -1.06f, -1.7f);
        this.LIZJ.LJIIJ(-0.84f, 0.53f, -2.2f, 0.97f, -3.9f, 1.27f);
        this.LIZJ.LJIIJ(-1.68f, 0.3f, -3.62f, 0.46f, -5.57f, 0.46f);
        this.LIZJ.LJIIJ(-1.95f, 0.0f, -3.9f, -0.16f, -5.57f, -0.46f);
        this.LIZJ.LJIIIZ(11.6f, 11.6f, false, true, -3.9f, -1.27f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.29f, 13.1f);
        dij.LJIIJ(1.81f, 0.35f, 4.08f, 1.7f, 5.13f, 2.36f);
        dij.LJIIJ(0.35f, 0.23f, 0.8f, 0.23f, 1.16f, 0.0f);
        dij.LJIIJ(1.05f, -0.67f, 3.32f, -2.01f, 5.13f, -2.36f);
        dij.LJIIJ(5.95f, -1.13f, 12.44f, 7.45f, 13.96f, 9.6f);
        dij.LJIIJ(0.2f, 0.3f, 0.23f, 0.67f, 0.06f, 0.99f);
        dij.LJIIJ(-1.03f, 1.87f, -4.84f, 8.33f, -9.25f, 10.48f);
        dij.LJ(30.77f, 35.97f, 28.24f, 36.0f, 24.0f, 36.0f);
        dij.LJIILJJIL(-6.76f, -0.03f, -10.48f, -1.83f, true);
        dij.LJIIJ(-4.41f, -2.15f, -8.22f, -8.61f, -9.25f, -10.48f);
        dij.LJIIIZ(0.93f, 0.93f, false, true, 0.06f, -1.0f);
        dij.LJIIJ(1.52f, -2.14f, 8.01f, -10.72f, 13.96f, -9.59f);
        dij.LIZLLL();
        dij.LJIILIIL(-0.38f, 1.97f);
        dij.LJIIIZ(5.4f, 5.4f, false, false, -3.26f, 0.57f);
        dij.LJIIIZ(15.62f, 15.62f, false, false, -3.67f, 2.53f);
        dij.LJIIIZ(34.93f, 34.93f, false, false, -4.62f, 5.14f);
        dij.LJIIIZ(39.8f, 39.8f, false, false, 2.85f, 4.3f);
        dij.LJIIJ(1.59f, 2.05f, 3.4f, 3.9f, 5.19f, 4.76f);
        dij.LJ(17.67f, 33.96f, 19.8f, 34.0f, 24.0f, 34.0f);
        dij.LJIIJ(4.21f, 0.0f, 6.33f, -0.04f, 9.6f, -1.63f);
        dij.LJIIJ(1.78f, -0.87f, 3.6f, -2.71f, 5.19f, -4.77f);
        dij.LJIIIZ(39.8f, 39.8f, false, false, 2.85f, -4.3f);
        dij.LJIIIZ(34.93f, 34.93f, false, false, -4.62f, -5.13f);
        dij.LJIIIZ(15.62f, 15.62f, false, false, -3.67f, -2.53f);
        dij.LJIIIZ(5.4f, 5.4f, false, false, -3.26f, -0.57f);
        dij.LJIIJ(-1.39f, 0.26f, -3.36f, 1.4f, -4.43f, 2.08f);
        dij.LJIIJ(-1.01f, 0.65f, -2.3f, 0.65f, -3.32f, 0.0f);
        dij.LJIIJ(-1.07f, -0.69f, -3.04f, -1.82f, -4.43f, -2.08f);
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
