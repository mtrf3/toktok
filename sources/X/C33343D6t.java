package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33343D6t extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33343D6t() {
        this.LIZJ.LJIIIIZZ(17.07f, 26.35f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, false, -0.58f, -0.42f);
        this.LIZJ.LJIIL(-0.98f, 0.14f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, false, -0.42f, 0.57f);
        this.LIZJ.LJIIJ(0.83f, 4.76f, 3.61f, 8.98f, 8.26f, 9.99f);
        this.LIZJ.LJIIJ(0.27f, 0.05f, 0.53f, -0.13f, 0.57f, -0.4f);
        this.LIZJ.LJIIL(0.16f, -1.0f);
        this.LIZJ.LJIIIZ(0.53f, 0.53f, false, false, -0.41f, -0.58f);
        this.LIZJ.LJIIJ(-3.49f, -0.82f, -5.85f, -4.07f, -6.6f, -8.3f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.r7(dij);
        dij.LJIIJ(-0.57f, 0.0f, -1.2f, 0.18f, -1.84f, 0.44f);
        dij.LJIIJ(-0.66f, 0.27f, -1.39f, 0.66f, -2.16f, 1.16f);
        dij.LJIIIZ(24.57f, 24.57f, false, false, -4.87f, 4.23f);
        dij.LJ(11.89f, 14.46f, 9.0f, 19.7f, 9.0f, 26.0f);
        dij.LJIIJ(0.0f, 4.07f, 1.31f, 8.29f, 3.84f, 11.52f);
        dij.LIZJ(13.84f, 13.84f, false, false, 24.0f, 43.0f);
        dij.LJIIJ(4.84f, 0.0f, 8.62f, -2.24f, 11.16f, -5.48f);
        dij.LIZJ(18.95f, 18.95f, false, false, 39.0f, 26.0f);
        dij.LJIIJ(0.0f, -6.31f, -2.9f, -11.54f, -6.13f, -15.17f);
        dij.LIZJ(24.57f, 24.57f, false, false, 28.0f, 6.6f);
        dij.LJIIJ(-0.77f, -0.5f, -1.5f, -0.89f, -2.16f, -1.16f);
        dij.LIZJ(5.06f, 5.06f, false, false, 24.0f, 5.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(11.0f, 26.0f);
        dij.LJIIJ(0.0f, -5.69f, 2.6f, -10.46f, 5.62f, -13.83f);
        dij.LJIIJ(1.5f, -1.69f, 3.1f, -3.0f, 4.47f, -3.9f);
        dij.LJIIJ(0.69f, -0.44f, 1.3f, -0.76f, 1.83f, -0.98f);
        dij.LJIIJ(0.54f, -0.22f, 0.9f, -0.29f, 1.08f, -0.29f);
        dij.LJIIJ(0.18f, 0.0f, 0.54f, 0.07f, 1.08f, 0.3f);
        dij.LJIIJ(0.52f, 0.2f, 1.14f, 0.53f, 1.83f, 0.98f);
        dij.LJIIJ(1.38f, 0.88f, 2.96f, 2.2f, 4.47f, 3.89f);
        dij.LJ(34.39f, 15.54f, 37.0f, 20.3f, 37.0f, 26.0f);
        dij.LJIIJ(0.0f, 3.67f, -1.19f, 7.44f, -3.41f, 10.28f);
        dij.LIZJ(11.85f, 11.85f, false, true, 24.0f, 41.0f);
        dij.LJIIJ(-4.16f, 0.0f, -7.38f, -1.9f, -9.59f, -4.72f);
        dij.LIZJ(16.95f, 16.95f, false, true, 11.0f, 26.0f);
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
