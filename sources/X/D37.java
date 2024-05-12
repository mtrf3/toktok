package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D37 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D37() {
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
        dij.LJIIIIZZ(34.73f, 11.7f);
        dij.LJIIJ(0.75f, 0.71f, 0.7f, 1.9f, -0.04f, 2.63f);
        dij.LJII(25.0f, 24.03f);
        dij.LJIIL(9.67f, 9.66f);
        dij.LJIIJ(0.73f, 0.73f, 0.79f, 1.92f, 0.03f, 2.64f);
        dij.LJIIIZ(17.0f, 17.0f, true, true, 0.02f, -24.64f);
        dij.LIZLLL();
        dij.LJIIIIZZ(22.5f, 17.0f);
        C32856Cuy.rh(dij);
        dij.LJIIIIZZ(38.0f, 29.0f);
        C32856Cuy.ak(dij);
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
