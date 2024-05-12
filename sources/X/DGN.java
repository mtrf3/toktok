package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGN extends AbstractC39455Fe7 {
    public DGN() {
        this.LIZJ.LJIIIIZZ(16.5f, 14.0f);
        this.LIZJ.LJIIJ(1.48f, 0.0f, 2.9f, 0.3f, 4.17f, 0.86f);
        this.LIZJ.LIZJ(14.45f, 14.45f, false, false, 17.0f, 24.5f);
        this.LIZJ.LJIIJ(0.0f, 3.7f, 1.39f, 7.08f, 3.67f, 9.64f);
        this.LIZJ.LIZJ(10.5f, 10.5f, true, true, 16.5f, 14.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.5f, -1.91f);
        this.LIZJ.LJIIIZ(14.5f, 14.5f, true, false, 0.0f, 24.82f);
        this.LIZJ.LJIIIZ(14.5f, 14.5f, true, false, 0.0f, -24.82f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 5.06f);
        this.LIZJ.LJIIIZ(10.47f, 10.47f, false, true, 0.0f, 14.7f);
        this.LIZJ.LJIIIZ(10.47f, 10.47f, false, true, 0.0f, -14.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.33f, 16.99f);
        this.LIZJ.LIZJ(14.45f, 14.45f, false, false, 31.0f, 24.5f);
        this.LIZJ.LJIIJ(0.0f, -3.7f, -1.39f, -7.08f, -3.67f, -9.64f);
        this.LIZJ.LJIIIZ(10.5f, 10.5f, true, true, 0.0f, 19.28f);
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
