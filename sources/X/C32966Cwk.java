package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32966Cwk extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32966Cwk() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIILIIL(20.8f, 13.88f);
        dij.LJIIL(1.76f, -1.77f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -2.83f);
        dij.LJIIL(-0.67f, -0.67f);
        C32856Cuy.a3(dij);
        dij.LJIIJ(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        dij.LJIIL(0.67f, 0.67f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 0.0f, 8.49f);
        dij.LJIIL(-1.77f, 1.77f);
        C32856Cuy.D5(dij);
        dij.LJIIL(-2.12f, -2.13f);
        C32856Cuy.B5(dij);
        dij.LIZLLL();
        dij.LJIIIIZZ(36.0f, 12.8f);
        dij.LJIIJ(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        dij.LJIIL(-7.79f, 7.8f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, 0.0f);
        dij.LJIIL(-2.13f, -2.13f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, -0.7f);
        dij.LJIIL(7.8f, -7.8f);
        dij.LJIIJ(0.19f, -0.2f, 0.5f, -0.2f, 0.7f, 0.0f);
        I9A.LIZIZ(dij, 2.12f, 2.12f, -4.15f, 19.33f);
        dij.LJIIL(-24.0f, 8.0f);
        dij.LJIIJ(-0.8f, 0.26f, -1.55f, -0.5f, -1.29f, -1.3f);
        dij.LJIIL(8.0f, -24.0f);
        dij.LJIIIZ(1.02f, 1.02f, false, true, 1.69f, -0.4f);
        dij.LJIIL(16.0f, 16.0f);
        dij.LJIIJ(0.53f, 0.54f, 0.32f, 1.46f, -0.4f, 1.7f);
        dij.LIZLLL();
        dij.LJIILIIL(0.96f, -6.23f);
        dij.LJIIL(2.47f, -2.48f);
        C32856Cuy.LLLIZZ(dij);
        dij.LJIIL(0.7f, 0.71f);
        dij.LJIIJ(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f);
        dij.LJIIL(2.13f, -2.12f);
        C32856Cuy.Kb(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -8.49f, 0.0f);
        dij.LJII(30.0f, 23.06f);
        C32856Cuy.x5(dij);
        dij.LJIIL(2.12f, 2.13f);
        C32856Cuy.LLIIZ(dij);
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
