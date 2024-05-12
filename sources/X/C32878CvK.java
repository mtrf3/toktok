package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32878CvK extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public C32878CvK() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(3.2f, 2.62f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(38.54f, 38.53f);
        C32856Cuy.yd(this.LIZJ);
        this.LIZJ.LJIIL(-3.68f, -3.69f);
        this.LIZJ.LJIIJ(0.7f, -1.19f, 1.1f, -2.58f, 1.1f, -4.06f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-8.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJIIJJI(-2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(8.0f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -0.13f, 1.04f);
        this.LIZJ.LJII(13.83f, 9.0f);
        C32856Cuy.L6(this.LIZJ);
        C32856Cuy.pj(this.LIZJ);
        C32856Cuy.z1(this.LIZJ);
        this.LIZJ.LJIIJJI(-9.22f);
        this.LIZJ.LJIIJ(-0.43f, 0.0f, -0.78f, 0.54f, -0.78f, 1.21f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.58f);
        this.LIZJ.LJIIJ(0.0f, 0.67f, 0.35f, 1.21f, 0.78f, 1.21f);
        this.LIZJ.LJIIJJI(16.44f);
        this.LIZJ.LJIIJ(0.43f, 0.0f, 0.78f, -0.54f, 0.78f, -1.21f);
        C32856Cuy.z8(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.67f, -0.35f, -1.21f, -0.78f, -1.21f);
        C32856Cuy.T6(this.LIZJ);
        C32856Cuy.LJJLIIJ(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(8.0f, 8.0f, false, false, -8.0f, -8.0f);
        C32856Cuy.m6(this.LIZJ);
        this.LIZJ.LJIIJ(-0.37f, 0.0f, -0.74f, 0.03f, -1.1f, 0.07f);
        this.LIZJ.LJII(6.04f, 1.21f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(3.21f, 2.62f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(3.0f, 13.0f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, true, 0.33f, -2.28f);
        this.LIZJ.LJIIJ(0.1f, -0.34f, 0.53f, -0.43f, 0.78f, -0.18f);
        this.LIZJ.LJIIL(2.74f, 2.74f);
        this.LIZJ.LJIIJ(0.1f, 0.1f, 0.15f, 0.22f, 0.15f, 0.36f);
        this.LIZJ.LJIILL(25.53f);
        C32856Cuy.Tk(this.LIZJ);
        this.LIZJ.LJIIJJI(15.41f);
        C32856Cuy.dj(this.LIZJ);
        this.LIZJ.LJIIJJI(-18.4f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.5f, 0.13f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-7.48f, 4.2f);
        p5.LIZJ(2.0f, 2.0f, false, true, 3.0f, 42.58f);
        p5.LJIJ(13.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.0f, 10.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(2.36f);
        C32856Cuy.dj(this.LIZJ);
        C32856Cuy.p6(this.LIZJ);
        C32856Cuy.Y9(this.LIZJ);
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
