package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1M extends AbstractC39455Fe7 {
    public D1M() {
        this.LIZJ.LJIIIIZZ(15.5f, 8.01f);
        this.LIZJ.LJIIIZ(3.03f, 3.03f, false, false, 0.0f, 6.06f);
        C32856Cuy.o0(this.LIZJ);
        this.LIZJ.LJIIIZ(14.51f, 14.51f, false, false, -3.63f, -4.98f);
        this.LIZJ.LJIIJ(-0.78f, -0.69f, -1.54f, -1.09f, -2.47f, -1.09f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.29f, 6.07f);
        C32856Cuy.d0(this.LIZJ);
        this.LIZJ.LJIIIZ(16.82f, 16.82f, false, true, 4.5f, -6.47f);
        this.LIZJ.LJ(29.67f, 6.74f, 30.9f, 6.0f, 32.5f, 6.0f);
        this.LIZJ.LJIIIZ(5.03f, 5.03f, false, true, 4.01f, 8.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(4.04f);
        this.LIZJ.LJIIJ(0.8f, 0.0f, 1.45f, 0.65f, 1.45f, 1.44f);
        this.LIZJ.LJIILL(6.28f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, 0.8f, -0.65f, 1.45f, -1.45f, 1.45f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-2.13f);
        this.LIZJ.LJIILL(17.37f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, 0.8f, -0.65f, 1.45f, -1.45f, 1.45f);
        this.LIZJ.LJI(11.03f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(-0.8f, 0.0f, -1.45f, -0.65f, -1.45f, -1.45f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(23.25f);
        this.LIZJ.LJI(7.45f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(-0.8f, 0.0f, -1.45f, -0.65f, -1.45f, -1.45f);
        this.LIZJ.LJIILL(-6.28f);
        this.LIZJ.LJIIJ(0.0f, -0.8f, 0.65f, -1.44f, 1.45f, -1.44f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(4.04f);
        this.LIZJ.LIZJ(5.03f, 5.03f, false, true, 15.5f, 6.0f);
        this.LIZJ.LJIIJ(1.6f, 0.0f, 2.82f, 0.73f, 3.8f, 1.6f);
        this.LIZJ.LJIIIZ(16.82f, 16.82f, false, true, 4.49f, 6.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 16.08f);
        this.LIZJ.LJIILL(5.17f);
        C32856Cuy.LJJIIJZLJL(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(-5.17f);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIILIIL(18.4f, -2.0f);
        C32856Cuy.o0(this.LIZJ);
        this.LIZJ.LJIIIZ(3.03f, 3.03f, false, false, 0.0f, -6.06f);
        this.LIZJ.LJIIJ(-0.93f, 0.0f, -1.69f, 0.4f, -2.47f, 1.1f);
        this.LIZJ.LJIIIZ(14.51f, 14.51f, false, false, -3.64f, 4.97f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(10.02f, 9.17f);
        C32856Cuy.B6(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(16.82f);
        this.LIZJ.LJIIJJI(11.42f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIJ(23.25f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.0f, 40.07f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIJ(23.25f);
        this.LIZJ.LJI(11.58f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIILL(16.82f);
        DIL.LIZ(this.LIZJ, "p", 23.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
