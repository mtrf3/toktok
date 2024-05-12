package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33047Cy3 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33047Cy3() {
        this.LIZJ.LJIIIIZZ(16.0f, 20.0f);
        C32856Cuy.B(this.LIZJ);
        C32856Cuy.LLLLJ(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(41.68f, 39.24f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, 3.06f, -3.06f);
        dij.LJIIJ(0.76f, -1.5f, 0.76f, -3.46f, 0.76f, -7.38f);
        C32856Cuy.z8(dij);
        C32856Cuy.Yk(dij);
        dij.LJ(40.18f, 4.0f, 38.22f, 4.0f, 34.3f, 4.0f);
        dij.LJI(13.7f);
        C32856Cuy.io(dij);
        dij.LJIIJ(-0.76f, 1.5f, -0.76f, 3.46f, -0.76f, 7.38f);
        dij.LJIILL(13.6f);
        dij.LJIIJ(0.0f, 3.92f, 0.0f, 5.88f, 0.76f, 7.38f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, 3.06f, 3.06f);
        dij.LJIIJ(1.5f, 0.76f, 3.46f, 0.76f, 7.38f, 0.76f);
        dij.LJIIJJI(3.1f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.35f, 0.15f);
        dij.LJIIL(4.73f, 4.73f);
        C32856Cuy.h7(dij);
        dij.LJIIL(4.73f, -4.73f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.36f, -0.15f);
        dij.LJIIJJI(3.09f);
        dij.LJIIJ(3.92f, 0.0f, 5.88f, 0.0f, 7.38f, -0.76f);
        dij.LIZLLL();
        dij.LJIIIIZZ(6.5f, 15.2f);
        dij.LJIIJ(0.0f, -2.03f, 0.0f, -3.3f, 0.08f, -4.27f);
        dij.LJIIJ(0.08f, -0.92f, 0.2f, -1.2f, 0.25f, -1.3f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 1.3f, -1.3f);
        dij.LJIIJ(0.1f, -0.05f, 0.38f, -0.17f, 1.3f, -0.25f);
        dij.LJ(10.39f, 8.0f, 11.67f, 8.0f, 13.7f, 8.0f);
        dij.LJIIJJI(20.6f);
        dij.LJIIJ(2.03f, 0.0f, 3.3f, 0.0f, 4.27f, 0.08f);
        dij.LJIIJ(0.92f, 0.08f, 1.2f, 0.2f, 1.3f, 0.25f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 1.3f, 1.3f);
        dij.LJIIJ(0.05f, 0.1f, 0.17f, 0.38f, 0.25f, 1.3f);
        dij.LJIIJ(0.08f, 0.96f, 0.08f, 2.24f, 0.08f, 4.27f);
        dij.LJIILL(13.6f);
        dij.LJIIJ(0.0f, 2.03f, 0.0f, 3.3f, -0.08f, 4.27f);
        dij.LJIIJ(-0.08f, 0.92f, -0.2f, 1.2f, -0.25f, 1.3f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -1.3f, 1.3f);
        dij.LJIIJ(-0.1f, 0.05f, -0.38f, 0.17f, -1.3f, 0.25f);
        dij.LJIIJ(-0.96f, 0.08f, -2.24f, 0.08f, -4.27f, 0.08f);
        dij.LJIIJJI(-3.1f);
        dij.LJIIIZ(4.5f, 4.5f, false, false, -3.17f, 1.32f);
        dij.LJII(24.0f, 41.34f);
        dij.LJIIL(-4.03f, -4.02f);
        dij.LIZJ(4.5f, 4.5f, false, false, 16.8f, 36.0f);
        dij.LJI(13.7f);
        dij.LJIIJ(-2.03f, 0.0f, -3.3f, 0.0f, -4.27f, -0.08f);
        dij.LJIIJ(-0.92f, -0.08f, -1.2f, -0.2f, -1.3f, -0.25f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -1.3f, -1.3f);
        dij.LJIIIZ(3.6f, 3.6f, false, true, -0.25f, -1.3f);
        dij.LJIIJ(-0.08f, -0.96f, -0.08f, -2.24f, -0.08f, -4.27f);
        C32856Cuy.z8(dij);
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
