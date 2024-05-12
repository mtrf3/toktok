package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGF extends AbstractC39455Fe7 {
    public DGF() {
        this.LIZJ.LJIIIIZZ(30.42f, 1.03f);
        this.LIZJ.LJIIIZ(29.4f, 29.4f, true, false, 19.33f, 51.54f);
        this.LIZJ.LJII(67.7f, 70.52f);
        this.LIZJ.LJIIIZ(1.55f, 1.55f, true, false, 2.18f, -2.19f);
        this.LIZJ.LJII(51.97f, 50.42f);
        this.LIZJ.LIZJ(29.4f, 29.4f, false, false, 30.42f, 1.03f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-26.3f, 29.4f);
        this.LIZJ.LJIIIZ(26.3f, 26.3f, true, true, 52.6f, 0.0f);
        this.LIZJ.LJIIIZ(26.3f, 26.3f, false, true, -52.6f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
