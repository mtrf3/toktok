package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32884CvQ extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public C32884CvQ() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 0.0f);
        C32856Cuy.gg(this.LIZJ);
        C32856Cuy.E1(this.LIZJ);
        C32856Cuy.P4(this.LIZJ);
        C32856Cuy.LJJZ(this.LIZJ);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 24.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.86f, 26.22f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, true, false, -7.07f, -7.08f);
        this.LIZJ.LJII(2.0f, 38.92f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, false, 9.08f, 46.0f);
        this.LIZJ.LJIIL(19.78f, -19.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.12f, -4.95f);
        C32856Cuy.LLLILZJ(this.LIZJ);
        this.LIZJ.LJIIL(-5.3f, 5.31f);
        this.LIZJ.LJIIL(-2.84f, -2.83f);
        this.LIZJ.LJIIL(5.31f, -5.3f);
        C32856Cuy.LLLIZZ(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.5f, 39.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.5f, 2.5f, false, false, -5.0f, 0.0f);
        C32856Cuy.E1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(2.5f, 2.5f, false, false, 5.0f, 0.0f);
        C32856Cuy.h1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(7.03f, 7.03f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.5f, 2.5f, false, true, 3.53f, 0.0f);
        this.LIZJ.LJIIL(4.25f, 4.24f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -3.54f, 3.53f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-4.24f, -4.24f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(2.5f, 2.5f, false, true, 0.0f, -3.53f);
        p6.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.73f, 33.19f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, false, -3.54f, 3.53f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(4.24f, 4.25f);
        C32856Cuy.qd(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIL(-4.24f, -4.24f);
        this.LIZJ.LIZLLL();
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIIZZ(0.0f, 24.0f);
        C32856Cuy.fg(this.LIZJ);
        C32856Cuy.E0(this.LIZJ);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 0.0f, 5.0f);
        C32856Cuy.LJII(this.LIZJ);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 0.0f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(39.5f, 21.5f);
        C32856Cuy.N4(this.LIZJ);
        C32856Cuy.E0(this.LIZJ);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 0.0f, -5.0f);
        C32856Cuy.W(this.LIZJ);
        this.LIZJ.LJIIIIZZ(33.2f, 14.8f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIZ(2.5f, 2.5f, false, true, 0.0f, -3.53f);
        this.LIZJ.LJIIL(4.24f, -4.24f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIIZ(2.5f, 2.5f, true, true, 3.53f, 3.54f);
        this.LIZJ.LJIIL(-4.24f, 4.24f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -3.54f, 0.0f);
        this.LIZJ.LIZLLL();
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
