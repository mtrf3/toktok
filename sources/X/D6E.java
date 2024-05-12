package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6E extends AbstractC39455Fe7 {
    public D6E() {
        this.LIZJ.LJIIIIZZ(41.0f, 16.5f);
        this.LIZJ.LJIIIZ(10.22f, 10.22f, false, true, 3.3f, 7.3f);
        this.LIZJ.LJIIJ(0.0f, 7.06f, -5.54f, 12.8f, -12.4f, 12.8f);
        this.LIZJ.LJIIJJI(-8.4f);
        this.LIZJ.LJIILL(6.9f);
        this.LIZJ.LJIIJ(0.0f, 1.5f, -1.55f, 1.5f, -2.09f, 0.93f);
        this.LIZJ.LJII(10.5f, 32.6f);
        this.LIZJ.LJIIIZ(11.16f, 11.16f, false, true, -2.6f, -5.1f);
        this.LIZJ.LJIIJ(-1.9f, -2.0f, -4.2f, -4.28f, -4.2f, -9.25f);
        this.LIZJ.LJIIJ(0.0f, -7.2f, 5.55f, -13.05f, 12.4f, -13.05f);
        C32856Cuy.F6(this.LIZJ);
        this.LIZJ.LJIIJ(8.56f, 0.0f, 11.69f, 7.13f, 12.0f, 11.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.0f, 27.0f);
        this.LIZJ.LJIIJ(0.5f, 2.5f, 2.03f, 4.0f, 2.5f, 4.5f);
        this.LIZJ.LJIIL(6.96f, 7.21f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-5.1f);
        this.LIZJ.LJI(31.9f);
        this.LIZJ.LJIIJ(4.53f, 0.0f, 9.4f, -3.61f, 9.4f, -9.8f);
        this.LIZJ.LJIIJ(0.0f, -3.31f, -2.3f, -4.81f, -2.8f, -5.31f);
        this.LIZJ.LJ(38.5f, 25.0f, 33.34f, 29.0f, 28.0f, 29.0f);
        this.LIZJ.LJI(17.6f);
        this.LIZJ.LJ(15.0f, 29.0f, 13.0f, 28.0f, 11.0f, 27.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(26.5f, -12.5f);
        this.LIZJ.LJ(36.0f, 9.0f, 32.03f, 8.2f, 29.0f, 8.2f);
        C32856Cuy.s6(this.LIZJ);
        this.LIZJ.LJIIJ(-4.45f, 0.0f, -9.3f, 3.3f, -9.3f, 10.05f);
        this.LIZJ.LJ(6.7f, 19.26f, 7.0f, 21.0f, 7.9f, 22.0f);
        this.LIZJ.LJIIJ(1.6f, -5.5f, 5.1f, -9.0f, 12.1f, -9.0f);
        this.LIZJ.LJIILJJIL(14.5f, -0.5f, 17.5f, 1.5f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
