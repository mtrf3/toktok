package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF7 extends AbstractC39455Fe7 {
    public DF7() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 6.0f);
        this.LIZJ.LJ(15.7f, 6.0f, 9.0f, 12.66f, 9.0f, 20.84f);
        this.LIZJ.LJIIJ(0.0f, 1.8f, 0.8f, 4.05f, 2.24f, 6.54f);
        this.LIZJ.LJIIIZ(45.8f, 45.8f, false, false, 5.36f, 7.2f);
        this.LIZJ.LJIIIZ(66.9f, 66.9f, false, false, 5.62f, 5.6f);
        this.LIZJ.LIZJ(33.2f, 33.2f, false, false, 24.0f, 41.67f);
        this.LIZJ.LJIIJ(0.46f, -0.35f, 1.07f, -0.85f, 1.78f, -1.47f);
        this.LIZJ.LJIIIZ(66.9f, 66.9f, false, false, 5.62f, -5.61f);
        this.LIZJ.LJIIIZ(45.8f, 45.8f, false, false, 5.36f, -7.2f);
        this.LIZJ.LJ(38.21f, 24.9f, 39.0f, 22.65f, 39.0f, 20.84f);
        this.LIZJ.LJ(39.0f, 12.66f, 32.3f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(5.0f, 20.84f);
        this.LIZJ.LIZJ(18.92f, 18.92f, false, true, 24.0f, 2.0f);
        this.LIZJ.LJIIJ(10.48f, 0.0f, 19.0f, 8.42f, 19.0f, 18.84f);
        this.LIZJ.LJIIJ(0.0f, 2.85f, -1.2f, 5.82f, -2.78f, 8.55f);
        this.LIZJ.LJIIIZ(49.74f, 49.74f, false, true, -5.83f, 7.85f);
        this.LIZJ.LJIIIZ(70.89f, 70.89f, false, true, -5.97f, 5.95f);
        this.LIZJ.LJIIJ(-0.84f, 0.75f, -1.6f, 1.36f, -2.2f, 1.8f);
        this.LIZJ.LJIIIZ(10.32f, 10.32f, false, true, -1.28f, 0.8f);
        this.LIZJ.LJIIJ(-0.11f, 0.05f, -0.48f, 0.21f, -0.94f, 0.21f);
        this.LIZJ.LJIIJ(-0.46f, 0.0f, -0.83f, -0.16f, -0.93f, -0.2f);
        this.LIZJ.LJIIIZ(10.32f, 10.32f, false, true, -1.29f, -0.8f);
        this.LIZJ.LJIIJ(-0.6f, -0.45f, -1.36f, -1.06f, -2.2f, -1.8f);
        this.LIZJ.LJIIIZ(70.89f, 70.89f, false, true, -5.97f, -5.96f);
        this.LIZJ.LJIIIZ(49.74f, 49.74f, false, true, -5.83f, -7.85f);
        this.LIZJ.LJ(6.2f, 26.66f, 5.0f, 23.69f, 5.0f, 20.84f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(19.0f, -5.37f);
        this.LIZJ.LJIIIZ(4.35f, 4.35f, false, false, -4.38f, 4.32f);
        this.LIZJ.LIZJ(4.35f, 4.35f, false, false, 24.0f, 24.1f);
        this.LIZJ.LJIIIZ(4.35f, 4.35f, false, false, 4.38f, -4.32f);
        this.LIZJ.LIZJ(4.35f, 4.35f, false, false, 24.0f, 15.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-8.38f, 4.32f);
        this.LIZJ.LIZJ(8.35f, 8.35f, false, true, 24.0f, 11.47f);
        this.LIZJ.LJIIJ(4.6f, 0.0f, 8.38f, 3.7f, 8.38f, 8.32f);
        this.LIZJ.LIZJ(8.35f, 8.35f, false, true, 24.0f, 28.1f);
        this.LIZJ.LJIIJ(-4.6f, 0.0f, -8.38f, -3.71f, -8.38f, -8.32f);
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
