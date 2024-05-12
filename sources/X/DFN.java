package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFN extends AbstractC39455Fe7 {
    public DFN() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 12.62f);
        this.LIZJ.LJIIJ(-3.91f, -4.08f, -9.84f, -4.1f, -13.6f, -0.42f);
        this.LIZJ.LJIIIZ(9.48f, 9.48f, false, false, 0.0f, 13.63f);
        this.LIZJ.LJIIL(12.55f, 12.24f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 2.1f, 0.0f);
        this.LIZJ.LJII(37.6f, 25.83f);
        this.LIZJ.LJIIIZ(9.48f, 9.48f, false, false, 0.0f, -13.63f);
        this.LIZJ.LJIIJ(-3.77f, -3.68f, -9.7f, -3.66f, -13.61f, 0.42f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.9f, 2.36f);
        this.LIZJ.LJIIJ(-2.8f, -3.2f, -6.99f, -3.2f, -9.61f, -0.63f);
        this.LIZJ.LJIIIZ(6.48f, 6.48f, false, false, 0.0f, 9.33f);
        this.LIZJ.LJII(24.0f, 34.91f);
        this.LIZJ.LJIIL(11.51f, -11.23f);
        this.LIZJ.LJIIIZ(6.48f, 6.48f, false, false, 0.0f, -9.33f);
        this.LIZJ.LJIIJ(-2.62f, -2.56f, -6.8f, -2.56f, -9.6f, 0.63f);
        this.LIZJ.LJIIL(-0.05f, 0.05f);
        this.LIZJ.LJIIL(-0.81f, 0.8f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.5f, 1.5f, false, true, -2.1f, 0.0f);
        this.LIZJ.LJIIL(-0.81f, -0.8f);
        this.LIZJ.LJIIL(-0.04f, -0.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
