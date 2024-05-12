package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D95 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D95() {
        this.LIZJ.LJIIIIZZ(21.5f, 16.07f);
        C32856Cuy.j8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(26.88f, 30.67f);
        this.LIZJ.LJIIJ(0.0f, -1.4f, -0.82f, -2.53f, -2.88f, -2.53f);
        this.LIZJ.LJIIJ(-2.07f, 0.0f, -2.89f, 1.13f, -2.89f, 2.53f);
        this.LIZJ.LJIILJJIL(0.82f, 2.53f, 2.89f, 2.53f, true);
        this.LIZJ.LJIIJ(2.06f, 0.0f, 2.88f, -1.13f, 2.88f, -2.53f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.y1(dij);
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
