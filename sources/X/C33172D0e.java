package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33172D0e extends AbstractC39455Fe7 {
    public C33172D0e() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(15.0f, 11.0f);
        C32856Cuy.N8(this.LIZJ);
        C32856Cuy.d(this.LIZJ);
        C32856Cuy.LJIJJLI(this.LIZJ);
        C32856Cuy.pj(this.LIZJ);
        this.LIZJ.LJIILL(8.32f);
        this.LIZJ.LJIIJ(0.0f, 0.28f, -0.19f, 0.52f, -0.45f, 0.61f);
        this.LIZJ.LJIIIZ(5.26f, 5.26f, false, false, -3.42f, 4.92f);
        this.LIZJ.LJIIIZ(5.26f, 5.26f, false, false, 3.42f, 4.91f);
        this.LIZJ.LJIIJ(0.26f, 0.1f, 0.45f, 0.34f, 0.45f, 0.62f);
        C32856Cuy.K9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        p2.LJI(19.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-5.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJIIJJI(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p3.LJIILL(5.0f);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        C32856Cuy.mj(this.LIZJ);
        this.LIZJ.LJIILL(-7.77f);
        this.LIZJ.LJIIJ(0.0f, -0.26f, 0.17f, -0.49f, 0.4f, -0.6f);
        this.LIZJ.LJIIIZ(5.26f, 5.26f, false, false, 3.12f, -4.78f);
        this.LIZJ.LJIIIZ(5.26f, 5.26f, false, false, -3.12f, -4.79f);
        this.LIZJ.LJIIIZ(0.67f, 0.67f, false, true, -0.4f, -0.6f);
        C32856Cuy.nl(this.LIZJ);
        C32856Cuy.H0(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(5.0f);
        p4.LIZLLL();
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILIIL(1.0f, 11.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p6.LJIILL(-5.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p6.LJIIJJI(-2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p6.LJIILL(5.0f);
        C32856Cuy.Yl(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILIIL(-1.0f, 9.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p9.LJIIJJI(2.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p9.LJIILL(-5.0f);
        C32856Cuy.p8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
