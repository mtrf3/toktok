package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCK extends AbstractC39455Fe7 {
    public DCK() {
        this.LIZJ.LJIIIIZZ(1.0f, 18.0f);
        this.LIZJ.LJ(1.0f, 10.18f, 7.6f, 4.0f, 15.56f, 4.0f);
        this.LIZJ.LJIIJ(7.96f, 0.0f, 14.56f, 6.18f, 14.56f, 14.0f);
        this.LIZJ.LJIIJ(0.0f, 0.72f, -0.05f, 1.44f, -0.16f, 2.13f);
        this.LIZJ.LJIIJ(1.2f, 1.54f, 3.7f, 4.07f, 2.9f, 6.17f);
        this.LIZJ.LJIIJ(-0.47f, 1.22f, -1.73f, 1.84f, -2.9f, 2.22f);
        this.LIZJ.LJIIJ(0.09f, 1.88f, 0.44f, 4.42f, -0.68f, 6.1f);
        this.LIZJ.LJIIJ(-1.48f, 2.2f, -5.07f, 1.5f, -7.32f, 1.13f);
        this.LIZJ.LJIIL(0.12f, 3.15f);
        this.LIZJ.LJIIJ(0.25f, 4.3f, -6.23f, 4.1f, -9.03f, 4.1f);
        this.LIZJ.LJIIJ(-2.66f, 0.0f, -9.3f, -0.04f, -9.03f, -4.12f);
        this.LIZJ.LJIIL(0.63f, -11.6f);
        this.LIZJ.LIZJ(13.65f, 13.65f, false, true, 1.0f, 18.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(27.44f, 6.8f);
        this.LIZJ.LJIIJ(-0.67f, -1.0f, -1.42f, -1.95f, -2.18f, -2.88f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.4f, -1.72f);
        this.LIZJ.LJIIJ(0.18f, -0.7f, 0.26f, -1.44f, 0.26f, -2.2f);
        this.LIZJ.LJIIJ(0.0f, -5.44f, -4.64f, -10.0f, -10.56f, -10.0f);
        this.LIZJ.LJ(9.64f, 8.0f, 5.0f, 12.56f, 5.0f, 18.0f);
        this.LIZJ.LJIIIZ(9.7f, 9.7f, false, false, 3.07f, 7.05f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.62f, 1.56f);
        this.LIZJ.LJIIL(-0.63f, 11.71f);
        this.LIZJ.LJIIJ(1.55f, 0.6f, 3.34f, 0.68f, 4.99f, 0.68f);
        this.LIZJ.LJIIJ(1.65f, 0.0f, 3.45f, -0.08f, 5.0f, -0.68f);
        this.LIZJ.LJIIL(-0.19f, -4.93f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 2.43f, -2.03f);
        this.LIZJ.LJIIJ(1.81f, 0.4f, 3.77f, 0.87f, 5.65f, 0.72f);
        this.LIZJ.LJIIJ(0.18f, -1.63f, 0.07f, -3.28f, -0.06f, -4.92f);
        this.LIZJ.LJIIIZ(2.02f, 2.02f, false, true, 1.63f, -2.13f);
        this.LIZJ.LJIIJ(0.32f, -0.05f, 0.63f, -0.13f, 0.93f, -0.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(37.3f, 44.53f);
        this.LIZJ.LJIIJ(-0.45f, 0.33f, -0.58f, 0.95f, -0.28f, 1.4f);
        this.LIZJ.LJIIL(0.76f, 1.18f);
        this.LIZJ.LJIIJ(0.3f, 0.47f, 0.92f, 0.6f, 1.37f, 0.28f);
        this.LIZJ.LJIIIZ(19.27f, 19.27f, false, false, 6.6f, -22.2f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, false, -1.3f, -0.52f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.28f, 0.57f);
        this.LIZJ.LJIIJ(-0.5f, 0.22f, -0.73f, 0.81f, -0.54f, 1.33f);
        this.LIZJ.LJIIJ(2.36f, 6.4f, 0.16f, 13.86f, -5.33f, 17.96f);
        this.LIZJ.LIZLLL();
        C32856Cuy.P8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
