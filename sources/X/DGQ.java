package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGQ extends AbstractC39455Fe7 {
    public DGQ() {
        this.LIZJ.LJIIIIZZ(44.0f, 22.85f);
        this.LIZJ.LJIIJ(0.0f, 9.3f, -8.95f, 16.84f, -20.0f, 16.84f);
        this.LIZJ.LJIIJ(-1.34f, 0.0f, -2.65f, -0.1f, -3.91f, -0.32f);
        this.LIZJ.LJIIJ(-1.1f, -0.1f, -1.77f, 0.0f, -2.9f, 0.35f);
        this.LIZJ.LJIIJ(-0.43f, 0.14f, -0.92f, 0.4f, -1.48f, 0.71f);
        this.LIZJ.LJIIJ(-1.27f, 0.69f, -2.9f, 1.57f, -4.9f, 1.57f);
        this.LIZJ.LJIIJ(-0.03f, 0.0f, 0.1f, -0.13f, 0.31f, -0.34f);
        this.LIZJ.LJIIJ(0.72f, -0.73f, 2.43f, -2.44f, 2.43f, -3.81f);
        this.LIZJ.LJIILL(-0.64f);
        this.LIZJ.LJ(7.82f, 34.25f, 4.0f, 28.92f, 4.0f, 22.85f);
        this.LIZJ.LJ(4.0f, 13.55f, 12.95f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LJIILJJIL(20.0f, 7.54f, 20.0f, 16.85f, true);
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
