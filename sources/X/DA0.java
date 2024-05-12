package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DA0 extends AbstractC39455Fe7 {
    public DA0() {
        this.LIZJ.LJIIIIZZ(6.55f, 9.68f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -2.43f, 3.47f);
        this.LIZJ.LJII(5.0f, 18.14f);
        C32856Cuy.N9(this.LIZJ);
        C32856Cuy.Ad(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(21.0f);
        p.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        this.LIZJ.LJI(14.07f);
        this.LIZJ.LJIIL(25.65f, -4.52f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, false, 42.15f, 10.0f);
        this.LIZJ.LJIIL(-0.6f, -3.44f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -3.48f, -2.44f);
        this.LIZJ.LJII(6.55f, 9.68f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(16.53f, 14.54f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.84f, 0.0f);
        this.LIZJ.LJIIL(1.23f, 2.94f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.84f, 0.61f);
        this.LIZJ.LJIIL(3.17f, 0.26f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.57f, 1.75f);
        this.LIZJ.LJIIL(-2.41f, 2.07f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.33f, 1.0f);
        this.LIZJ.LJIIL(0.74f, 3.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.5f, 1.08f);
        this.LIZJ.LJIIL(-2.7f, -1.66f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.05f, 0.0f);
        this.LIZJ.LJIIL(-2.72f, 1.66f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.5f, -1.09f);
        this.LIZJ.LJIIL(0.75f, -3.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.33f, -0.99f);
        this.LIZJ.LJIIL(-2.41f, -2.07f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.57f, -1.75f);
        this.LIZJ.LJIIL(3.17f, -0.26f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.84f, -0.61f);
        this.LIZJ.LJIIL(1.23f, -2.94f);
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
