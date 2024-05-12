package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD2 extends AbstractC39455Fe7 {
    public DD2() {
        C32856Cuy.zo(this.LIZJ);
        this.LIZJ.LJIILIIL(26.0f, -11.0f);
        C32856Cuy.g5(this.LIZJ);
        this.LIZJ.LJIILIIL(-15.62f, 7.2f);
        this.LIZJ.LJIIJ(2.23f, 0.65f, 4.11f, 1.15f, 5.92f, 1.49f);
        this.LIZJ.LJIIL(-1.68f, 15.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.89f, 1.1f);
        this.LIZJ.LJIIL(1.98f, 0.22f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.1f, -0.88f);
        this.LIZJ.LJIIL(0.7f, -6.21f);
        this.LIZJ.LJIIL(5.42f, -0.02f);
        this.LIZJ.LJIIL(0.7f, 6.23f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.1f, 0.88f);
        this.LIZJ.LJIIL(1.98f, -0.22f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.89f, -1.1f);
        this.LIZJ.LJIIL(-0.89f, -8.0f);
        this.LIZJ.LJIIL(-0.65f, -7.06f);
        this.LIZJ.LJIIIZ(44.4f, 44.4f, false, false, 5.86f, -1.52f);
        this.LIZJ.LJIIJ(0.52f, -0.17f, 0.8f, -0.74f, 0.62f, -1.26f);
        this.LIZJ.LJIIL(-0.64f, -1.9f);
        this.LIZJ.LJIIJ(-0.18f, -0.52f, -0.75f, -0.8f, -1.28f, -0.63f);
        this.LIZJ.LJIIIZ(36.58f, 36.58f, false, true, -6.97f, 1.64f);
        this.LIZJ.LJIIJ(-2.03f, 0.25f, -4.6f, 0.2f, -6.7f, -0.05f);
        this.LIZJ.LJIIIZ(44.1f, 44.1f, false, true, -7.2f, -1.64f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.24f, 0.67f);
        this.LIZJ.LJIIL(-0.58f, 1.92f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.67f, 1.24f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.35f, 6.82f);
        this.LIZJ.LJIIL(0.54f, -4.86f);
        this.LIZJ.LJIIJ(1.18f, 0.07f, 2.41f, 0.09f, 3.6f, 0.03f);
        this.LIZJ.LJIIL(0.44f, 4.82f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-4.58f);
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
