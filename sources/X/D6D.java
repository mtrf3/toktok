package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6D extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public D6D() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(24.02f, 0.0f);
        this.LIZJ.LJIIIZ(23.99f, 23.99f, false, false, -8.76f, 46.32f);
        this.LIZJ.LJIIJ(-0.22f, -1.9f, -0.4f, -4.81f, 0.08f, -6.89f);
        this.LIZJ.LJIIL(2.8f, -11.92f);
        this.LIZJ.LJIILJJIL(-0.7f, -1.44f, -0.7f, -3.55f, false);
        this.LIZJ.LJIIJ(0.0f, -3.34f, 1.93f, -5.82f, 4.35f, -5.82f);
        this.LIZJ.LJIIJ(2.05f, 0.0f, 3.04f, 1.54f, 3.04f, 3.37f);
        this.LIZJ.LJIIJ(0.0f, 2.06f, -1.3f, 5.13f, -2.0f, 8.0f);
        this.LIZJ.LJIIJ(-0.57f, 2.38f, 1.21f, 4.34f, 3.56f, 4.34f);
        this.LIZJ.LJIIJ(4.27f, 0.0f, 7.55f, -4.5f, 7.55f, -10.98f);
        this.LIZJ.LJIIJ(0.0f, -5.74f, -4.13f, -9.75f, -10.04f, -9.75f);
        this.LIZJ.LJIIJ(-6.84f, 0.0f, -10.85f, 5.12f, -10.85f, 10.4f);
        this.LIZJ.LJIIJ(0.0f, 2.06f, 0.79f, 4.27f, 1.78f, 5.47f);
        this.LIZJ.LJIIJ(0.2f, 0.24f, 0.21f, 0.46f, 0.16f, 0.7f);
        this.LIZJ.LJIIL(-0.68f, 2.72f);
        this.LIZJ.LJIIJ(-0.1f, 0.43f, -0.35f, 0.53f, -0.8f, 0.31f);
        this.LIZJ.LJIIJ(-3.01f, -1.4f, -4.9f, -5.76f, -4.9f, -9.3f);
        this.LIZJ.LJIIJ(0.0f, -7.55f, 5.5f, -14.5f, 15.88f, -14.5f);
        this.LIZJ.LJIIJ(8.33f, 0.0f, 14.81f, 5.92f, 14.81f, 13.86f);
        this.LIZJ.LJIIJ(0.0f, 8.27f, -5.22f, 14.92f, -12.45f, 14.92f);
        this.LIZJ.LJIIJ(-2.43f, 0.0f, -4.73f, -1.27f, -5.5f, -2.77f);
        this.LIZJ.LJIIL(-1.5f, 5.7f);
        this.LIZJ.LJIIJ(-0.54f, 2.1f, -2.0f, 4.7f, -2.99f, 6.3f);
        this.LIZJ.LIZJ(24.0f, 24.0f, true, false, 24.02f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-1703911);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
