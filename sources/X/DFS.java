package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFS extends AbstractC39455Fe7 {
    public DFS() {
        this.LIZJ.LJIILIIL(32.57f, 31.34f);
        this.LIZJ.LJIIL(-0.09f, -0.6f);
        this.LIZJ.LJIIJ(-0.35f, -2.2f, -0.87f, -4.52f, -1.17f, -5.49f);
        this.LIZJ.LJIIIZ(11.4f, 11.4f, false, false, -7.5f, -7.45f);
        this.LIZJ.LJIIIZ(68.98f, 68.98f, false, false, -6.23f, -1.49f);
        this.LIZJ.LJIIL(-6.52f, 21.6f);
        this.LIZJ.LJIIL(21.51f, -6.57f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.17f, 0.41f);
        this.LIZJ.LJIIJ(-0.06f, 0.4f, -0.34f, 0.7f, -0.71f, 0.82f);
        this.LIZJ.LJII(5.67f, 43.97f);
        this.LIZJ.LJIIIZ(0.52f, 0.52f, false, true, -0.65f, -0.65f);
        this.LIZJ.LJII(16.3f, 6.02f);
        this.LIZJ.LJIIJ(0.11f, -0.37f, 0.42f, -0.65f, 0.8f, -0.71f);
        this.LIZJ.LJIIIZ(23.04f, 23.04f, false, true, 20.02f, 6.4f);
        this.LIZJ.LJIIIZ(23.3f, 23.3f, false, true, 6.63f, 20.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.02f, 10.47f);
        this.LIZJ.LJIIIZ(19.87f, 19.87f, false, false, -5.96f, -1.06f);
        this.LIZJ.LJIIL(-0.83f, 2.91f);
        this.LIZJ.LJIIL(0.46f, 0.1f);
        this.LIZJ.LJIIJ(2.16f, 0.45f, 4.32f, 1.03f, 5.33f, 1.33f);
        this.LIZJ.LJIIIZ(15.52f, 15.52f, false, true, 10.3f, 10.22f);
        this.LIZJ.LJIIJ(0.36f, 1.16f, 0.85f, 3.37f, 1.21f, 5.44f);
        this.LIZJ.LJIIL(0.03f, 0.16f);
        this.LIZJ.LJIIL(2.82f, -0.8f);
        this.LIZJ.LJIIJ(0.1f, -1.98f, -0.16f, -3.77f, -0.8f, -5.83f);
        this.LIZJ.LJIIIZ(19.06f, 19.06f, false, false, -12.56f, -12.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-9.23f, 15.98f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, true, 2.98f, 0.0f);
        this.LIZJ.LJIIJ(0.82f, 0.83f, 0.82f, 2.17f, 0.0f, 3.0f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, true, -2.98f, 0.0f);
        this.LIZJ.LJIIIZ(2.12f, 2.12f, false, true, 0.0f, -3.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(10.42f, 0.0f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, false, -2.97f, 0.0f);
        this.LIZJ.LJIIIZ(2.12f, 2.12f, false, false, 0.0f, 3.0f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, false, 2.97f, 0.0f);
        this.LIZJ.LJIIJ(0.82f, -0.83f, 0.82f, -2.17f, 0.0f, -3.0f);
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
