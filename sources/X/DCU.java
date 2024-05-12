package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCU extends AbstractC39455Fe7 {
    public DCU() {
        C32856Cuy.LLJI(this.LIZJ);
        this.LIZJ.LJIILIIL(0.42f, -28.81f);
        this.LIZJ.LIZJ(6.83f, 6.83f, false, false, 17.57f, 24.0f);
        this.LIZJ.LJIIIZ(6.83f, 6.83f, false, false, 6.85f, 6.81f);
        this.LIZJ.LJIIJ(1.75f, 0.0f, 3.35f, -0.65f, 4.57f, -1.73f);
        this.LIZJ.LJIIJ(0.47f, -0.42f, 1.18f, -0.5f, 1.67f, -0.11f);
        this.LIZJ.LJIIL(1.79f, 1.42f);
        this.LIZJ.LJIIJ(0.49f, 0.39f, 0.57f, 1.1f, 0.13f, 1.56f);
        this.LIZJ.LJIIIZ(11.43f, 11.43f, false, true, -8.16f, 3.4f);
        this.LIZJ.LJ(18.12f, 35.35f, 13.0f, 30.27f, 13.0f, 24.0f);
        this.LIZJ.LJIILJJIL(5.11f, -11.35f, 11.42f, -11.35f, true);
        this.LIZJ.LJIIJ(3.2f, 0.0f, 6.09f, 1.3f, 8.16f, 3.4f);
        this.LIZJ.LJIIJ(0.44f, 0.45f, 0.36f, 1.17f, -0.13f, 1.56f);
        this.LIZJ.LJIIL(-1.79f, 1.42f);
        this.LIZJ.LJIIJ(-0.49f, 0.4f, -1.2f, 0.3f, -1.67f, -0.1f);
        this.LIZJ.LJIIIZ(6.84f, 6.84f, false, false, -4.57f, -1.74f);
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
