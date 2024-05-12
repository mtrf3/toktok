package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D99 extends AbstractC39455Fe7 {
    public D99() {
        this.LIZJ.LJIIIIZZ(26.57f, 8.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.83f, 1.62f);
        this.LIZJ.LJIIL(-3.96f, 20.54f);
        this.LIZJ.LJIIL(-2.28f, -6.8f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 16.6f, 22.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        this.LIZJ.LJIIJJI(9.16f);
        this.LIZJ.LJIIL(4.24f, 12.64f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.86f, -0.26f);
        this.LIZJ.LJIIL(3.96f, -20.54f);
        this.LIZJ.LJIIL(2.28f, 6.8f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 31.4f, 26.0f);
        C32856Cuy.Na(this.LIZJ);
        C32856Cuy.Oi(this.LIZJ);
        this.LIZJ.LJIIJJI(-9.16f);
        this.LIZJ.LJII(28.6f, 9.36f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 26.57f, 8.0f);
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
