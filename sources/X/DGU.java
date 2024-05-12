package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGU extends AbstractC39455Fe7 {
    public DGU() {
        this.LIZJ.LJIIIIZZ(24.2f, 4.58f);
        this.LIZJ.LJIIJ(-0.15f, -0.77f, -1.25f, -0.77f, -1.4f, 0.0f);
        this.LIZJ.LJIIL(-0.24f, 1.13f);
        this.LIZJ.LIZJ(24.91f, 24.91f, false, true, 5.79f, 23.03f);
        this.LIZJ.LJIIL(-1.22f, 0.26f);
        this.LIZJ.LJIIJ(-0.76f, 0.17f, -0.76f, 1.25f, 0.0f, 1.42f);
        this.LIZJ.LJIIL(1.22f, 0.26f);
        this.LIZJ.LIZJ(24.91f, 24.91f, false, true, 22.56f, 42.3f);
        this.LIZJ.LJIIL(0.23f, 1.13f);
        this.LIZJ.LJIIJ(0.16f, 0.77f, 1.26f, 0.77f, 1.42f, 0.0f);
        this.LIZJ.LJIIL(0.23f, -1.13f);
        this.LIZJ.LJIIIZ(24.91f, 24.91f, false, true, 16.77f, -17.32f);
        this.LIZJ.LJIIL(1.22f, -0.26f);
        this.LIZJ.LJIIJ(0.76f, -0.17f, 0.76f, -1.25f, 0.0f, -1.42f);
        this.LIZJ.LJIIL(-1.22f, -0.26f);
        this.LIZJ.LIZJ(24.91f, 24.91f, false, true, 24.44f, 5.7f);
        this.LIZJ.LJIIL(-0.23f, -1.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.2f, 24.0f);
        this.LIZJ.LJIIIZ(25.03f, 25.03f, false, false, 13.3f, -13.99f);
        this.LIZJ.LIZJ(25.03f, 25.03f, false, false, 36.8f, 24.0f);
        this.LIZJ.LJIIIZ(25.03f, 25.03f, false, false, -13.3f, 13.99f);
        this.LIZJ.LIZJ(25.03f, 25.03f, false, false, 10.2f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(38.9f, 3.28f);
        this.LIZJ.LJIIIZ(0.42f, 0.42f, false, false, -0.8f, 0.0f);
        this.LIZJ.LJIIIZ(7.28f, 7.28f, false, true, -4.83f, 5.3f);
        this.LIZJ.LJIIJ(-0.36f, 0.15f, -0.36f, 0.69f, 0.0f, 0.85f);
        this.LIZJ.LJIIIZ(7.28f, 7.28f, false, true, 4.84f, 5.29f);
        this.LIZJ.LJIIJ(0.14f, 0.37f, 0.64f, 0.37f, 0.78f, 0.0f);
        this.LIZJ.LJIIIZ(7.28f, 7.28f, false, true, 4.84f, -5.3f);
        this.LIZJ.LJIIJ(0.36f, -0.15f, 0.36f, -0.69f, 0.0f, -0.84f);
        this.LIZJ.LJIIIZ(7.28f, 7.28f, false, true, -4.84f, -5.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(35.81f, 8.9f);
        this.LIZJ.LJIIIZ(5.22f, 5.22f, false, false, 2.68f, -2.98f);
        this.LIZJ.LJIIIZ(5.22f, 5.22f, false, false, 2.68f, 2.98f);
        this.LIZJ.LJIIIZ(5.22f, 5.22f, false, false, -2.68f, 2.98f);
        this.LIZJ.LJIIIZ(5.22f, 5.22f, false, false, -2.68f, -2.98f);
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
