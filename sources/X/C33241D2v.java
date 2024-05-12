package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33241D2v extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33241D2v() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(26.56f, 40.15f);
        dij.LJIIJ(0.0f, 0.47f, 0.38f, 0.85f, 0.85f, 0.85f);
        dij.LJIIJJI(1.7f);
        dij.LJIIJ(0.47f, 0.0f, 0.86f, -0.38f, 0.86f, -0.85f);
        dij.LJIJ(7.85f);
        dij.LIZJ(0.85f, 0.85f, false, false, 29.1f, 7.0f);
        dij.LJIIJJI(-1.7f);
        dij.LJIIIZ(0.85f, 0.85f, false, false, -0.85f, 0.85f);
        dij.LJIILL(2.55f);
        dij.LJI(14.8f);
        dij.LJIIJ(-3.35f, 0.0f, -5.02f, 0.0f, -6.3f, 0.65f);
        dij.LJIIIZ(5.96f, 5.96f, false, false, -2.6f, 2.6f);
        dij.LJIIJ(-0.65f, 1.27f, -0.65f, 2.94f, -0.65f, 6.27f);
        dij.LJIILL(8.16f);
        dij.LJIIJ(0.0f, 3.33f, 0.0f, 5.0f, 0.65f, 6.27f);
        dij.LJIIIZ(5.96f, 5.96f, false, false, 2.6f, 2.6f);
        dij.LJIIJ(1.28f, 0.65f, 2.95f, 0.65f, 6.3f, 0.65f);
        dij.LJIIJJI(11.76f);
        dij.LJIILL(2.55f);
        dij.LIZLLL();
        dij.LJIIIIZZ(13.77f, 20.18f);
        dij.LJIILL(7.64f);
        dij.LJIIJ(0.0f, 0.66f, 0.0f, 0.99f, 0.14f, 1.18f);
        dij.LJIIJ(0.12f, 0.17f, 0.3f, 0.27f, 0.51f, 0.3f);
        dij.LJIIJ(0.24f, 0.02f, 0.53f, -0.14f, 1.1f, -0.47f);
        dij.LJIIL(6.7f, -3.82f);
        dij.LJIIJ(0.59f, -0.33f, 0.88f, -0.5f, 0.97f, -0.71f);
        dij.LJIIIZ(0.73f, 0.73f, false, false, 0.0f, -0.6f);
        dij.LJIIJ(-0.1f, -0.21f, -0.38f, -0.38f, -0.97f, -0.71f);
        dij.LJIIL(-6.7f, -3.82f);
        dij.LJIIJ(-0.57f, -0.33f, -0.86f, -0.5f, -1.1f, -0.47f);
        dij.LJIIJ(-0.2f, 0.02f, -0.39f, 0.13f, -0.5f, 0.3f);
        dij.LJIIJ(-0.15f, 0.2f, -0.15f, 0.52f, -0.15f, 1.18f);
        dij.LIZLLL();
        dij.LJIILIIL(19.6f, -9.78f);
        dij.LJIIJ(3.19f, 0.0f, 4.78f, 0.0f, 6.0f, 0.59f);
        dij.LJIIIZ(5.96f, 5.96f, false, true, 2.79f, 2.78f);
        dij.LJIIJ(0.59f, 1.22f, 0.59f, 2.8f, 0.59f, 5.98f);
        dij.LJIILL(8.5f);
        dij.LJIIJ(0.0f, 3.17f, 0.0f, 4.76f, -0.6f, 5.98f);
        dij.LJIIIZ(5.96f, 5.96f, false, true, -2.78f, 2.78f);
        dij.LJIIJ(-1.22f, 0.59f, -2.81f, 0.59f, -6.0f, 0.59f);
        dij.LJIJ(10.4f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
