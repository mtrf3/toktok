package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDN extends AbstractC39455Fe7 {
    public DDN() {
        this.LIZJ.LJIIIIZZ(49.55f, 2.06f);
        this.LIZJ.LJI(38.19f);
        this.LIZJ.LJIJ(48.3f);
        this.LIZJ.LJIIIZ(9.93f, 9.93f, false, true, -9.81f, 10.03f);
        this.LIZJ.LJIIIZ(9.93f, 9.93f, false, true, -9.82f, -10.03f);
        this.LIZJ.LJIIJ(0.0f, -5.41f, 4.28f, -9.84f, 9.52f, -10.04f);
        this.LIZJ.LJIILL(-11.6f);
        this.LIZJ.LJ(16.52f, 26.84f, 7.2f, 36.38f, 7.2f, 48.3f);
        this.LIZJ.LJIIJ(0.0f, 12.0f, 9.52f, 21.64f, 21.27f, 21.64f);
        this.LIZJ.LJIIJ(11.76f, 0.0f, 21.27f, -9.74f, 21.27f, -21.64f);
        this.LIZJ.LJIJ(24.59f);
        this.LIZJ.LIZJ(26.2f, 26.2f, false, false, 64.8f, 29.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(18.1f);
        this.LIZJ.LIZJ(15.9f, 15.9f, false, true, 49.55f, 2.05f);
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
