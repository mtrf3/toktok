package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D48 extends AbstractC39455Fe7 {
    public D48() {
        this.LIZJ.LJIIIIZZ(6.9f, 8.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(3.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.L(this.LIZJ);
        C32856Cuy.n0(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.95f, 1.57f);
        this.LIZJ.LJIIL(0.99f, 4.43f);
        C32856Cuy.T6(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.9f, 2.63f);
        this.LIZJ.LJIIL(-4.0f, 12.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 38.0f, 26.0f);
        C32856Cuy.r6(this.LIZJ);
        this.LIZJ.LJIIL(1.1f, 5.0f);
        C32856Cuy.Ec(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(14.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.95f, -1.57f);
        this.LIZJ.LJII(6.9f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.2f, 14.0f);
        this.LIZJ.LJIIJJI(22.46f);
        this.LIZJ.LJIIL(2.67f, -8.0f);
        this.LIZJ.LJIIJJI(-26.9f);
        this.LIZJ.LJIIL(1.77f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(20.0f, 41.0f);
        C32856Cuy.g5(this.LIZJ);
        this.LIZJ.LJIILIIL(15.0f, 4.0f);
        C32856Cuy.Gf(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
