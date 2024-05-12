package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6N extends AbstractC39455Fe7 {
    public D6N() {
        this.LIZJ.LJIIIIZZ(25.6f, 16.0f);
        this.LIZJ.LJIIJ(-3.36f, 0.0f, -5.04f, 0.0f, -6.32f, 0.66f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -2.63f, 2.62f);
        this.LIZJ.LJ(16.0f, 20.56f, 16.0f, 22.24f, 16.0f, 25.6f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(8.8f);
        this.LIZJ.LJIIJ(0.0f, 3.36f, 0.0f, 5.04f, 0.65f, 6.33f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, 2.63f, 2.62f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(1.28f, 0.65f, 2.96f, 0.65f, 6.32f, 0.65f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(8.8f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(3.36f, 0.0f, 5.04f, 0.0f, 6.32f, -0.65f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, 2.63f, -2.62f);
        this.LIZJ.LJIIJ(0.65f, -1.3f, 0.65f, -2.97f, 0.65f, -6.33f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-8.8f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -3.36f, 0.0f, -5.04f, -0.65f, -6.32f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -2.63f, -2.62f);
        this.LIZJ.LJ(39.44f, 16.0f, 37.76f, 16.0f, 34.4f, 16.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-8.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.65f, -14.81f);
        this.LIZJ.LJIIL(7.21f, 5.2f);
        this.LIZJ.LJIIJ(0.41f, 0.3f, 0.41f, 0.93f, 0.0f, 1.23f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIL(-7.2f, 5.2f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, true, -0.96f, -0.5f);
        this.LIZJ.LJIJ(9.2f);
        C32856Cuy.LJFF(this.LIZJ);
        this.LIZJ.LIZJ(10.8f, 10.8f, false, false, 9.2f, 20.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(6.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJI(5.8f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p12.LJIILL(-6.0f);
        this.LIZJ.LIZJ(15.2f, 15.2f, false, true, 20.0f, 4.8f);
        C32856Cuy.C0(this.LIZJ);
        this.LIZJ.LJIJ(1.68f);
        this.LIZJ.LJIIJ(0.0f, -0.5f, 0.55f, -0.77f, 0.95f, -0.5f);
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
