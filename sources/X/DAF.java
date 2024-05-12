package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAF extends AbstractC39455Fe7 {
    public DAF() {
        this.LIZJ.LJIILIIL(18.56f, 11.59f);
        this.LIZJ.LJIIL(-0.11f, 0.02f);
        this.LIZJ.LJIIJ(-0.66f, 0.1f, -0.95f, 0.6f, -0.95f, 0.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(36.7f);
        C32856Cuy.ob(this.LIZJ);
        this.LIZJ.LJIIL(0.02f, 0.28f);
        this.LIZJ.LJIIJ(0.0f, 2.46f, -1.93f, 4.56f, -5.13f, 5.41f);
        this.LIZJ.LJIIJ(-3.2f, 0.86f, -6.26f, -0.17f, -6.83f, -2.3f);
        this.LIZJ.LJIIJ(-0.58f, -2.14f, 1.55f, -4.57f, 4.76f, -5.42f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(10.1f, 10.1f, false, true, 4.2f, -0.23f);
        this.LIZJ.LJIJ(12.55f);
        this.LIZJ.LJIIIZ(4.03f, 4.03f, false, true, 3.46f, -3.9f);
        this.LIZJ.LJIIL(17.65f, -3.6f);
        this.LIZJ.LJIIIZ(4.16f, 4.16f, false, true, 4.83f, 3.24f);
        this.LIZJ.LJIIJ(0.04f, 0.22f, 0.06f, 0.45f, 0.06f, 0.68f);
        this.LIZJ.LJIILL(21.56f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-0.05f);
        this.LIZJ.LJIIJ(0.03f, 0.14f, 0.05f, 0.29f, 0.05f, 0.45f);
        this.LIZJ.LJIIJ(0.0f, 2.46f, -1.93f, 4.56f, -5.13f, 5.41f);
        this.LIZJ.LJIIJ(-3.2f, 0.86f, -6.26f, -0.17f, -6.83f, -2.3f);
        this.LIZJ.LJIIJ(-0.58f, -2.14f, 1.55f, -4.57f, 4.76f, -5.42f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(10.1f, 10.1f, false, true, 4.2f, -0.23f);
        this.LIZJ.LJIJ(8.97f);
        this.LIZJ.LJIIL(-0.01f, -0.14f);
        this.LIZJ.LJIIJ(-0.08f, -0.41f, -0.58f, -0.92f, -1.35f, -0.82f);
        this.LIZJ.LJII(18.56f, 11.6f);
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
