package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGX extends AbstractC39455Fe7 {
    public DGX() {
        this.LIZJ.LJIILIIL(20.41f, 14.24f);
        this.LIZJ.LJIIL(12.11f, 8.78f);
        this.LIZJ.LJIIJ(0.64f, 0.5f, 0.64f, 1.46f, 0.0f, 1.95f);
        this.LIZJ.LJIIL(-12.1f, 8.8f);
        this.LIZJ.LJIIIZ(0.89f, 0.89f, false, true, -1.42f, -0.73f);
        this.LIZJ.LJIILL(-18.1f);
        this.LIZJ.LJIIIZ(0.88f, 0.88f, false, true, 1.41f, -0.7f);
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
