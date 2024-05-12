package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8R extends AbstractC39455Fe7 {
    public D8R() {
        this.LIZJ.LJIIIIZZ(6.12f, 24.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.1f, 2.0f, 0.54f, 3.91f, 1.24f, 5.69f);
        this.LIZJ.LJII(3.64f, 32.1f);
        C32856Cuy.Kg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(6.3f, 36.93f);
        C32856Cuy.nh(this.LIZJ);
        this.LIZJ.LJIIL(-2.31f, 3.25f);
        this.LIZJ.LJIIIZ(22.13f, 22.13f, false, true, -5.06f, -5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.21f, 44.54f);
        C32856Cuy.Bm(this.LIZJ);
        this.LIZJ.LJIIIIZZ(40.96f, 38.13f);
        this.LIZJ.LJIIIZ(22.0f, 22.0f, false, false, -31.0f, -31.0f);
        this.LIZJ.LJII(7.13f, 4.3f);
        C32856Cuy.LLLJ(this.LIZJ);
        this.LIZJ.LJIIL(-2.75f, -2.75f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.84f, -2.84f);
        this.LIZJ.LJII(12.81f, 10.0f);
        this.LIZJ.LIZJ(18.0f, 18.0f, false, true, 38.12f, 35.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.45f, 20.44f);
        this.LIZJ.LJIIJ(0.4f, -1.94f, 1.1f, -3.78f, 2.06f, -5.44f);
        this.LIZJ.LJIIL(-3.47f, -2.0f);
        this.LIZJ.LJIIIZ(21.86f, 21.86f, false, false, -2.51f, 6.65f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(3.92f, 0.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(35.3f, 42.94f);
        this.LIZJ.LJIIL(-2.04f, -3.44f);
        this.LIZJ.LJIIJ(-1.65f, 0.98f, -3.48f, 1.7f, -5.42f, 2.11f);
        this.LIZJ.LJIIL(0.84f, 3.91f);
        this.LIZJ.LJIIJ(2.37f, -0.5f, 4.6f, -1.38f, 6.62f, -2.58f);
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
