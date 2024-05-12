package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7M extends AbstractC39455Fe7 {
    public D7M() {
        this.LIZJ.LJIIIIZZ(9.42f, 3.0f);
        this.LIZJ.LIZJ(4.42f, 4.42f, false, false, 5.0f, 7.42f);
        this.LIZJ.LJIILL(33.16f);
        this.LIZJ.LIZJ(4.42f, 4.42f, false, false, 9.42f, 45.0f);
        this.LIZJ.LJI(23.8f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.61f, 0.0f, 1.1f, -0.5f, 1.1f, -1.1f);
        this.LIZJ.LJIILL(-4.63f);
        this.LIZJ.LJIIJ(0.0f, -0.68f, 0.27f, -1.33f, 0.75f, -1.8f);
        this.LIZJ.LJIIL(14.4f, -14.4f);
        this.LIZJ.LJIIJ(0.21f, -0.21f, 0.33f, -0.5f, 0.33f, -0.79f);
        this.LIZJ.LJIJ(7.42f);
        this.LIZJ.LIZJ(4.42f, 4.42f, false, false, 35.95f, 3.0f);
        this.LIZJ.LJI(9.42f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.42f, 12.16f);
        this.LIZJ.LJIIJ(0.0f, -0.61f, 0.5f, -1.1f, 1.1f, -1.1f);
        this.LIZJ.LJIIJJI(15.48f);
        this.LIZJ.LJIIJ(0.61f, 0.0f, 1.1f, 0.49f, 1.1f, 1.1f);
        C32856Cuy.q1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.62f, -0.49f, 1.11f, -1.1f, 1.11f);
        this.LIZJ.LJI(14.95f);
        this.LIZJ.LJIIJ(-0.61f, 0.0f, -1.1f, -0.5f, -1.1f, -1.1f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-2.21f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.1f, 9.95f);
        this.LIZJ.LJIIJJI(7.74f);
        this.LIZJ.LJIIJ(0.61f, 0.0f, 1.11f, 0.49f, 1.11f, 1.1f);
        this.LIZJ.LJIILL(2.21f);
        this.LIZJ.LJIIJ(0.0f, 0.61f, -0.5f, 1.1f, -1.1f, 1.1f);
        this.LIZJ.LJIIJJI(-7.74f);
        this.LIZJ.LJIIJ(-0.61f, 0.0f, -1.1f, -0.49f, -1.1f, -1.1f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-2.21f);
        this.LIZJ.LJIIJ(0.0f, -0.61f, 0.49f, -1.1f, 1.1f, -1.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(46.18f, 32.06f);
        this.LIZJ.LJIIL(-4.2f, -4.0f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, false, -1.55f, 0.02f);
        this.LIZJ.LJIIL(-10.79f, 10.8f);
        this.LIZJ.LJIIJ(-0.2f, 0.2f, -0.32f, 0.48f, -0.32f, 0.78f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(4.23f);
        this.LIZJ.LJIIJ(0.0f, 0.62f, 0.5f, 1.11f, 1.1f, 1.11f);
        this.LIZJ.LJIIJJI(3.96f);
        this.LIZJ.LJIIJ(0.3f, 0.0f, 0.58f, -0.12f, 0.79f, -0.32f);
        this.LIZJ.LJII(46.2f, 33.64f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, false, -0.02f, -1.58f);
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
