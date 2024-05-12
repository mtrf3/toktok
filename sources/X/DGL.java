package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGL extends AbstractC39455Fe7 {
    public DGL() {
        this.LIZJ.LJIIIIZZ(6.66f, 8.55f);
        this.LIZJ.LJIIJ(4.8f, -4.83f, 12.36f, -4.8f, 17.34f, 0.53f);
        this.LIZJ.LJIIJ(4.98f, -5.34f, 12.54f, -5.36f, 17.34f, -0.53f);
        this.LIZJ.LJIIIZ(12.64f, 12.64f, false, true, 0.0f, 17.79f);
        this.LIZJ.LJIIL(-15.98f, 16.1f);
        this.LIZJ.LJIIIZ(1.91f, 1.91f, false, true, -2.72f, 0.0f);
        this.LIZJ.LJII(6.66f, 26.34f);
        this.LIZJ.LJIIIZ(12.64f, 12.64f, false, true, 0.0f, -17.79f);
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
