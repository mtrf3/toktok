package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE7 extends AbstractC39455Fe7 {
    public DE7() {
        C32856Cuy.Ci(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.04f, -27.2f);
        this.LIZJ.LJIIJ(1.15f, -2.54f, 3.1f, -3.85f, 5.14f, -3.85f);
        this.LIZJ.LJIIJ(2.3f, 0.0f, 4.16f, 1.87f, 4.16f, 4.16f);
        this.LIZJ.LJIIJ(0.0f, 1.02f, -0.6f, 2.4f, -1.76f, 3.6f);
        this.LIZJ.LJIIIZ(6.57f, 6.57f, false, true, -3.57f, 1.73f);
        this.LIZJ.LJIIJ(-0.58f, 0.1f, -1.06f, 0.57f, -1.06f, 1.16f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.13f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, 1.06f, 1.0f);
        this.LIZJ.LJIIIZ(10.85f, 10.85f, false, false, 6.62f, -3.05f);
        this.LIZJ.LJIIJ(1.67f, -1.72f, 2.96f, -4.11f, 2.96f, -6.57f);
        this.LIZJ.LJIIIZ(8.42f, 8.42f, false, false, -8.41f, -8.41f);
        this.LIZJ.LJIIJ(-4.3f, 0.0f, -7.57f, 2.87f, -9.2f, 6.74f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.64f, 1.34f);
        this.LIZJ.LJIIL(2.02f, 0.67f);
        this.LIZJ.LJIIJ(0.56f, 0.19f, 1.15f, -0.12f, 1.4f, -0.65f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.23f, 15.31f);
        this.LIZJ.LJIIIZ(3.2f, 3.2f, true, false, -6.38f, 0.0f);
        this.LIZJ.LJIIIZ(3.2f, 3.2f, false, false, 6.38f, 0.0f);
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
