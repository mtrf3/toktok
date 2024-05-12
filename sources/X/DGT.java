package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGT extends AbstractC39455Fe7 {
    public DGT() {
        this.LIZJ.LJIIIIZZ(31.14f, 35.89f);
        this.LIZJ.LJII(36.73f, 7.3f);
        this.LIZJ.LJIIJ(0.11f, -0.57f, -0.63f, -0.89f, -0.95f, -0.4f);
        this.LIZJ.LJIIL(-9.12f, 13.77f);
        this.LIZJ.LJII(19.0f, 11.95f);
        this.LIZJ.LJIIIZ(0.79f, 0.79f, false, false, -1.36f, 0.38f);
        this.LIZJ.LJIIL(-5.6f, 28.59f);
        this.LIZJ.LJIIJ(-0.1f, 0.57f, 0.64f, 0.89f, 0.96f, 0.4f);
        this.LIZJ.LJIIL(9.12f, -13.78f);
        this.LIZJ.LJIIL(7.66f, 8.73f);
        this.LIZJ.LJIIIZ(0.79f, 0.79f, false, false, 1.36f, -0.38f);
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
