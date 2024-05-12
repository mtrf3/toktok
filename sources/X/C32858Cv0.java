package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cv0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32858Cv0 extends AbstractC39455Fe7 {
    public C32858Cv0() {
        this.LIZJ.LJIIIIZZ(2.5f, 4.0f);
        C32856Cuy.J8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(11.5f);
        C32856Cuy.n8(this.LIZJ);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        C32856Cuy.z5(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(9.5f);
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(3.0f);
        C32856Cuy.LLJJJ(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 4.0f);
        this.LIZJ.LJIIIIZZ(45.5f, 44.0f);
        C32856Cuy.Mj(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(32.5f);
        C32856Cuy.V5(this.LIZJ);
        C32856Cuy.T6(this.LIZJ);
        C32856Cuy.LLJJI(this.LIZJ);
        this.LIZJ.LJIILL(-9.5f);
        C32856Cuy.R1(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(44.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(44.0f, 2.5f);
        C32856Cuy.e5(this.LIZJ);
        C32856Cuy.LJJLIIIJ(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        p6.LJIIJJI(-2.0f);
        p6.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        C32856Cuy.d(this.LIZJ);
        C32856Cuy.LLJJIJI(this.LIZJ);
        C32856Cuy.xb(this.LIZJ);
        this.LIZJ.LIZJ(0.5f, 0.5f, false, true, 32.0f, 5.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(3.0f);
        C32856Cuy.J1(this.LIZJ);
        this.LIZJ.LJI(44.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.0f, 45.5f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 2.5f, 44.0f);
        this.LIZJ.LJIJ(32.5f);
        C32856Cuy.R1(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(42.0f);
        C32856Cuy.Z4(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(9.5f);
        C32856Cuy.n8(this.LIZJ);
        C32856Cuy.LLLLLLLLLL(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.0f, 29.1f);
        this.LIZJ.LJIIJ(0.0f, 2.82f, 3.13f, 6.9f, 7.0f, 6.9f);
        this.LIZJ.LJIILJJIL(7.0f, -4.08f, 7.0f, -6.9f, true);
        this.LIZJ.LJIIJ(0.0f, -2.8f, -14.0f, -2.8f, -14.0f, 0.0f);
        this.LIZJ.LIZLLL();
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIIZZ(16.0f, 23.0f);
        C32856Cuy.Ki(this.LIZJ);
        this.LIZJ.LJIIIIZZ(32.0f, 23.0f);
        C32856Cuy.Ki(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
