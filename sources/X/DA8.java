package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DA8 extends AbstractC39455Fe7 {
    public DA8() {
        this.LIZJ.LJIIIIZZ(9.0f, 9.31f);
        this.LIZJ.LJIILL(17.75f);
        this.LIZJ.LJIIJ(5.27f, -1.73f, 11.45f, -2.05f, 16.16f, 1.31f);
        this.LIZJ.LJIIJ(4.03f, 2.88f, 9.52f, 2.01f, 13.84f, 0.32f);
        this.LIZJ.LJIJ(10.94f);
        this.LIZJ.LJIIJ(-5.27f, 1.73f, -11.45f, 2.05f, -16.16f, -1.31f);
        this.LIZJ.LJIIJ(-4.0f, -2.86f, -9.53f, -2.01f, -13.84f, -0.32f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(43.0f, 8.0f);
        C32856Cuy.LJLJLLL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.1f, 1.79f);
        this.LIZJ.LJIIJ(-5.83f, 2.9f, -13.5f, 3.82f, -19.06f, -0.16f);
        this.LIZJ.LJ(18.8f, 28.75f, 13.32f, 29.6f, 9.0f, 31.3f);
        C32856Cuy.O(this.LIZJ);
        C32856Cuy.U3(this.LIZJ);
        C32856Cuy.f(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.75f, 0.44f, -1.45f, 1.1f, -1.79f);
        this.LIZJ.LJIIJ(5.75f, -2.87f, 13.62f, -3.73f, 19.06f, 0.16f);
        this.LIZJ.LJIIJ(4.37f, 3.13f, 10.43f, 2.04f, 14.95f, -0.16f);
        this.LIZJ.LJ(41.4f, 5.56f, 43.0f, 6.54f, 43.0f, 8.0f);
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
