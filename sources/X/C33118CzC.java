package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33118CzC extends AbstractC39455Fe7 {
    public C33118CzC() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 4.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        C32856Cuy.LJLLLL(this.LIZJ);
        C32856Cuy.oi(this.LIZJ);
        C32856Cuy.LJJIII(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        p2.LJIJ(9.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        C32856Cuy.Y6(this.LIZJ);
        C32856Cuy.LLLLZLL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p3.LJIIJJI(30.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(30.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(9.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIJ(9.0f);
        p5.LIZLLL();
        this.LIZJ.LJIILIIL(4.7f, 8.33f);
        C32856Cuy.wf(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(1.26f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIILL(-4.1f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(5.26f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(29.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(1.28f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIJ(18.33f);
        C32856Cuy.Bn(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-1.28f);
        C32856Cuy.Cn(this.LIZJ);
        this.LIZJ.LJIILL(3.73f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJJI(-5.26f);
        this.LIZJ.LJIILL(-3.73f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJI(12.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(14.08f, 0.0f);
        C32856Cuy.wf(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJJI(4.33f);
        this.LIZJ.LJIIIZ(7.1f, 7.1f, false, false, 4.94f, -1.72f);
        this.LIZJ.LJIIIZ(5.93f, 5.93f, false, false, 1.91f, -4.63f);
        this.LIZJ.LJIIJ(0.0f, -1.93f, -0.64f, -3.47f, -1.91f, -4.6f);
        this.LIZJ.LJIIIZ(7.13f, 7.13f, false, false, -4.95f, -1.72f);
        C40084FoG.LJ(this.LIZJ, "p", -4.32f);
        this.LIZJ.LJIILIIL(4.32f, 9.82f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIIJJI(-2.05f);
        this.LIZJ.LJIILL(-6.97f);
        C32856Cuy.Db(this.LIZJ);
        this.LIZJ.LJIIJ(1.12f, 0.0f, 1.99f, 0.32f, 2.6f, 0.97f);
        this.LIZJ.LJIIJ(0.6f, 0.64f, 0.9f, 1.48f, 0.9f, 2.5f);
        this.LIZJ.LJIIIZ(3.34f, 3.34f, false, true, -3.52f, 3.5f);
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
