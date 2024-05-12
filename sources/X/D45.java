package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D45 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D45() {
        this.LIZJ.LJIIIIZZ(26.24f, 26.24f);
        this.LIZJ.LJIIIZ(3.62f, 3.62f, false, true, -5.63f, -0.63f);
        this.LIZJ.LJIIL(-6.26f, -9.96f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, true, 1.3f, -1.3f);
        this.LIZJ.LJIIL(9.96f, 6.26f);
        this.LIZJ.LJIIIZ(3.62f, 3.62f, false, true, 0.63f, 5.63f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 2.2f);
        dij.LJIIJ(-1.1f, 0.0f, -1.98f, 0.89f, -1.98f, 1.98f);
        dij.LJIILL(4.87f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.99f, 0.99f);
        dij.LJIIJJI(1.98f);
        C32856Cuy.Dn(dij);
        dij.LJIJ(6.27f);
        dij.LJIIIZ(17.85f, 17.85f, true, true, -15.0f, 5.52f);
        dij.LJIIJ(0.37f, -0.4f, 0.39f, -1.03f, 0.01f, -1.42f);
        dij.LJII(9.65f, 8.93f);
        dij.LJIIIZ(0.96f, 0.96f, false, false, -1.39f, -0.01f);
        dij.LIZJ(21.8f, 21.8f, true, false, 24.0f, 2.2f);
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
