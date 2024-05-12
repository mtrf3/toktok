package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGH extends AbstractC39455Fe7 {
    public DGH() {
        this.LIZJ.LJIIIIZZ(30.28f, 20.44f);
        this.LIZJ.LJIIJ(0.44f, -1.08f, 0.84f, -2.15f, 1.32f, -3.22f);
        this.LIZJ.LJIIIZ(15.24f, 15.24f, false, true, 4.88f, -6.16f);
        this.LIZJ.LJIIIZ(2.12f, 2.12f, false, true, 2.44f, -0.22f);
        this.LIZJ.LIZJ(2.14f, 2.14f, false, true, 40.06f, 13.0f);
        this.LIZJ.LJIIIZ(25.1f, 25.1f, false, false, 0.2f, 5.86f);
        this.LIZJ.LJIIJ(0.19f, 1.3f, 0.6f, 2.57f, 1.21f, 3.73f);
        this.LIZJ.LJIIIZ(13.04f, 13.04f, false, true, 1.5f, 7.13f);
        this.LIZJ.LJIIIZ(19.9f, 19.9f, false, true, -1.64f, 6.58f);
        this.LIZJ.LJIIIZ(14.1f, 14.1f, false, true, -6.67f, 7.02f);
        this.LIZJ.LJIIJ(-3.68f, 2.0f, -7.84f, 2.92f, -12.02f, 2.64f);
        this.LIZJ.LJIIIZ(20.78f, 20.78f, false, true, -12.46f, -4.64f);
        this.LIZJ.LIZJ(13.63f, 13.63f, false, true, 5.2f, 32.3f);
        this.LIZJ.LJIIJ(-0.6f, -4.15f, 0.14f, -8.39f, 2.1f, -12.09f);
        this.LIZJ.LJIIJ(0.51f, -0.92f, 1.15f, -1.75f, 1.9f, -2.49f);
        this.LIZJ.LJIIIZ(2.13f, 2.13f, false, true, 3.72f, 1.07f);
        this.LIZJ.LJIIJ(0.3f, 1.16f, 0.69f, 2.29f, 1.06f, 3.43f);
        this.LIZJ.LJIIJ(0.12f, 0.36f, 0.28f, 0.72f, 0.5f, 1.23f);
        this.LIZJ.LJIIJ(0.09f, -1.07f, 0.15f, -1.9f, 0.26f, -2.77f);
        this.LIZJ.LJIIIZ(26.55f, 26.55f, false, true, 5.22f, -13.73f);
        this.LIZJ.LJIIIZ(21.35f, 21.35f, false, true, 4.95f, -4.5f);
        this.LIZJ.LJIIIZ(2.12f, 2.12f, false, true, 3.18f, 0.7f);
        this.LIZJ.LJIIJ(0.2f, 0.37f, 0.28f, 0.79f, 0.24f, 1.2f);
        this.LIZJ.LJIIJ(0.0f, 2.56f, -0.1f, 5.11f, 0.0f, 7.65f);
        this.LIZJ.LJIIJ(0.0f, 2.84f, 0.62f, 5.64f, 1.8f, 8.21f);
        this.LIZJ.LJIIL(0.15f, 0.24f);
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
