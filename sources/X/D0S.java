package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0S extends AbstractC39455Fe7 {
    public D0S() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(15.0f, 11.0f);
        C32856Cuy.f(this.LIZJ);
        C32856Cuy.Y3(this.LIZJ);
        C32856Cuy.LLLLILI(this.LIZJ);
        this.LIZJ.LJIILIIL(21.0f, 0.0f);
        C32856Cuy.LJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(8.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.r6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p3.LJIILL(3.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(8.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        C32856Cuy.LJLJJLL(this.LIZJ);
        C32856Cuy.oi(this.LIZJ);
        this.LIZJ.LJIIJJI(10.23f);
        this.LIZJ.LJIIJ(0.66f, 0.0f, 1.14f, -0.63f, 1.02f, -1.28f);
        this.LIZJ.LIZJ(15.0f, 15.0f, false, true, 39.5f, 20.04f);
        this.LIZJ.LJIIJ(0.7f, 0.27f, 1.5f, -0.22f, 1.5f, -0.97f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(16.0f);
        p5.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.0f, 23.0f);
        C32856Cuy.g4(this.LIZJ);
        this.LIZJ.LJIILIIL(-12.0f, -7.0f);
        C32856Cuy.v5(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p6.LJIILL(-4.0f);
        p6.LJIIJJI(-4.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p6.LJIILL(-2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p6.LJIIJJI(4.0f);
        p6.LJIILL(-4.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
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
