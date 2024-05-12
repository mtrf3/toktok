package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D66 extends AbstractC39455Fe7 {
    public D66() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(12.0f, 12.0f);
        C32856Cuy.oj(this.LIZJ);
        C32856Cuy.LJIILLIIL(this.LIZJ);
        C32856Cuy.pj(this.LIZJ);
        C32856Cuy.LJLLILLLL(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.58f, 0.81f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJII(24.0f, 30.35f);
        this.LIZJ.LJIIL(-10.42f, 7.46f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, true, 12.0f, 37.0f);
        C32856Cuy.LLZLLIL(this.LIZJ);
        C32856Cuy.nc(this.LIZJ);
        this.LIZJ.LJIILL(23.05f);
        this.LIZJ.LJIIL(9.42f, -6.74f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.16f, 0.0f);
        this.LIZJ.LJII(34.0f, 35.05f);
        C32856Cuy.Pf(this.LIZJ);
        C32856Cuy.LLLLJ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
