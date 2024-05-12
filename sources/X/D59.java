package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D59 extends AbstractC39455Fe7 {
    public D59() {
        this.LIZJ.LJIILIIL(16.79f, 27.0f);
        this.LIZJ.LJIIL(2.42f, -17.0f);
        C32856Cuy.s6(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, true, true, 0.0f, -2.0f);
        C32856Cuy.LJIILLIIL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, true, true, 0.0f, 2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-3.21f);
        this.LIZJ.LJIIL(2.42f, 17.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(36.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(4.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        C32856Cuy.B6(this.LIZJ);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.vn(this.LIZJ);
        C32856Cuy.LJJZZI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(12.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.LJJLJLI(this.LIZJ);
        C32856Cuy.x(this.LIZJ);
        this.LIZJ.LJIIJJI(4.79f);
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
