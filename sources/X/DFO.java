package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFO extends AbstractC39455Fe7 {
    public DFO() {
        C32856Cuy.R5(this.LIZJ);
        this.LIZJ.LJIILIIL(17.82f, 13.71f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.4f, 0.4f, false, true, 0.36f, 0.0f);
        this.LIZJ.LJIIL(4.06f, 2.02f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, 1.16f, -0.83f);
        this.LIZJ.LJIIL(-0.7f, -4.8f);
        this.LIZJ.LJIIIZ(0.4f, 0.4f, false, true, 0.12f, -0.35f);
        this.LIZJ.LJII(32.76f, 18.0f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, -0.45f, -1.36f);
        this.LIZJ.LJIIL(-4.29f, -0.66f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.4f, 0.4f, false, true, -0.3f, -0.23f);
        this.LIZJ.LJIIL(-1.99f, -4.28f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, -1.46f, 0.0f);
        this.LIZJ.LJIIL(-1.99f, 4.28f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.4f, 0.4f, false, true, -0.3f, 0.23f);
        this.LIZJ.LJIIL(-4.3f, 0.66f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, -0.44f, 1.36f);
        this.LIZJ.LJIIL(2.94f, 2.93f);
        this.LIZJ.LJIIIZ(0.4f, 0.4f, false, true, 0.11f, 0.34f);
        this.LIZJ.LJIIL(-0.69f, 4.8f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, 1.16f, 0.84f);
        this.LIZJ.LJIIL(4.06f, -2.02f);
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
