package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D87 extends AbstractC39455Fe7 {
    public D87() {
        this.LIZJ.LJIIIIZZ(19.0f, 6.5f);
        C32856Cuy.Wd(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.5f, 13.0f);
        C32856Cuy.na(this.LIZJ);
        this.LIZJ.LJIILIIL(4.23f, 17.27f);
        this.LIZJ.LJIIJ(-4.1f, 1.6f, -7.68f, 5.17f, -9.15f, 11.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.51f, 0.51f, false, true, -0.6f, 0.38f);
        this.LIZJ.LJIIL(-1.96f, -0.44f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.37f, -0.6f);
        this.LIZJ.LJIIJ(1.7f, -6.85f, 5.94f, -11.23f, 11.0f, -13.2f);
        this.LIZJ.LJIIIZ(18.1f, 18.1f, false, true, 15.18f, 0.98f);
        this.LIZJ.LJIIJ(0.24f, 0.13f, 0.32f, 0.44f, 0.18f, 0.68f);
        this.LIZJ.LJIIL(-1.02f, 1.72f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, true, -0.69f, 0.19f);
        this.LIZJ.LJIIIZ(15.11f, 15.11f, false, false, -12.57f, -0.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(26.1f, -1.82f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, true, 0.7f, 0.13f);
        this.LIZJ.LJIIL(2.68f, 4.03f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -2.08f, 3.89f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(27.5f);
        C32856Cuy.V5(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(11.76f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.42f, -0.78f);
        this.LIZJ.LJIIL(-1.65f, -2.47f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.14f, -0.7f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(1.66f, -1.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.8f, 43.39f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 2.08f, -3.89f);
        this.LIZJ.LJI(44.5f);
        C32856Cuy.n8(this.LIZJ);
        this.LIZJ.LJI(32.74f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.42f, 0.78f);
        this.LIZJ.LJIIL(1.65f, 2.47f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.14f, 0.7f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(-1.66f, 1.1f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, -0.13f);
        this.LIZJ.LJIIL(-2.68f, -4.03f);
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
