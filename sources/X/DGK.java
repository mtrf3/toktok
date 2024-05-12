package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGK extends AbstractC39455Fe7 {
    public DGK() {
        this.LIZJ.LJIIIIZZ(21.78f, 11.5f);
        this.LIZJ.LIZJ(10.39f, 10.39f, false, false, 11.5f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, 5.81f, 4.63f, 10.49f, 10.28f, 10.49f);
        this.LIZJ.LJIIJ(2.72f, 0.0f, 5.2f, -1.08f, 7.04f, -2.86f);
        this.LIZJ.LIZJ(10.56f, 10.56f, false, false, 32.05f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, -5.82f, -4.62f, -10.49f, -10.27f, -10.49f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.5f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, -7.43f, 5.92f, -13.5f, 13.28f, -13.5f);
        this.LIZJ.LJIIJ(7.35f, 0.0f, 13.27f, 6.07f, 13.27f, 13.5f);
        this.LIZJ.LJIIJ(0.0f, 3.3f, -1.17f, 6.33f, -3.12f, 8.68f);
        this.LIZJ.LJIIL(6.44f, 6.56f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.01f, 1.41f);
        this.LIZJ.LJIIL(-0.72f, 0.7f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, -0.01f);
        this.LIZJ.LJIIL(-6.46f, -6.58f);
        this.LIZJ.LJIIJ(-2.22f, 1.71f, -4.99f, 2.73f, -8.0f, 2.73f);
        this.LIZJ.LIZJ(13.39f, 13.39f, false, true, 8.5f, 21.99f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
