package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBR extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public DBR() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.M5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(36.0f, 3.6f);
        this.LIZJ.LJIIIZ(32.4f, 32.4f, true, false, 21.44f, 56.7f);
        this.LIZJ.LJIIIZ(1.54f, 1.54f, false, true, 2.04f, 2.3f);
        this.LIZJ.LJIIIZ(35.49f, 35.49f, true, true, 12.0f, -26.6f);
        this.LIZJ.LJIIJ(0.0f, 6.88f, -5.34f, 12.59f, -12.08f, 12.59f);
        this.LIZJ.LJIIJ(-4.5f, 0.0f, -8.37f, -2.54f, -10.45f, -6.28f);
        this.LIZJ.LIZJ(14.4f, 14.4f, true, true, 50.4f, 36.0f);
        this.LIZJ.LJIIJ(0.0f, 5.32f, 4.1f, 9.5f, 9.0f, 9.5f);
        this.LIZJ.LJIILJJIL(9.0f, -4.18f, 9.0f, -9.5f, true);
        this.LIZJ.LIZJ(32.4f, 32.4f, false, false, 36.0f, 3.6f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(47.31f, 36.0f);
        this.LIZJ.LJIIIZ(11.31f, 11.31f, true, false, -22.62f, 0.0f);
        this.LIZJ.LJIIIZ(11.31f, 11.31f, false, false, 22.62f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
