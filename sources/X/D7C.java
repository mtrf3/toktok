package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7C extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7C() {
        C32856Cuy.LLLLLJIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.76f, 29.33f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, false, -0.2f, 1.34f);
        this.LIZJ.LJIIJ(1.79f, 2.3f, 4.24f, 3.96f, 7.44f, 3.96f);
        this.LIZJ.LJIILJJIL(5.66f, -1.68f, 7.44f, -3.96f, true);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, false, -0.2f, -1.34f);
        this.LIZJ.LJIIL(-1.48f, -1.12f);
        this.LIZJ.LJIIIZ(1.09f, 1.09f, false, false, -1.42f, 0.12f);
        this.LIZJ.LJIIJ(-0.91f, 0.91f, -2.65f, 2.4f, -4.34f, 2.4f);
        this.LIZJ.LJIIJ(-1.8f, 0.0f, -3.45f, -1.43f, -4.33f, -2.35f);
        this.LIZJ.LJIIIZ(1.11f, 1.11f, false, false, -1.45f, -0.15f);
        this.LIZJ.LJIIL(-1.46f, 1.1f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.q5(dij);
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
