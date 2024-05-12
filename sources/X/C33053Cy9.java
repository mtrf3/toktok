package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33053Cy9 extends AbstractC39455Fe7 {
    public C33053Cy9() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(23.0f, 2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.Qe(this.LIZJ);
        this.LIZJ.LJIILIIL(0.0f, 38.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p3.LJIILL(4.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-4.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p4.LJIIJJI(-2.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.S3(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(2.82f, 2.83f);
        C32856Cuy.xd(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-2.83f, -2.82f);
        C32856Cuy.kn(this.LIZJ);
        this.LIZJ.LJIIIIZZ(34.6f, 36.02f);
        C32856Cuy.Ik(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(2.82f, 2.82f);
        C32856Cuy.yd(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIL(-2.83f, -2.83f);
        p9.LJIIIZ(1.0f, 1.0f, false, false, -1.4f, 0.0f);
        Q7L.LIZLLL(this.LIZJ, "p", -1.42f, 1.41f);
        this.LIZJ.LJIIIIZZ(45.0f, 22.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p10.LJIILL(2.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p10.LJIIJJI(-4.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p10.LJIILL(-2.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p11.LJIIJJI(4.0f);
        p11.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.0f, 22.0f);
        C32856Cuy.N2(this.LIZJ);
        C32856Cuy.af(this.LIZJ);
        C32856Cuy.LJJIJIIJIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(38.85f, 7.74f);
        C32856Cuy.zk(this.LIZJ);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIL(-2.83f, 2.83f);
        C32856Cuy.F7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(11.98f, 34.6f);
        C32856Cuy.yk(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIL(-2.82f, 2.83f);
        C32856Cuy.F7(this.LIZJ);
        C32856Cuy.Th(this.LIZJ);
        this.LIZJ.LJIILIIL(8.0f, -12.0f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, true, false, 0.0f, 24.0f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, false, false, 0.0f, -24.0f);
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
