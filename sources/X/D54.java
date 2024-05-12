package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D54 extends AbstractC39455Fe7 {
    public D54() {
        this.LIZJ.LJIIIIZZ(16.5f, 5.0f);
        this.LIZJ.LJIIJJI(35.45f);
        this.LIZJ.LJIIJ(5.8f, 0.0f, 10.5f, 4.7f, 10.5f, 10.5f);
        this.LIZJ.LJIILL(37.94f);
        this.LIZJ.LJIIJ(0.0f, 0.27f, 0.23f, 0.5f, 0.5f, 0.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.0f);
        p.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(15.5f);
        this.LIZJ.LIZJ(13.5f, 13.5f, false, false, 51.95f, 2.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(16.5f);
        p3.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(2.0f);
        p4.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-5.0f, 7.8f);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, false, 7.0f, 17.3f);
        this.LIZJ.LJIILL(51.2f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.5f, 1.5f, false, false, 2.35f, 1.24f);
        this.LIZJ.LJIIL(21.4f, -14.66f);
        this.LIZJ.LJIIL(21.42f, 14.66f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 2.35f, -1.24f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(17.3f);
        C32856Cuy.c9(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 11.5f);
        this.LIZJ.LJIIIIZZ(10.0f, 17.3f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(0.0f, -0.82f, 0.67f, -1.5f, 1.5f, -1.5f);
        this.LIZJ.LJIIJJI(38.52f);
        this.LIZJ.LJIIJ(0.82f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        this.LIZJ.LJIILL(48.36f);
        this.LIZJ.LJII(31.6f, 52.02f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -1.7f, 0.0f);
        this.LIZJ.LJII(10.0f, 65.66f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(17.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
