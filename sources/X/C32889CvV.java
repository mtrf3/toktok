package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32889CvV extends AbstractC39455Fe7 {
    public C32889CvV() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 9.0f);
        p.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(9.0f);
        p2.LJIILL(4.0f);
        p2.LJI(9.0f);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(9.0f);
        C32856Cuy.LLLLLLLLLL(this.LIZJ);
        C32856Cuy.T9(this.LIZJ);
        this.LIZJ.LJIILIIL(16.0f, 9.0f);
        C32856Cuy.je(this.LIZJ);
        C32856Cuy.LJJIJLIJ(this.LIZJ);
        C32856Cuy.je(this.LIZJ);
        this.LIZJ.LJIILIIL(-18.0f, 9.34f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, 3.13f, 3.58f, 7.66f, 8.0f, 7.66f);
        p4.LJIILJJIL(8.0f, -4.53f, 8.0f, -7.66f, true);
        p4.LJIIJ(0.0f, -3.12f, -16.0f, -3.12f, -16.0f, 0.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.0f, 44.0f);
        C32856Cuy.ii(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-9.0f);
        p5.LJIIJJI(4.0f);
        p5.LJIILL(9.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p6.LJIIJJI(9.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(4.0f);
        p7.LJI(9.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(35.0f, -5.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        p9.LJIIJJI(-9.0f);
        C32856Cuy.LJJLJLI(this.LIZJ);
        C32856Cuy.LLLZ(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(-9.0f);
        p10.LJIIJJI(4.0f);
        p10.LJIILL(9.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(39.0f, 4.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, 5.0f);
        p11.LJIILL(9.0f);
        C32856Cuy.LJFF(this.LIZJ);
        C32856Cuy.m(this.LIZJ);
        C32856Cuy.LJIIJ(this.LIZJ);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIJ(4.0f);
        C40084FoG.LJ(this.LIZJ, "p", 9.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
