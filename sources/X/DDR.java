package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDR extends AbstractC39455Fe7 {
    public DDR() {
        C32856Cuy.s7(this.LIZJ);
        this.LIZJ.LJIIJ(-4.4f, 0.0f, -8.4f, 1.78f, -11.3f, 4.67f);
        this.LIZJ.LIZJ(16.0f, 16.0f, true, false, 24.0f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-12.7f, 3.25f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, true, true, 25.41f, 25.5f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, -25.42f, -25.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.2f, 17.0f);
        this.LIZJ.LJIIJ(-1.9f, 0.0f, -3.3f, 1.3f, -4.08f, 3.25f);
        this.LIZJ.LJIIJ(-0.1f, 0.25f, -0.38f, 0.4f, -0.65f, 0.3f);
        this.LIZJ.LJIIL(-0.94f, -0.3f);
        this.LIZJ.LJIIIZ(0.48f, 0.48f, false, true, -0.3f, -0.64f);
        this.LIZJ.LJIIJ(0.94f, -2.42f, 2.9f, -4.61f, 5.97f, -4.61f);
        this.LIZJ.LJIIJ(3.14f, 0.0f, 5.8f, 2.39f, 5.8f, 5.5f);
        this.LIZJ.LJIIJ(0.0f, 1.65f, -0.97f, 3.15f, -2.21f, 4.25f);
        this.LIZJ.LJIIIZ(9.6f, 9.6f, false, true, -4.14f, 2.14f);
        this.LIZJ.LJIIIZ(0.48f, 0.48f, false, true, -0.57f, -0.4f);
        this.LIZJ.LJIIL(-0.16f, -0.98f);
        this.LIZJ.LJIIIZ(0.53f, 0.53f, false, true, 0.4f, -0.6f);
        this.LIZJ.LJIIIZ(7.61f, 7.61f, false, false, 3.14f, -1.66f);
        this.LIZJ.LJIIJ(1.01f, -0.9f, 1.54f, -1.9f, 1.54f, -2.75f);
        this.LIZJ.LJIIJ(0.0f, -1.89f, -1.64f, -3.5f, -3.8f, -3.5f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 33.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, true, true, 0.0f, -4.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, 4.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
