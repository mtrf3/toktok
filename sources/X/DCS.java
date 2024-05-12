package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCS extends AbstractC39455Fe7 {
    public DCS() {
        this.LIZJ.LJIIIIZZ(41.18f, 9.94f);
        this.LIZJ.LJIIJ(1.89f, 0.5f, 3.37f, 2.0f, 3.88f, 3.88f);
        this.LIZJ.LJIIJ(0.94f, 3.44f, 0.9f, 10.6f, 0.9f, 10.6f);
        this.LIZJ.LJIILJJIL(0.0f, 7.14f, -0.9f, 10.58f, true);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -3.88f, 3.88f);
        this.LIZJ.LJIIJ(-3.44f, 0.9f, -17.2f, 0.9f, -17.2f, 0.9f);
        this.LIZJ.LJIILJJIL(-13.72f, 0.0f, -17.2f, -0.94f, true);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -3.87f, -3.87f);
        this.LIZJ.LJ(2.0f, 31.57f, 2.0f, 24.39f, 2.0f, 24.39f);
        this.LIZJ.LJIILJJIL(0.0f, -7.13f, 0.9f, -10.57f, true);
        this.LIZJ.LIZJ(5.62f, 5.62f, false, true, 6.79f, 9.9f);
        this.LIZJ.LJ(10.22f, 9.0f, 23.98f, 9.0f, 23.98f, 9.0f);
        this.LIZJ.LJIILJJIL(13.76f, 0.0f, 17.2f, 0.94f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.04f, 24.4f);
        this.LIZJ.LJII(19.6f, 17.8f);
        this.LIZJ.LJIILL(13.18f);
        this.LIZJ.LJIIL(11.44f, -6.59f);
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
