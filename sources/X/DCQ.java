package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCQ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DCQ() {
        this.LIZJ.LJIIIIZZ(33.4f, 15.93f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.33f, -1.33f);
        this.LIZJ.LJIIL(-11.5f, 5.5f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.47f, 0.47f);
        this.LIZJ.LJIIL(-5.5f, 11.5f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.33f, 1.33f);
        this.LIZJ.LJIIL(11.5f, -5.5f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.47f, -0.47f);
        this.LIZJ.LJIIL(5.5f, -11.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.62f, 30.38f);
        this.LIZJ.LJIIL(3.67f, -7.67f);
        this.LIZJ.LJIIL(4.0f, 4.0f);
        this.LIZJ.LJIIL(-7.67f, 3.67f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.09f, -9.09f);
        this.LIZJ.LJIIL(7.67f, -3.67f);
        this.LIZJ.LJIIL(-3.67f, 7.67f);
        this.LIZJ.LJIIL(-4.0f, -4.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 6.0f);
        dij.LJIIIZ(18.0f, 18.0f, true, false, 0.0f, 36.0f);
        dij.LJIIIZ(18.0f, 18.0f, false, false, 0.0f, -36.0f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 2.0f);
        dij.LJIIIZ(16.0f, 16.0f, true, true, 0.0f, 32.0f);
        dij.LJIIIZ(16.0f, 16.0f, false, true, 0.0f, -32.0f);
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
