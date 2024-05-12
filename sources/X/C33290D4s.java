package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33290D4s extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33290D4s() {
        C32856Cuy.Xc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(36.53f, 25.3f);
        this.LIZJ.LJIIJ(1.51f, 0.0f, 3.05f, 0.3f, 4.43f, 0.9f);
        this.LIZJ.LIZJ(17.0f, 17.0f, true, false, 27.9f, 43.86f);
        this.LIZJ.LJIIIZ(7.69f, 7.69f, false, true, -1.05f, -3.17f);
        this.LIZJ.LJIIIZ(3.66f, 3.66f, false, true, 3.4f, -4.04f);
        this.LIZJ.LJIIIZ(3.64f, 3.64f, false, true, -3.09f, -4.0f);
        this.LIZJ.LJIIJ(0.53f, -4.82f, 4.93f, -7.35f, 9.37f, -7.35f);
        this.LIZJ.LIZLLL();
        C32856Cuy.sg(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(40.82f, 29.77f);
        dij.LJIIIZ(6.97f, 6.97f, false, false, -4.29f, -1.27f);
        dij.LJIIJJI(-0.38f);
        dij.LJIIIZ(6.63f, 6.63f, false, false, -4.62f, 1.9f);
        dij.LJIIIZ(4.6f, 4.6f, false, false, -1.19f, 2.6f);
        dij.LJIIJ(-0.01f, 0.13f, 0.03f, 0.24f, 0.1f, 0.33f);
        dij.LJIIJ(0.1f, 0.1f, 0.23f, 0.17f, 0.38f, 0.17f);
        dij.LJIIJJI(3.16f);
        dij.LJIIJ(0.27f, 0.0f, 0.48f, -0.22f, 0.57f, -0.48f);
        dij.LJIIJ(0.22f, -0.65f, 0.87f, -1.1f, 1.73f, -1.17f);
        dij.LJIIJJI(0.25f);
        dij.LJIIJ(0.64f, 0.0f, 1.17f, 0.22f, 1.49f, 0.6f);
        dij.LJIIIZ(1.43f, 1.43f, false, true, 0.35f, 0.99f);
        dij.LJIIJ(0.02f, 0.7f, -0.47f, 1.27f, -1.24f, 1.52f);
        dij.LJIIIZ(2.96f, 2.96f, false, true, -0.94f, 0.13f);
        dij.LJIIJJI(-1.13f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, 0.5f);
        dij.LJIIJJI(1.13f);
        dij.LJIIIZ(3.87f, 3.87f, false, true, 0.87f, 0.1f);
        dij.LJIIJ(0.92f, 0.23f, 1.51f, 0.8f, 1.5f, 1.56f);
        dij.LJIIJ(0.02f, 1.0f, -0.83f, 1.69f, -2.03f, 1.69f);
        dij.LJIIJ(-0.88f, 0.0f, -1.58f, -0.33f, -1.92f, -0.85f);
        dij.LJIIJ(-0.06f, -0.08f, -0.1f, -0.17f, -0.14f, -0.27f);
        dij.LJIIJ(-0.1f, -0.25f, -0.31f, -0.48f, -0.59f, -0.48f);
        dij.LJI(30.5f);
        dij.LJIIIZ(0.49f, 0.49f, false, false, -0.33f, 0.13f);
        dij.LJIIJ(-0.1f, 0.1f, -0.16f, 0.23f, -0.14f, 0.38f);
        dij.LJIIIZ(4.53f, 4.53f, false, false, 1.04f, 2.42f);
        dij.LJIIJ(1.13f, 1.35f, 3.07f, 2.17f, 5.43f, 2.17f);
        dij.LJIIJ(3.91f, 0.0f, 6.67f, -2.0f, 6.66f, -4.81f);
        dij.LJIIJ(0.01f, -1.97f, -1.3f, -3.35f, -3.88f, -3.63f);
        dij.LJIILL(-0.13f);
        dij.LJIIJ(1.9f, -0.2f, 3.3f, -1.42f, 3.28f, -3.21f);
        dij.LJIIJ(0.01f, -1.38f, -0.63f, -2.56f, -1.74f, -3.39f);
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
