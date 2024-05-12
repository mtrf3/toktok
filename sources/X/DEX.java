package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEX extends AbstractC39455Fe7 {
    public DEX() {
        this.LIZJ.LJIIIIZZ(16.5f, 13.9f);
        this.LIZJ.LJIIIZ(57.67f, 57.67f, false, false, -3.75f, 4.26f);
        this.LIZJ.LJ(10.65f, 20.72f, 9.0f, 24.52f, 9.0f, 28.09f);
        this.LIZJ.LJ(9.0f, 36.33f, 15.72f, 43.0f, 24.0f, 43.0f);
        this.LIZJ.LJIIIZ(14.95f, 14.95f, false, false, 14.72f, -17.78f);
        this.LIZJ.LJIIJ(-1.64f, -6.67f, -5.29f, -10.96f, -7.06f, -12.5f);
        this.LIZJ.LJIIJ(-0.3f, -0.25f, -0.7f, -0.04f, -0.7f, 0.35f);
        this.LIZJ.LJIIJ(-0.02f, 0.64f, -0.04f, 1.18f, -0.08f, 1.67f);
        this.LIZJ.LJIIJ(-0.17f, 2.13f, -0.45f, 3.13f, -1.34f, 3.85f);
        this.LIZJ.LJIIJ(-0.59f, 0.47f, -1.27f, 0.07f, -1.28f, -0.68f);
        this.LIZJ.LJIIL(-0.01f, -0.5f);
        this.LIZJ.LJIIIZ(48.27f, 48.27f, false, false, -0.16f, -3.42f);
        this.LIZJ.LJIIJ(-0.43f, -4.5f, -1.7f, -7.8f, -4.68f, -10.3f);
        this.LIZJ.LJIIJ(-0.33f, -0.27f, -0.84f, 0.02f, -0.86f, 0.46f);
        this.LIZJ.LJIIJ(-0.14f, 3.45f, -3.05f, 6.54f, -6.05f, 9.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.27f, 9.38f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, 0.46f, 0.0f);
        this.LIZJ.LJIIL(5.01f, 6.03f);
        this.LIZJ.LJIIIZ(5.8f, 5.8f, false, true, 1.26f, 3.6f);
        this.LIZJ.LJIIJ(0.0f, 3.36f, -2.91f, 6.09f, -6.5f, 6.09f);
        this.LIZJ.LJIILJJIL(-6.5f, -2.73f, -6.5f, -6.09f, true);
        this.LIZJ.LJIIJ(0.0f, -1.34f, 0.47f, -2.6f, 1.26f, -3.6f);
        this.LIZJ.LJIIL(5.0f, -6.03f);
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
