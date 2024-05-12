package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGS extends AbstractC39455Fe7 {
    public DGS() {
        this.LIZJ.LJIIIIZZ(36.11f, 41.16f);
        this.LIZJ.LJIIJ(-0.48f, 0.34f, -1.09f, 0.41f, -1.65f, 0.26f);
        this.LIZJ.LJIIIZ(39.04f, 39.04f, false, false, -20.92f, 0.0f);
        this.LIZJ.LJIIJ(-0.56f, 0.15f, -1.17f, 0.08f, -1.65f, -0.26f);
        this.LIZJ.LJIIIZ(21.0f, 21.0f, true, true, 24.22f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.5f, -27.77f);
        this.LIZJ.LJIIIZ(1.38f, 1.38f, false, false, -1.74f, -0.18f);
        this.LIZJ.LJIIL(-11.0f, 7.25f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 5.66f, 5.66f);
        this.LIZJ.LJIIL(7.25f, -11.0f);
        this.LIZJ.LJIIJ(0.36f, -0.54f, 0.29f, -1.27f, -0.17f, -1.73f);
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
