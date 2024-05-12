package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF4 extends AbstractC39455Fe7 {
    public DF4() {
        this.LIZJ.LJIIIIZZ(42.85f, 6.53f);
        C32856Cuy.LLIIIL(this.LIZJ);
        this.LIZJ.LJII(21.64f, 42.07f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.24f, 0.2f);
        this.LIZJ.LJII(5.1f, 26.13f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.14f, -1.41f);
        this.LIZJ.LJIIL(1.54f, -1.27f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.4f, 0.13f);
        this.LIZJ.LJII(19.73f, 37.6f);
        this.LIZJ.LJII(39.77f, 5.78f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.38f, -0.31f);
        this.LIZJ.LJIIL(1.7f, 1.06f);
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
