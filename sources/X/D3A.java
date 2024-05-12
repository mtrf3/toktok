package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3A extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D3A() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -16746497);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(25.65f, 34.99f);
        dij.LJ(14.82f, 34.99f, 8.25f, 27.48f, 8.0f, 15.0f);
        dij.LJIIJJI(5.48f);
        dij.LJIIJ(0.17f, 9.17f, 4.34f, 13.06f, 7.54f, 13.85f);
        C32856Cuy.m9(dij);
        dij.LJIIJJI(5.25f);
        dij.LJIILL(7.9f);
        dij.LJIIJ(3.09f, -0.33f, 6.31f, -3.93f, 7.4f, -7.9f);
        dij.LJIIJJI(5.17f);
        dij.LIZJ(15.22f, 15.22f, false, true, 32.0f, 24.96f);
        dij.LIZJ(15.79f, 15.79f, false, true, 40.04f, 35.0f);
        dij.LJIIJJI(-5.68f);
        dij.LJIIJ(-1.2f, -3.8f, -4.15f, -6.74f, -8.09f, -7.14f);
        dij.LJIILL(7.14f);
        dij.LJIIJJI(-0.62f);
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
