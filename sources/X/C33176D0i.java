package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33176D0i extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33176D0i() {
        this.LIZJ.LJIIIIZZ(51.95f, 44.9f);
        this.LIZJ.LJIIJ(0.0f, 0.27f, 0.22f, 0.5f, 0.5f, 0.48f);
        this.LIZJ.LJIIIZ(15.7f, 15.7f, false, false, 0.0f, -31.38f);
        this.LIZJ.LJIIJ(-0.28f, 0.0f, -0.5f, 0.21f, -0.5f, 0.49f);
        C32856Cuy.q1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.27f, 0.22f, 0.49f, 0.5f, 0.5f);
        this.LIZJ.LJIIIZ(12.51f, 12.51f, false, true, 0.0f, 25.0f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, false, -0.5f, 0.51f);
        C32856Cuy.q1(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(12.62f, 23.45f);
        dij.LJIIJ(8.18f, -7.41f, 13.6f, -9.66f, 19.03f, -8.71f);
        dij.LJIIJ(2.98f, 0.52f, 4.77f, 2.38f, 5.9f, 4.35f);
        dij.LJIIJ(0.81f, 1.4f, 1.38f, 3.02f, 1.8f, 4.24f);
        dij.LJIIL(0.04f, 0.1f);
        dij.LJIIJJI(0.21f);
        dij.LJIILL(0.62f);
        dij.LJIILL(-0.61f);
        dij.LJIIJJI(12.61f);
        dij.LJIIIZ(7.0f, 7.0f, false, true, 5.04f, 1.9f);
        dij.LJIIIZ(6.06f, 6.06f, false, true, 0.04f, 8.58f);
        dij.LJIIIZ(7.03f, 7.03f, false, true, -5.08f, 1.9f);
        dij.LJIIJJI(-8.05f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.74f, 0.6f);
        dij.LJIIL(-1.9f, 16.14f);
        dij.LJIILL(0.05f);
        dij.LJIIIZ(5.43f, 5.43f, false, true, -5.43f, 4.59f);
        dij.LJI(10.1f);
        dij.LIZJ(6.04f, 6.04f, false, true, 4.0f, 51.8f);
        dij.LJIJ(29.06f);
        dij.LJIIL(0.01f, -0.2f);
        dij.LJIIJ(0.4f, -2.93f, 2.95f, -5.46f, 6.1f, -5.41f);
        dij.LJIIJJI(2.5f);
        dij.LIZLLL();
        dij.LJIILIIL(23.59f, -0.01f);
        dij.LJIIIZ(16.6f, 16.6f, false, false, -1.25f, -2.85f);
        dij.LJIIJ(-0.86f, -1.48f, -2.0f, -2.58f, -3.83f, -2.9f);
        dij.LJIIJ(-4.07f, -0.7f, -8.63f, 0.77f, -16.92f, 8.36f);
        dij.LJIIJ(-0.28f, 0.26f, -0.64f, 0.4f, -1.01f, 0.4f);
        dij.LJIIJJI(-3.13f);
        dij.LJIIJ(-1.44f, -0.03f, -2.81f, 1.17f, -3.07f, 2.72f);
        dij.LJIJ(51.7f);
        dij.LJIIIZ(3.04f, 3.04f, false, false, 3.07f, 2.51f);
        dij.LJI(36.1f);
        dij.LJIIIZ(2.43f, 2.43f, false, false, 2.44f, -2.02f);
        dij.LJIIL(1.9f, -16.17f);
        C32856Cuy.LJJJJLL(dij);
        dij.LJIIIZ(3.75f, 3.75f, false, true, 3.71f, -3.16f);
        dij.LJIIJJI(8.05f);
        dij.LJIIJ(1.46f, 0.0f, 2.4f, -0.47f, 2.97f, -1.03f);
        dij.LJIIIZ(3.06f, 3.06f, false, false, -0.03f, -4.3f);
        dij.LJIIIZ(4.03f, 4.03f, false, false, -2.94f, -1.04f);
        dij.LJIIJJI(-7.62f);
        dij.LJIIL(-5.0f, -0.01f);
        dij.LJI(28.29f);
        C32856Cuy.G3(dij);
        dij.LJIIJJI(7.93f);
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
