package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1T extends AbstractC39455Fe7 {
    public D1T() {
        this.LIZJ.LJIIIIZZ(11.92f, 6.0f);
        this.LIZJ.LJIIJJI(24.16f);
        this.LIZJ.LJIIJ(1.33f, 0.0f, 2.45f, 0.0f, 3.37f, 0.07f);
        this.LIZJ.LJIIJ(0.95f, 0.08f, 1.86f, 0.25f, 2.73f, 0.7f);
        C32856Cuy.d6(this.LIZJ);
        this.LIZJ.LJIILL(16.16f);
        C32856Cuy.C7(this.LIZJ);
        this.LIZJ.LJI(11.92f);
        C32856Cuy.ce(this.LIZJ);
        this.LIZJ.LIZJ(44.6f, 44.6f, false, true, 2.0f, 32.08f);
        this.LIZJ.LJIJ(15.92f);
        C32856Cuy.Me(this.LIZJ);
        this.LIZJ.LIZJ(44.6f, 44.6f, false, true, 11.92f, 6.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.0f, 27.8f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(15.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIILL(-1.6f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJI(11.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(1.6f);
        C32856Cuy.Yl(this.LIZJ);
        this.LIZJ.LJIILIIL(26.0f, 3.4f);
        C32856Cuy.bo(this.LIZJ);
        C32856Cuy.Xl(this.LIZJ);
        this.LIZJ.LJIILIIL(0.0f, -3.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-1.6f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-5.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(1.6f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.D0(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-20.0f, 3.4f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-6.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p5.LJIILL(1.6f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p5.LJIIJJI(6.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p5.LJIILL(-1.6f);
        C32856Cuy.Xl(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
