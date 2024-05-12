package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD9 extends AbstractC39455Fe7 {
    public DD9() {
        this.LIZJ.LJIILIIL(10.67f, 26.16f);
        this.LIZJ.LJIIL(4.74f, -6.23f);
        this.LIZJ.LJIIL(12.21f, 14.55f);
        this.LIZJ.LJIIL(-7.79f, 10.22f);
        this.LIZJ.LJIIJ(-0.43f, 0.6f, -1.38f, 0.23f, -1.28f, -0.5f);
        this.LIZJ.LJIIL(2.04f, -15.02f);
        this.LIZJ.LJIIL(-9.29f, -1.63f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.89f, 0.89f, false, true, -0.63f, -1.4f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.76f, 14.21f);
        this.LIZJ.LJII(12.95f, 6.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, -0.12f);
        this.LIZJ.LJIIL(-1.18f, 1.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.13f, 1.4f);
        this.LIZJ.LJII(36.3f, 39.42f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.4f, 0.13f);
        this.LIZJ.LJIIL(1.2f, -1.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.11f, -1.4f);
        this.LIZJ.LJIIL(-7.03f, -8.38f);
        this.LIZJ.LJIIL(5.28f, -6.93f);
        this.LIZJ.LJIIIZ(0.89f, 0.89f, false, false, -0.64f, -1.4f);
        C32856Cuy.W5(this.LIZJ);
        this.LIZJ.LJIIL(-8.32f, 10.91f);
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
