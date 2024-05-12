package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9C extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D9C() {
        C32856Cuy.A(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.13f, 24.97f);
        dij.LJIIJ(0.74f, -0.43f, 0.74f, -1.51f, 0.0f, -1.95f);
        dij.LJIIL(-10.7f, -6.17f);
        dij.LJIIJ(-0.74f, -0.43f, -1.68f, 0.11f, -1.68f, 0.98f);
        dij.LJIILL(12.34f);
        dij.LJIIJ(0.0f, 0.87f, 0.94f, 1.4f, 1.69f, 0.97f);
        dij.LJIIL(10.68f, -6.17f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(52.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
