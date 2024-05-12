package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBJ extends AbstractC39455Fe7 {
    public DBJ() {
        this.LIZJ.LJIIIIZZ(41.06f, 27.76f);
        this.LIZJ.LJIIJ(0.61f, -1.73f, 0.94f, -2.58f, 0.94f, -4.51f);
        this.LIZJ.LJ(42.0f, 13.72f, 33.94f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LJIILLIIL(6.0f, 13.72f, 6.0f, 23.25f, true);
        this.LIZJ.LJIIJ(0.0f, 4.34f, 1.67f, 8.3f, 4.43f, 11.33f);
        this.LIZJ.LJIIIZ(18.3f, 18.3f, false, true, -1.5f, 5.14f);
        this.LIZJ.LJIIJ(-0.5f, 1.15f, 0.58f, 2.51f, 1.76f, 2.08f);
        this.LIZJ.LJIIIZ(46.6f, 46.6f, false, false, 6.13f, -2.73f);
        this.LIZJ.LJIIIZ(18.61f, 18.61f, false, false, 10.42f, 1.15f);
        this.LIZJ.LJIIJ(-0.04f, -0.37f, -0.06f, -0.75f, -0.06f, -1.13f);
        this.LIZJ.LJIIJ(0.0f, -5.7f, 4.62f, -11.33f, 10.32f, -11.33f);
        this.LIZJ.LJIIJJI(3.56f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-14.44f, -4.14f);
        C32856Cuy.Ic(this.LIZJ);
        this.LIZJ.LJIIIIZZ(33.0f, 26.25f);
        this.LIZJ.LIZJ(2.63f, 2.63f, true, true, 33.0f, 21.0f);
        this.LIZJ.LJIIIZ(2.63f, 2.63f, false, true, 0.0f, 5.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-15.38f, -2.63f);
        C32856Cuy.Ic(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
