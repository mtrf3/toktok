package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32887CvT extends AbstractC39455Fe7 {
    public C32887CvT() {
        this.LIZJ.LJIIIIZZ(43.0f, 34.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLZZZZ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(31.5f);
        C32856Cuy.fg(this.LIZJ);
        C32856Cuy.T6(this.LIZJ);
        C32856Cuy.H8(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-29.0f, 9.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIILL(-6.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.f4(this.LIZJ);
        C32856Cuy.zn(this.LIZJ);
        C32856Cuy.zb(this.LIZJ);
        C32856Cuy.gg(this.LIZJ);
        C32856Cuy.LLJLL(this.LIZJ);
        C32856Cuy.V(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(5.0f, 14.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(6.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(6.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(4.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.LJJLIIIIJ(this.LIZJ);
        C32856Cuy.eg(this.LIZJ);
        C32856Cuy.f4(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(38.0f, 0.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p9.LJIIJJI(-6.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.bb(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(-4.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        C32856Cuy.LJJLIIIIJ(this.LIZJ);
        C32856Cuy.jg(this.LIZJ);
        C32856Cuy.Na(this.LIZJ);
        C32856Cuy.f1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
