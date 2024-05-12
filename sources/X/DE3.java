package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE3 extends AbstractC39455Fe7 {
    public DE3() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(20.48f, 5.76f);
        p.LJIIJ(-1.4f, -0.7f, -3.23f, -1.26f, -5.48f, -1.26f);
        p.LJ(8.0f, 4.5f, 3.0f, 10.0f, 3.0f, 17.0f);
        p.LJIIJ(0.0f, 8.0f, 6.64f, 15.13f, 12.5f, 20.5f);
        p.LJ(19.1f, 40.8f, 22.0f, 43.0f, 24.0f, 43.0f);
        p.LJIILJJIL(4.82f, -2.19f, 8.5f, -5.5f, true);
        p.LJ(38.46f, 32.13f, 45.0f, 25.0f, 45.0f, 17.0f);
        p.LJIIJ(0.0f, -7.0f, -5.0f, -12.5f, -12.0f, -12.5f);
        p.LJIIJ(-2.22f, 0.0f, -4.03f, 0.55f, -5.43f, 1.24f);
        p.LJII(24.5f, 11.0f);
        p.LJIIL(2.5f, 4.5f);
        p.LJIIL(-2.5f, 5.0f);
        p.LJIJ(26.0f);
        p.LJII(22.0f, 20.5f);
        p.LJIIL(1.5f, -5.0f);
        p.LJII(20.0f, 13.0f);
        p.LJIIL(0.48f, -7.24f);
        p.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
