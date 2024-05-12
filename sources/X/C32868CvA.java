package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32868CvA extends AbstractC39455Fe7 {
    public C32868CvA() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(29.0f, 14.0f);
        C32856Cuy.LJJLIL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        p2.LJI(7.0f);
        C32856Cuy.bh(this.LIZJ);
        C32856Cuy.LJLJJL(this.LIZJ);
        C32856Cuy.dh(this.LIZJ);
        C32856Cuy.z0(this.LIZJ);
        C32856Cuy.A1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        p3.LJIIJJI(16.0f);
        p3.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        this.LIZJ.LJIILL(-3.21f);
        this.LIZJ.LJIIL(7.18f, 6.28f);
        this.LIZJ.LIZJ(1.8f, 1.8f, false, false, 47.0f, 37.6f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(18.4f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.8f, 1.8f, false, false, -2.82f, -1.48f);
        this.LIZJ.LJII(37.0f, 23.2f);
        C32856Cuy.s9(this.LIZJ);
        C32856Cuy.ah(this.LIZJ);
        C32856Cuy.T(this.LIZJ);
        this.LIZJ.LJIILIIL(-6.0f, -4.0f);
        C32856Cuy.wm(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(2.0f);
        p6.LJI(15.0f);
        C32856Cuy.bh(this.LIZJ);
        C32856Cuy.LJLIIIL(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(7.0f);
        p7.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(12.0f);
        p9.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        C32856Cuy.h0(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 20.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        p10.LJIIJJI(16.0f);
        C32856Cuy.wm(this.LIZJ);
        C32856Cuy.LJLJJL(this.LIZJ);
        C32856Cuy.vm(this.LIZJ);
        C32856Cuy.r6(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        p11.LJIJ(20.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(30.0f, 13.42f);
        this.LIZJ.LJII(37.08f, 28.0f);
        this.LIZJ.LJII(43.0f, 22.58f);
        C78269Unh.LIZJ(this.LIZJ, "p", 10.84f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
