package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DH1 extends AbstractC39455Fe7 {
    public DH1() {
        this.LIZJ.LJIIIIZZ(40.5f, 31.57f);
        this.LIZJ.LJIIJ(0.8f, -5.06f, 0.15f, -11.29f, -5.21f, -15.39f);
        this.LIZJ.LJIIJ(-0.92f, -0.7f, -2.21f, -0.3f, -2.77f, 0.72f);
        this.LIZJ.LJIIJ(-1.22f, 2.18f, -3.01f, 4.8f, -5.02f, 5.6f);
        this.LIZJ.LJIIJ(1.82f, -6.36f, 0.33f, -15.18f, -7.06f, -20.12f);
        this.LIZJ.LJIIJ(-1.15f, -0.77f, -2.51f, 0.05f, -2.41f, 1.41f);
        this.LIZJ.LJIIJ(0.2f, 2.72f, 0.33f, 5.6f, -4.53f, 11.21f);
        this.LIZJ.LJIIJ(-4.5f, 4.5f, -7.5f, 9.5f, -6.0f, 16.57f);
        this.LIZJ.LJIILLIIL(15.4f, 44.0f, 23.97f, 44.0f, true);
        this.LIZJ.LJIIJ(8.55f, 0.0f, 15.43f, -5.5f, 16.53f, -12.43f);
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
