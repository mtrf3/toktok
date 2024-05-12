package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2A extends AbstractC39455Fe7 {
    public D2A() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 6.5f);
        p.LIZJ(2.5f, 2.5f, false, true, 6.5f, 4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(35.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LIZJ(2.5f, 2.5f, false, true, 44.0f, 6.5f);
        C32856Cuy.LJLJLJ(this.LIZJ);
        C32856Cuy.eg(this.LIZJ);
        this.LIZJ.LJIIJJI(-35.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 4.0f, 27.5f);
        C32856Cuy.LJJJZ(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(8.0f, 8.0f);
        C32856Cuy.LJLJL(this.LIZJ);
        C32856Cuy.LJJIIJZLJL(this.LIZJ);
        C32856Cuy.I8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(4.0f, 41.0f);
        C32856Cuy.n2(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJI(5.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-2.0f);
        p5.LIZLLL();
        this.LIZJ.LJIILIIL(1.0f, -8.0f);
        C32856Cuy.Zj(this.LIZJ);
        C32856Cuy.LJJIIZI(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p6.LJIILL(-2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p6.LJI(5.0f);
        p6.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
