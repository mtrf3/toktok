package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBK extends AbstractC39455Fe7 {
    public DBK() {
        C32856Cuy.zo(this.LIZJ);
        this.LIZJ.LJIILIIL(22.1f, -9.0f);
        this.LIZJ.LJIIJ(-1.93f, 0.0f, -3.76f, 1.23f, -4.84f, 3.61f);
        this.LIZJ.LJIIJ(-0.23f, 0.5f, -0.79f, 0.79f, -1.31f, 0.62f);
        this.LIZJ.LJIIL(-1.9f, -0.64f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, -0.6f, -1.25f);
        this.LIZJ.LJ(16.98f, 13.7f, 20.05f, 11.0f, 24.1f, 11.0f);
        this.LIZJ.LIZJ(7.9f, 7.9f, false, true, 32.0f, 18.9f);
        this.LIZJ.LJIIJ(0.0f, 2.31f, -1.21f, 4.56f, -2.78f, 6.17f);
        this.LIZJ.LIZJ(10.2f, 10.2f, false, true, 23.0f, 27.95f);
        this.LIZJ.LJIIJ(-0.55f, 0.05f, -1.0f, -0.4f, -1.0f, -0.95f);
        C32856Cuy.LJJLIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.08f);
        this.LIZJ.LJIIJ(1.23f, -0.2f, 2.5f, -0.77f, 3.35f, -1.64f);
        this.LIZJ.LIZJ(5.27f, 5.27f, false, false, 28.0f, 18.91f);
        this.LIZJ.LIZJ(3.9f, 3.9f, false, false, 24.1f, 15.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 36.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, true, true, 0.0f, -6.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 0.0f, 6.0f);
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
