package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCN extends AbstractC39455Fe7 {
    public DCN() {
        this.LIZJ.LJIIIIZZ(6.18f, 19.5f);
        this.LIZJ.LJIIJ(0.0f, -7.07f, 7.15f, -12.34f, 13.81f, -10.05f);
        this.LIZJ.LJIIIZ(11.9f, 11.9f, false, true, 8.66f, -3.74f);
        this.LIZJ.LJIIJ(6.09f, 0.0f, 11.11f, 4.59f, 11.91f, 10.54f);
        this.LIZJ.LIZJ(12.23f, 12.23f, false, true, 45.9f, 26.4f);
        this.LIZJ.LJIIJ(0.0f, 6.43f, -4.91f, 11.73f, -11.14f, 12.19f);
        this.LIZJ.LJIIJJI(-22.3f);
        this.LIZJ.LIZJ(10.53f, 10.53f, false, true, 2.0f, 27.98f);
        this.LIZJ.LJIIJ(0.0f, -3.47f, 1.65f, -6.55f, 4.18f, -8.49f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.8f, 32.42f);
        this.LIZJ.LJIIJ(0.72f, 0.72f, 1.88f, 0.72f, 2.6f, 0.0f);
        this.LIZJ.LJIIL(6.09f, -6.02f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, false, 0.0f, -1.56f);
        this.LIZJ.LJIIL(-1.05f, -1.07f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, false, -1.56f, 0.0f);
        this.LIZJ.LJIIL(-2.93f, 2.9f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-9.44f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, -0.61f, -0.49f, -1.1f, -1.1f, -1.1f);
        C32856Cuy.rb(this.LIZJ);
        this.LIZJ.LJIIJ(-0.61f, 0.0f, -1.1f, 0.49f, -1.1f, 1.1f);
        this.LIZJ.LJIILL(9.43f);
        this.LIZJ.LJIIL(-2.93f, -2.9f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, false, -1.56f, 0.01f);
        this.LIZJ.LJIIL(-1.05f, 1.07f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, false, 0.0f, 1.56f);
        this.LIZJ.LJIIL(6.09f, 6.02f);
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
