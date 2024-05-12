package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGY extends AbstractC39455Fe7 {
    public DGY() {
        this.LIZJ.LJIIIIZZ(31.36f, 5.14f);
        this.LIZJ.LJIIJ(0.4f, -1.64f, -1.61f, -2.77f, -2.8f, -1.58f);
        this.LIZJ.LJII(9.45f, 22.78f);
        this.LIZJ.LJIIJ(-0.85f, 0.85f, -0.45f, 2.31f, 0.72f, 2.6f);
        this.LIZJ.LJIIL(8.75f, 2.22f);
        this.LIZJ.LJIIJ(0.3f, 0.08f, 0.47f, 0.38f, 0.38f, 0.67f);
        this.LIZJ.LJIIL(-4.34f, 14.38f);
        this.LIZJ.LJIIJ(-0.5f, 1.65f, 1.54f, 2.89f, 2.77f, 1.67f);
        this.LIZJ.LJIIL(20.8f, -20.64f);
        this.LIZJ.LJIIJ(0.87f, -0.86f, 0.45f, -2.34f, -0.74f, -2.62f);
        this.LIZJ.LJIIL(-9.22f, -2.16f);
        this.LIZJ.LJIIIZ(0.53f, 0.53f, false, true, -0.4f, -0.64f);
        this.LIZJ.LJIIL(3.2f, -13.12f);
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
