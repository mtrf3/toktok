package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33481DCb extends AbstractC39455Fe7 {
    public C33481DCb() {
        C32856Cuy.R(this.LIZJ);
        this.LIZJ.LJIIJ(2.61f, 0.0f, 4.97f, 0.45f, 7.04f, 1.29f);
        this.LIZJ.LJIIIZ(13.99f, 13.99f, false, false, -2.04f, 3.5f);
        this.LIZJ.LJIIIZ(15.22f, 15.22f, false, false, -5.0f, -0.79f);
        C32856Cuy.Sl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(37.7f, 26.17f);
        this.LIZJ.LJIIJJI(-1.39f);
        this.LIZJ.LJIIIZ(0.93f, 0.93f, false, false, -0.91f, 0.8f);
        this.LIZJ.LJIIL(-0.18f, 1.38f);
        this.LIZJ.LJIIIZ(8.7f, 8.7f, false, false, -3.07f, 1.28f);
        this.LIZJ.LJIIL(-1.11f, -0.86f);
        this.LIZJ.LJIIIZ(0.9f, 0.9f, false, false, -1.2f, 0.09f);
        this.LIZJ.LJIIL(-0.98f, 0.98f);
        this.LIZJ.LJIIIZ(0.9f, 0.9f, false, false, -0.09f, 1.2f);
        this.LIZJ.LJIIL(0.86f, 1.11f);
        this.LIZJ.LJIIIZ(8.7f, 8.7f, false, false, -1.28f, 3.07f);
        this.LIZJ.LJIIL(-1.38f, 0.18f);
        this.LIZJ.LJIIIZ(0.93f, 0.93f, false, false, -0.8f, 0.91f);
        this.LIZJ.LJIILL(1.39f);
        this.LIZJ.LJIIJ(0.0f, 0.46f, 0.35f, 0.85f, 0.8f, 0.91f);
        this.LIZJ.LJIIL(1.38f, 0.18f);
        this.LIZJ.LJIIIZ(8.78f, 8.78f, false, false, 1.28f, 3.07f);
        this.LIZJ.LJIIL(-0.86f, 1.1f);
        this.LIZJ.LJIIIZ(0.92f, 0.92f, false, false, 0.09f, 1.21f);
        this.LIZJ.LJIIL(0.98f, 0.98f);
        this.LIZJ.LJIIIZ(0.9f, 0.9f, false, false, 1.2f, 0.09f);
        this.LIZJ.LJIIL(1.11f, -0.86f);
        this.LIZJ.LJIIIZ(8.7f, 8.7f, false, false, 3.07f, 1.28f);
        this.LIZJ.LJIIL(0.18f, 1.37f);
        this.LIZJ.LJIIJ(0.06f, 0.46f, 0.45f, 0.81f, 0.91f, 0.81f);
        this.LIZJ.LJIIJJI(1.39f);
        this.LIZJ.LJIIJ(0.46f, 0.0f, 0.85f, -0.35f, 0.91f, -0.81f);
        this.LIZJ.LJIIL(0.18f, -1.37f);
        this.LIZJ.LJIIIZ(8.78f, 8.78f, false, false, 3.07f, -1.28f);
        this.LIZJ.LJIIL(1.1f, 0.86f);
        this.LIZJ.LJIIJ(0.37f, 0.28f, 0.89f, 0.24f, 1.21f, -0.09f);
        this.LIZJ.LJIIL(0.98f, -0.98f);
        this.LIZJ.LJIIIZ(0.92f, 0.92f, false, false, 0.09f, -1.21f);
        this.LIZJ.LJIIL(-0.86f, -1.1f);
        this.LIZJ.LJIIIZ(8.78f, 8.78f, false, false, 1.28f, -3.07f);
        this.LIZJ.LJIIL(1.37f, -0.18f);
        this.LIZJ.LJIIIZ(0.93f, 0.93f, false, false, 0.81f, -0.91f);
        this.LIZJ.LJIILL(-1.39f);
        this.LIZJ.LJIIIZ(0.93f, 0.93f, false, false, -0.81f, -0.91f);
        this.LIZJ.LJIIL(-1.37f, -0.18f);
        this.LIZJ.LJIIIZ(8.7f, 8.7f, false, false, -1.28f, -3.07f);
        this.LIZJ.LJIIL(0.86f, -1.11f);
        this.LIZJ.LJIIIZ(0.9f, 0.9f, false, false, -0.09f, -1.2f);
        this.LIZJ.LJIIL(-0.98f, -0.98f);
        this.LIZJ.LJIIIZ(0.92f, 0.92f, false, false, -1.21f, -0.09f);
        this.LIZJ.LJIIL(-1.1f, 0.86f);
        this.LIZJ.LJIIIZ(8.78f, 8.78f, false, false, -3.07f, -1.28f);
        this.LIZJ.LJIIL(-0.18f, -1.38f);
        this.LIZJ.LJIIIZ(0.93f, 0.93f, false, false, -0.91f, -0.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.84f, 37.0f);
        this.LIZJ.LJIIIZ(5.16f, 5.16f, true, true, 10.32f, 0.0f);
        this.LIZJ.LJIIIZ(5.16f, 5.16f, false, true, -10.32f, 0.0f);
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
