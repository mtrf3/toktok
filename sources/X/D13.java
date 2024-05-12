package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D13 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D13() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 48.0f);
        this.LIZJ.LJIIIZ(24.0f, 24.0f, true, true, 0.0f, -48.0f);
        this.LIZJ.LJIIIZ(24.0f, 24.0f, false, true, 0.0f, 48.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -47872);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(29.15f, 28.47f);
        dij.LJIIIZ(2.36f, 2.36f, false, true, -2.34f, -2.36f);
        C32856Cuy.L7(dij);
        dij.LIZLLL();
        dij.LJIILIIL(0.42f, 3.9f);
        dij.LJIIJ(-1.6f, 1.6f, -4.67f, 1.73f, -5.57f, 1.73f);
        dij.LJIIJ(-0.9f, 0.0f, -3.97f, -0.12f, -5.57f, -1.74f);
        dij.LJIIIZ(0.62f, 0.62f, false, true, 0.0f, -0.87f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, 0.86f, 0.0f);
        dij.LJIIJ(1.0f, 1.02f, 3.16f, 1.39f, 4.7f, 1.39f);
        dij.LJIIJ(1.55f, 0.0f, 3.7f, -0.37f, 4.72f, -1.39f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, 0.86f, 0.0f);
        dij.LJIIJ(0.23f, 0.24f, 0.23f, 0.63f, 0.0f, 0.87f);
        dij.LIZLLL();
        dij.LJIIIIZZ(16.49f, 26.1f);
        C32856Cuy.L7(dij);
        dij.LJIIIZ(2.36f, 2.36f, false, true, -2.34f, -2.36f);
        dij.LIZLLL();
        dij.LJIIIIZZ(39.0f, 23.74f);
        dij.LJIIIZ(3.3f, 3.3f, false, false, -3.28f, -3.32f);
        dij.LJIIJ(-0.89f, 0.0f, -1.7f, 0.36f, -2.28f, 0.93f);
        dij.LJIIIZ(15.96f, 15.96f, false, false, -8.78f, -2.81f);
        dij.LJIIL(1.5f, -7.1f);
        dij.LJIIL(4.88f, 1.04f);
        dij.LJIIIZ(2.35f, 2.35f, false, false, 2.33f, 2.26f);
        dij.LJIIJ(1.3f, 0.0f, 2.35f, -1.06f, 2.35f, -2.37f);
        dij.LJIIIZ(2.33f, 2.33f, false, false, -4.44f, -1.05f);
        dij.LJIIL(-5.46f, -1.17f);
        dij.LJIIIZ(0.58f, 0.58f, false, false, -0.7f, 0.45f);
        dij.LJIIL(-1.63f, 7.8f);
        dij.LJIILL(0.13f);
        dij.LJIIJ(-3.5f, 0.1f, -6.66f, 1.16f, -8.94f, 2.81f);
        dij.LJIIIZ(3.24f, 3.24f, false, false, -2.27f, -0.92f);
        dij.LJIIIZ(3.32f, 3.32f, false, false, -1.34f, 6.34f);
        dij.LJIIJ(-0.05f, 0.33f, -0.08f, 0.66f, -0.08f, 1.0f);
        dij.LJIIJ(0.0f, 5.1f, 5.88f, 9.24f, 13.14f, 9.24f);
        dij.LJIIJ(7.25f, 0.0f, 13.13f, -4.13f, 13.13f, -9.23f);
        dij.LJIIJ(0.0f, -0.34f, -0.03f, -0.67f, -0.08f, -1.0f);
        dij.LIZJ(3.33f, 3.33f, false, false, 39.0f, 23.74f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
