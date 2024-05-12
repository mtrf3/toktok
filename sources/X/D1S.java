package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1S extends AbstractC39455Fe7 {
    public D1S() {
        C32856Cuy.in(this.LIZJ);
        this.LIZJ.LJIIIIZZ(23.37f, 27.46f);
        this.LIZJ.LJIIJ(-1.37f, -0.3f, -2.84f, -0.46f, -4.39f, -0.46f);
        C32856Cuy.Y5(this.LIZJ);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 1.0f, -0.45f, 1.02f, -1.0f);
        this.LIZJ.LJIIJ(0.3f, -7.84f, 4.9f, -13.0f, 12.98f, -13.0f);
        this.LIZJ.LJIIJ(0.53f, 0.0f, 1.05f, 0.02f, 1.55f, 0.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(8.03f, 8.03f, false, true, 2.84f, -3.6f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.98f, 31.0f);
        C32856Cuy.rj(this.LIZJ);
        C32856Cuy.Ch(this.LIZJ);
        C32856Cuy.sj(this.LIZJ);
        C32856Cuy.Ie(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-10.0f);
        C32856Cuy.LJJLL(this.LIZJ);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, true, true, 6.0f, 0.0f);
        C32856Cuy.n1(this.LIZJ);
        C32856Cuy.C0(this.LIZJ);
        C32856Cuy.y9(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(7.0f, 7.0f, true, false, -14.0f, 0.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(5.0f);
        p4.LIZLLL();
        this.LIZJ.LJIILIIL(14.0f, 11.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-14.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-7.0f);
        p6.LJIIJJI(14.0f);
        C32856Cuy.F1(this.LIZJ);
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
