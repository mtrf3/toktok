package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32869CvB extends AbstractC39455Fe7 {
    public C32869CvB() {
        this.LIZJ.LJIIIIZZ(26.15f, 15.65f);
        C32856Cuy.LLJJIJIL(this.LIZJ);
        this.LIZJ.LJIIL(8.29f, -8.3f);
        this.LIZJ.LJIIJ(0.2f, -0.19f, 0.51f, -0.19f, 0.7f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(0.71f, 0.71f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.2f, 0.2f, 0.2f, 0.52f, 0.0f, 0.71f);
        this.LIZJ.LJIIL(-8.29f, 8.3f);
        C32856Cuy.D5(this.LIZJ);
        Q7L.LIZLLL(this.LIZJ, "p", -0.71f, -0.71f);
        this.LIZJ.LJIIIIZZ(12.0f, 11.0f);
        C32856Cuy.Cn(this.LIZJ);
        C32856Cuy.LJLLILLLL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(21.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(19.56f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.0f, -0.27f, 0.22f, -0.5f, 0.5f, -0.5f);
        C32856Cuy.o4(this.LIZJ);
        C32856Cuy.K9(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        p6.LJI(12.0f);
        p6.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        p6.LJIJ(12.0f);
        C32856Cuy.el(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(11.68f);
        C32856Cuy.sd(this.LIZJ);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(13.5f, 16.0f);
        C32856Cuy.C5(this.LIZJ);
        C32856Cuy.xb(this.LIZJ);
        C32856Cuy.LLILZIL(this.LIZJ);
        C32856Cuy.B6(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p9.LJIILL(1.0f);
        p9.LIZLLL();
        this.LIZJ.LJIILIIL(4.5f, 6.0f);
        C32856Cuy.pm(this.LIZJ);
        C32856Cuy.b5(this.LIZJ);
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
