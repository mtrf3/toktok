package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D65 extends AbstractC39455Fe7 {
    public D65() {
        this.LIZJ.LJIIIIZZ(9.65f, 8.1f);
        this.LIZJ.LJIIIZ(6.15f, 6.15f, false, false, -6.15f, 6.16f);
        this.LIZJ.LJIILL(22.58f);
        this.LIZJ.LJIIJ(0.0f, 3.4f, 2.75f, 6.16f, 6.15f, 6.16f);
        this.LIZJ.LJIIJJI(28.7f);
        this.LIZJ.LJIIJ(3.4f, 0.0f, 6.15f, -2.76f, 6.15f, -6.16f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(14.26f);
        this.LIZJ.LJIIJ(0.0f, -3.4f, -2.75f, -6.15f, -6.15f, -6.15f);
        DIL.LIZ(this.LIZJ, "p", 9.65f);
        this.LIZJ.LJIILIIL(12.55f, 9.8f);
        this.LIZJ.LJIIIZ(2.03f, 2.03f, false, true, 3.6f, -0.02f);
        this.LIZJ.LJIIL(1.69f, 3.19f);
        this.LIZJ.LJIIL(3.42f, 0.74f);
        this.LIZJ.LJIIJ(1.5f, 0.33f, 2.1f, 2.12f, 1.13f, 3.3f);
        this.LIZJ.LJIIL(-2.49f, 2.97f);
        this.LIZJ.LJIIL(0.52f, 3.92f);
        this.LIZJ.LJIIIZ(2.03f, 2.03f, false, true, -2.97f, 2.06f);
        this.LIZJ.LJII(24.0f, 32.4f);
        this.LIZJ.LJIIL(-3.1f, 1.66f);
        this.LIZJ.LIZJ(2.03f, 2.03f, false, true, 17.93f, 32.0f);
        this.LIZJ.LJIIL(0.52f, -3.92f);
        this.LIZJ.LJIIL(-2.48f, -2.97f);
        this.LIZJ.LJIIIZ(2.03f, 2.03f, false, true, 1.13f, -3.3f);
        this.LIZJ.LJIIL(3.49f, -0.74f);
        this.LIZJ.LJIIL(1.61f, -3.17f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.82f, 4.0f);
        C32856Cuy.lh(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(16.4f, 0.0f);
        C32856Cuy.lh(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(2.05f);
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
