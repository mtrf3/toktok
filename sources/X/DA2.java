package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DA2 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DA2() {
        C32856Cuy.O3(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(45.84f, 33.61f);
        dij.LJIIJ(0.37f, 0.37f, 0.37f, 0.97f, 0.0f, 1.34f);
        dij.LJIIL(-3.61f, 3.61f);
        dij.LJIIL(3.62f, 3.62f);
        dij.LJIIJ(0.36f, 0.36f, 0.36f, 0.96f, 0.0f, 1.33f);
        dij.LJIIL(-1.34f, 1.34f);
        dij.LJIIIZ(0.94f, 0.94f, false, true, -1.33f, 0.0f);
        dij.LJIIL(-3.62f, -3.62f);
        dij.LJIIL(-3.61f, 3.62f);
        dij.LJIIIZ(0.94f, 0.94f, false, true, -1.34f, 0.0f);
        dij.LJIIL(-1.33f, -1.34f);
        dij.LJIIIZ(0.94f, 0.94f, false, true, 0.0f, -1.33f);
        dij.LJIIL(3.61f, -3.62f);
        dij.LJIIL(-3.61f, -3.61f);
        dij.LJIIIZ(0.94f, 0.94f, false, true, 0.0f, -1.34f);
        dij.LJIIL(1.33f, -1.33f);
        dij.LJIIIZ(0.94f, 0.94f, false, true, 1.34f, 0.0f);
        dij.LJIIL(3.61f, 3.61f);
        dij.LJIIL(3.62f, -3.61f);
        dij.LJIIIZ(0.94f, 0.94f, false, true, 1.33f, 0.0f);
        dij.LJIIL(1.34f, 1.33f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
