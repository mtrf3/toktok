package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2S extends AbstractC39455Fe7 {
    public D2S() {
        this.LIZJ.LJIIIIZZ(16.0f, 4.0f);
        C32856Cuy.LJIIZILJ(this.LIZJ);
        C32856Cuy.Mk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(16.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.Qi(this.LIZJ);
        C32856Cuy.LJLLILLLL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.13f, 1.65f);
        this.LIZJ.LJIIL(10.37f, -7.1f);
        this.LIZJ.LJIIL(10.37f, 7.1f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 34.0f, 42.0f);
        C32856Cuy.y3(this.LIZJ);
        C32856Cuy.LLLLIILL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(-1.0f, 5.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(17.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(21.2f);
        this.LIZJ.LJIIL(-8.37f, -5.73f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.26f, 0.0f);
        this.LIZJ.LJII(11.0f, 38.21f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(17.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
