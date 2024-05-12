package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33168D0a extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33168D0a() {
        this.LIZJ.LJIIIIZZ(14.1f, 3.79f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, false, -1.58f, 0.28f);
        this.LIZJ.LJIIL(-0.48f, 2.85f);
        this.LIZJ.LJIIIZ(8.57f, 8.57f, false, true, -4.23f, 6.05f);
        this.LIZJ.LJIIL(-2.52f, 1.42f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, false, 0.28f, 1.6f);
        this.LIZJ.LJIIL(2.85f, 0.47f);
        this.LIZJ.LJIIIZ(8.57f, 8.57f, false, true, 6.05f, 4.23f);
        this.LIZJ.LJIIL(1.42f, 2.52f);
        this.LIZJ.LJIIJ(0.4f, 0.7f, 1.46f, 0.52f, 1.6f, -0.28f);
        this.LIZJ.LJIIL(0.47f, -2.85f);
        this.LIZJ.LJIIIZ(8.57f, 8.57f, false, true, 4.23f, -6.04f);
        this.LIZJ.LJIIL(2.52f, -1.43f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, false, -0.28f, -1.6f);
        this.LIZJ.LJIIL(-2.85f, -0.47f);
        this.LIZJ.LJIIIZ(8.57f, 8.57f, false, true, -6.05f, -4.23f);
        this.LIZJ.LJIIL(-1.42f, -2.52f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(7.5f, 20.9f);
        C32856Cuy.LJLIIIL(dij);
        C32856Cuy.g7(dij);
        dij.LJIIJJI(13.8f);
        C32856Cuy.Fa(dij);
        dij.LJIJ(17.1f);
        C32856Cuy.d4(dij);
        dij.LJIIJ(-1.28f, -0.65f, -2.96f, -0.65f, -6.32f, -0.65f);
        dij.LJIIJJI(-3.24f);
        dij.LJIIIZ(5.31f, 5.31f, false, true, -0.5f, 8.92f);
        dij.LJIIL(-2.59f, 1.47f);
        dij.LJIIIZ(4.41f, 4.41f, false, false, -2.17f, 3.1f);
        dij.LJIIL(-0.5f, 2.95f);
        dij.LJIIIZ(5.3f, 5.3f, false, true, -9.82f, 1.73f);
        dij.LJIIL(-1.47f, -2.6f);
        dij.LJIIIZ(4.41f, 4.41f, false, false, -3.1f, -2.17f);
        dij.LJI(7.5f);
        dij.LIZLLL();
        dij.LJIILIIL(24.74f, 0.6f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, 1.37f, 0.37f);
        dij.LJIIL(0.13f, 1.7f);
        dij.LJIIJ(0.1f, 1.3f, 0.78f, 2.47f, 1.85f, 3.2f);
        dij.LJIIL(1.41f, 0.97f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, -0.37f, 1.37f);
        dij.LJIIL(-1.7f, 0.13f);
        dij.LJIIJ(-1.3f, 0.1f, -2.47f, 0.78f, -3.2f, 1.85f);
        dij.LJIIL(-0.97f, 1.41f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, -1.37f, -0.37f);
        dij.LJIIL(-0.13f, -1.7f);
        dij.LJIIIZ(4.29f, 4.29f, false, false, -1.85f, -3.2f);
        dij.LJII(26.0f, 26.26f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, 0.37f, -1.37f);
        dij.LJIIL(1.7f, -0.13f);
        dij.LJIIIZ(4.29f, 4.29f, false, false, 3.2f, -1.85f);
        dij.LJIIL(0.97f, -1.41f);
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
