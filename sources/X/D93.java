package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D93 extends AbstractC39455Fe7 {
    public D93() {
        this.LIZJ.LJIILIIL(4.59f, 17.41f);
        this.LIZJ.LJIIL(13.29f, 13.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        p.LJIIL(1.42f, -1.42f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p.LJII(10.83f, 18.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(22.8f);
        this.LIZJ.LJIIJ(3.4f, 0.0f, 5.82f, 0.0f, 7.72f, 0.16f);
        this.LIZJ.LJIIJ(1.88f, 0.15f, 3.07f, 0.44f, 4.02f, 0.93f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(10.0f, 10.0f, false, true, 4.37f, 4.37f);
        this.LIZJ.LJIIJ(0.49f, 0.95f, 0.78f, 2.14f, 0.93f, 4.02f);
        this.LIZJ.LJIIJ(0.16f, 1.9f, 0.16f, 4.33f, 0.16f, 7.72f);
        C32856Cuy.th(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.89f);
        this.LIZJ.LJIIJ(0.0f, -3.28f, 0.0f, -5.87f, -0.17f, -7.95f);
        this.LIZJ.LJIIIZ(14.4f, 14.4f, false, false, -1.36f, -5.52f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, -6.11f, -6.11f);
        this.LIZJ.LJIIIZ(14.4f, 14.4f, false, false, -5.52f, -1.36f);
        this.LIZJ.LJ(28.76f, 14.0f, 26.17f, 14.0f, 22.9f, 14.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(10.83f);
        this.LIZJ.LJIIL(9.88f, -9.88f);
        C32856Cuy.mc(this.LIZJ);
        this.LIZJ.LJII(4.58f, 14.6f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, 2.82f);
        p6.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
