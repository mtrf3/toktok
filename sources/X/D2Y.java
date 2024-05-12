package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2Y extends AbstractC39455Fe7 {
    public D2Y() {
        this.LIZJ.LJIIIIZZ(14.0f, 30.5f);
        C32856Cuy.Yb(this.LIZJ);
        C32856Cuy.x9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(6.5f);
        C32856Cuy.LLILZIL(this.LIZJ);
        C32856Cuy.n6(this.LIZJ);
        C32856Cuy.ih(this.LIZJ);
        C32856Cuy.v9(this.LIZJ);
        C32856Cuy.xo(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        p2.LJI(14.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(5.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(29.0f, 22.0f);
        C32856Cuy.td(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(0.0f, 2.0f);
        C32856Cuy.ta(this.LIZJ);
        this.LIZJ.LJIIIIZZ(41.08f, 38.85f);
        this.LIZJ.LJIIIZ(0.52f, 0.52f, false, true, -0.6f, -0.36f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, false, false, -22.97f, 0.02f);
        this.LIZJ.LJIIIZ(0.52f, 0.52f, false, true, -0.6f, 0.36f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-0.98f, -0.22f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, true, -0.36f, -0.61f);
        this.LIZJ.LIZJ(14.0f, 14.0f, false, true, 42.42f, 38.0f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, true, -0.36f, 0.61f);
        this.LIZJ.LJIIL(-0.98f, 0.23f);
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
