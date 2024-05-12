package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFU extends AbstractC39455Fe7 {
    public DFU() {
        this.LIZJ.LJIIIIZZ(20.06f, 2.14f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.74f, 1.64f);
        this.LIZJ.LJIIJ(-0.07f, 0.7f, -0.11f, 1.4f, -0.15f, 2.03f);
        this.LIZJ.LJIIJ(0.0f, 0.25f, -0.02f, 0.49f, -0.03f, 0.7f);
        this.LIZJ.LJIIJ(-0.06f, 0.82f, -0.14f, 1.56f, -0.33f, 2.33f);
        this.LIZJ.LJIIJ(-0.38f, 1.47f, -1.25f, 3.3f, -3.68f, 5.88f);
        this.LIZJ.LJIIJ(-3.3f, 3.5f, -7.3f, 8.57f, -6.22f, 15.82f);
        this.LIZJ.LJ(8.0f, 37.92f, 15.09f, 43.87f, 23.95f, 43.87f);
        this.LIZJ.LJIIJ(8.9f, 0.0f, 15.64f, -5.77f, 16.84f, -13.3f);
        this.LIZJ.LJIIJ(0.66f, -4.17f, 0.05f, -11.86f, -6.27f, -16.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.98f, 0.75f);
        this.LIZJ.LJIIIZ(25.1f, 25.1f, false, true, -2.76f, 4.04f);
        this.LIZJ.LJIIJ(0.08f, -1.85f, 0.0f, -3.84f, -0.39f, -5.8f);
        this.LIZJ.LJIIJ(-0.83f, -4.33f, -3.14f, -8.82f, -8.33f, -10.92f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.4f, 11.68f);
        this.LIZJ.LJIIJ(0.7f, 3.58f, 0.24f, 7.38f, -0.39f, 9.65f);
        this.LIZJ.LJIIL(-0.26f, 0.96f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 2.0f, 1.8f);
        this.LIZJ.LJIIL(0.92f, -0.37f);
        this.LIZJ.LJIIJ(0.77f, -0.36f, 1.89f, -1.09f, 2.67f, -1.8f);
        this.LIZJ.LJIIJ(0.82f, -0.75f, 1.63f, -1.64f, 2.37f, -2.54f);
        this.LIZJ.LJIIJ(0.74f, -0.9f, 1.45f, -1.85f, 2.04f, -2.73f);
        this.LIZJ.LJIIJ(3.1f, 3.42f, 3.5f, 8.17f, 3.03f, 11.14f);
        this.LIZJ.LJIIJ(-0.86f, 5.43f, -5.78f, 9.94f, -12.89f, 9.94f);
        this.LIZJ.LJIIJ(-7.14f, 0.0f, -12.32f, -4.75f, -13.08f, -9.91f);
        this.LIZJ.LJIIJ(-0.79f, -5.3f, 2.02f, -9.14f, 5.17f, -12.5f);
        this.LIZJ.LJIIJ(2.77f, -2.94f, 4.06f, -5.35f, 4.64f, -7.63f);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, false, 0.4f, -2.45f);
        this.LIZJ.LJIIJ(1.86f, 1.6f, 2.9f, 3.88f, 3.39f, 6.44f);
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
