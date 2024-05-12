package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8U extends AbstractC39455Fe7 {
    public D8U() {
        this.LIZJ.LJIIIIZZ(37.05f, 9.17f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.45f, 0.83f);
        C32856Cuy.LJLLJ(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.36f, 0.93f);
        this.LIZJ.LJIIL(-6.38f, -2.45f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, true, -12.7f, -4.89f);
        this.LIZJ.LJIIL(-5.56f, -2.13f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.04f);
        C32856Cuy.Yb(this.LIZJ);
        C32856Cuy.o9(this.LIZJ);
        C32856Cuy.Wn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.5f);
        this.LIZJ.LJII(36.11f, 9.07f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.94f, 0.09f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.5f, 21.67f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(3.64f);
        this.LIZJ.LJIIL(24.0f, 9.23f);
        this.LIZJ.LJIJ(11.51f);
        this.LIZJ.LJIIL(-24.0f, 10.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.5f, 8.67f);
        this.LIZJ.LJIILL(0.16f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, 8.82f, 3.23f);
        this.LIZJ.LJII(19.0f, 30.34f);
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
