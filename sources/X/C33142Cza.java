package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cza, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33142Cza extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33142Cza() {
        C32856Cuy.xc(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(20.6f, 18.0f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        dij.LJIILL(2.0f);
        dij.LJIIJ(-2.35f, 0.29f, -3.84f, 1.86f, -3.84f, 3.86f);
        dij.LJIIJ(0.0f, 2.5f, 1.94f, 3.27f, 3.83f, 3.8f);
        dij.LJIILL(3.9f);
        dij.LJIIIZ(5.43f, 5.43f, false, true, -2.54f, -1.3f);
        dij.LJIIJ(-0.24f, -0.22f, -0.63f, -0.2f, -0.81f, 0.06f);
        dij.LJIIL(-0.67f, 0.97f);
        dij.LJIIJ(-0.14f, 0.2f, -0.12f, 0.45f, 0.05f, 0.62f);
        dij.LJIIJ(0.97f, 0.92f, 2.28f, 1.6f, 3.97f, 1.78f);
        dij.LJIILL(1.31f);
        C32856Cuy.a5(dij);
        dij.LJIIJJI(0.92f);
        C32856Cuy.LLJJI(dij);
        dij.LJIILL(-1.31f);
        dij.LJ(24.77f, 33.86f, 26.0f, 32.1f, 26.0f, 30.1f);
        dij.LJIIJ(0.0f, -2.6f, -2.04f, -3.41f, -3.99f, -3.96f);
        dij.LJIILL(-3.46f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 1.98f, 0.97f);
        dij.LJIIJ(0.24f, 0.2f, 0.6f, 0.18f, 0.79f, -0.07f);
        dij.LJIIL(0.67f, -0.92f);
        dij.LJIIIZ(0.47f, 0.47f, false, false, -0.06f, -0.63f);
        dij.LIZJ(6.28f, 6.28f, false, false, 22.0f, 20.5f);
        dij.LJIJ(18.5f);
        C32856Cuy.LLJJIJI(dij);
        dij.LJIIJJI(-0.92f);
        dij.LIZLLL();
        dij.LJIILIIL(-0.5f, 4.58f);
        dij.LJIILL(3.02f);
        dij.LJIIJ(-0.9f, -0.3f, -1.54f, -0.69f, -1.54f, -1.42f);
        dij.LJIIJ(0.0f, -0.82f, 0.58f, -1.42f, 1.53f, -1.6f);
        dij.LIZLLL();
        dij.LJIIIIZZ(22.0f, 28.7f);
        dij.LJIIJ(0.98f, 0.32f, 1.69f, 0.76f, 1.69f, 1.62f);
        dij.LJIIJ(0.0f, 0.74f, -0.48f, 1.51f, -1.69f, 1.76f);
        dij.LJIJ(28.7f);
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
