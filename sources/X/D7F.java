package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7F extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7F() {
        C32856Cuy.Se(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.p(dij);
        dij.LJIILL(8.71f);
        dij.LJIIJ(0.0f, 0.17f, 0.08f, 0.32f, 0.22f, 0.41f);
        dij.LJIIL(6.93f, 4.77f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.13f, 0.7f);
        dij.LJIIL(-0.56f, 0.82f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, 0.13f);
        dij.LJIIL(-7.8f, -5.36f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.22f, -0.42f);
        dij.LJIJ(14.5f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
