package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1K extends AbstractC39455Fe7 {
    public D1K() {
        this.LIZJ.LJIIIIZZ(7.0f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(15.98f);
        C32856Cuy.N2(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(11.83f);
        this.LIZJ.LJIIL(9.32f, 9.32f);
        C32856Cuy.p5(this.LIZJ);
        this.LIZJ.LJII(9.0f, 11.83f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(11.15f);
        C32856Cuy.bk(this.LIZJ);
        C32856Cuy.e(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, -2.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.17f, 39.0f);
        this.LIZJ.LJIIL(-9.32f, -9.32f);
        C32856Cuy.ci(this.LIZJ);
        this.LIZJ.LJII(39.0f, 36.17f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(25.02f);
        C32856Cuy.LLLLLLJ(this.LIZJ);
        C32856Cuy.N9(this.LIZJ);
        C32856Cuy.vm(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(25.02f);
        C32856Cuy.z4(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(11.15f);
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
