package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D74 extends AbstractC39455Fe7 {
    public D74() {
        this.LIZJ.LJIIIIZZ(36.0f, 4.54f);
        this.LIZJ.LJIIIZ(6.68f, 6.68f, false, true, 5.0f, -2.24f);
        C32856Cuy.Ym(this.LIZJ);
        this.LIZJ.LIZJ(3.3f, 3.3f, false, false, 37.7f, 9.0f);
        C32856Cuy.LJLLLL(this.LIZJ);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, false, false, 3.3f, 3.3f);
        C32856Cuy.Ym(this.LIZJ);
        this.LIZJ.LJIIIZ(6.68f, 6.68f, false, true, -5.0f, -2.24f);
        this.LIZJ.LJIIIZ(6.68f, 6.68f, false, true, -5.0f, 2.24f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.5f);
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-2.4f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p3.LJI(31.0f);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, false, false, 3.3f, -3.3f);
        C32856Cuy.g(this.LIZJ);
        this.LIZJ.LIZJ(3.3f, 3.3f, false, false, 31.0f, 5.7f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-2.5f);
        p4.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(2.8f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p6.LJI(31.0f);
        this.LIZJ.LJIIJ(1.99f, 0.0f, 3.77f, 0.86f, 5.0f, 2.24f);
        this.LIZJ.LIZLLL();
        C32856Cuy.rg(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
