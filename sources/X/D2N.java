package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2N extends AbstractC39455Fe7 {
    public D2N() {
        C32856Cuy.B7(this.LIZJ);
        this.LIZJ.LJI(24.17f);
        C32856Cuy.gl(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(9.97f);
        C32856Cuy.hl(this.LIZJ);
        C32856Cuy.tb(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(21.7f, 21.7f, false, true, -1.52f, -8.0f);
        p2.LIZLLL();
        this.LIZJ.LJIILIIL(13.24f, 25.0f);
        this.LIZJ.LJIIJ(4.5f, 0.0f, 6.75f, -2.4f, 6.75f, -5.56f);
        this.LIZJ.LJIIJ(0.0f, -2.92f, -1.84f, -4.7f, -4.82f, -4.92f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-0.16f);
        this.LIZJ.LJIIL(3.75f, -2.85f);
        C32856Cuy.E9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(9.97f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(3.48f);
        this.LIZJ.LJIIJJI(6.83f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(0.15f);
        this.LIZJ.LJIIL(-4.03f, 3.03f);
        this.LIZJ.LJIILL(2.52f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(2.43f);
        this.LIZJ.LJIIJ(1.98f, 0.0f, 2.87f, 0.97f, 2.87f, 2.31f);
        this.LIZJ.LJIIJ(0.0f, 1.37f, -0.98f, 2.26f, -2.46f, 2.26f);
        this.LIZJ.LJIIJ(-1.34f, 0.0f, -2.41f, -0.56f, -2.77f, -1.98f);
        this.LIZJ.LJII(9.0f, 43.87f);
        this.LIZJ.LJIIJ(0.76f, 2.62f, 3.32f, 4.13f, 6.49f, 4.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(18.74f, -0.4f);
        C32856Cuy.Q6(this.LIZJ);
        this.LIZJ.LJIIL(-4.08f, -6.64f);
        this.LIZJ.LJIIL(3.65f, -6.05f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(33.8f);
        this.LIZJ.LJIIL(-1.77f, 3.9f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(-0.16f);
        this.LIZJ.LJIIL(-1.72f, -3.9f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-4.87f);
        this.LIZJ.LJIIL(3.7f, 6.14f);
        this.LIZJ.LJIIL(-4.05f, 6.55f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJJI(4.77f);
        this.LIZJ.LJIIL(2.26f, -4.52f);
        C32856Cuy.c0(this.LIZJ);
        this.LIZJ.LJIIL(2.12f, 4.52f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.7f, -26.08f);
        this.LIZJ.LJIIJ(-0.03f, -0.46f, -0.57f, -0.88f, -1.08f, -0.91f);
        this.LIZJ.LJIIL(-1.07f, -0.1f);
        this.LIZJ.LJIIJ(-2.84f, -0.24f, -10.4f, -0.9f, -12.05f, -0.76f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LIZJ(2.94f, 2.94f, false, false, 24.0f, 23.0f);
        this.LIZJ.LJIIIZ(2.94f, 2.94f, false, false, 3.25f, 2.73f);
        this.LIZJ.LJIIJ(1.65f, -0.15f, 8.98f, -2.11f, 11.74f, -2.85f);
        this.LIZJ.LJIIL(1.04f, -0.28f);
        this.LIZJ.LJIIJ(0.49f, -0.11f, 0.95f, -0.62f, 0.9f, -1.08f);
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
