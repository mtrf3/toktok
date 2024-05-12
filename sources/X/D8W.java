package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8W extends AbstractC39455Fe7 {
    public D8W() {
        this.LIZJ.LJIILIIL(24.0f, 22.98f);
        this.LIZJ.LJIIL(9.35f, -6.8f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, false, 35.0f, 12.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(8.0f);
        p.LJI(13.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.94f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 1.65f, 3.24f);
        this.LIZJ.LJIIL(9.35f, 6.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 2.09f);
        this.LIZJ.LJIIL(-10.22f, 6.81f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, false, 12.0f, 35.21f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(40.0f);
        C32856Cuy.LJIL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-4.79f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(4.0f, 4.0f, false, false, -1.78f, -3.33f);
        this.LIZJ.LJII(24.0f, 25.07f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(10.53f, -7.27f);
        this.LIZJ.LJII(26.0f, 24.0f);
        this.LIZJ.LJIIL(9.33f, 6.22f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 2.67f, 5.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(40.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p7.LJI(12.0f);
        p7.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-4.79f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 2.67f, -5.0f);
        this.LIZJ.LJII(22.0f, 24.0f);
        this.LIZJ.LJIIL(-8.53f, -6.2f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 11.0f, 12.94f);
        C32856Cuy.Dj(this.LIZJ);
        C32856Cuy.wm(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(4.94f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -2.47f, 4.86f);
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
