package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33175D0h extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33175D0h() {
        this.LIZJ.LJIIIIZZ(32.0f, 10.15f);
        this.LIZJ.LJIIIZ(5.85f, 5.85f, true, false, 0.0f, 11.7f);
        this.LIZJ.LJIIIZ(5.85f, 5.85f, false, false, 0.0f, -11.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(29.85f, 16.0f);
        this.LIZJ.LJIIIZ(2.15f, 2.15f, true, true, 4.3f, 0.0f);
        this.LIZJ.LJIIIZ(2.15f, 2.15f, false, true, -4.3f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.hf(dij);
        dij.LJIIJ(-1.13f, 1.14f, -2.07f, 2.08f, -2.78f, 2.9f);
        C32856Cuy.fd(dij);
        dij.LJIIJ(1.13f, 1.14f, 2.07f, 2.08f, 2.9f, 2.78f);
        dij.LJIIIZ(8.18f, 8.18f, false, false, 2.77f, 1.66f);
        dij.LJIIIZ(8.0f, 8.0f, false, false, 4.94f, 0.0f);
        dij.LJIIIZ(8.18f, 8.18f, false, false, 2.77f, -1.66f);
        dij.LJIIJ(0.83f, -0.7f, 1.77f, -1.64f, 2.9f, -2.78f);
        C32856Cuy.LLIIIZ(dij);
        dij.LJIIIZ(5.08f, 5.08f, false, false, -0.5f, -1.94f);
        dij.LIZLLL();
        dij.LJIILIIL(-4.0f, 1.38f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.44f, 0.45f);
        dij.LJIIL(0.02f, 0.06f);
        dij.LJIIL(0.05f, 0.37f);
        dij.LJIIJ(0.03f, 0.4f, 0.03f, 0.94f, 0.03f, 1.8f);
        dij.LJIILL(8.57f);
        dij.LJIIJ(0.0f, 1.81f, -0.01f, 2.39f, -0.14f, 2.91f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -0.6f, 1.45f);
        dij.LJIIJ(-0.28f, 0.45f, -0.67f, 0.87f, -1.95f, 2.15f);
        dij.LJII(24.37f, 39.04f);
        dij.LJIIIZ(51.67f, 51.67f, false, true, -2.72f, 2.62f);
        dij.LJIIJ(-0.67f, 0.57f, -1.08f, 0.8f, -1.41f, 0.9f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -2.48f, 0.0f);
        dij.LJIIJ(-0.33f, -0.1f, -0.74f, -0.33f, -1.41f, -0.9f);
        dij.LJIIJ(-0.69f, -0.58f, -1.51f, -1.4f, -2.72f, -2.62f);
        dij.LJII(9.2f, 34.62f);
        dij.LJIIIZ(51.73f, 51.73f, false, true, -2.62f, -2.73f);
        dij.LJIIIZ(4.32f, 4.32f, false, true, -0.9f, -1.41f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 0.0f, -2.47f);
        dij.LJIIJ(0.1f, -0.34f, 0.33f, -0.75f, 0.9f, -1.42f);
        dij.LJIIJ(0.59f, -0.68f, 1.41f, -1.5f, 2.62f, -2.72f);
        dij.LJIIL(13.18f, -13.18f);
        dij.LJIIIZ(13.56f, 13.56f, false, true, 2.15f, -1.95f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 1.45f, -0.6f);
        dij.LJ(26.5f, 8.0f, 27.08f, 8.0f, 28.88f, 8.0f);
        dij.LJIIJJI(8.56f);
        dij.LJIIJ(0.88f, 0.0f, 1.41f, 0.0f, 1.8f, 0.03f);
        dij.LJIIIZ(2.56f, 2.56f, false, true, 0.44f, 0.07f);
        C32856Cuy.a0(dij);
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
