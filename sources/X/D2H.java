package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2H extends AbstractC39455Fe7 {
    public D2H() {
        this.LIZJ.LJIIIIZZ(12.48f, 14.52f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(7.48f, 7.48f, true, true, 14.96f, 0.0f);
        p.LJIIIZ(7.48f, 7.48f, false, true, -14.96f, 0.0f);
        p.LIZLLL();
        this.LIZJ.LJIILIIL(7.47f, -5.47f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.48f, 5.48f, true, false, 0.0f, 10.96f);
        p2.LJIIIZ(5.48f, 5.48f, false, false, 0.0f, -10.96f);
        p2.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.61f, 27.26f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(-3.36f, 1.31f, -6.3f, 4.23f, -7.52f, 9.02f);
        p3.LJIIIZ(0.51f, 0.51f, false, true, -0.6f, 0.38f);
        p3.LJIIL(-0.98f, -0.22f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, true, -0.37f, -0.6f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(1.37f, -5.43f, 4.75f, -8.88f, 8.74f, -10.44f);
        p4.LJIIIZ(14.45f, 14.45f, false, true, 12.02f, 0.73f);
        p4.LJIIJ(0.25f, 0.13f, 0.33f, 0.44f, 0.19f, 0.68f);
        p4.LJIIL(-0.51f, 0.86f);
        p4.LJIIIZ(0.52f, 0.52f, false, true, -0.69f, 0.19f);
        p4.LJIIIZ(12.45f, 12.45f, false, false, -10.28f, -0.6f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.0f, 33.5f);
        C32856Cuy.C5(this.LIZJ);
        C32856Cuy.L6(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(5.5f);
        p5.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        C32856Cuy.b2(this.LIZJ);
        C32856Cuy.H9(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-5.5f);
        C32856Cuy.LLILZIL(this.LIZJ);
        C32856Cuy.J6(this.LIZJ);
        C32856Cuy.ih(this.LIZJ);
        C32856Cuy.F9(this.LIZJ);
        C32856Cuy.xo(this.LIZJ);
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
