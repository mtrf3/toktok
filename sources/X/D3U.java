package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3U extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3U() {
        this.LIZJ.LIZIZ(new RectF(0.0f, 0.0f, 48.0f, 48.0f), 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -10994177);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(31.99f, 31.57f);
        dij.LJIIL(-5.02f, -0.7f);
        dij.LJIIIZ(0.66f, 0.66f, false, false, -0.72f, 0.4f);
        dij.LJIIJ(-0.83f, 2.01f, -1.5f, 5.53f, 1.73f, 6.12f);
        dij.LJIIJ(3.17f, 0.58f, 4.37f, -2.88f, 4.59f, -5.1f);
        dij.LJIIIZ(0.66f, 0.66f, false, false, -0.58f, -0.72f);
        dij.LIZLLL();
        dij.LJIIIIZZ(29.87f, 16.64f);
        dij.LJIIJ(-4.75f, 0.52f, -3.06f, 6.9f, -3.31f, 11.12f);
        dij.LJIIJ(-0.03f, 0.39f, 0.24f, 0.73f, 0.62f, 0.78f);
        dij.LJIIL(5.4f, 0.62f);
        dij.LJIIJ(0.32f, 0.04f, 0.63f, -0.14f, 0.74f, -0.44f);
        dij.LJIIJ(1.27f, -3.51f, 3.74f, -12.86f, -3.45f, -12.08f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.9f, 26.14f);
        dij.LJIIL(5.06f, -0.44f);
        dij.LJIIJ(0.3f, -0.03f, 0.6f, 0.14f, 0.7f, 0.44f);
        dij.LJIIJ(0.7f, 2.1f, 1.18f, 5.76f, -2.08f, 6.19f);
        dij.LJIIJ(-3.21f, 0.42f, -4.21f, -3.21f, -4.3f, -5.51f);
        dij.LJIIIZ(0.66f, 0.66f, false, true, 0.62f, -0.68f);
        dij.LIZLLL();
        dij.LJIIIIZZ(18.88f, 10.94f);
        dij.LJIIJ(4.72f, 0.8f, 2.65f, 7.27f, 2.67f, 11.61f);
        dij.LJIIJ(0.0f, 0.39f, -0.28f, 0.71f, -0.66f, 0.74f);
        dij.LJIIL(-5.44f, 0.35f);
        dij.LJIIIZ(0.69f, 0.69f, false, true, -0.71f, -0.5f);
        dij.LJIIJ(-1.07f, -3.66f, -3.02f, -13.39f, 4.14f, -12.2f);
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
