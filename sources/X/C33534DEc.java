package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33534DEc extends AbstractC39455Fe7 {
    public C33534DEc() {
        this.LIZJ.LJIIIIZZ(36.28f, 8.24f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.2f, 0.98f);
        this.LIZJ.LJII(37.5f, 29.0f);
        this.LIZJ.LJIIIZ(7.24f, 7.24f, false, false, -4.17f, -0.25f);
        this.LIZJ.LJIIJ(-2.97f, 0.63f, -5.05f, 2.67f, -4.65f, 4.56f);
        this.LIZJ.LJIIJ(0.4f, 1.9f, 3.13f, 2.92f, 6.1f, 2.28f);
        this.LIZJ.LJIIJ(2.98f, -0.63f, 4.72f, -2.6f, 4.72f, -4.6f);
        this.LIZJ.LJIIL(-0.02f, -21.78f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -3.62f, -2.93f);
        this.LIZJ.LJII(19.02f, 9.86f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -2.37f, 2.94f);
        this.LIZJ.LJIILL(20.59f);
        this.LIZJ.LJIIIZ(7.25f, 7.25f, false, false, -4.16f, -0.25f);
        this.LIZJ.LJIIJ(-2.97f, 0.63f, -5.05f, 2.68f, -4.65f, 4.57f);
        this.LIZJ.LJIIJ(0.4f, 1.89f, 3.13f, 2.9f, 6.1f, 2.28f);
        this.LIZJ.LJIIJ(2.81f, -0.6f, 4.7f, -2.49f, 4.7f, -4.25f);
        this.LIZJ.LJIJ(12.8f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.8f, -0.98f);
        this.LIZJ.LJIIL(16.84f, -3.58f);
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
