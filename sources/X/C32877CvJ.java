package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32877CvJ extends AbstractC39455Fe7 {
    public C32877CvJ() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(11.0f, 9.0f);
        C32856Cuy.rj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(26.17f);
        C32856Cuy.Tk(this.LIZJ);
        C32856Cuy.L6(this.LIZJ);
        C32856Cuy.sj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-8.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p3.LJIILL(8.0f);
        C32856Cuy.Be(this.LIZJ);
        this.LIZJ.LJI(13.95f);
        C32856Cuy.Ti(this.LIZJ);
        C32856Cuy.k9(this.LIZJ);
        C32856Cuy.Ce(this.LIZJ);
        C32856Cuy.LJIJJLI(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(8.0f, 8.0f, false, true, 8.0f, 8.0f);
        C32856Cuy.z1(this.LIZJ);
        this.LIZJ.LJIIJJI(3.04f);
        this.LIZJ.LJIIJ(0.53f, 0.0f, 0.96f, 0.54f, 0.96f, 1.21f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(1.58f);
        this.LIZJ.LJIIJ(0.0f, 0.67f, -0.43f, 1.21f, -0.96f, 1.21f);
        C32856Cuy.Pb(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
        C32856Cuy.LJJLIIJ(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        p6.LJI(11.0f);
        p6.LIZLLL();
        this.LIZJ.LJIILIIL(8.0f, 14.0f);
        C32856Cuy.vc(this.LIZJ);
        C32856Cuy.LJIIJJI(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.0f, -0.54f, 1.0f, -1.21f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(24.2f);
        this.LIZJ.LJIIJ(0.0f, -0.67f, -0.45f, -1.21f, -1.0f, -1.21f);
        C32856Cuy.LLLLJI(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
