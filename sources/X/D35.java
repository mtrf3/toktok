package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D35 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public D35() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -269568);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(17.0f, 25.0f);
        dij.LJIJ(14.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(11.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIIJ(-0.03f, 13.14f, -0.6f, 17.3f, -6.26f, 22.36f);
        dij.LJIIIZ(0.98f, 0.98f, false, true, -1.39f, -0.09f);
        dij.LJII(19.7f, 33.3f);
        dij.LJIIIZ(1.04f, 1.04f, false, true, 0.1f, -1.47f);
        dij.LIZJ(8.7f, 8.7f, false, false, 23.0f, 26.0f);
        dij.LJIIJJI(-5.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
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
