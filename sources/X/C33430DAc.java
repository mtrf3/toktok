package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33430DAc extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33430DAc() {
        this.LIZJ.LJIIIIZZ(21.24f, 24.22f);
        this.LIZJ.LJIIJ(-0.46f, 0.82f, -0.22f, 1.7f, 0.43f, 2.29f);
        this.LIZJ.LJIIJ(0.75f, 0.68f, 1.8f, 0.69f, 2.52f, -0.18f);
        this.LIZJ.LJIIL(0.06f, -0.07f);
        this.LIZJ.LJIIL(0.07f, -0.08f);
        this.LIZJ.LJIIJ(0.6f, -0.73f, 2.97f, -4.23f, 4.68f, -7.43f);
        this.LIZJ.LJIIJ(0.29f, -0.34f, 0.28f, -0.85f, -0.02f, -1.12f);
        this.LIZJ.LJIIJ(-0.3f, -0.27f, -0.78f, -0.21f, -1.07f, 0.13f);
        this.LIZJ.LJIIIZ(56.5f, 56.5f, false, false, -6.43f, 6.1f);
        this.LIZJ.LJIIL(-0.14f, 0.2f);
        this.LIZJ.LJIIL(-0.1f, 0.16f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.15f, 8.0f);
        dij.LIZJ(16.07f, 16.07f, false, false, 8.0f, 24.0f);
        dij.LJIIJ(0.0f, 8.83f, 7.22f, 16.0f, 16.15f, 16.0f);
        dij.LJIIJ(5.96f, 0.0f, 11.14f, -3.28f, 13.97f, -8.48f);
        dij.LJIIJ(0.32f, -0.59f, 0.69f, -0.76f, 1.36f, -0.4f);
        dij.LJIIJ(0.67f, 0.37f, 0.75f, 0.71f, 0.4f, 1.36f);
        dij.LJIIJ(-3.17f, 5.8f, -9.0f, 9.52f, -15.73f, 9.52f);
        dij.LIZJ(18.07f, 18.07f, false, true, 6.0f, 24.0f);
        dij.LJIIJ(0.0f, -9.95f, 8.13f, -18.0f, 18.15f, -18.0f);
        dij.LJIIJ(0.75f, 0.0f, 1.0f, 0.1f, 1.0f, 1.0f);
        dij.LJIIJ(0.0f, 0.91f, -0.25f, 1.0f, -1.0f, 1.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(40.75f, 21.0f);
        dij.LJIIJ(0.9f, -0.1f, 1.01f, 0.0f, 1.12f, 0.87f);
        dij.LJIIJ(0.22f, 1.73f, 0.17f, 3.47f, -0.13f, 5.17f);
        dij.LJIIJ(-0.15f, 0.85f, -0.39f, 0.95f, -1.16f, 0.8f);
        dij.LJIIJ(-0.78f, -0.13f, -0.96f, -0.3f, -0.81f, -1.15f);
        dij.LJIIJ(0.27f, -1.5f, 0.31f, -3.04f, 0.12f, -4.57f);
        dij.LJIIJ(-0.12f, -0.84f, -0.09f, -1.0f, 0.86f, -1.11f);
        dij.LIZLLL();
        dij.LJIIIIZZ(36.42f, 12.42f);
        dij.LJIIJ(0.69f, -0.59f, 0.85f, -0.56f, 1.41f, 0.1f);
        dij.LJIIIZ(17.03f, 17.03f, false, true, 2.72f, 4.4f);
        dij.LJIIJ(0.34f, 0.8f, 0.2f, 1.0f, -0.53f, 1.31f);
        dij.LJIIJ(-0.72f, 0.31f, -0.97f, 0.28f, -1.3f, -0.52f);
        dij.LJIIJ(-0.6f, -1.4f, -1.41f, -2.72f, -2.4f, -3.88f);
        dij.LJIIJ(-0.57f, -0.65f, -0.63f, -0.8f, 0.1f, -1.41f);
        dij.LIZLLL();
        dij.LJIIIIZZ(28.05f, 7.45f);
        dij.LJIIJ(0.26f, -0.87f, 0.4f, -0.93f, 1.25f, -0.68f);
        dij.LJIIJ(1.67f, 0.5f, 3.24f, 1.24f, 4.67f, 2.2f);
        dij.LJIIJ(0.72f, 0.49f, 0.72f, 0.74f, 0.28f, 1.4f);
        dij.LJIIJ(-0.44f, 0.65f, -0.67f, 0.75f, -1.4f, 0.26f);
        dij.LJIIIZ(15.03f, 15.03f, false, false, -4.12f, -1.94f);
        dij.LJIIJ(-0.82f, -0.23f, -0.95f, -0.32f, -0.68f, -1.24f);
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
