package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD3 extends AbstractC39455Fe7 {
    public DD3() {
        C32856Cuy.ml(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(0.0f, 15.0f);
        C32856Cuy.ti(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.7f, 4.69f);
        this.LIZJ.LJIIJ(-1.8f, -0.34f, -3.7f, -0.84f, -5.92f, -1.49f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.67f, -1.24f);
        this.LIZJ.LJIIL(0.58f, -1.92f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.24f, -0.67f);
        this.LIZJ.LJIIJ(2.96f, 0.87f, 5.11f, 1.4f, 7.2f, 1.64f);
        this.LIZJ.LJIIJ(2.1f, 0.25f, 4.67f, 0.3f, 6.7f, 0.05f);
        this.LIZJ.LJIIJ(1.96f, -0.25f, 4.09f, -0.7f, 6.97f, -1.64f);
        this.LIZJ.LJIIJ(0.53f, -0.17f, 1.1f, 0.11f, 1.28f, 0.63f);
        this.LIZJ.LJIIL(0.64f, 1.9f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, true, -0.62f, 1.26f);
        this.LIZJ.LJIIIZ(44.4f, 44.4f, false, true, -5.86f, 1.52f);
        this.LIZJ.LJIIL(0.65f, 7.07f);
        this.LIZJ.LJIIL(0.89f, 7.99f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.89f, 1.1f);
        this.LIZJ.LJIIL(-1.98f, 0.22f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.1f, -0.88f);
        this.LIZJ.LJII(26.7f, 31.0f);
        this.LIZJ.LJIIL(-5.42f, 0.02f);
        this.LIZJ.LJIIL(-0.7f, 6.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.1f, 0.9f);
        this.LIZJ.LJIIL(-1.98f, -0.23f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.89f, -1.1f);
        this.LIZJ.LJIIL(1.68f, -15.1f);
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
