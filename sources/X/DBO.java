package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBO extends AbstractC39455Fe7 {
    public DBO() {
        this.LIZJ.LJIIIIZZ(32.53f, 5.13f);
        this.LIZJ.LJIIIZ(7.09f, 7.09f, true, true, 9.96f, 9.95f);
        this.LIZJ.LJIIL(-6.14f, 4.84f);
        this.LIZJ.LJIIL(2.02f, 2.02f);
        C32856Cuy.LLF(this.LIZJ);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(33.78f, 23.0f);
        this.LIZJ.LJII(21.7f, 35.02f);
        this.LIZJ.LJIIJ(-4.17f, 4.13f, -9.24f, 6.4f, -14.53f, 8.65f);
        this.LIZJ.LJIIIZ(2.2f, 2.2f, false, true, -2.92f, -2.81f);
        this.LIZJ.LJIIJ(2.2f, -5.8f, 4.54f, -11.26f, 9.04f, -15.72f);
        this.LIZJ.LJIIL(11.34f, -11.28f);
        this.LIZJ.LJIIL(-1.82f, -1.82f);
        C32856Cuy.ci(this.LIZJ);
        this.LIZJ.LJIIL(2.05f, 2.05f);
        this.LIZJ.LJIIL(4.84f, -6.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.5f, 38.33f);
        this.LIZJ.LJIIIZ(29.56f, 29.56f, false, false, 9.38f, -6.15f);
        this.LIZJ.LJIIL(7.37f, -7.32f);
        this.LIZJ.LJIIL(4.7f, -4.68f);
        this.LIZJ.LJIIL(-3.48f, -3.48f);
        this.LIZJ.LJIIL(-4.7f, 4.68f);
        this.LIZJ.LJIIL(-6.66f, 6.6f);
        this.LIZJ.LIZJ(28.95f, 28.95f, false, false, 9.5f, 38.33f);
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
