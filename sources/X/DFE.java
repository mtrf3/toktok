package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFE extends AbstractC39455Fe7 {
    public DFE() {
        this.LIZJ.LJIIIIZZ(37.4f, 5.0f);
        this.LIZJ.LJIIJ(0.78f, -0.05f, 1.48f, 0.48f, 1.65f, 1.25f);
        this.LIZJ.LJIIL(2.22f, 10.51f);
        this.LIZJ.LJIIJ(0.18f, 0.85f, -0.36f, 1.7f, -1.21f, 1.87f);
        this.LIZJ.LJIIL(-1.58f, 0.34f);
        this.LIZJ.LJIIIZ(1.58f, 1.58f, false, true, -1.87f, -1.22f);
        this.LIZJ.LJIIL(-0.98f, -4.63f);
        this.LIZJ.LJIIL(-12.79f, 16.56f);
        this.LIZJ.LJIIJ(-0.53f, 0.7f, -1.52f, 0.82f, -2.2f, 0.29f);
        this.LIZJ.LJIIL(-1.29f, -0.99f);
        this.LIZJ.LJIIIZ(1.58f, 1.58f, false, true, -0.28f, -2.21f);
        this.LIZJ.LJII(31.9f, 10.15f);
        this.LIZJ.LJIIL(-5.42f, 0.36f);
        this.LIZJ.LJIIJ(-0.87f, 0.05f, -1.62f, -0.6f, -1.68f, -1.47f);
        this.LIZJ.LJIIL(-0.1f, -1.62f);
        this.LIZJ.LJIIJ(-0.06f, -0.87f, 0.6f, -1.62f, 1.46f, -1.68f);
        this.LIZJ.LJII(37.4f, 5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(20.1f, 10.47f);
        this.LIZJ.LJIIJ(0.9f, -0.12f, 1.65f, 0.57f, 1.71f, 1.43f);
        this.LIZJ.LJIIL(0.11f, 1.6f);
        this.LIZJ.LJIIJ(0.06f, 0.89f, -0.6f, 1.6f, -1.41f, 1.73f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.04f, 0.01f);
        this.LIZJ.LJIIIZ(11.57f, 11.57f, true, false, 13.27f, 9.52f);
        this.LIZJ.LJIIIZ(1.66f, 1.66f, false, true, 1.19f, -1.89f);
        this.LIZJ.LJIIL(1.56f, -0.4f);
        this.LIZJ.LJIIJ(0.84f, -0.22f, 1.73f, 0.28f, 1.9f, 1.17f);
        this.LIZJ.LJIIIZ(16.44f, 16.44f, false, true, 0.27f, 3.02f);
        this.LIZJ.LIZJ(16.33f, 16.33f, true, true, 20.1f, 10.47f);
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
