package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF1 extends AbstractC39455Fe7 {
    public DF1() {
        C32856Cuy.wl(this.LIZJ);
        this.LIZJ.LJIILIIL(10.49f, 3.94f);
        this.LIZJ.LJIIJ(-0.4f, 0.4f, -0.4f, 1.04f, 0.0f, 1.44f);
        this.LIZJ.LJII(15.1f, 24.0f);
        this.LIZJ.LJIIL(-3.61f, 3.62f);
        this.LIZJ.LJIIJ(-0.4f, 0.4f, -0.4f, 1.04f, 0.0f, 1.45f);
        this.LIZJ.LJIIL(1.45f, 1.43f);
        this.LIZJ.LJIIJ(0.4f, 0.4f, 1.04f, 0.4f, 1.44f, 0.0f);
        this.LIZJ.LJII(18.0f, 26.9f);
        this.LIZJ.LJIIL(3.62f, 3.6f);
        this.LIZJ.LJIIJ(0.4f, 0.4f, 1.04f, 0.4f, 1.45f, 0.0f);
        this.LIZJ.LJIIL(1.43f, -1.43f);
        this.LIZJ.LJIIJ(0.4f, -0.41f, 0.4f, -1.05f, 0.0f, -1.45f);
        this.LIZJ.LJII(20.9f, 24.0f);
        this.LIZJ.LJIIL(3.6f, -3.62f);
        this.LIZJ.LJIIJ(0.4f, -0.4f, 0.4f, -1.04f, 0.0f, -1.44f);
        this.LIZJ.LJIIL(-1.43f, -1.45f);
        this.LIZJ.LJIIJ(-0.41f, -0.4f, -1.05f, -0.4f, -1.45f, 0.0f);
        this.LIZJ.LJII(18.0f, 21.1f);
        this.LIZJ.LJIIL(-3.62f, -3.61f);
        this.LIZJ.LJIIJ(-0.4f, -0.4f, -1.04f, -0.4f, -1.44f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.45f, 1.45f);
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
