package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCV extends AbstractC39455Fe7 {
    public DCV() {
        this.LIZJ.LJIIIIZZ(18.31f, 23.12f);
        this.LIZJ.LJIIIZ(7.05f, 7.05f, true, false, -0.02f, -14.1f);
        this.LIZJ.LJIIIZ(7.05f, 7.05f, false, false, 0.02f, 14.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(12.32f, 14.11f);
        this.LIZJ.LJIIJ(0.0f, -6.82f, -5.51f, -12.35f, -12.32f, -12.35f);
        this.LIZJ.LJ(11.51f, 24.88f, 6.0f, 30.41f, 6.0f, 37.23f);
        this.LIZJ.LJIIJ(0.0f, 0.98f, 0.79f, 1.77f, 1.76f, 1.77f);
        this.LIZJ.LJIIJJI(21.1f);
        this.LIZJ.LJIIJ(0.98f, 0.0f, 1.77f, -0.8f, 1.77f, -1.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.37f, 0.0f);
        this.LIZJ.LJIIJ(0.0f, -2.95f, -0.87f, -5.7f, -2.38f, -8.0f);
        this.LIZJ.LJIIJ(0.37f, -0.44f, 1.06f, -0.68f, 2.26f, -0.68f);
        this.LIZJ.LJIIJ(5.04f, 0.0f, 9.12f, 4.1f, 9.12f, 9.14f);
        this.LIZJ.LJIIJ(0.0f, 0.72f, -0.58f, 1.31f, -1.3f, 1.31f);
        C32856Cuy.K6(this.LIZJ);
        this.LIZJ.LJIILL(-1.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.1f, -15.21f);
        this.LIZJ.LJIIIZ(5.22f, 5.22f, true, true, -10.44f, 0.01f);
        this.LIZJ.LJIIIZ(5.22f, 5.22f, false, true, 10.43f, -0.01f);
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
