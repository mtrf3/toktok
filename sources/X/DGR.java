package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGR extends AbstractC39455Fe7 {
    public DGR() {
        this.LIZJ.LJIIIIZZ(19.69f, 3.07f);
        this.LIZJ.LJIIJ(1.16f, -0.24f, 3.15f, 0.0f, 3.15f, 2.5f);
        this.LIZJ.LJIIIZ(16.4f, 16.4f, false, false, 19.1f, 15.65f);
        this.LIZJ.LJIIJ(2.01f, -0.34f, 3.06f, 0.69f, 3.06f, 2.6f);
        this.LIZJ.LIZJ(21.1f, 21.1f, false, true, 24.0f, 45.0f);
        this.LIZJ.LJ(12.4f, 45.0f, 3.0f, 35.51f, 3.0f, 23.81f);
        this.LIZJ.LIZJ(21.15f, 21.15f, false, true, 19.69f, 3.07f);
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
