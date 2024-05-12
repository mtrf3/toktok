package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAU extends AbstractC39455Fe7 {
    public DAU() {
        this.LIZJ.LJIILIIL(12.08f, 5.99f);
        this.LIZJ.LJIIL(23.86f, 0.02f);
        C32856Cuy.fl(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.02f, 30.0f);
        C32856Cuy.dl(this.LIZJ);
        this.LIZJ.LJIIL(-23.86f, -0.02f);
        C32856Cuy.cl(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.02f, -30.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(12.22f, 12.1f);
        this.LIZJ.LJIIL(2.52f, 7.64f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-5.78f);
        this.LIZJ.LJIIL(2.69f, -7.65f);
        C32856Cuy.P1(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(7.3f);
        this.LIZJ.LJIIL(1.64f, 5.06f);
        C32856Cuy.we(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
