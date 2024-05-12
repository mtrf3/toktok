package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33342D6s extends AbstractC39455Fe7 {
    public C33342D6s() {
        this.LIZJ.LJIILIIL(17.29f, 15.0f);
        this.LIZJ.LJIIL(0.63f, -6.1f);
        C32856Cuy.s4(this.LIZJ);
        this.LIZJ.LJII(21.3f, 15.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(6.98f);
        this.LIZJ.LJIIL(0.63f, -6.1f);
        C32856Cuy.s4(this.LIZJ);
        this.LIZJ.LJII(32.3f, 15.0f);
        C32856Cuy.Ec(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.09f);
        this.LIZJ.LJIIL(-0.7f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(36.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.Gj(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.19f);
        C32856Cuy.ei(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-6.98f);
        C32856Cuy.ei(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(11.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(5.19f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(0.7f, -7.0f);
        C32856Cuy.K4(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-2.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(5.29f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.62f, 4.0f);
        this.LIZJ.LJIIL(-0.7f, 7.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(6.98f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIL(0.7f, -7.0f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJJI(-6.98f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
