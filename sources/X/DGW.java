package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGW extends AbstractC39455Fe7 {
    public DGW() {
        this.LIZJ.LJIIIIZZ(24.71f, 32.03f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.58f, 0.0f);
        this.LIZJ.LJII(14.4f, 20.6f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.8f, -1.61f);
        this.LIZJ.LJIIJJI(17.54f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.79f, 1.61f);
        this.LIZJ.LJIIL(-8.82f, 11.42f);
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
