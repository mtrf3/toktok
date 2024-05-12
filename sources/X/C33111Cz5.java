package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33111Cz5 extends AbstractC39455Fe7 {
    public C33111Cz5() {
        this.LIZJ.LJIIIIZZ(15.0f, 17.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p.LJIIJJI(1.0f);
        p.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p.LJIJ(13.0f);
        C32856Cuy.LJIILJJIL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.5f);
        p2.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p2.LJIIJJI(1.0f);
        p2.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        C32856Cuy.k9(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(4.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(20.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(11.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.m9(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        p6.LJIIJJI(4.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(4.5f);
        this.LIZJ.LIZLLL();
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIIZZ(31.0f, 11.0f);
        C32856Cuy.t6(this.LIZJ);
        C32856Cuy.ab(this.LIZJ);
        C32856Cuy.p3(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(20.0f);
        p10.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(26.0f);
        p11.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIJ(15.0f);
        p12.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.LJFF(this.LIZJ);
        C32856Cuy.ab(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.85f, 12.06f);
        C32856Cuy.d2(this.LIZJ);
        this.LIZJ.LJII(22.0f, 30.09f);
        this.LIZJ.LJIIL(-4.44f, -4.44f);
        C32856Cuy.b4(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIL(5.5f, 5.5f);
        C32856Cuy.a4(this.LIZJ);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIIL(9.5f, -9.5f);
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
