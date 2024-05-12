package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6L extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6L() {
        C32856Cuy.w3(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.22f, 47.39f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 1.51f, 0.0f);
        dij.LJIIL(18.01f, -10.4f);
        dij.LJIIIZ(1.52f, 1.52f, false, false, 0.0f, -2.63f);
        dij.LJIIL(-18.0f, -10.4f);
        dij.LJIIIZ(1.52f, 1.52f, false, false, -2.27f, 1.31f);
        dij.LJIILL(20.8f);
        dij.LJIIJ(-0.01f, 0.55f, 0.28f, 1.05f, 0.75f, 1.32f);
        dij.LIZLLL();
        dij.LJIILIIL(15.74f, -11.72f);
        dij.LJIIL(-13.47f, 7.78f);
        dij.LJIJ(27.9f);
        dij.LJIIL(13.47f, 7.77f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
