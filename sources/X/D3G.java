package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3G extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D3G() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -10983950);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(35.95f, 14.01f);
        dij.LJIIIZ(28.14f, 28.14f, false, false, -6.8f, -2.01f);
        dij.LJIIJ(-0.33f, 0.55f, -0.62f, 1.12f, -0.88f, 1.7f);
        dij.LJIIJ(-2.5f, -0.36f, -5.05f, -0.36f, -7.55f, 0.0f);
        dij.LJIIJ(-0.26f, -0.58f, -0.55f, -1.15f, -0.87f, -1.7f);
        dij.LJIIIZ(28.34f, 28.34f, false, false, -6.82f, 2.01f);
        dij.LJIIJ(-4.3f, 6.12f, -5.47f, 12.09f, -4.89f, 17.97f);
        dij.LIZJ(27.91f, 27.91f, false, false, 16.49f, 36.0f);
        dij.LJIIJ(0.68f, -0.87f, 1.27f, -1.8f, 1.79f, -2.77f);
        dij.LJIIIZ(18.1f, 18.1f, false, true, -2.82f, -1.29f);
        dij.LJIIL(0.7f, -0.5f);
        dij.LJIIIZ(20.3f, 20.3f, false, false, 16.69f, 0.0f);
        dij.LJIIJ(0.22f, 0.18f, 0.45f, 0.35f, 0.69f, 0.5f);
        dij.LJIIJ(-0.9f, 0.51f, -1.85f, 0.94f, -2.82f, 1.3f);
        dij.LJIIJ(0.51f, 0.96f, 1.1f, 1.89f, 1.78f, 2.76f);
        dij.LJIIJ(3.01f, -0.87f, 5.84f, -2.23f, 8.36f, -4.02f);
        dij.LJIIJ(0.69f, -6.82f, -1.17f, -12.73f, -4.9f, -17.97f);
        dij.LIZLLL();
        dij.LJIIIIZZ(19.02f, 28.36f);
        dij.LJIIJ(-1.63f, 0.0f, -2.97f, -1.42f, -2.97f, -3.16f);
        dij.LJIIJ(0.0f, -1.74f, 1.3f, -3.17f, 2.96f, -3.17f);
        dij.LJIIJ(1.67f, 0.0f, 3.0f, 1.43f, 2.98f, 3.17f);
        dij.LJIIJ(-0.03f, 1.74f, -1.31f, 3.16f, -2.97f, 3.16f);
        dij.LIZLLL();
        dij.LJIILIIL(10.96f, 0.0f);
        dij.LJIIJ(-1.63f, 0.0f, -2.97f, -1.42f, -2.97f, -3.16f);
        dij.LJIIJ(0.0f, -1.74f, 1.3f, -3.17f, 2.97f, -3.17f);
        dij.LJIIJ(1.67f, 0.0f, 3.0f, 1.43f, 2.97f, 3.17f);
        dij.LJIIJ(-0.03f, 1.74f, -1.31f, 3.16f, -2.97f, 3.16f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        this.LIZ.add(LIZIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
