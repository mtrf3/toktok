package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGV extends AbstractC39455Fe7 {
    public DGV() {
        this.LIZJ.LJIIIIZZ(24.0f, 12.5f);
        this.LIZJ.LJIIIZ(11.5f, 11.5f, true, false, 7.4f, 20.31f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, true, 3.2f, 3.83f);
        this.LIZJ.LIZJ(16.5f, 16.5f, true, true, 40.5f, 24.0f);
        C32856Cuy.P4(this.LIZJ);
        this.LIZJ.LIZJ(11.5f, 11.5f, false, false, 24.0f, 12.5f);
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
