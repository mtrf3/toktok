package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32891CvX extends AbstractC39455Fe7 {
    public C32891CvX() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 9.0f);
        C32856Cuy.x(this.LIZJ);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.wm(this.LIZJ);
        C32856Cuy.B1(this.LIZJ);
        C32856Cuy.p0(this.LIZJ);
        C32856Cuy.N5(this.LIZJ);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.LJLL(this.LIZJ);
        C32856Cuy.qh(this.LIZJ);
        C32856Cuy.l9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(9.5f);
        C32856Cuy.LLILZIL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(16.0f);
        p3.LJIJ(9.0f);
        p3.LIZLLL();
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(2.0f, 3.0f);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.u6(this.LIZJ);
        C32856Cuy.LJZ(this.LIZJ);
        this.LIZJ.LJIILIIL(-4.0f, 2.0f);
        C32856Cuy.LJLL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p5.LJIIJJI(18.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.l9(this.LIZJ);
        C32856Cuy.LLLLIL(this.LIZJ);
        this.LIZJ.LJIILIIL(6.0f, 17.5f);
        C32856Cuy.mo(this.LIZJ);
        this.LIZJ.LJIILIIL(7.0f, 0.0f);
        C32856Cuy.mo(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
