package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5A extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5A() {
        C32856Cuy.n4(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.D4(dij);
        dij.LJ(4.0f, 37.92f, 4.0f, 35.68f, 4.0f, 31.2f);
        dij.LJIJ(16.8f);
        dij.LIZLLL();
        dij.LJIIIIZZ(16.8f, 8.0f);
        dij.LJIIJ(-2.3f, 0.0f, -3.8f, 0.0f, -4.93f, 0.1f);
        dij.LJIIIZ(4.56f, 4.56f, false, false, -1.69f, 0.34f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -1.74f, 1.74f);
        dij.LJIIJ(-0.1f, 0.2f, -0.26f, 0.6f, -0.34f, 1.7f);
        dij.LJ(8.0f, 13.0f, 8.0f, 14.48f, 8.0f, 16.8f);
        dij.LJIILL(14.4f);
        dij.LJIIJ(0.0f, 2.3f, 0.0f, 3.8f, 0.1f, 4.93f);
        dij.LJIIJ(0.08f, 1.09f, 0.24f, 1.49f, 0.34f, 1.69f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 1.74f, 1.74f);
        dij.LJIIJ(0.2f, 0.1f, 0.6f, 0.26f, 1.7f, 0.34f);
        dij.LJIIIZ(68.0f, 68.0f, false, false, 4.92f, 0.1f);
        C32856Cuy.ac(dij);
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
