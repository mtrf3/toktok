package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1J extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D1J() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(10.1f, 14.58f);
        dij.LIZJ(1.0f, 1.0f, false, true, 11.0f, 14.0f);
        C32856Cuy.LJJI(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.87f, 1.5f);
        dij.LJIIL(-13.0f, 23.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.82f, -0.2f);
        dij.LJII(19.2f, 26.0f);
        dij.LJIIL(-8.97f, -10.36f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.15f, -1.07f);
        dij.LIZLLL();
        dij.LJIILIIL(11.19f, 11.37f);
        dij.LJIIL(2.98f, 9.55f);
        dij.LJII(35.29f, 16.0f);
        dij.LJIIJJI(-22.1f);
        dij.LJIIL(7.1f, 8.21f);
        dij.LJIIL(7.96f, -4.94f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.69f, 0.16f);
        dij.LJIIL(0.52f, 0.85f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.16f, 0.69f);
        dij.LJIIL(-8.01f, 4.98f);
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
