package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5H extends AbstractC39455Fe7 {
    public D5H() {
        this.LIZJ.LJIIIIZZ(43.0f, 20.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIJ(6.0f);
        C32856Cuy.xm(this.LIZJ);
        C32856Cuy.Fg(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(11.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(5.0f, 28.0f);
        C32856Cuy.zg(this.LIZJ);
        C32856Cuy.LLLLLZ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(29.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.U6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(6.0f, 4.0f);
        C32856Cuy.Y3(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJI(8.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(11.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.Pi(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, -2.0f);
        p7.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.0f, 43.0f);
        C32856Cuy.Fk(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        p9.LJIJ(29.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p10.LJIIJJI(-2.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p10.LJIILL(11.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJI(29.0f);
        p11.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p11.LJIILL(2.0f);
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
