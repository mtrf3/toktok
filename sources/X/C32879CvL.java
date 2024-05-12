package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32879CvL extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public C32879CvL() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(3.2f, 4.04f);
        C32856Cuy.M8(this.LIZJ);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(9.83f, 5.0f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.ki(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(3.6f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(2.8f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p4.LJIIJJI(-4.0f);
        C32856Cuy.I9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.36f, -0.04f, 0.72f, -0.11f, 1.06f);
        this.LIZJ.LJIIL(3.68f, 3.69f);
        C32856Cuy.xk(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-1.41f, 1.41f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.42f, 0.0f);
        this.LIZJ.LJII(3.21f, 4.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.97f, 18.0f);
        C32856Cuy.S6(this.LIZJ);
        C32856Cuy.LJJLJLI(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(24.96f);
        this.LIZJ.LJIIJ(-0.53f, 0.0f, -0.96f, 0.54f, -0.96f, 1.21f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(1.58f);
        this.LIZJ.LJIIJ(0.0f, 0.67f, 0.43f, 1.21f, 0.96f, 1.21f);
        this.LIZJ.LIZLLL();
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIIZZ(3.0f, 10.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(-0.15f);
        this.LIZJ.LJII(16.15f, 23.0f);
        C32856Cuy.p6(this.LIZJ);
        C32856Cuy.vc(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(6.15f);
        this.LIZJ.LJIIL(13.0f, 13.0f);
        this.LIZJ.LJIIJJI(-19.2f);
        C32856Cuy.Ti(this.LIZJ);
        C32856Cuy.LLZLI(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
