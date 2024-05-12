package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7J extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7J() {
        C32856Cuy.M(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(12.06f, 17.55f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 6.93f, -4.0f);
        dij.LJIIL(4.56f, 7.9f);
        dij.LJIIIZ(4.01f, 4.01f, false, true, 5.77f, 0.17f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 5.72f, -0.01f);
        dij.LJIIL(0.05f, -0.03f);
        dij.LJIIIZ(5.07f, 5.07f, false, true, 6.93f, 1.85f);
        dij.LJIIL(2.71f, 4.7f);
        dij.LJIIIZ(11.5f, 11.5f, false, true, -4.2f, 15.71f);
        dij.LJIIL(-2.74f, 1.58f);
        dij.LJIIIZ(11.5f, 11.5f, false, true, -10.84f, 0.35f);
        dij.LJIIL(-14.21f, -7.03f);
        dij.LJIIIZ(3.8f, 3.8f, false, true, 2.88f, -7.02f);
        dij.LJIIL(5.72f, 1.9f);
        dij.LJIIL(-1.02f, -1.77f);
        dij.LJIIL(-8.26f, -14.3f);
        dij.LIZLLL();
        dij.LJIILIIL(10.85f, 12.78f);
        C32856Cuy.i1(dij);
        dij.LJIIL(1.68f, 2.92f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, -2.95f, 3.62f);
        dij.LJIIL(-6.96f, -2.31f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.61f, 1.48f);
        dij.LJIIL(14.2f, 7.03f);
        dij.LJIIIZ(8.5f, 8.5f, false, false, 8.02f, -0.26f);
        dij.LJIIL(2.73f, -1.57f);
        dij.LJIIIZ(8.5f, 8.5f, false, false, 3.11f, -11.61f);
        dij.LJIIL(-2.71f, -4.7f);
        dij.LJIIIZ(2.07f, 2.07f, false, false, -2.77f, -0.8f);
        dij.LJIIL(0.75f, 1.3f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, -2.6f, 1.5f);
        dij.LJIIL(-0.49f, -0.85f);
        C32856Cuy.LJJJJLI(dij);
        dij.LJIIL(-1.26f, -2.16f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.73f, 0.99f);
        dij.LJIIL(0.25f, 0.44f);
        C32856Cuy.i1(dij);
        dij.LJIIL(0.5f, 0.86f);
        dij.LJIIIZ(1.5f, 1.5f, true, true, -2.6f, 1.5f);
        dij.LJIIL(-0.75f, -1.3f);
        C32856Cuy.LJJJJLI(dij);
        dij.LJIIL(-1.5f, -2.58f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.73f, 1.0f);
        dij.LJIIL(1.75f, 3.03f);
        dij.LJIIIZ(1.5f, 1.5f, true, true, -2.6f, 1.5f);
        dij.LJIIL(-1.75f, -3.03f);
        C32856Cuy.LJJJJLI(dij);
        dij.LJIIL(-6.5f, -11.24f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.73f, 1.0f);
        dij.LJIIL(8.25f, 14.28f);
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
