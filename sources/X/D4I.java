package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4I extends AbstractC39455Fe7 {
    public D4I() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(12.0f, 4.0f);
        C32856Cuy.rj(this.LIZJ);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.i5(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(8.0f);
        C32856Cuy.i5(this.LIZJ);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.tj(this.LIZJ);
        C32856Cuy.LJJIFFI(this.LIZJ);
        C32856Cuy.Jn(this.LIZJ);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(25.0f, 25.47f);
        this.LIZJ.LJIILL(3.31f);
        this.LIZJ.LIZJ(2.2f, 2.2f, false, true, 34.59f, 35.0f);
        this.LIZJ.LJIIIZ(21.92f, 21.92f, false, true, -9.55f, -3.39f);
        this.LIZJ.LJIIIZ(21.55f, 21.55f, false, true, -6.64f, -6.62f);
        this.LIZJ.LIZJ(21.82f, 21.82f, false, true, 15.0f, 15.4f);
        this.LIZJ.LIZJ(2.2f, 2.2f, false, true, 17.22f, 13.0f);
        C32856Cuy.Fb(this.LIZJ);
        this.LIZJ.LJIIJ(1.1f, -0.01f, 2.06f, 0.8f, 2.21f, 1.9f);
        this.LIZJ.LJIIJ(0.14f, 1.06f, 0.4f, 2.1f, 0.78f, 3.1f);
        this.LIZJ.LJIIJ(0.3f, 0.8f, 0.1f, 1.72f, -0.5f, 2.33f);
        this.LIZJ.LJIIL(-1.4f, 1.4f);
        this.LIZJ.LJIIIZ(17.68f, 17.68f, false, false, 6.63f, 6.63f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.4f, -1.4f);
        this.LIZJ.LJIIJ(0.62f, -0.61f, 1.53f, -0.8f, 2.34f, -0.5f);
        this.LIZJ.LJIIJ(1.0f, 0.37f, 2.04f, 0.63f, 3.1f, 0.77f);
        this.LIZJ.LJIIIZ(2.2f, 2.2f, false, true, 1.9f, 2.24f);
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
