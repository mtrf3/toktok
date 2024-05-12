package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9O extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D9O() {
        this.LIZJ.LJIILIIL(32.26f, 16.62f);
        this.LIZJ.LJIIL(-1.7f, -1.07f);
        this.LIZJ.LJIIIZ(1.02f, 1.02f, false, false, -1.4f, 0.33f);
        this.LIZJ.LJIIL(-6.65f, 10.66f);
        this.LIZJ.LJIIL(-3.6f, -4.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.42f, -0.11f);
        this.LIZJ.LJIIL(-1.52f, 1.33f);
        this.LIZJ.LJIIIZ(1.01f, 1.01f, false, false, -0.1f, 1.42f);
        this.LIZJ.LJIIL(5.38f, 6.15f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.23f, -0.26f);
        this.LIZJ.LJIIL(8.1f, -12.96f);
        this.LIZJ.LJIIJ(0.29f, -0.48f, 0.15f, -1.1f, -0.32f, -1.4f);
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
