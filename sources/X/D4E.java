package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4E extends AbstractC39455Fe7 {
    public D4E() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(11.5f, 16.5f);
        this.LIZJ.LJIILL(15.95f);
        this.LIZJ.LJIIJ(0.0f, 0.23f, 0.0f, 0.54f, 0.02f, 0.81f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 3.22f, 3.22f);
        this.LIZJ.LJIIJ(0.27f, 0.02f, 0.58f, 0.02f, 0.81f, 0.02f);
        this.LIZJ.LJI(31.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(5.9f);
        C32856Cuy.qe(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(1.8f);
        C32856Cuy.vh(this.LIZJ);
        this.LIZJ.LJIILL(-5.9f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(5.9f);
        C32856Cuy.vh(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-1.8f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -0.56f, 0.0f, -0.84f, -0.1f, -1.05f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -0.45f, -0.44f);
        this.LIZJ.LJIIJ(-0.2f, -0.11f, -0.49f, -0.11f, -1.05f, -0.11f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-5.9f);
        this.LIZJ.LJIJ(15.55f);
        this.LIZJ.LJIIJ(0.0f, -0.23f, 0.0f, -0.54f, -0.02f, -0.81f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, -3.22f, -3.22f);
        this.LIZJ.LJIIJ(-0.27f, -0.02f, -0.58f, -0.02f, -0.81f, -0.02f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(16.5f);
        C32856Cuy.N(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(1.0f, 1.0f, false, false, -0.44f, -0.44f);
        this.LIZJ.LJ(15.73f, 4.0f, 15.46f, 4.0f, 14.9f, 4.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-1.8f);
        C32856Cuy.Je(this.LIZJ);
        this.LIZJ.LJIIJ(-0.1f, 0.21f, -0.1f, 0.49f, -0.1f, 1.05f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIILL(5.9f);
        C32856Cuy.hh(this.LIZJ);
        this.LIZJ.LJ(4.0f, 12.26f, 4.0f, 12.54f, 4.0f, 13.1f);
        C32856Cuy.o1(this.LIZJ);
        C32856Cuy.qe(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJJI(5.9f);
        this.LIZJ.LIZLLL();
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIILIIL(5.0f, 0.0f);
        DIJ p15 = this.LIZJ;
        o.LJIIIZ(p15, "p");
        p15.LJIIJJI(15.0f);
        p15.LJIILL(15.0f);
        DIJ p16 = this.LIZJ;
        o.LJIIIZ(p16, "p");
        p16.LJIIJJI(-15.0f);
        DIJ p17 = this.LIZJ;
        o.LJIIIZ(p17, "p");
        p17.LJIILL(-15.0f);
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
