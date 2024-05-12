package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEP extends AbstractC39455Fe7 {
    public DEP() {
        this.LIZJ.LJIIIIZZ(20.13f, 5.6f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LIZJ(10.4f, 10.4f, false, true, 24.0f, 8.5f);
        p.LJIILJJIL(1.04f, -1.38f, 3.1f, -2.52f, false);
        this.LIZJ.LIZJ(11.8f, 11.8f, false, true, 33.0f, 4.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(7.0f, 0.0f, 12.0f, 5.5f, 12.0f, 12.5f);
        p2.LJIIJ(0.0f, 8.0f, -6.54f, 15.13f, -12.5f, 20.5f);
        p2.LJ(28.82f, 40.81f, 26.0f, 43.0f, 24.0f, 43.0f);
        p2.LJIILJJIL(-4.9f, -2.2f, -8.5f, -5.5f, true);
        p2.LJ(9.64f, 32.13f, 3.0f, 25.0f, 3.0f, 17.0f);
        p2.LJ(3.0f, 10.0f, 8.0f, 4.5f, 15.0f, 4.5f);
        this.LIZJ.LJIIJ(2.07f, 0.0f, 3.78f, 0.47f, 5.13f, 1.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.65f, 4.76f);
        this.LIZJ.LIZJ(7.1f, 7.1f, false, false, 15.0f, 9.5f);
        this.LIZJ.LJIIJ(-3.97f, 0.0f, -7.0f, 2.99f, -7.0f, 7.5f);
        this.LIZJ.LJIIJ(0.0f, 2.6f, 1.09f, 5.4f, 3.16f, 8.39f);
        this.LIZJ.LJIIJ(2.07f, 2.99f, 4.87f, 5.81f, 7.72f, 8.42f);
        this.LIZJ.LJIIIZ(40.2f, 40.2f, false, false, 4.27f, 3.53f);
        this.LIZJ.LJIIJ(0.35f, 0.24f, 0.63f, 0.4f, 0.84f, 0.52f);
        this.LIZJ.LJIIJ(0.2f, -0.11f, 0.48f, -0.27f, 0.82f, -0.5f);
        this.LIZJ.LJIIIZ(44.32f, 44.32f, false, false, 4.34f, -3.58f);
        this.LIZJ.LJIIJ(2.88f, -2.58f, 5.67f, -5.4f, 7.72f, -8.38f);
        this.LIZJ.LJ(38.92f, 22.42f, 40.0f, 19.62f, 40.0f, 17.0f);
        this.LIZJ.LJIIJ(0.0f, -4.51f, -3.03f, -7.5f, -7.0f, -7.5f);
        this.LIZJ.LJIIIZ(7.1f, 7.1f, false, false, -3.48f, 0.86f);
        this.LIZJ.LJIIJ(-2.02f, 1.11f, -3.75f, 3.01f, -5.52f, 4.47f);
        this.LIZJ.LJIIJ(-1.77f, -1.46f, -3.5f, -3.36f, -5.52f, -4.47f);
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
