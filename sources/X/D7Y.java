package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7Y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7Y() {
        C32856Cuy.T1(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Th(dij);
        dij.LJIILIIL(6.55f, -1.82f);
        C32856Cuy.LLLLL(dij);
        dij.LJIILIIL(5.09f, 0.0f);
        C32856Cuy.LLLLL(dij);
        dij.LJIILIIL(-6.55f, 3.4f);
        dij.LJIIJ(0.0f, 1.14f, 1.3f, 2.78f, 2.91f, 2.78f);
        dij.LJIIJ(1.6f, 0.0f, 2.9f, -1.64f, 2.9f, -2.78f);
        dij.LJIILJJIL(-5.8f, -1.14f, -5.8f, 0.0f, true);
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
