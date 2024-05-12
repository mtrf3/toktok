package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7O extends AbstractC39455Fe7 {
    public D7O() {
        this.LIZJ.LJIILIIL(43.41f, 17.41f);
        this.LIZJ.LJIIL(-13.29f, 13.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p.LJIIL(-1.42f, -1.42f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        p.LJII(37.17f, 18.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(25.2f);
        this.LIZJ.LJIIJ(-3.4f, 0.0f, -5.82f, 0.0f, -7.72f, 0.16f);
        this.LIZJ.LJIIJ(-1.88f, 0.15f, -3.07f, 0.44f, -4.02f, 0.93f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, false, false, -4.37f, 4.37f);
        this.LIZJ.LJIIJ(-0.49f, 0.95f, -0.78f, 2.14f, -0.93f, 4.02f);
        this.LIZJ.LJ(8.0f, 29.38f, 8.0f, 31.81f, 8.0f, 35.2f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(43.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(5.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-7.89f);
        this.LIZJ.LJIIJ(0.0f, -3.28f, 0.0f, -5.87f, 0.17f, -7.95f);
        this.LIZJ.LJIIJ(0.17f, -2.13f, 0.53f, -3.9f, 1.36f, -5.52f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, true, 6.11f, -6.11f);
        this.LIZJ.LJIIIZ(14.4f, 14.4f, false, true, 5.52f, -1.36f);
        this.LIZJ.LJ(19.24f, 14.0f, 21.83f, 14.0f, 25.1f, 14.0f);
        this.LIZJ.LJIIJJI(12.06f);
        this.LIZJ.LJII(27.3f, 4.12f);
        C32856Cuy.We(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(13.3f, 13.3f);
        C32856Cuy.LLLILZJ(this.LIZJ);
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
