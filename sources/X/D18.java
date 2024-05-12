package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D18 extends AbstractC39455Fe7 {
    public D18() {
        C32856Cuy.sl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(32.62f, 9.0f);
        C32856Cuy.rk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(4.95f, 4.95f);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJIIL(-4.95f, 4.95f);
        C32856Cuy.nk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-4.95f, -4.95f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJIIL(4.95f, -4.95f);
        this.LIZJ.LIZLLL();
        C32856Cuy.b8(this.LIZJ);
        C32856Cuy.S4(this.LIZJ);
        C32856Cuy.dn(this.LIZJ);
        this.LIZJ.LJIILIIL(10.0f, 4.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJIIJJI(-8.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p4.LJIILL(8.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(8.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", -8.0f);
        C32856Cuy.b7(this.LIZJ);
        C32856Cuy.S4(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
