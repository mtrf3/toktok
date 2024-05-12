package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33585DGb extends AbstractC39455Fe7 {
    public C33585DGb() {
        this.LIZJ.LJIIIIZZ(22.63f, 4.82f);
        this.LIZJ.LJIIJ(0.45f, -1.1f, 2.0f, -1.1f, 2.46f, 0.0f);
        this.LIZJ.LJIIL(4.8f, 11.55f);
        this.LIZJ.LJIIJ(0.2f, 0.46f, 0.63f, 0.78f, 1.13f, 0.82f);
        this.LIZJ.LJIIL(12.47f, 1.0f);
        this.LIZJ.LJIIJ(1.18f, 0.1f, 1.66f, 1.57f, 0.76f, 2.34f);
        this.LIZJ.LJIIL(-9.5f, 8.14f);
        this.LIZJ.LJIIJ(-0.38f, 0.32f, -0.55f, 0.83f, -0.43f, 1.32f);
        this.LIZJ.LJIIL(2.9f, 12.17f);
        this.LIZJ.LJIIIZ(1.33f, 1.33f, false, true, -1.99f, 1.45f);
        this.LIZJ.LJIIL(-10.68f, -6.52f);
        this.LIZJ.LJIIIZ(1.33f, 1.33f, false, false, -1.39f, 0.0f);
        this.LIZJ.LJII(12.5f, 43.6f);
        this.LIZJ.LJIIIZ(1.33f, 1.33f, false, true, -2.0f, -1.45f);
        this.LIZJ.LJIIL(2.9f, -12.17f);
        this.LIZJ.LJIIJ(0.12f, -0.49f, -0.04f, -1.0f, -0.42f, -1.32f);
        this.LIZJ.LJIIL(-9.5f, -8.14f);
        this.LIZJ.LJIIJ(-0.9f, -0.77f, -0.42f, -2.25f, 0.76f, -2.34f);
        this.LIZJ.LJIIL(12.47f, -1.0f);
        this.LIZJ.LJIIJ(0.5f, -0.04f, 0.93f, -0.36f, 1.12f, -0.82f);
        this.LIZJ.LJIIL(4.8f, -11.55f);
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
