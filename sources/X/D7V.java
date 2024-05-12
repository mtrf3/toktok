package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7V extends AbstractC39455Fe7 {
    public D7V() {
        this.LIZJ.LJIIIIZZ(14.97f, 8.1f);
        C32856Cuy.y0(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(5.72f);
        this.LIZJ.LJII(5.35f, 38.23f);
        this.LIZJ.LIZJ(4.1f, 4.1f, false, false, 9.02f, 44.0f);
        this.LIZJ.LJIIJJI(29.96f);
        this.LIZJ.LJIIIZ(4.1f, 4.1f, false, false, 3.67f, -5.77f);
        this.LIZJ.LJIIL(-10.62f, -24.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(8.1f);
        C32856Cuy.y0(this.LIZJ);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 1.0f, -0.46f, 1.0f, -1.02f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(5.03f);
        this.LIZJ.LJIIJ(0.0f, -0.57f, -0.44f, -1.03f, -1.0f, -1.03f);
        this.LIZJ.LJI(14.97f);
        this.LIZJ.LJIIJ(-0.56f, 0.0f, -1.0f, 0.46f, -1.0f, 1.03f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(2.05f);
        this.LIZJ.LJIIJ(0.0f, 0.56f, 0.44f, 1.02f, 1.0f, 1.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(15.4f, 21.5f);
        this.LIZJ.LJIIIZ(6.21f, 6.21f, false, true, 1.51f, 0.01f);
        this.LIZJ.LJIIL(3.47f, 7.97f);
        this.LIZJ.LJIIJJI(-22.7f);
        this.LIZJ.LJIIL(1.88f, -4.32f);
        this.LIZJ.LJIIJ(0.5f, 0.4f, 1.13f, 0.82f, 1.84f, 1.17f);
        this.LIZJ.LJIIJ(1.11f, 0.53f, 2.5f, 0.89f, 4.05f, 0.65f);
        this.LIZJ.LJIIIZ(8.32f, 8.32f, false, false, 4.66f, -2.62f);
        this.LIZJ.LJIIJ(2.02f, -2.07f, 3.94f, -2.7f, 5.28f, -2.85f);
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
