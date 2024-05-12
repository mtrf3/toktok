package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEN extends AbstractC39455Fe7 {
    public DEN() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(20.9f, 5.98f);
        p.LIZJ(10.4f, 10.4f, false, true, 24.0f, 8.5f);
        p.LJIILJJIL(1.04f, -1.38f, 3.1f, -2.52f, false);
        p.LIZJ(12.1f, 12.1f, false, true, 33.0f, 4.5f);
        p.LJIIJ(7.0f, 0.0f, 12.0f, 5.5f, 12.0f, 12.5f);
        p.LJIIJ(0.0f, 8.0f, -6.54f, 15.13f, -12.5f, 20.5f);
        p.LJ(28.82f, 40.81f, 26.0f, 43.0f, 24.0f, 43.0f);
        p.LJIILJJIL(-4.9f, -2.2f, -8.5f, -5.5f, true);
        p.LJ(9.64f, 32.13f, 3.0f, 25.0f, 3.0f, 17.0f);
        p.LJ(3.0f, 10.0f, 8.0f, 4.5f, 15.0f, 4.5f);
        p.LJIIJ(2.47f, 0.0f, 4.44f, 0.68f, 5.9f, 1.48f);
        p.LIZLLL();
        this.LIZJ.LJIILIIL(-1.37f, 3.85f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LIZJ(8.02f, 8.02f, false, false, 15.0f, 8.5f);
        this.LIZJ.LJIIJ(-4.58f, 0.0f, -8.0f, 3.5f, -8.0f, 8.5f);
        this.LIZJ.LJIIJ(0.0f, 2.88f, 1.2f, 5.87f, 3.34f, 8.96f);
        this.LIZJ.LJIIJ(2.13f, 3.08f, 5.0f, 5.97f, 7.86f, 8.59f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(41.1f, 41.1f, false, false, 4.39f, 3.62f);
        p3.LJIIJ(0.78f, 0.53f, 1.23f, 0.72f, 1.4f, 0.8f);
        p3.LJIIJ(0.18f, -0.08f, 0.62f, -0.27f, 1.38f, -0.79f);
        p3.LJIIJ(1.18f, -0.8f, 2.63f, -2.01f, 4.45f, -3.65f);
        p3.LJIIJ(2.9f, -2.61f, 5.76f, -5.49f, 7.87f, -8.56f);
        p3.LJ(39.81f, 22.89f, 41.0f, 19.9f, 41.0f, 17.0f);
        this.LIZJ.LJIIJ(0.0f, -5.0f, -3.42f, -8.5f, -8.0f, -8.5f);
        this.LIZJ.LJIIJ(-2.06f, 0.0f, -3.55f, 0.68f, -4.53f, 1.33f);
        this.LIZJ.LJIIJ(-1.71f, 1.14f, -3.04f, 2.88f, -4.47f, 4.34f);
        this.LIZJ.LJIIJ(-1.4f, -1.44f, -2.78f, -3.22f, -4.47f, -4.34f);
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
