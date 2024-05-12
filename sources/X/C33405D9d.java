package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33405D9d extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33405D9d() {
        this.LIZJ.LJIIIIZZ(20.37f, 23.48f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 0.68f, 3.72f);
        this.LIZJ.LJIIJ(1.18f, 1.1f, 2.84f, 1.12f, 3.97f, -0.28f);
        this.LIZJ.LJIIIZ(5.74f, 5.74f, false, false, 0.2f, -0.25f);
        this.LIZJ.LJIIJ(0.95f, -1.19f, 2.77f, -4.38f, 5.45f, -9.58f);
        this.LIZJ.LJIIJ(0.45f, -0.56f, 0.44f, -1.37f, -0.03f, -1.81f);
        this.LIZJ.LJIIJ(-0.48f, -0.44f, -1.22f, -0.35f, -1.67f, 0.21f);
        this.LIZJ.LJIIJ(-4.4f, 3.6f, -7.13f, 6.07f, -8.22f, 7.42f);
        this.LIZJ.LJIIL(-0.21f, 0.3f);
        this.LIZJ.LJIIL(-0.17f, 0.27f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(3.0f, 24.0f);
        dij.LIZJ(21.0f, 21.0f, false, true, 24.0f, 3.0f);
        dij.LJIIJ(2.0f, 0.0f, 2.0f, 0.5f, 2.0f, 2.0f);
        dij.LJIILJJIL(0.0f, 2.0f, -2.0f, 2.0f, true);
        dij.LJIIIZ(17.0f, 17.0f, true, false, 0.01f, 34.0f);
        dij.LJIIIZ(17.77f, 17.77f, false, false, 11.55f, -4.48f);
        dij.LJIIJ(0.99f, -0.9f, 1.48f, -0.99f, 2.82f, 0.14f);
        dij.LJIIJ(1.14f, 0.95f, 1.12f, 1.69f, -0.14f, 2.82f);
        dij.LIZJ(21.76f, 21.76f, false, true, 24.0f, 45.0f);
        dij.LIZJ(21.03f, 21.03f, false, true, 3.0f, 24.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(43.07f, 25.05f);
        dij.LJIIJ(1.57f, 0.26f, 1.96f, 0.43f, 1.65f, 2.3f);
        dij.LJIIJ(-0.3f, 1.86f, -0.85f, 3.67f, -1.62f, 5.37f);
        dij.LJIIJ(-0.7f, 1.51f, -1.27f, 1.62f, -2.65f, 1.0f);
        dij.LJIIJ(-1.39f, -0.64f, -1.79f, -0.92f, -1.0f, -2.66f);
        dij.LJIIIZ(17.02f, 17.02f, false, false, 1.33f, -4.35f);
        dij.LJIIJ(0.26f, -1.66f, 0.71f, -1.91f, 2.29f, -1.66f);
        dij.LIZLLL();
        dij.LJIIIIZZ(39.82f, 13.56f);
        dij.LJIIJ(1.4f, -0.76f, 1.8f, -0.85f, 2.7f, 0.81f);
        dij.LJIIJ(0.9f, 1.67f, 1.57f, 3.44f, 1.99f, 5.26f);
        dij.LJIIJ(0.37f, 1.61f, -0.02f, 2.05f, -1.5f, 2.4f);
        dij.LJIIJ(-1.49f, 0.34f, -1.97f, 0.36f, -2.4f, -1.5f);
        dij.LJIIJ(-0.34f, -1.48f, -0.88f, -2.91f, -1.6f, -4.26f);
        dij.LJIIJ(-0.8f, -1.47f, -0.6f, -1.95f, 0.8f, -2.7f);
        dij.LIZLLL();
        dij.LJIIIIZZ(30.25f, 6.08f);
        dij.LJIIJ(0.67f, -1.45f, 0.94f, -1.77f, 2.66f, -0.97f);
        dij.LJIIJ(1.71f, 0.8f, 3.3f, 1.82f, 4.73f, 3.02f);
        dij.LJIIJ(1.26f, 1.08f, 1.21f, 1.66f, 0.23f, 2.82f);
        dij.LJIIJ(-0.99f, 1.16f, -1.36f, 1.47f, -2.82f, 0.23f);
        dij.LJIIIZ(17.01f, 17.01f, false, false, -3.83f, -2.45f);
        dij.LJIIJ(-1.52f, -0.7f, -1.64f, -1.2f, -0.97f, -2.65f);
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
