package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33221D2b extends AbstractC39455Fe7 {
    public C33221D2b() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 9.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-1.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(6.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(18.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LIZJ(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(5.58f);
        this.LIZJ.LJIIL(10.58f, 23.8f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 38.92f, 44.0f);
        this.LIZJ.LJI(9.08f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -3.66f, -5.62f);
        this.LIZJ.LJII(16.0f, 14.58f);
        C32856Cuy.T9(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILIIL(4.0f, 0.0f);
        C32856Cuy.E1(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.17f, 0.81f);
        this.LIZJ.LJIIL(-6.58f, 14.8f);
        this.LIZJ.LJIIL(0.07f, 0.07f);
        this.LIZJ.LJIIJ(0.59f, 0.55f, 1.4f, 1.19f, 2.35f, 1.63f);
        this.LIZJ.LJIIJ(0.94f, 0.44f, 1.95f, 0.67f, 3.03f, 0.5f);
        this.LIZJ.LJIIJ(1.06f, -0.15f, 2.38f, -0.72f, 3.89f, -2.22f);
        this.LIZJ.LJIIJ(3.33f, -3.34f, 6.7f, -4.53f, 9.32f, -4.83f);
        this.LIZJ.LJIIL(0.66f, -0.06f);
        this.LIZJ.LJIIL(-4.4f, -9.89f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 28.0f, 15.0f);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.Y(this.LIZJ);
        this.LIZJ.LJIILIIL(14.36f, 20.74f);
        this.LIZJ.LJIIIZ(8.34f, 8.34f, false, false, -2.0f, 0.0f);
        this.LIZJ.LJIIJ(-1.76f, 0.2f, -4.28f, 1.0f, -6.95f, 3.67f);
        this.LIZJ.LJIIJ(-2.0f, 2.0f, -4.06f, 3.06f, -6.11f, 3.36f);
        this.LIZJ.LJIIIZ(9.23f, 9.23f, false, true, -5.33f, -0.83f);
        this.LIZJ.LJIIJ(-0.94f, -0.44f, -1.75f, -0.98f, -2.42f, -1.5f);
        this.LIZJ.LJII(9.08f, 40.0f);
        this.LIZJ.LJIIJJI(29.84f);
        this.LIZJ.LJIIL(-4.56f, -10.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-21.88f, 0.04f);
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
