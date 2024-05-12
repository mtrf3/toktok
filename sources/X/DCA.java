package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCA extends AbstractC39455Fe7 {
    public DCA() {
        C32856Cuy.Da(this.LIZJ);
        this.LIZJ.LJIILIIL(33.0f, 5.31f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(4.17f);
        this.LIZJ.LJII(26.18f, 24.0f);
        this.LIZJ.LJIIL(11.67f, 6.1f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.23f);
        this.LIZJ.LJIIL(-5.02f, -2.67f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(0.22f);
        this.LIZJ.LJIIJ(0.0f, 1.63f, -1.2f, 2.64f, -2.92f, 2.64f);
        this.LIZJ.LJI(14.01f);
        this.LIZJ.LJIIJ(-1.82f, 0.0f, -2.92f, -1.0f, -2.92f, -2.64f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-4.2f);
        this.LIZJ.LJII(18.12f, 24.0f);
        this.LIZJ.LJIIL(-7.03f, -3.64f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-4.2f);
        this.LIZJ.LJIIJ(0.0f, -1.66f, 1.1f, -2.67f, 2.92f, -2.67f);
        this.LIZJ.LJIIJJI(15.91f);
        this.LIZJ.LJIIJ(1.73f, 0.0f, 2.92f, 1.0f, 2.92f, 2.67f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(0.15f);
        this.LIZJ.LJIIL(5.02f, -2.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.1f, 16.91f);
        this.LIZJ.LJIIL(-8.63f, -4.52f);
        this.LIZJ.LJIIL(-8.66f, 4.52f);
        this.LIZJ.LJIIJJI(17.29f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-8.63f, -8.7f);
        this.LIZJ.LJIIL(8.57f, -4.48f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(13.48f);
        this.LIZJ.LJIIL(8.66f, 4.49f);
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
