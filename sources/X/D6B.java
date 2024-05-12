package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6B extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6B() {
        C32856Cuy.Ib(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(20.31f, 10.7f);
        dij.LJIIJ(0.5f, -0.29f, 1.12f, -0.26f, 1.6f, 0.06f);
        dij.LJIIL(8.88f, 5.9f);
        dij.LJIIJ(0.44f, 0.3f, 0.71f, 0.8f, 0.71f, 1.34f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, -0.7f, 1.33f);
        dij.LJIIL(-8.9f, 5.91f);
        dij.LJIIJ(-0.47f, 0.32f, -1.08f, 0.35f, -1.59f, 0.07f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, -0.81f, -1.4f);
        dij.LJIJ(12.09f);
        dij.LJIIJ(0.0f, -0.58f, 0.31f, -1.12f, 0.81f, -1.4f);
        dij.LIZLLL();
        dij.LJIIIIZZ(27.1f, 18.0f);
        dij.LJIIL(-4.48f, -2.98f);
        dij.LJIILL(5.96f);
        dij.LJII(27.1f, 18.0f);
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
