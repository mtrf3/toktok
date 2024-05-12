package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32971Cwp extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32971Cwp() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -1);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(42.0f, 32.23f);
        dij.LJII(25.3f, 24.0f);
        dij.LJII(42.0f, 15.77f);
        C32856Cuy.j9(dij);
        dij.LJIIJ(0.0f, -0.25f, -0.25f, -0.41f, -0.5f, -0.33f);
        dij.LJIIL(-6.6f, 3.2f);
        dij.LIZJ(4.48f, 4.48f, false, false, 30.47f, 11.0f);
        dij.LJI(10.43f);
        dij.LIZJ(4.42f, 4.42f, false, false, 6.0f, 15.36f);
        C32856Cuy.p9(dij);
        dij.LJIIJ(0.0f, 0.58f, 0.33f, 1.16f, 0.84f, 1.4f);
        dij.LJII(16.19f, 24.0f);
        dij.LJIIL(-9.35f, 4.6f);
        dij.LJIIJ(-0.5f, 0.25f, -0.84f, 0.83f, -0.84f, 1.4f);
        dij.LJIILL(2.64f);
        dij.LJ(6.0f, 35.03f, 8.0f, 37.0f, 10.43f, 37.0f);
        dij.LJIIJJI(20.04f);
        dij.LJIIIZ(4.41f, 4.41f, false, false, 4.43f, -3.87f);
        dij.LJIIL(6.6f, 3.21f);
        dij.LJIIJ(0.25f, 0.08f, 0.5f, -0.08f, 0.5f, -0.33f);
        dij.LJIILL(-3.78f);
        dij.LIZLLL();
        dij.LJIIIIZZ(10.0f, 16.59f);
        dij.LJIILL(-1.15f);
        dij.LJIIJ(0.0f, -0.24f, 0.18f, -0.4f, 0.43f, -0.4f);
        dij.LJIIJJI(20.04f);
        dij.LJIIJ(0.25f, 0.0f, 0.42f, 0.16f, 0.42f, 0.4f);
        C32856Cuy.m1(dij);
        dij.LJII(20.7f, 21.86f);
        dij.LJII(10.0f, 16.6f);
        dij.LIZLLL();
        dij.LJIILIIL(20.9f, 16.05f);
        dij.LJIIJ(0.0f, 0.25f, -0.18f, 0.41f, -0.43f, 0.41f);
        dij.LJI(10.43f);
        dij.LJIIJ(-0.25f, 0.0f, -0.42f, -0.16f, -0.42f, -0.41f);
        dij.LJIILL(-1.15f);
        dij.LJIIL(10.7f, -5.27f);
        dij.LJIIL(10.18f, 5.02f);
        C32856Cuy.m1(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-16383999);
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
