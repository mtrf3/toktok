package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3M extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D3M() {
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
        dij.LJIILIIL(20.96f, 32.52f);
        dij.LJIIL(13.98f, -21.6f);
        dij.LJIIIZ(0.7f, 0.7f, false, true, 0.98f, -0.2f);
        dij.LJIIL(1.66f, 1.07f);
        dij.LJIIIZ(0.7f, 0.7f, false, true, 0.21f, 0.98f);
        dij.LJII(22.6f, 36.26f);
        dij.LJIIIZ(1.7f, 1.7f, false, true, -2.7f, 0.2f);
        dij.LJIIL(-9.45f, -10.8f);
        dij.LJIIIZ(0.7f, 0.7f, false, true, 0.06f, -1.0f);
        dij.LJIIL(1.5f, -1.31f);
        dij.LJIIIZ(0.7f, 0.7f, false, true, 1.0f, 0.06f);
        dij.LJIIL(7.96f, 9.1f);
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
