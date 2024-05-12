package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1I extends AbstractC39455Fe7 {
    public D1I() {
        this.LIZJ.LJIIIIZZ(43.5f, 35.5f);
        this.LIZJ.LJIIJ(0.0f, 0.61f, -0.1f, 1.2f, -0.3f, 1.74f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-3.7f, -3.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(9.5f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJIIJJI(-24.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-3.7f, -3.7f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 1.7f, -0.3f);
        C32856Cuy.LJJI(this.LIZJ);
        C32856Cuy.ki(this.LIZJ);
        C32856Cuy.LJLLJ(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.56f, 9.15f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.02f, -0.04f);
        this.LIZJ.LJII(8.7f, 6.24f);
        this.LIZJ.LJIIL(-0.03f, 0.03f);
        this.LIZJ.LJIIL(-1.06f, -1.06f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(4.79f, 6.6f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(2.71f, 2.71f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(35.5f);
        C32856Cuy.oi(this.LIZJ);
        this.LIZJ.LJIIJJI(24.76f);
        this.LIZJ.LJIIL(2.7f, 2.7f);
        C32856Cuy.Dk(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(1.42f, -1.4f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.42f);
        this.LIZJ.LJIIL(-1.07f, -1.06f);
        this.LIZJ.LJIIL(-9.44f, -9.47f);
        this.LIZJ.LJIIL(-0.08f, -0.05f);
        this.LIZJ.LJII(11.56f, 9.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.06f, 5.6f);
        this.LIZJ.LJIIL(6.22f, 6.21f);
        this.LIZJ.LJIIJ(-0.6f, 0.19f, -1.15f, 0.52f, -1.62f, 0.98f);
        this.LIZJ.LJIIL(-4.6f, 4.57f);
        this.LIZJ.LJIJ(14.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.0f, 20.5f);
        C32856Cuy.P2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
