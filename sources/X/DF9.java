package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF9 extends AbstractC39455Fe7 {
    public DF9() {
        this.LIZJ.LJIIIIZZ(43.86f, 8.75f);
        this.LIZJ.LJIIJ(-1.16f, 0.78f, -3.83f, 1.92f, -5.15f, 1.92f);
        this.LIZJ.LIZJ(8.06f, 8.06f, false, false, 32.75f, 8.0f);
        this.LIZJ.LJIIJ(-4.56f, 0.0f, -8.25f, 3.87f, -8.25f, 8.63f);
        this.LIZJ.LJIIJ(0.0f, 0.66f, 0.07f, 1.3f, 0.2f, 1.93f);
        this.LIZJ.LJIIIZ(22.52f, 22.52f, false, true, -17.0f, -8.96f);
        this.LIZJ.LJIIJ(-2.5f, 4.53f, -0.34f, 9.57f, 2.5f, 11.4f);
        this.LIZJ.LJIIJ(-0.98f, 0.08f, -2.76f, -0.11f, -3.6f, -0.97f);
        this.LIZJ.LJIIJ(-0.06f, 3.0f, 1.32f, 7.0f, 6.36f, 8.44f);
        this.LIZJ.LJIIJ(-0.97f, 0.54f, -2.69f, 0.39f, -3.44f, 0.27f);
        this.LIZJ.LJIIJ(0.27f, 2.54f, 3.66f, 5.86f, 7.38f, 5.86f);
        this.LIZJ.LJIIJ(-1.32f, 1.6f, -6.3f, 4.5f, -11.9f, 3.58f);
        this.LIZJ.LIZJ(23.99f, 23.99f, false, false, 17.9f, 42.0f);
        this.LIZJ.LJ(31.23f, 42.0f, 41.57f, 30.71f, 41.0f, 16.79f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(16.5f);
        this.LIZJ.LJIIJ(1.21f, -0.86f, 2.84f, -2.4f, 4.0f, -4.41f);
        this.LIZJ.LJIIJ(-0.67f, 0.38f, -2.7f, 1.16f, -4.58f, 1.35f);
        this.LIZJ.LJIIJ(1.21f, -0.68f, 3.0f, -2.91f, 3.44f, -4.69f);
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
