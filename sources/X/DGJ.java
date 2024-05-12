package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGJ extends AbstractC39455Fe7 {
    public DGJ() {
        this.LIZJ.LJIIIIZZ(46.0f, 21.5f);
        this.LIZJ.LJ(46.0f, 11.84f, 36.15f, 4.0f, 24.0f, 4.0f);
        this.LIZJ.LJIILLIIL(2.0f, 11.84f, 2.0f, 21.5f, true);
        this.LIZJ.LJIILLIIL(7.5f, 39.0f, 24.0f, 39.0f, true);
        this.LIZJ.LJIILL(7.32f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, 1.47f, 0.86f);
        this.LIZJ.LJ(35.96f, 41.23f, 46.0f, 32.96f, 46.0f, 21.5f);
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
