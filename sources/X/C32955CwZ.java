package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32955CwZ extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32955CwZ() {
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
        dij.LJIIIIZZ(19.0f, 7.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        dij.LJIILL(4.0f);
        C32856Cuy.p3(dij);
        C32856Cuy.LJLJL(dij);
        C32856Cuy.tj(dij);
        dij.LJIIJJI(18.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        dij.LJIILL(-4.0f);
        C32856Cuy.C0(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        dij.LJIJ(11.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.LLLLJI(dij);
        dij.LJIILIIL(14.0f, 22.0f);
        C32856Cuy.rd(dij);
        dij.LJIILL(10.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-12.33f, 8.0f);
        dij.LJIIJJI(-1.1f);
        dij.LJIIJ(-0.41f, 0.0f, -0.76f, -0.32f, -0.76f, -0.71f);
        C32856Cuy.LJJJJZ(dij);
        dij.LJIIIZ(8.07f, 8.07f, false, true, -4.58f, -1.98f);
        dij.LJIIIZ(0.67f, 0.67f, false, true, -0.09f, -0.92f);
        dij.LJIIL(1.04f, -1.33f);
        dij.LJIIIZ(0.8f, 0.8f, false, true, 1.16f, -0.1f);
        dij.LJIIIZ(5.68f, 5.68f, false, false, 2.47f, 1.32f);
        dij.LJIILL(-2.95f);
        dij.LJIIIZ(8.71f, 8.71f, false, true, -2.93f, -1.19f);
        dij.LJIIIZ(3.44f, 3.44f, false, true, -1.5f, -2.96f);
        dij.LJIIJ(0.0f, -2.18f, 1.78f, -3.86f, 4.43f, -4.22f);
        dij.LJIILL(-1.15f);
        dij.LJIIJ(0.0f, -0.4f, 0.35f, -0.71f, 0.76f, -0.71f);
        C32856Cuy.e0(dij);
        dij.LJIIJ(0.42f, 0.0f, 0.76f, 0.32f, 0.76f, 0.71f);
        dij.LJIILL(1.18f);
        dij.LJIIJ(1.52f, 0.23f, 2.84f, 0.8f, 3.89f, 1.69f);
        dij.LJIIJ(0.3f, 0.25f, 0.32f, 0.66f, 0.1f, 0.95f);
        dij.LJIIL(-1.04f, 1.27f);
        dij.LJIIIZ(0.81f, 0.81f, false, true, -1.13f, 0.1f);
        dij.LJIIIZ(5.15f, 5.15f, false, false, -1.82f, -0.95f);
        dij.LJIILL(2.5f);
        dij.LJIIJ(1.03f, 0.27f, 2.14f, 0.62f, 3.0f, 1.24f);
        dij.LIZJ(3.55f, 3.55f, false, true, 26.0f, 30.74f);
        dij.LJIIJ(0.0f, 1.07f, -0.37f, 2.1f, -1.16f, 2.92f);
        dij.LJIIIZ(5.65f, 5.65f, false, true, -3.4f, 1.52f);
        C32856Cuy.l1(dij);
        dij.LJIIJ(0.0f, 0.4f, -0.35f, 0.72f, -0.77f, 0.72f);
        dij.LIZLLL();
        dij.LJIILIIL(0.76f, -4.81f);
        dij.LJIIJ(0.84f, -0.26f, 1.11f, -0.79f, 1.11f, -1.23f);
        dij.LJIIJ(0.0f, -0.25f, -0.1f, -0.44f, -0.31f, -0.62f);
        dij.LJIIJ(-0.19f, -0.15f, -0.45f, -0.3f, -0.8f, -0.42f);
        dij.LJIILL(2.27f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.62f, -8.36f);
        dij.LJIIJ(-0.67f, 0.2f, -0.97f, 0.6f, -0.97f, 1.07f);
        dij.LJIIJ(0.0f, 0.2f, 0.07f, 0.35f, 0.26f, 0.5f);
        dij.LJIIJ(0.16f, 0.13f, 0.4f, 0.25f, 0.71f, 0.37f);
        dij.LJIILL(-1.94f);
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
