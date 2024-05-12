package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3R extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3R() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(40.2f, 24.52f);
        dij.LJIIJ(0.39f, -0.17f, 0.85f, 0.0f, 1.01f, 0.42f);
        dij.LJIIJ(2.4f, 6.26f, 0.23f, 13.61f, -5.22f, 17.58f);
        dij.LJIIIZ(0.76f, 0.76f, false, true, -1.08f, -0.22f);
        dij.LJIIL(-0.6f, -0.93f);
        dij.LJIIIZ(0.83f, 0.83f, false, true, 0.22f, -1.12f);
        dij.LJIIIZ(12.54f, 12.54f, false, false, 4.22f, -14.21f);
        dij.LJIIIZ(0.84f, 0.84f, false, true, 0.43f, -1.06f);
        I9A.LIZIZ(dij, 1.01f, -0.46f, -5.8f, 2.6f);
        dij.LJIIJ(0.4f, -0.19f, 0.87f, 0.0f, 1.0f, 0.4f);
        dij.LJIIJ(1.18f, 3.46f, 0.02f, 7.4f, -2.86f, 9.67f);
        dij.LJIIJ(-0.34f, 0.27f, -0.83f, 0.16f, -1.07f, -0.2f);
        dij.LJIIL(-0.6f, -0.94f);
        dij.LJIIJ(-0.23f, -0.36f, -0.13f, -0.85f, 0.2f, -1.13f);
        dij.LJIIIZ(6.13f, 6.13f, false, false, 1.87f, -6.3f);
        dij.LJIIJ(-0.13f, -0.42f, 0.05f, -0.88f, 0.45f, -1.06f);
        C279417u.LIZIZ(dij, 1.01f, -0.45f, 17.32f, 8.63f);
        dij.LJIIJ(-6.06f, 0.0f, -11.05f, 4.7f, -11.05f, 10.61f);
        dij.LJIIJ(0.0f, 2.77f, 1.1f, 5.28f, 2.9f, 7.17f);
        dij.LJIIL(-0.51f, 9.4f);
        dij.LJIIJ(-0.14f, 2.68f, 4.97f, 2.75f, 6.67f, 2.75f);
        dij.LJIIJ(1.67f, 0.0f, 6.83f, -0.07f, 6.68f, -2.75f);
        dij.LJIIL(-0.12f, -3.08f);
        dij.LJIIL(0.43f, 0.08f);
        dij.LJIIJ(1.72f, 0.33f, 4.44f, 0.86f, 5.47f, -0.68f);
        dij.LJIIJ(0.74f, -1.1f, 0.6f, -2.76f, 0.5f, -4.13f);
        dij.LJIIJ(-0.02f, -0.26f, -0.05f, -0.53f, -0.05f, -0.77f);
        dij.LJIIJ(1.14f, -0.33f, 2.74f, -1.06f, 2.35f, -2.51f);
        dij.LJIIJ(-0.31f, -1.15f, -1.15f, -2.16f, -1.92f, -3.1f);
        dij.LJIIL(-0.46f, -0.56f);
        dij.LJIIJ(0.11f, -0.6f, 0.17f, -1.2f, 0.17f, -1.82f);
        dij.LJIIJ(0.0f, -5.9f, -5.0f, -10.6f, -11.06f, -10.6f);
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
