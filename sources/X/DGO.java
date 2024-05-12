package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGO extends AbstractC39455Fe7 {
    public DGO() {
        this.LIZJ.LJIIIIZZ(36.73f, 11.27f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, true, true, -25.46f, 25.46f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 25.46f, -25.46f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.58f, 36.0f);
        this.LIZJ.LJII(12.0f, 13.42f);
        this.LIZJ.LIZJ(16.0f, 16.0f, false, false, 34.58f, 36.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.73f, -23.31f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, false, -21.9f, -0.69f);
        this.LIZJ.LJII(36.0f, 34.58f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, false, -0.69f, -21.9f);
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
