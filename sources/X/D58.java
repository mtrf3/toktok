package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D58 extends AbstractC39455Fe7 {
    public D58() {
        this.LIZJ.LJIIIIZZ(7.0f, 21.5f);
        this.LIZJ.LJ(7.0f, 13.97f, 14.38f, 8.0f, 24.0f, 8.0f);
        this.LIZJ.LJIIJ(9.62f, 0.0f, 17.0f, 5.97f, 17.0f, 13.5f);
        this.LIZJ.LJIIJ(0.0f, 4.63f, -2.3f, 8.26f, -5.43f, 11.14f);
        this.LIZJ.LIZJ(39.57f, 39.57f, false, true, 27.0f, 38.37f);
        C32856Cuy.K9(this.LIZJ);
        C32856Cuy.xm(this.LIZJ);
        C32856Cuy.LIZJ(this.LIZJ);
        this.LIZJ.LJIIJ(-9.62f, 0.0f, -17.0f, -5.97f, -17.0f, -13.5f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 6.0f);
        this.LIZJ.LJ(13.73f, 6.0f, 5.0f, 12.46f, 5.0f, 21.5f);
        this.LIZJ.LJIILLIIL(13.73f, 37.0f, 24.0f, 37.0f, true);
        C32856Cuy.y0(this.LIZJ);
        C32856Cuy.B1(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.45f, 0.9f);
        this.LIZJ.LJIIJ(3.0f, -1.5f, 7.12f, -3.69f, 10.48f, -6.79f);
        this.LIZJ.LJ(40.3f, 30.99f, 43.0f, 26.87f, 43.0f, 21.5f);
        this.LIZJ.LJ(43.0f, 12.46f, 34.27f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.0f, 18.5f);
        C32856Cuy.Ga(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(9.0f, -2.0f);
        C32856Cuy.LLLZI(this.LIZJ);
        this.LIZJ.LJIILIIL(5.0f, 2.0f);
        C32856Cuy.Ga(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
