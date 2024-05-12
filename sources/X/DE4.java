package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE4 extends AbstractC39455Fe7 {
    public DE4() {
        this.LIZJ.LJIIIIZZ(42.5f, 24.02f);
        this.LIZJ.LIZJ(18.5f, 18.5f, true, false, 23.06f, 42.5f);
        this.LIZJ.LIZJ(20.0f, 20.0f, false, true, 42.5f, 24.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.1f, 42.27f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, true, 14.96f, -14.23f);
        this.LIZJ.LIZJ(18.53f, 18.53f, false, true, 27.1f, 42.27f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(20.0f, 19.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 1.66f, -1.12f, 3.0f, -2.5f, 3.0f);
        p.LJIILJJIL(-2.5f, -1.34f, -2.5f, -3.0f, true);
        p.LJIILJJIL(1.12f, -3.0f, 2.5f, -3.0f, true);
        p.LJIILJJIL(2.5f, 1.34f, 2.5f, 3.0f, true);
        p.LIZLLL();
        C32856Cuy.LLLZLZ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILJJIL(-2.5f, -1.34f, -2.5f, -3.0f, true);
        p2.LJIILJJIL(1.12f, -3.0f, 2.5f, -3.0f, true);
        p2.LJIILJJIL(2.5f, 1.34f, 2.5f, 3.0f, true);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
