package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8F extends AbstractC39455Fe7 {
    public D8F() {
        this.LIZJ.LJIIIIZZ(26.45f, 5.6f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 1.64f, 0.37f);
        this.LIZJ.LJIIL(16.0f, 17.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 0.0f, 2.06f);
        this.LIZJ.LJIIL(-16.0f, 17.0f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 25.5f, 41.0f);
        this.LIZJ.LJIILL(-8.97f);
        this.LIZJ.LJIIIZ(31.22f, 31.22f, false, false, -18.08f, 6.8f);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, false, false, -1.32f, 1.19f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 3.5f, 39.0f);
        this.LIZJ.LJIIJ(0.0f, -1.58f, 0.67f, -3.82f, 1.74f, -6.17f);
        this.LIZJ.LJIIJ(1.1f, -2.4f, 2.7f, -5.1f, 4.71f, -7.64f);
        this.LIZJ.LJIIJ(3.71f, -4.67f, 9.06f, -9.03f, 15.55f, -9.62f);
        C32856Cuy.e(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.61f, 0.38f, -1.17f, 0.95f, -1.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.05f, 5.18f);
        C32856Cuy.o9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        this.LIZJ.LJIIJ(-5.83f, 0.0f, -10.94f, 3.83f, -14.7f, 8.56f);
        this.LIZJ.LJIIIZ(34.62f, 34.62f, false, false, -4.7f, 7.9f);
        this.LIZJ.LIZJ(34.29f, 34.29f, false, true, 27.0f, 29.0f);
        C32856Cuy.e5(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(6.72f);
        this.LIZJ.LJII(40.94f, 24.0f);
        this.LIZJ.LJII(28.5f, 10.78f);
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
