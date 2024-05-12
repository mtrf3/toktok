package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEY extends AbstractC39455Fe7 {
    public DEY() {
        C32856Cuy.LLJI(this.LIZJ);
        this.LIZJ.LJIILIIL(11.67f, -31.0f);
        this.LIZJ.LJIIIZ(1.17f, 1.17f, false, true, 1.0f, 1.75f);
        this.LIZJ.LJIIL(-11.66f, 20.2f);
        this.LIZJ.LJIIIZ(1.17f, 1.17f, false, true, -2.12f, -0.23f);
        this.LIZJ.LJIIL(-2.66f, -8.46f);
        this.LIZJ.LJIIJ(-0.14f, -0.45f, 0.0f, -0.93f, 0.36f, -1.24f);
        this.LIZJ.LJIIL(6.94f, -5.89f);
        this.LIZJ.LJIIJ(0.08f, -0.07f, 0.09f, -0.11f, 0.1f, -0.13f);
        this.LIZJ.LJIIJ(0.0f, -0.04f, -0.01f, -0.1f, -0.05f, -0.16f);
        this.LIZJ.LJIIIZ(0.27f, 0.27f, false, false, -0.12f, -0.12f);
        this.LIZJ.LJIIJ(-0.02f, 0.0f, -0.07f, -0.02f, -0.16f, 0.02f);
        this.LIZJ.LJIIL(-8.46f, 3.21f);
        this.LIZJ.LJIIJ(-0.45f, 0.17f, -0.96f, 0.05f, -1.28f, -0.3f);
        this.LIZJ.LJIIL(-6.09f, -6.7f);
        this.LIZJ.LJIIIZ(1.17f, 1.17f, false, true, 0.86f, -1.95f);
        this.LIZJ.LJIIJJI(23.34f);
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
