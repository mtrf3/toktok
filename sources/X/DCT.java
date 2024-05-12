package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCT extends AbstractC39455Fe7 {
    public DCT() {
        this.LIZJ.LJIIIIZZ(35.28f, 10.97f);
        this.LIZJ.LJIIJ(0.8f, 0.76f, 0.73f, 2.02f, -0.04f, 2.8f);
        this.LIZJ.LJII(25.03f, 24.01f);
        this.LIZJ.LJIIL(10.19f, 10.24f);
        this.LIZJ.LJIIJ(0.77f, 0.78f, 0.83f, 2.04f, 0.04f, 2.8f);
        this.LIZJ.LIZJ(17.81f, 17.81f, false, true, 22.92f, 42.0f);
        this.LIZJ.LJ(13.02f, 42.0f, 5.0f, 33.94f, 5.0f, 24.0f);
        this.LIZJ.LJIILLIIL(13.02f, 6.0f, 22.92f, 6.0f, true);
        this.LIZJ.LJIIJ(4.8f, 0.0f, 9.15f, 1.9f, 12.36f, 4.97f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.4f, 16.59f);
        this.LIZJ.LJIIIZ(3.17f, 3.17f, true, false, -6.34f, -0.02f);
        this.LIZJ.LJIIIZ(3.17f, 3.17f, false, false, 6.34f, 0.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(16.34f, 12.7f);
        this.LIZJ.LIZJ(5.28f, 5.28f, false, false, 44.0f, 24.0f);
        this.LIZJ.LJIIIZ(5.28f, 5.28f, true, false, -5.27f, 5.3f);
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
