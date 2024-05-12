package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFW extends AbstractC39455Fe7 {
    public DFW() {
        C32856Cuy.LLJILJILJ(this.LIZJ);
        this.LIZJ.LJIILIIL(-1.1f, 14.83f);
        C32856Cuy.j8(this.LIZJ);
        this.LIZJ.LJIILIIL(5.38f, 14.6f);
        this.LIZJ.LJIIJ(0.0f, 1.4f, -0.82f, 2.53f, -2.88f, 2.53f);
        this.LIZJ.LJIIJ(-2.07f, 0.0f, -2.89f, -1.13f, -2.89f, -2.53f);
        this.LIZJ.LJIILJJIL(0.82f, -2.53f, 2.89f, -2.53f, true);
        this.LIZJ.LJIIJ(2.06f, 0.0f, 2.88f, 1.13f, 2.88f, 2.53f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
