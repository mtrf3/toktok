package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1Q extends AbstractC39455Fe7 {
    public D1Q() {
        this.LIZJ.LJIIIIZZ(6.0f, 17.0f);
        C32856Cuy.LJJZZI(this.LIZJ);
        C32856Cuy.oj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-6.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(6.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.F4(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(36.0f, 0.0f);
        C32856Cuy.Ie(this.LIZJ);
        C32856Cuy.to(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(6.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.B8(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 21.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p4.LJIIJJI(-2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(6.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-6.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(2.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p7.LJIIJJI(7.0f);
        C32856Cuy.sj(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.0f, 31.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(7.0f);
        p9.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        C32856Cuy.c5(this.LIZJ);
        C32856Cuy.I(this.LIZJ);
        C32856Cuy.j3(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.0f, -9.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(34.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p10.LJIILL(2.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p10.LJI(7.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p10.LJIILL(-2.0f);
        C32856Cuy.Wl(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
