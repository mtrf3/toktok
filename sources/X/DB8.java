package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB8 extends AbstractC39455Fe7 {
    public DB8() {
        this.LIZJ.LJIIIIZZ(34.7f, 3.11f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.42f);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.94f, 0.5f, 0.83f, 1.02f);
        this.LIZJ.LJII(35.73f, 15.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(6.55f);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 0.95f, 0.5f, 0.83f, 1.03f);
        this.LIZJ.LJIIL(-0.43f, 2.0f);
        this.LIZJ.LJIIJ(-0.12f, 0.57f, -0.63f, 0.97f, -1.2f, 0.97f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(34.9f);
        this.LIZJ.LJIIL(-1.83f, 9.0f);
        C32856Cuy.F0(this.LIZJ);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.94f, 0.5f, 0.83f, 1.03f);
        this.LIZJ.LJIIL(-0.44f, 2.0f);
        this.LIZJ.LJIIJ(-0.12f, 0.57f, -0.62f, 0.97f, -1.2f, 0.97f);
        this.LIZJ.LJIIJJI(-7.01f);
        this.LIZJ.LJII(30.0f, 43.02f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(-0.12f, 0.57f, -0.62f, 0.98f, -1.2f, 0.98f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-2.43f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(0.85f, 0.85f, false, true, -0.83f, -1.02f);
        this.LIZJ.LJII(27.8f, 32.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(16.43f);
        this.LIZJ.LJIIL(-2.25f, 11.02f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJ(-0.12f, 0.57f, -0.62f, 0.98f, -1.2f, 0.98f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(-2.44f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIZ(0.85f, 0.85f, false, true, -0.83f, -1.02f);
        this.LIZJ.LJII(11.95f, 32.0f);
        this.LIZJ.LJI(5.1f);
        C32856Cuy.b6(this.LIZJ);
        this.LIZJ.LJIIJ(0.13f, -0.57f, 0.63f, -0.97f, 1.2f, -0.97f);
        this.LIZJ.LJIIJJI(6.87f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIL(1.84f, -9.0f);
        this.LIZJ.LJI(7.48f);
        C32856Cuy.b6(this.LIZJ);
        this.LIZJ.LJIIJ(0.12f, -0.57f, 0.62f, -0.97f, 1.2f, -0.97f);
        this.LIZJ.LJIIJJI(7.14f);
        this.LIZJ.LJIIL(2.23f, -10.9f);
        this.LIZJ.LJIIJ(0.12f, -0.58f, 0.62f, -0.99f, 1.2f, -0.99f);
        this.LIZJ.LJIIJJI(2.44f);
        this.LIZJ.LJIIJ(0.53f, 0.0f, 0.94f, 0.5f, 0.83f, 1.02f);
        this.LIZJ.LJII(19.9f, 15.0f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJJI(11.37f);
        this.LIZJ.LJIIL(2.22f, -10.9f);
        this.LIZJ.LJIIJ(0.12f, -0.58f, 0.63f, -0.99f, 1.21f, -0.99f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.08f, 19.0f);
        this.LIZJ.LJIIL(-1.84f, 9.0f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIIJJI(11.37f);
        DIJ p15 = this.LIZJ;
        o.LJIIIZ(p15, "p");
        p15.LJIIL(1.84f, -9.0f);
        this.LIZJ.LJI(19.08f);
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
