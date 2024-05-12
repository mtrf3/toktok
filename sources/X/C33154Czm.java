package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33154Czm extends AbstractC39455Fe7 {
    public C33154Czm() {
        C32856Cuy.LLLLZLL(this.LIZJ);
        C32856Cuy.Yg(this.LIZJ);
        C32856Cuy.Yn(this.LIZJ);
        C32856Cuy.eo(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJI(9.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIJ(9.0f);
        p.LIZLLL();
        this.LIZJ.LJIILIIL(26.0f, -2.0f);
        C32856Cuy.u4(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.H0(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, 6.0f);
        p3.LJIILL(30.0f);
        p3.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, 6.0f);
        C32856Cuy.u4(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(9.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        p5.LJIJ(9.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.0f, 19.0f);
        C32856Cuy.a9(this.LIZJ);
        C32856Cuy.l7(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-8.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p6.LJIIJJI(2.0f);
        this.LIZJ.LIZLLL();
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILIIL(0.0f, 15.0f);
        C32856Cuy.H8(this.LIZJ);
        C32856Cuy.LLZ(this.LIZJ);
        C32856Cuy.Yn(this.LIZJ);
        C32856Cuy.Wg(this.LIZJ);
        C32856Cuy.i3(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
