package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33107Cz1 extends AbstractC39455Fe7 {
    public C33107Cz1() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(23.0f, 35.0f);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.wn(this.LIZJ);
        C32856Cuy.LJJZZI(this.LIZJ);
        C32856Cuy.LJIIL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        p2.LJIILL(-4.0f);
        C32856Cuy.xm(this.LIZJ);
        this.LIZJ.LJIIJJI(-4.79f);
        this.LIZJ.LJII(28.8f, 10.0f);
        C32856Cuy.J6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, true, false, 0.0f, -2.0f);
        C32856Cuy.s6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, true, false, 0.0f, 2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(3.21f);
        this.LIZJ.LJII(16.8f, 27.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(12.0f);
        p6.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(4.0f);
        p7.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        C32856Cuy.LJIIL(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.48f, -6.0f);
        this.LIZJ.LJIIL(2.71f, -19.0f);
        this.LIZJ.LJIIJJI(5.54f);
        this.LIZJ.LJIIL(2.71f, 19.0f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.C1(this.LIZJ);
        C32856Cuy.n6(this.LIZJ);
        C32856Cuy.LJJLJLI(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(6.52f);
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
