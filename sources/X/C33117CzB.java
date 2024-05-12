package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33117CzB extends AbstractC39455Fe7 {
    public C33117CzB() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 9.0f);
        C32856Cuy.el(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(13.0f);
        C32856Cuy.fl(this.LIZJ);
        C32856Cuy.F0(this.LIZJ);
        C32856Cuy.fl(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(27.0f);
        C32856Cuy.qh(this.LIZJ);
        C32856Cuy.A9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        p4.LJIJ(9.0f);
        p4.LIZLLL();
        this.LIZJ.LJIILIIL(5.0f, 19.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(11.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(20.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(12.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.LJIIIIZZ(this.LIZJ);
        C32856Cuy.LJLJI(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        p9.LJI(14.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.0f, 8.0f);
        C32856Cuy.Ck(this.LIZJ);
        C32856Cuy.Fk(this.LIZJ);
        C32856Cuy.d5(this.LIZJ);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(4.5f, 7.0f);
        this.LIZJ.LJIIJ(0.0f, 1.66f, -0.67f, 3.0f, -1.5f, 3.0f);
        this.LIZJ.LJIILJJIL(-1.5f, -1.34f, -1.5f, -3.0f, true);
        this.LIZJ.LJIILJJIL(0.67f, -3.0f, 1.5f, -3.0f, true);
        this.LIZJ.LJIILJJIL(1.5f, 1.34f, 1.5f, 3.0f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.5f, 3.0f);
        this.LIZJ.LJIIJ(0.83f, 0.0f, 1.5f, -1.34f, 1.5f, -3.0f);
        this.LIZJ.LJIILJJIL(-0.67f, -3.0f, -1.5f, -3.0f, true);
        this.LIZJ.LJIILJJIL(-1.5f, 1.34f, -1.5f, 3.0f, true);
        this.LIZJ.LJIILJJIL(0.67f, 3.0f, 1.5f, 3.0f, true);
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
